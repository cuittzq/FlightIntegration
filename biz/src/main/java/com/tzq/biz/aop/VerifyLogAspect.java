package com.tzq.biz.aop;

import com.tzq.dal.service.InterfaceRequestLogService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by cl24957 on 2018/5/21.
 */
@Aspect
@Component
public class VerifyLogAspect {
    @Resource
    InterfaceRequestLogService interfaceRequestLogService;


}
