package com.tzq.biz.service.purchase.abstracts;

import com.tzq.biz.service.purchase.core.CreateOrderService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;

/**
 * Created by cl24957 on 2018/5/16.
 */
public abstract class AbstractCreateOrderService extends AbstractBaseService implements CreateOrderService {


    /**
     * 航班查询返回参数组装
     *
     * @param <T>
     * @param t
     * @return
     */
    protected abstract <T> CreateOrderResVO response(T t, RouteContext<CreateOrderReqVO> context);

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    protected abstract <T> T request(RouteContext<CreateOrderReqVO> context);
}
