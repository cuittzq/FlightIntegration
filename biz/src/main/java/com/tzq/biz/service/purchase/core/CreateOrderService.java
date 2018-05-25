package com.tzq.biz.service.purchase.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/16
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface CreateOrderService {
    /**
     * 生单
     * @param context
     */
    CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> context);
}
