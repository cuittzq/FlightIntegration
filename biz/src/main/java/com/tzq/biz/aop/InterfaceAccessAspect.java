package com.tzq.biz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/7
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Component
@Aspect
public class InterfaceAccessAspect {
    @Pointcut(value = "@annotation(com.tzq.biz.aop.InterfaceAccess)")
    public void access() {

    }

    @Before("access()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
    }
}
