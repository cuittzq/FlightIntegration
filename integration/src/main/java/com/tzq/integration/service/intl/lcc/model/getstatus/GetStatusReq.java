package com.tzq.integration.service.intl.lcc.model.getstatus;

import com.tzq.integration.service.intl.lcc.model.BaseParam;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/13.
 */
public class GetStatusReq extends BaseParam implements Serializable {

    private static final long serialVersionUID = -4630653354788990006L;

    private String orderNo;
    private  String pnrCode;

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
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
