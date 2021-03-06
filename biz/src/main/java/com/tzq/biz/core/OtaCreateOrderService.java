package com.tzq.biz.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;

public interface OtaCreateOrderService {
    /**
     * 生单
     *
     * @param req
     * @return
     */
    SingleResult<CreateOrderResVO> createOrder(RouteContext<CreateOrderReqVO> req);
}
