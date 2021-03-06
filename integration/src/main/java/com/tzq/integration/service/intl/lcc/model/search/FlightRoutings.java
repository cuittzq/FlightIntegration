package com.tzq.integration.service.intl.lcc.model.search;

import java.util.List;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightRoutings {
    /**
     * 可保存必要信息，之后生单按原值回转。最大 1000 个字符
     */
    private String              data;
    /**
     * 成人单价（以元为单位）
     */
    private int                 adultPrice;
    /**
     * 成人税费（以元为单位）
     */
    private int                 adultTax;
    /**
     * 儿童单价（以元为单位）
     */
    private int                 childPrice;
    /**
     * 儿童税费（以元为单位）
     */
    private int                 childTax;
    /**
     * 报价类型：0 普通价 / 1 留学生价
     */
    private int                 priceType;
    /**
     * 报价类型：0 预定价 / 1 申请价
     */
    private int                 applyType;
    /**
     * 成人税费类型：0 未含税 / 1 已含税
     */
    private int                 adultTaxType;
    /**
     * 儿童税费类型：0 未含税 / 1 已含税
     */
    private int                 childTaxType;
    /**
     * 退改签信息
     */
    private Rules               rule;
    /**
     * 参考信息，对查询请求的简化描述
     */
    private String              refData;
    /**
     * 去程航段按顺序
     */
    private List<FlightSegment> fromSegments;
    /**
     * 回程航段按顺序
     */
    private List<FlightSegment> retSegments;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    public int getAdultTax() {
        return adultTax;
    }

    public void setAdultTax(int adultTax) {
        this.adultTax = adultTax;
    }

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public int getChildTax() {
        return childTax;
    }

    public void setChildTax(int childTax) {
        this.childTax = childTax;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public int getApplyType() {
        return applyType;
    }

    public void setApplyType(int applyType) {
        this.applyType = applyType;
    }

    public int getAdultTaxType() {
        return adultTaxType;
    }

    public void setAdultTaxType(int adultTaxType) {
        this.adultTaxType = adultTaxType;
    }

    public int getChildTaxType() {
        return childTaxType;
    }

    public void setChildTaxType(int childTaxType) {
        this.childTaxType = childTaxType;
    }

    public Rules getRule() {
        return rule;
    }

    public void setRule(Rules rule) {
        this.rule = rule;
    }

    public String getRefData() {
        return refData;
    }

    public void setRefData(String refData) {
        this.refData = refData;
    }

    public List<FlightSegment> getFromSegments() {
        return fromSegments;
    }

    public void setFromSegments(List<FlightSegment> fromSegments) {
        this.fromSegments = fromSegments;
    }

    public List<FlightSegment> getRetSegments() {
        return retSegments;
    }

    public void setRetSegments(List<FlightSegment> retSegments) {
        this.retSegments = retSegments;
    }
}
