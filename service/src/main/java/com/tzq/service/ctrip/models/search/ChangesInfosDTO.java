package com.tzq.service.ctrip.models.search;

public class ChangesInfosDTO {
    /**
     * passengerType : 0
     * changesType : 0
     * changesStatus : T
     * changesFee : 0
     * currency : CNY
     * revNoshow : T
     * revNoShowCondition : 2
     * revNoshowFee : 0
     * cnRevRemark :
     * enRevRemark :
     */

    private int passengerType;
    private int changesType;
    private String changesStatus;
    private int changesFee;
    private String currency;
    private String revNoshow;
    private int revNoShowCondition;
    private int revNoshowFee;
    private String cnRevRemark;
    private String enRevRemark;

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public int getChangesType() {
        return changesType;
    }

    public void setChangesType(int changesType) {
        this.changesType = changesType;
    }

    public String getChangesStatus() {
        return changesStatus;
    }

    public void setChangesStatus(String changesStatus) {
        this.changesStatus = changesStatus;
    }

    public int getChangesFee() {
        return changesFee;
    }

    public void setChangesFee(int changesFee) {
        this.changesFee = changesFee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRevNoshow() {
        return revNoshow;
    }

    public void setRevNoshow(String revNoshow) {
        this.revNoshow = revNoshow;
    }

    public int getRevNoShowCondition() {
        return revNoShowCondition;
    }

    public void setRevNoShowCondition(int revNoShowCondition) {
        this.revNoShowCondition = revNoShowCondition;
    }

    public int getRevNoshowFee() {
        return revNoshowFee;
    }

    public void setRevNoshowFee(int revNoshowFee) {
        this.revNoshowFee = revNoshowFee;
    }

    public String getCnRevRemark() {
        return cnRevRemark;
    }

    public void setCnRevRemark(String cnRevRemark) {
        this.cnRevRemark = cnRevRemark;
    }

    public String getEnRevRemark() {
        return enRevRemark;
    }

    public void setEnRevRemark(String enRevRemark) {
        this.enRevRemark = enRevRemark;
    }
}
