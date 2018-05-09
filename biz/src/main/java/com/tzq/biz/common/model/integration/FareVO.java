/**
 * LY.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.tzq.biz.common.model.integration;

import com.google.common.collect.Maps;
import com.tzq.biz.common.enums.CurrencyEnum;
import com.tzq.biz.common.enums.PassengerTypeEnum;
import com.tzq.biz.common.model.Money;
import org.apache.commons.collections.MapUtils;

import java.io.Serializable;
import java.util.Map;

/**
 * 运价
 *
 * @author czj12867
 * @version $Id: FareVO.java, v 0.1 2016年10月18日 上午11:18:58 czj12867 Exp $
 */
public class FareVO implements Serializable {

    /**  */
    private static final long serialVersionUID = 5393108473264392872L;

    /**
     * 乘客类型
     */
    private PassengerTypeEnum passengerType;

    /**
     * 货币代码
     */
    private CurrencyEnum currencyCode;

    /**
     * 票价
     */
    private Money ticketPrice = new Money();

    /**
     * fd价格
     */
    private Money fdPrice = new Money();

    /**
     * 基建费
     */
    private Money airportTax = new Money();

    /**
     * 其他税费
     */
    private Money otherTax = new Money();

    /**
     * 签注栏代码
     */
    private String ei;

    /**
     * 签注栏描述
     */
    private String eiComment;

    /**
     * 行李单位
     */
    private String baggageUnit;

    /**
     * 行李额
     */
    private String baggageNum;

    /**
     * 优惠金额
     */
    private Money couponsAmount = new Money();

    /**
     * 优惠码
     */
    private String couponsNo;

    /**
     * TC项
     */
    private String tourCode;

    /**
     * 票价基础代码
     */
    private String fareBasisCode;

    /**
     * 扩展字段
     */
    private Map<String, Object> extInfo = Maps.newHashMap();

    /**
     * Getter method for property <tt>passengerType</tt>.
     *
     * @return property value of passengerType
     */
    public PassengerTypeEnum getPassengerType() {
        return passengerType;
    }

    /**
     * Setter method for property <tt>passengerType</tt>.
     *
     * @param passengerType value to be assigned to property passengerType
     */
    public void setPassengerType(PassengerTypeEnum passengerType) {
        this.passengerType = passengerType;
    }

    /**
     * Getter method for property <tt>currencyCode</tt>.
     *
     * @return property value of currencyCode
     */
    public CurrencyEnum getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter method for property <tt>currencyCode</tt>.
     *
     * @param currencyCode value to be assigned to property currencyCode
     */
    public void setCurrencyCode(CurrencyEnum currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Getter method for property <tt>ticketPrice</tt>.
     *
     * @return property value of ticketPrice
     */
    public Money getTicketPrice() {
        return ticketPrice;
    }

    /**
     * Setter method for property <tt>ticketPrice</tt>.
     *
     * @param ticketPrice value to be assigned to property ticketPrice
     */
    public void setTicketPrice(Money ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Getter method for property <tt>fdPrice</tt>.
     *
     * @return property value of fdPrice
     */
    public Money getFdPrice() {
        return fdPrice;
    }

    /**
     * Setter method for property <tt>fdPrice</tt>.
     *
     * @param fdPrice value to be assigned to property fdPrice
     */
    public void setFdPrice(Money fdPrice) {
        this.fdPrice = fdPrice;
    }

    /**
     * Getter method for property <tt>airportTax</tt>.
     *
     * @return property value of airportTax
     */
    public Money getAirportTax() {
        return airportTax;
    }

    /**
     * Setter method for property <tt>airportTax</tt>.
     *
     * @param airportTax value to be assigned to property airportTax
     */
    public void setAirportTax(Money airportTax) {
        this.airportTax = airportTax;
    }

    /**
     * Getter method for property <tt>otherTax</tt>.
     *
     * @return property value of otherTax
     */
    public Money getOtherTax() {
        return otherTax;
    }

    /**
     * Setter method for property <tt>otherTax</tt>.
     *
     * @param otherTax value to be assigned to property otherTax
     */
    public void setOtherTax(Money otherTax) {
        this.otherTax = otherTax;
    }

    /**
     * Getter method for property <tt>ei</tt>.
     *
     * @return property value of ei
     */
    public String getEi() {
        return ei;
    }

    /**
     * Setter method for property <tt>ei</tt>.
     *
     * @param ei value to be assigned to property ei
     */
    public void setEi(String ei) {
        this.ei = ei;
    }

    /**
     * Getter method for property <tt>eiComment</tt>.
     *
     * @return property value of eiComment
     */
    public String getEiComment() {
        return eiComment;
    }

    /**
     * Setter method for property <tt>eiComment</tt>.
     *
     * @param eiComment value to be assigned to property eiComment
     */
    public void setEiComment(String eiComment) {
        this.eiComment = eiComment;
    }

    /**
     * Getter method for property <tt>baggageUnit</tt>.
     *
     * @return property value of baggageUnit
     */
    public String getBaggageUnit() {
        return baggageUnit;
    }

    /**
     * Setter method for property <tt>baggageUnit</tt>.
     *
     * @param baggageUnit value to be assigned to property baggageUnit
     */
    public void setBaggageUnit(String baggageUnit) {
        this.baggageUnit = baggageUnit;
    }

    /**
     * Getter method for property <tt>baggageNum</tt>.
     *
     * @return property value of baggageNum
     */
    public String getBaggageNum() {
        return baggageNum;
    }

    /**
     * Setter method for property <tt>baggageNum</tt>.
     *
     * @param baggageNum value to be assigned to property baggageNum
     */
    public void setBaggageNum(String baggageNum) {
        this.baggageNum = baggageNum;
    }

    /**
     * Getter method for property <tt>couponsAmount</tt>.
     *
     * @return property value of couponsAmount
     */
    public Money getCouponsAmount() {
        return couponsAmount;
    }

    /**
     * Setter method for property <tt>couponsAmount</tt>.
     *
     * @param couponsAmount value to be assigned to property couponsAmount
     */
    public void setCouponsAmount(Money couponsAmount) {
        this.couponsAmount = couponsAmount;
    }

    /**
     * Getter method for property <tt>couponsNo</tt>.
     *
     * @return property value of couponsNo
     */
    public String getCouponsNo() {
        return couponsNo;
    }

    /**
     * Setter method for property <tt>couponsNo</tt>.
     *
     * @param couponsNo value to be assigned to property couponsNo
     */
    public void setCouponsNo(String couponsNo) {
        this.couponsNo = couponsNo;
    }

    /**
     * Getter method for property <tt>tourCode</tt>.
     *
     * @return property value of tourCode
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Setter method for property <tt>tourCode</tt>.
     *
     * @param tourCode value to be assigned to property tourCode
     */
    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    /**
     * Getter method for property <tt>fareBasisCode</tt>.
     *
     * @return property value of fareBasisCode
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Setter method for property <tt>fareBasisCode</tt>.
     *
     * @param fareBasisCode value to be assigned to property fareBasisCode
     */
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    /**
     * 新增运价扩展属性
     *
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
     *
     * @param key
     * @return
     */
    public Object getAttribute(String key) {
        if (extInfo == null) {
            return null;
        }
        return extInfo.get(key);
    }

    /**
     * 获取extInfo
     *
     * @return
     */
    public Map<String, Object> getExtInfo() {
        return extInfo;
    }
}
