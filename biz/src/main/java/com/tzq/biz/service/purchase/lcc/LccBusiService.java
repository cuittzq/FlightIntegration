package com.tzq.biz.service.purchase.lcc;


import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketResVO;
/**
 * Created by cl24957 on 2018/5/11.
 */
public interface    LccBusiService {
    CtripVerifyResVO verifyCabinAndPrice(CtripVerifyReqVO vo);

    CreateOrderResVO crateOrder(CreateOrderReqVO reqVO);

    IssueTicketResVO issueTicket(IssueTicketReqVO reqVO);

}
