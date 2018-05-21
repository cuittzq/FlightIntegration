package com.tzq.biz.proxy;

import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.service.purchase.core.CreateOrderService;
import com.tzq.biz.service.purchase.core.IssueTicketService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.biz.service.purchase.core.VerifyService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
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
    @InterfaceAccess(desc = "searchFlight")
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
        logger.info("[订单创建] param={}", context.toString());
        CreateOrderResVO orderResVO = null;
        orderResVO = getInstance(context, CreateOrderService.class).createOrder(context);
        return orderResVO;
    }


    @Override
    public CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        logger.info("[验舱验价] param={}", context.toString());
        CtripVerifyResVO routeVO = null;
        routeVO = getInstance(context, VerifyService.class).verifyFlight(context);
        return routeVO;
    }


    /**
     * 生单
     *
     * @param context
     */
    @Override
    public IssueTicketResVO issueTicket(RouteContext<IssueTicketReqVO> context) {
        logger.info("[验舱验价] param={}", context.toString());
        IssueTicketResVO routeVO = null;
        routeVO = getInstance(context, IssueTicketService.class).issueTicket(context);
        return routeVO;
    }
}
