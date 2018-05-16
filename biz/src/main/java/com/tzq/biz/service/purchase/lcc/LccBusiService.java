package com.tzq.biz.service.purchase.lcc;


import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketResVO;
import com.tzq.commons.model.integration.lcc.order.OrderReqVO;
import com.tzq.commons.model.integration.lcc.order.OrderResVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyReqVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyResVO;

/**
 * Created by cl24957 on 2018/5/11.
 */
public interface    LccBusiService {
    VerifyResVO verifyCabinAndPrice(VerifyReqVO vo);

    OrderResVO crateOrder(OrderReqVO reqVO);

    IssueTicketResVO issueTicket(IssueTicketReqVO reqVO);

}
