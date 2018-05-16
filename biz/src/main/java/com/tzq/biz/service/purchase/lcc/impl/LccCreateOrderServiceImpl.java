package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.annotation.Route;
import com.tzq.biz.service.purchase.abstracts.AbstractCreateOrderService;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lccCreateOrderService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LccCreateOrderServiceImpl extends AbstractCreateOrderService {


    @Resource
    private LccClient lccClient;

    /**
     * 生单
     *
     * @param context
     */
    @Override
    public CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> context) {
        OrderReq         orderReq   = request(context);
        OrderRes         order      = lccClient.createOrder(orderReq);
        CreateOrderResVO orderResVO = response(order, context);
        return orderResVO;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> CreateOrderResVO response(T t, RouteContext<CreateOrderReqVO> context) {
        OrderRes orderRes = (OrderRes) t;
        // todo orderRes->createOrderResVO
        CreateOrderResVO createOrderResVO = new CreateOrderResVO();
        return createOrderResVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<CreateOrderReqVO> context) {
        OrderReq         orderReq         = new OrderReq();
        CreateOrderReqVO createOrderReqVO = context.getT();
        // todo orderReq->createOrderReqVO
        return (T) orderReq;
    }
}
