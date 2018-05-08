package com.tzq.biz.common.model.integration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tzq.biz.common.model.Money;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 航班组
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightUnitVO implements Serializable {

    /**  */
    private static final long   serialVersionUID = -6353518122580306793L;

    private Date updateTime;

    /** 成人总票价 */
    private Money               adultTotalPrice  = new Money();

    /** 成人总税费 */
    private Money               adultTotalTax    = new Money();

    /** 儿童总票价 */
    private Money               childTotalPrice  = new Money();

    /** 儿童总税费 */
    private Money               childTotalTax    = new Money();

    /** 婴儿总票价 */
    private Money               infantTotalPrice = new Money();

    /** 婴儿总税费 */
    private Money               infantTotalTax   = new Money();

    /** 航班号组 */
    private String              flightNoGroup;

    /** 仓位组 */
    private String              cabinCodeGroup;

    /** 产品组 */
    private String              productCodeGroup;

    /** 扩展字段 */
    private Map<String, Object> extInfo = Maps.newHashMap();

    /** 航班列表 */
    private List<SegmentVO> segmentList = Lists.newArrayList();

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Getter method for property <tt>adultTotalPrice</tt>.
     *
     * @return property value of adultTotalPrice
     */
    public Money getAdultTotalPrice() {
        return adultTotalPrice;
    }

    /**
     * Setter method for property <tt>adultTotalPrice</tt>.
     *
     * @param adultTotalPrice value to be assigned to property adultTotalPrice
     */
    public void setAdultTotalPrice(Money adultTotalPrice) {
        this.adultTotalPrice = adultTotalPrice;
    }

    /**
     * Getter method for property <tt>adultTotalTax</tt>.
     *
     * @return property value of adultTotalTax
     */
    public Money getAdultTotalTax() {
        return adultTotalTax;
    }

    /**
     * Setter method for property <tt>adultTotalTax</tt>.
     *
     * @param adultTotalTax value to be assigned to property adultTotalTax
     */
    public void setAdultTotalTax(Money adultTotalTax) {
        this.adultTotalTax = adultTotalTax;
    }

    /**
     * Getter method for property <tt>childTotalPrice</tt>.
     *
     * @return property value of childTotalPrice
     */
    public Money getChildTotalPrice() {
        return childTotalPrice;
    }

    /**
     * Setter method for property <tt>childTotalPrice</tt>.
     *
     * @param childTotalPrice value to be assigned to property childTotalPrice
     */
    public void setChildTotalPrice(Money childTotalPrice) {
        this.childTotalPrice = childTotalPrice;
    }

    /**
     * Getter method for property <tt>childTotalTax</tt>.
     *
     * @return property value of childTotalTax
     */
    public Money getChildTotalTax() {
        return childTotalTax;
    }

    /**
     * Setter method for property <tt>childTotalTax</tt>.
     *
     * @param childTotalTax value to be assigned to property childTotalTax
     */
    public void setChildTotalTax(Money childTotalTax) {
        this.childTotalTax = childTotalTax;
    }

    /**
     * Getter method for property <tt>infantTotalPrice</tt>.
     *
     * @return property value of infantTotalPrice
     */
    public Money getInfantTotalPrice() {
        return infantTotalPrice;
    }

    /**
     * Setter method for property <tt>infantTotalPrice</tt>.
     *
     * @param infantTotalPrice value to be assigned to property infantTotalPrice
     */
    public void setInfantTotalPrice(Money infantTotalPrice) {
        this.infantTotalPrice = infantTotalPrice;
    }

    /**
     * Getter method for property <tt>infantTotalTax</tt>.
     *
     * @return property value of infantTotalTax
     */
    public Money getInfantTotalTax() {
        return infantTotalTax;
    }

    /**
     * Setter method for property <tt>infantTotalTax</tt>.
     *
     * @param infantTotalTax value to be assigned to property infantTotalTax
     */
    public void setInfantTotalTax(Money infantTotalTax) {
        this.infantTotalTax = infantTotalTax;
    }

    /**
     * Getter method for property <tt>flightNoGroup</tt>.
     *
     * @return property value of flightNoGroup
     */
    public String getFlightNoGroup() {
        return flightNoGroup;
    }

    /**
     * Setter method for property <tt>flightNoGroup</tt>.
     *
     * @param flightNoGroup value to be assigned to property flightNoGroup
     */
    public void setFlightNoGroup(String flightNoGroup) {
        this.flightNoGroup = flightNoGroup;
    }

    /**
     * Getter method for property <tt>cabinCodeGroup</tt>.
     *
     * @return property value of cabinCodeGroup
     */
    public String getCabinCodeGroup() {
        return cabinCodeGroup;
    }

    /**
     * Setter method for property <tt>cabinCodeGroup</tt>.
     *
     * @param cabinCodeGroup value to be assigned to property cabinCodeGroup
     */
    public void setCabinCodeGroup(String cabinCodeGroup) {
        this.cabinCodeGroup = cabinCodeGroup;
    }

    /**
     * Getter method for property <tt>productCodeGroup</tt>.
     *
     * @return property value of productCodeGroup
     */
    public String getProductCodeGroup() {
        return productCodeGroup;
    }

    /**
     * Setter method for property <tt>productCodeGroup</tt>.
     *
     * @param productCodeGroup value to be assigned to property productCodeGroup
     */
    public void setProductCodeGroup(String productCodeGroup) {
        this.productCodeGroup = productCodeGroup;
    }

    /**
     * Getter method for property <tt>segmentList</tt>.
     *
     * @return property value of segmentList
     */
    public List<SegmentVO> getSegmentList() {
        return segmentList;
    }

    /**
     * Setter method for property <tt>segmentList</tt>.
     *
     * @param segmentList value to be assigned to property segmentList
     */
    public void setSegmentList(List<SegmentVO> segmentList) {
        this.segmentList = segmentList;
    }

    /**
     * 新增航班组扩展属性
     * @param key
     * @param value
     */
    public void addAttribute(String key, Object value) {
        if (MapUtils.isEmpty(extInfo)) {
            extInfo = Maps.newHashMap();
        }
        extInfo.put(key, value);
    }

    /**
     * 获取属性
     * @param key
     * @return
     */
    public Object getAttribute(String key) {
        if (extInfo == null) {
            return null;
        }
        return extInfo.get(key);
    }

    public Map<String, Object> getExtInfo() {
        return extInfo;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        FlightUnitVO other = (FlightUnitVO) obj;
        if (StringUtils.equalsIgnoreCase(this.flightNoGroup, other.getFlightNoGroup()) && StringUtils.equalsIgnoreCase(this.cabinCodeGroup, other.getCabinCodeGroup())
                && StringUtils.equalsIgnoreCase(this.productCodeGroup, other.getProductCodeGroup())) {
            return true;
        }
        return false;
    }
}
