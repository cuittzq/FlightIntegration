package com.tzq.commons.model.integration.lcc.issueticket;

import com.tzq.commons.model.integration.lcc.BaseParamVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/15.
 */
public class IssueTicketReqVO extends BaseParamVO implements Serializable {
    private static final long serialVersionUID = 2709161966087358000L;
    private String orderNo;
    private String pnrCode;

    private FlightRoutingsVO routings;

    public FlightRoutingsVO getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutingsVO routings) {
        this.routings = routings;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"orderNo\":\"").append(orderNo).append('\"');
        sb.append(",             \"pnrCode\":\"").append(pnrCode).append('\"');
        sb.append(",             \"routings\":").append(routings);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
