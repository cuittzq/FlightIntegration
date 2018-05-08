package com.tzq.integration.common.model.integration;

import com.google.common.collect.Maps;
import com.tzq.integration.common.enums.InventoryEnum;
import com.tzq.integration.common.enums.StatusEnum;
import com.tzq.integration.common.model.Money;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Map;

/**
 * 仓位模型
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class CabinVO implements Serializable {

    /**  */
    private static final long serialVersionUID = -4011476843022205809L;

    /**
     * 基础仓位代码
     */
    private String baseCabinCode;

    /**
     * 基础仓位运价
     */
    private Money baseCabinPrice = new Money();

    /**
     * 仓位代码
     */
    private String cabinCode;

    /**
     * 仓位名称
     */
    private String cabinName;

    /**
     * 仓位等级
     */
    private String cabinClass;

    /**
     * 余座
     */
    private String inventory;

    /**
     * 是否支持预留座位
     */
    private StatusEnum isAsr;

    /**
     * 扩展字段
     */
    private Map<String, Object> extInfo = Maps.newHashMap();

    public CabinVO() {
    }

    public CabinVO(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    /**
     * Getter method for property <tt>baseCabinCode</tt>.
     *
     * @return property value of baseCabinCode
     */
    public String getBaseCabinCode() {
        return baseCabinCode;
    }

    /**
     * Setter method for property <tt>baseCabinCode</tt>.
     *
     * @param baseCabinCode value to be assigned to property baseCabinCode
     */
    public void setBaseCabinCode(String baseCabinCode) {
        this.baseCabinCode = baseCabinCode;
    }

    /**
     * Getter method for property <tt>baseCabinPrice</tt>.
     *
     * @return property value of baseCabinPrice
     */
    public Money getBaseCabinPrice() {
        return baseCabinPrice;
    }

    /**
     * Setter method for property <tt>baseCabinPrice</tt>.
     *
     * @param baseCabinPrice value to be assigned to property baseCabinPrice
     */
    public void setBaseCabinPrice(Money baseCabinPrice) {
        this.baseCabinPrice = baseCabinPrice;
    }

    /**
     * Getter method for property <tt>cabinCode</tt>.
     *
     * @return property value of cabinCode
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * Setter method for property <tt>cabinCode</tt>.
     *
     * @param cabinCode value to be assigned to property cabinCode
     */
    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    /**
     * Getter method for property <tt>cabinName</tt>.
     *
     * @return property value of cabinName
     */
    public String getCabinName() {
        return cabinName;
    }

    /**
     * Setter method for property <tt>cabinName</tt>.
     *
     * @param cabinName value to be assigned to property cabinName
     */
    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    /**
     * Getter method for property <tt>cabinClass</tt>.
     *
     * @return property value of cabinClass
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * Setter method for property <tt>cabinClass</tt>.
     *
     * @param cabinClass value to be assigned to property cabinClass
     */
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    /**
     * Getter method for property <tt>inventory</tt>.
     *
     * @return property value of inventory
     */
    public String getInventory() {
        return inventory;
    }

    /**
     * Setter method for property <tt>inventory</tt>.
     *
     * @param inventory value to be assigned to property inventory
     */
    public void setInventory(String inventory) {
        if (StringUtils.isNumeric(inventory)) {
            this.inventory = inventory;
            return;
        }
        if (InventoryEnum.getEnumByCode(StringUtils.upperCase(inventory)) != null) {
            this.inventory = StringUtils.upperCase(inventory);
            return;
        }
        this.inventory = "0";
    }

    /**
     * Getter method for property <tt>isAsr</tt>.
     *
     * @return property value of isAsr
     */
    public StatusEnum getIsAsr() {
        return isAsr;
    }

    /**
     * Setter method for property <tt>isAsr</tt>.
     *
     * @param isAsr value to be assigned to property isAsr
     */
    public void setIsAsr(StatusEnum isAsr) {
        this.isAsr = isAsr;
    }

    /**
     * 新增仓位扩展属性
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

    public Map<String, Object> getExtInfo() {
        return extInfo;
    }
}