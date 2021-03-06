package com.tzq.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/7
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

/**
 * Created by wuwf on 17/4/27.
 * 日志切面
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public * com.tzq.web.controller.*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
    }

    //后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp) {
    }

    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
    @After("webLog()")
    public void after(JoinPoint jp) {
    }

}
