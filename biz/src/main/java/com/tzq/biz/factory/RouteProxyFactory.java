package com.tzq.biz.factory;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/16
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface RouteProxyFactory {
    /**
     * 取得对应服务接口类
     *
     * @param <T>
     * @return
     */
    public <T> T getService(String key, Class<T> clazz);
}
