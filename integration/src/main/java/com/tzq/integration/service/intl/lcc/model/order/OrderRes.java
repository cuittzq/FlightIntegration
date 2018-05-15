package com.tzq.integration.service.intl.lcc.model.order;

import com.tzq.integration.service.intl.lcc.model.BaseRes;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class OrderRes extends BaseRes implements Serializable{
    private static final long serialVersionUID = -1258325284912484540L;

    private String orderNo;
    private String pnrCode;
    private Integer maxSeats;
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

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public FlightRoutings getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutings routings) {
        this.routings = routings;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"orderNo\":\"").append(orderNo).append('\"');
        sb.append(",             \"pnrCode\":\"").append(pnrCode).append('\"');
        sb.append(",             \"maxSeats\":").append(maxSeats);
        sb.append(",             \"routings\":").append(routings);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
