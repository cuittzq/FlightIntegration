package com.tzq.integration.common.model.integration;

import java.io.Serializable;

/**
 * 规则vo
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class RuleVO implements Serializable {

    /**  */
    private static final long serialVersionUID = 6532307568087733637L;

    /** 退票说明 */
    private String            refundTicketRule;

    /** 改签说明 */
    private String            endorseTicketRule;

    /** 误机说明 */
    private String            missPlaneRule;

    /** 行李说明 */
    private String            baggageRule;

    /** 客票说明 */
    private String            ticketDescription;

    /**
     * Getter method for property <tt>refundTicketRule</tt>.
     *
     * @return property value of refundTicketRule
     */
    public String getRefundTicketRule() {
        return refundTicketRule;
    }

    /**
     * Setter method for property <tt>refundTicketRule</tt>.
     *
     * @param refundTicketRule value to be assigned to property refundTicketRule
     */
    public void setRefundTicketRule(String refundTicketRule) {
        this.refundTicketRule = refundTicketRule;
    }

    /**
     * Getter method for property <tt>endorseTicketRule</tt>.
     *
     * @return property value of endorseTicketRule
     */
    public String getEndorseTicketRule() {
        return endorseTicketRule;
    }

    /**
     * Setter method for property <tt>endorseTicketRule</tt>.
     *
     * @param endorseTicketRule value to be assigned to property endorseTicketRule
     */
    public void setEndorseTicketRule(String endorseTicketRule) {
        this.endorseTicketRule = endorseTicketRule;
    }

    /**
     * Getter method for property <tt>missPlaneRule</tt>.
     *
     * @return property value of missPlaneRule
     */
    public String getMissPlaneRule() {
        return missPlaneRule;
    }

    /**
     * Setter method for property <tt>missPlaneRule</tt>.
     *
     * @param missPlaneRule value to be assigned to property missPlaneRule
     */
    public void setMissPlaneRule(String missPlaneRule) {
        this.missPlaneRule = missPlaneRule;
    }

    /**
     * Getter method for property <tt>baggageRule</tt>.
     *
     * @return property value of baggageRule
     */
    public String getBaggageRule() {
        return baggageRule;
    }

    /**
     * Setter method for property <tt>baggageRule</tt>.
     *
     * @param baggageRule value to be assigned to property baggageRule
     */
    public void setBaggageRule(String baggageRule) {
        this.baggageRule = baggageRule;
    }

    /**
     * Getter method for property <tt>ticketDescription</tt>.
     *
     * @return property value of ticketDescription
     */
    public String getTicketDescription() {
        return ticketDescription;
    }

    /**
     * Setter method for property <tt>ticketDescription</tt>.
     *
     * @param ticketDescription value to be assigned to property ticketDescription
     */
    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }
}
