package com.tzq.integration.service.intl.lcc;

import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusReq;
import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusRes;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketReq;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketRes;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface LccClient {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    SearchFlightRes searchFlight(SearchFlightReq req);

    VerifyRes verifyCabinPrice(VerifyReq req);

    OrderRes createOrder(OrderReq req);

    IssueTicketRes issueTicket(IssueTicketReq req);

    GetStatusRes getStatus(GetStatusReq req);
}
