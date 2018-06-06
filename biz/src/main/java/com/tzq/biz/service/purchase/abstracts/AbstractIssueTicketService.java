package com.tzq.biz.service.purchase.abstracts;

import com.tzq.biz.service.purchase.core.IssueTicketService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/21
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public abstract class AbstractIssueTicketService implements IssueTicketService {

    /**
     * 航班查询返回参数组装
     *
     * @param <T>
     * @param t
     * @return
     */
    protected abstract <T> IssueTicketResVO response(T t, RouteContext<IssueTicketReqVO> context);

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    protected abstract <T> T request(RouteContext<IssueTicketReqVO> context);
}
