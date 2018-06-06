package com.tzq.biz.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/16
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface OtaIssueTicketService {
    /**
     * 出票
     *
     * @param req
     * @return
     */
    SingleResult<IssueTicketResVO> issueTicket(RouteContext<IssueTicketReqVO> req);
}
