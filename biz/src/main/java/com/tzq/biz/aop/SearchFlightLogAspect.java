package com.tzq.biz.aop;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.service.InterfaceRequestLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/7
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

/**
 * Created by wuwf on 17/4/27.
 * 日志切面
 */
@Aspect
@Component
public class SearchFlightLogAspect {

    @Resource
    InterfaceRequestLogService interfaceRequestLogService;


    @Pointcut("execution(public * com.tzq.biz.core.impl.*.*(..))")
    public void interfacelog() {
    }

    @Before("interfacelog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes          = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest       request             = attributes.getRequest();
        RouteContext<SearchVO>   paramin             = (RouteContext<SearchVO>) joinPoint.getArgs()[0];
        InterfaceRequestLog      interfaceRequestLog = new InterfaceRequestLog();
        interfaceRequestLog.setArrcode(paramin.getT().getArrAirportCode());
        interfaceRequestLog.setDepcode(paramin.getT().getDepAirportCode());
        interfaceRequestLog.setDepdate(DateUtils.parseDateNoTime(paramin.getT().getDepDate(), "YYYYMMDD"));
        interfaceRequestLog.setBackdate(DateUtils.parseDateNoTime(paramin.getT().getArrDate(), "YYYYMMDD"));
        interfaceRequestLog.setCarrier("");
        //  interfaceRequestLog.setInterfaceresult();
        interfaceRequestLogService.insert(interfaceRequestLog);
        // 记录下请求内容
        System.out.println("URL : " + request.getRequestURL().toString());
        System.out.println("HTTP_METHOD : " + request.getMethod());
        System.out.println("IP : " + request.getRemoteAddr());
        System.out.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "interfacelog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("方法的返回值 : " + ret);
    }

    //后置异常通知
    @AfterThrowing("interfacelog()")
    public void throwss(JoinPoint jp) {
        System.out.println("方法异常时执行.....");
        System.out.println(jp.getTarget());
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("interfacelog()")
    public void after(JoinPoint jp) {
        System.out.println("方法最后执行.....");
    }
}
