package com.tzq.biz.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface OtaIssueTicketService {
    /**
     * 出票
     *
     * @param req
     * @return
     */
    SingleResult<String> issueTicket(RouteContext<String> req);
}
