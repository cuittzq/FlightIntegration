package com.tzq.biz.proxy;

import com.tzq.biz.service.purchase.core.CreateOrderService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class DefaultPurchaseProxy extends AbstractPurchaseProxy {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(DefaultPurchaseProxy.class);

    /**
     * 查询
     *
     * @param context
     */
    @Override
    public FlightRouteVO searchFlight(RouteContext<SearchVO> context) {
        logger.info("[航班查询] param={}", context.toString());
        FlightRouteVO routeVO = null;
        routeVO = getInstance(context, SearchFlightService.class).searchFlight(context);
        return routeVO;
    }

    /**
     * 生单
     *
     * @param context
     */
    @Override
    public CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> context) {
        logger.info("[航班查询] param={}", context.toString());
        CreateOrderResVO orderResVO = null;
        orderResVO = getInstance(context, CreateOrderService.class).createOrder(context);
        return orderResVO;
    }
}
