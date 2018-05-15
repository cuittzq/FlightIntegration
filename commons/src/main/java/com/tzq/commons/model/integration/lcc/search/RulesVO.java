package com.tzq.commons.model.integration.lcc.search;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class RulesVO {
    /**
     * 退票规定，最大 300 个字符
     */
    private String refund;
    /**
     * 改签规定，最大 300 个字符
     */
    private String endorse;
    /**
     * 行李额规定，最大 300 个字符
     */
    private String baggage;
    /**
     * 其他说明，最大 300 个字符
     */
    private String other;

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    public String getEndorse() {
        return endorse;
    }

    public void setEndorse(String endorse) {
        this.endorse = endorse;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
