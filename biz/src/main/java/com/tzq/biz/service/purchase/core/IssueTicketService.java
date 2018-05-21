package com.tzq.biz.service.purchase.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/21
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface IssueTicketService {

    /**
     * 生单
     *
     * @param context
     */
    IssueTicketResVO issueTicket(RouteContext<IssueTicketReqVO> context);
}
