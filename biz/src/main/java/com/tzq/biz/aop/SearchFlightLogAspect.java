package com.tzq.biz.aop;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.enums.MethodEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.service.InterfaceRequestLogService;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

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
    }

    @AfterReturning(returning = "ret", pointcut = "interfacelog()")
    public void doAfterReturning(Object ret) throws Throwable {
    }

    //后置异常通知
    @AfterThrowing("interfacelog()")
    public void throwss(JoinPoint jp) {
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("interfacelog()")
    public void after(JoinPoint joinPoint) {
    }

    @AfterReturning(pointcut = "execution(* com.tzq.biz.core.impl.*.*(..))", returning = "returnValue")
    public void log(JoinPoint point, Object returnValue) {
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            HttpServletResponse response = attributes.getResponse();
            RouteContext<SearchVO> paramin = (RouteContext<SearchVO>) point.getArgs()[0];
            SingleResult<FlightRouteVO> flightRouteVO = new SingleResult();
            if (returnValue != null) {
                flightRouteVO = (SingleResult<FlightRouteVO>) returnValue;
            }
            InterfaceRequestLog interfaceRequestLog = buildLogs(request, response, paramin, flightRouteVO);
            interfaceRequestLogService.insert(interfaceRequestLog);
            // 记录下请求内容
            System.out.println("URL : " + request.getRequestURL().toString());
            System.out.println("HTTP_METHOD : " + request.getMethod());
            System.out.println("IP : " + request.getRemoteAddr());
            System.out.println("CLASS_METHOD : " + point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
            System.out.println("ARGS : " + Arrays.toString(point.getArgs()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }


    private InterfaceRequestLog buildLogs(HttpServletRequest request, HttpServletResponse response, RouteContext<SearchVO> paramin, SingleResult<FlightRouteVO> flightRouteVO) throws ParseException {
        InterfaceRequestLog interfaceRequestLog = new InterfaceRequestLog();
        interfaceRequestLog.setArrcode(paramin.getT().getArrAirportCode());
        interfaceRequestLog.setDepcode(paramin.getT().getDepAirportCode());
        interfaceRequestLog.setDepdate(DateUtils.parseDateNoTime(paramin.getT().getDepDate(), "yyyyMMdd"));
        if (StringUtils.isNotEmpty(paramin.getT().getArrDate())) {
            interfaceRequestLog.setBackdate(DateUtils.parseDateNoTime(paramin.getT().getArrDate(), "yyyyMMdd"));
        } else {
            interfaceRequestLog.setBackdate(new Date(1990, 1, 1));
        }

        interfaceRequestLog.setCarrier("");
        interfaceRequestLog.setSalesplatform(1);
        interfaceRequestLog.setPurchaseplatform(1);
        interfaceRequestLog.setRequestdate(new Date());
        interfaceRequestLog.setRequesttype(MethodEnum.SEARCHFLIGHT.getCode());
        interfaceRequestLog.setRequestresult(1);
        interfaceRequestLog.setInterfaceresult(1);
        interfaceRequestLog.setOrderno("");
        interfaceRequestLog.setPnr("");
        // 0-单程，1-往返
        interfaceRequestLog.setVoyagetype(0);
        interfaceRequestLog.setSalesplatrequesttime(new Date());
        interfaceRequestLog.setSalesplatresponsetime(new Date());
        interfaceRequestLog.setPurchaseplatrequesttime(new Date());
        interfaceRequestLog.setPurchaseplatresponsetime(new Date());
        interfaceRequestLog.setSalesplatrequestip("192.168.10.10");
        interfaceRequestLog.setPurchaseplatrequestip(request.getRemoteAddr());
        interfaceRequestLog.setSalesplatrequesttipmessage("");
        interfaceRequestLog.setPurchaseplatrequesttipmessage("");
        interfaceRequestLog.setSalesplatlogdetail("");
        interfaceRequestLog.setPurchaseplatlogdetail(JSON.toJSONString(flightRouteVO));
        return interfaceRequestLog;

    }
}