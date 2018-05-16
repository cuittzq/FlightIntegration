package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import org.springframework.stereotype.Service;

@Service
public class OtaCreateOrderServiceImpl implements OtaCreateOrderService {
    /**
     * 生单
     *
     * @param req
     * @return
     */
    @Override
    public CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> req) {
        return null;
    }
}
