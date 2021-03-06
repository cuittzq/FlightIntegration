package com.tzq.commons.model.integration.lcc.order;

import com.tzq.commons.model.integration.lcc.BaseResVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/15.
 */
public class OrderResVO extends BaseResVO implements Serializable {

    private static final long serialVersionUID = 7484409694190418088L;
    private String orderNo;
    private String pnrCode;
    private Integer maxSeats;
    private FlightRoutingsVO routings;

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

    public FlightRoutingsVO getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutingsVO routings) {
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
