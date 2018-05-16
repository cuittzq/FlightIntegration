package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

@Service
public class OtaIssueTicketServiceImpl implements OtaIssueTicketService {

    /**
     * 出票
     *
     * @param req
     * @return
     */
    @Override
    public SingleResult<String> issueTicket(RouteContext<String> req) {
        return null;
    }
}
