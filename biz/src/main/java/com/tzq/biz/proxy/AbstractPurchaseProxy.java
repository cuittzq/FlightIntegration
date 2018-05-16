package com.tzq.biz.proxy;

import com.tzq.biz.constant.Symbol;
import com.tzq.biz.factory.RouteProxyFactory;
import com.tzq.commons.model.context.BaseContext;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public abstract class AbstractPurchaseProxy implements PurchaseProxy {
    /**
     * 路由工厂
     */
    protected RouteProxyFactory routeProxyFactory;

    /**
     * Setter method for property <tt>routeProxyFactory</tt>.
     *
     * @param routeProxyFactory value to be assigned to property routeProxyFactory
     */
    public void setRouteProxyFactory(RouteProxyFactory routeProxyFactory) {
        this.routeProxyFactory = routeProxyFactory;
    }

    /**
     * 路由取得具体
     *
     * @param context
     * @param clazz
     * @param <T>
     * @return
     */
    protected <T> T getInstance(BaseContext context, Class<T> clazz) {
        T service = routeProxyFactory.getService(key(context), clazz);
        return service;
    }

    /**
     * 组装key
     *
     * @param context
     * @return
     */
    private String key(BaseContext context) {
        if (context == null) {
            return "";
        }
        return context.getAreaType().getCode() + Symbol.STRIGULA + context.getPurchaseEnum().getCode();
    }
}
