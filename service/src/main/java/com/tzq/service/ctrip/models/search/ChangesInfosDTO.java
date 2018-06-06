package com.tzq.service.ctrip.models.search;

import java.math.BigDecimal;

public class ChangesInfosDTO {

    /**
     * 乘客类型，0 成人/1 儿童/2 婴儿
     * 1）对于对乘客类型的查询、验价，必须按乘客类型返回；如成人+儿童的查询，成人和儿童的退改签都要有。
     */
    private int passengerType;
    /**
     * 改期类型
     * 0：客票全部未使用；
     * 1：客票部分使用【即去程已使用，在往返行程中使用，代表回程的退票信息】
     * 【单程时0；往返时0、1都要有】
     */
    private int changesType;
    /**
     * 改期标识
     * T：不可改期
     * H：有条件改期
     * F：免费改期
     * E：按航司客规【公布运价专用】
     */
    private String changesStatus;
    /**
     *
     */
    private BigDecimal changesFee;
    /**
     *
     */
    private String currency;
    /**
     * 是否允许NoShow改期
     * T：不可退； H：有条件退；F：免费退；E：按航司客规为准【公布运价专用】
     */
    private String revNoshow;
    /**
     * 改期时航班起飞前多久算NoShow，单位：小时
     * 1）若无法确认此时间，请默认赋0
     */
    private int revNoShowCondition;
    /**
     * NoShow改期费用
     * 1）当revNoshow =H，必须赋值
     */
    private BigDecimal revNoshowFee;
    /**
     * 中文改期备注
     */
    private String cnRevRemark;
    /**
     * 英文改期备注
     */
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

    public BigDecimal getChangesFee() {
        return changesFee;
    }

    public void setChangesFee(BigDecimal changesFee) {
        this.changesFee = changesFee;
    }

    public BigDecimal getRevNoshowFee() {
        return revNoshowFee;
    }

    public void setRevNoshowFee(BigDecimal revNoshowFee) {
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
