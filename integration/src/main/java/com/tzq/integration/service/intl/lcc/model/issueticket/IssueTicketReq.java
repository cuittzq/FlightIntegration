package com.tzq.integration.service.intl.lcc.model.issueticket;

import com.tzq.integration.service.intl.lcc.model.BaseParam;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/13.
 */
public class IssueTicketReq extends BaseParam implements Serializable {
    private static final long serialVersionUID = 5623220208054898876L;
    private String orderNo;
    private String pnrCode;

    private FlightRoutings routing;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPnrCode() {
        return pnrCode;
    }

    public void setPnrCode(String pnrCode) {
        this.pnrCode = pnrCode;
    }

    public FlightRoutings getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutings routing) {
        this.routing = routing;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"orderNo\":\"").append(orderNo).append('\"');
        sb.append(",             \"pnrCode\":\"").append(pnrCode).append('\"');
        sb.append(",             \"routing\":").append(routing);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
