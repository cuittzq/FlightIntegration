package com.tzq.commons.model.ctrip;

public class RefundInfosVO {
    /**
     * passengerType : 0
     * refundType : 0
     * refundStatus : H
     * refundFee : 100
     * currency : CNY
     * refNoshow : H
     * refNoShowCondition : 2
     * refNoshowFee : 200
     * cnRefRemark :
     * enRefRemark :
     */

    private int passengerType;
    private int refundType;
    private String refundStatus;
    private int refundFee;
    private String currency;
    private String refNoshow;
    private int refNoShowCondition;
    private int refNoshowFee;
    private String cnRefRemark;
    private String enRefRemark;

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public int getRefundType() {
        return refundType;
    }

    public void setRefundType(int refundType) {
        this.refundType = refundType;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public int getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(int refundFee) {
        this.refundFee = refundFee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRefNoshow() {
        return refNoshow;
    }

    public void setRefNoshow(String refNoshow) {
        this.refNoshow = refNoshow;
    }

    public int getRefNoShowCondition() {
        return refNoShowCondition;
    }

    public void setRefNoShowCondition(int refNoShowCondition) {
        this.refNoShowCondition = refNoShowCondition;
    }

    public int getRefNoshowFee() {
        return refNoshowFee;
    }

    public void setRefNoshowFee(int refNoshowFee) {
        this.refNoshowFee = refNoshowFee;
    }

    public String getCnRefRemark() {
        return cnRefRemark;
    }

    public void setCnRefRemark(String cnRefRemark) {
        this.cnRefRemark = cnRefRemark;
    }

    public String getEnRefRemark() {
        return enRefRemark;
    }

    public void setEnRefRemark(String enRefRemark) {
        this.enRefRemark = enRefRemark;
    }
}
