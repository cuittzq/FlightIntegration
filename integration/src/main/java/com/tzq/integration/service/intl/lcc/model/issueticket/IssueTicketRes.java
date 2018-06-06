package com.tzq.integration.service.intl.lcc.model.issueticket;

import com.tzq.integration.service.intl.lcc.model.BaseRes;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/13.
 */
public class IssueTicketRes extends BaseRes implements Serializable {
    private static final long serialVersionUID = 5624691797417990316L;

    private String orderNo;
    private String pnrCode;
    private Integer orderState;

    private FlightRoutings routings;

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

    public FlightRoutings getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutings routings) {
        this.routings = routings;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"orderNo\":\"").append(orderNo).append('\"');
        sb.append(",             \"pnrCode\":\"").append(pnrCode).append('\"');
        sb.append(",             \"orderState\":").append(orderState);
        sb.append(",             \"routings\":").append(routings);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
