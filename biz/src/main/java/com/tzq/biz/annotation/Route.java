package com.tzq.biz.annotation;

import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.TYPE})
public @interface Route {
    /**
     * 国内国际区分
     *
     * @return
     */
    AreaTypeEnum area();

    /**
     * 分销商
     *
     * @return
     */
    PurchaseEnum purchase();

}
