package com.tzq.service.ctrip;

import com.tzq.service.ctrip.models.issueticket.IssueTicketReqDTO;
import com.tzq.service.ctrip.models.issueticket.IssueTicketResDTO;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface CtripFlightService {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    SearchFlightRes searchFlight(SearchFlightReq req);

    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    CtripVerifyRes verifyFlight(CtripVerifyReq req);

    /**
     * 生单
     *
     * @param req
     * @return
     */
    CreateOrderRes createOrder(CreateOrderReq req);


    /**
     * 出票
     *
     * @param req
     * @return
     */
    IssueTicketResDTO issueTicket(IssueTicketReqDTO req);
}
