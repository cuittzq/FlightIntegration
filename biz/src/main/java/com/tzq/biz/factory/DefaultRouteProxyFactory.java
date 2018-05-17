package com.tzq.biz.factory;

import com.google.common.collect.Maps;
import com.tzq.biz.annotation.Route;
import com.tzq.biz.constant.Symbol;
import com.tzq.biz.service.purchase.core.CreateOrderService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.biz.service.purchase.core.VerifyService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class DefaultRouteProxyFactory implements RouteProxyFactory, ApplicationListener<ContextRefreshedEvent> {

    private Logger                           logger        = LoggerFactory.getLogger(DefaultRouteProxyFactory.class);
    /**
     * 航班查询服务类集合
     */
    private Map<String, SearchFlightService> SEARCH_FLIGHT = Maps.newHashMap();

    /**
     * 预定服务类集合
     */
    private Map<String, CreateOrderService> CREATE_ORDER = Maps.newHashMap();

    /**
     * 验价服务集合
     */
    private Map<String,VerifyService> VERIFY = Maps.newHashMap();

    /**
     * 取得对应服务接口类
     *
     * @param key
     * @param clazz
     * @return
     */
    @Override
    public <T> T getService(String key, Class<T> clazz) {
        Assert.isTrue(StringUtils.isNotEmpty(key), "route key can not be empty");
        logger.info("[服务路由，获取对应航司服务] key={},服务类型={} ", key, clazz.getName());
        T t = null;
        //获取航班查询服务
        if (SearchFlightService.class.isAssignableFrom(clazz)) {
            t = (T) SEARCH_FLIGHT.get(key);
        }
        //获取航班批量查询服务
        if (CreateOrderService.class.isAssignableFrom(clazz)) {
            t = (T) CREATE_ORDER.get(key);
        }

        // 获取验价服务
        if(VerifyService.class.isAssignableFrom(clazz))
        {
            t = (T) VERIFY.get(key);
        }

        return t;
    }



    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {
            logger.info("[路由工厂初始化]");
            Map<String, Object> beanMap = event.getApplicationContext().getBeansWithAnnotation(Route.class);
            for (Object obj : beanMap.values()) {
                Route route = obj.getClass().getAnnotation(Route.class);
                if (route == null) {
                    continue;
                }
                //航班查询服务集合初始化
                if (SearchFlightService.class.isAssignableFrom(obj.getClass())) {
                    logger.warn(key(route));
                    SEARCH_FLIGHT.put(key(route), SearchFlightService.class.cast(obj));
                }
                //下单服务集合初始化
                if (CreateOrderService.class.isAssignableFrom(obj.getClass())) {
                    logger.warn(key(route));
                    CREATE_ORDER.put(key(route), CreateOrderService.class.cast(obj));
                }

                //校验服务集合初始化
                if (VerifyService.class.isAssignableFrom(obj.getClass())) {
                    logger.warn(key(route));
                    VERIFY.put(key(route), VerifyService.class.cast(obj));
                }
            }
            logger.info("[路由工厂初始化完毕]");
        }
    }

    /**
     * 获取key
     *
     * @param route
     * @return
     */
    private String key(Route route) {
        return route.area().getCode() + Symbol.STRIGULA + route.purchase().getCode();
    }
}
