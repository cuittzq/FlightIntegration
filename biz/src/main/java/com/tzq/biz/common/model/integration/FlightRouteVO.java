package com.tzq.biz.common.model.integration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tzq.biz.common.enums.AreaTypeEnum;
import com.tzq.biz.common.enums.TripTypeEnum;
import com.tzq.biz.common.model.BaseVO;
import org.apache.commons.collections.MapUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 航线
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightRouteVO extends BaseVO<Long> {

    /**  */
    private static final long serialVersionUID = 2400324495088848428L;

    private Long id;

    /**
     * 航线标示
     */
    private String routekey;

    /**
     * 行程类型
     */
    private TripTypeEnum tripType;

    /**
     * 出发三字码
     */
    private String depAirportCode;

    /**
     * 到达三字码
     */
    private String arrAirportCode;

    /**
     * 出发日期
     */
    private Date depDate;

    /**
     * 回程日期
     */
    private Date retDate;

    /**
     * 国内国际区分
     */
    private AreaTypeEnum areaType;

    /**
     * 订单二字码
     */
    private String airlineCode;

    /**
     * 供应商Id
     */
    private String sourceId;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 扩展字段
     */
    private Map<String, Object> extInfo = Maps.newHashMap();

    /**
     * 航段组列表
     */
    private List<FlightUnitVO> flightUnitList = Lists.newArrayList();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>routekey</tt>.
     *
     * @return property value of routekey
     */
    public String getRoutekey() {
        return routekey;
    }

    /**
     * Setter method for property <tt>routekey</tt>.
     *
     * @param routekey value to be assigned to property routekey
     */
    public void setRoutekey(String routekey) {
        this.routekey = routekey;
    }

    /**
     * Getter method for property <tt>tripType</tt>.
     *
     * @return property value of tripType
     */
    public TripTypeEnum getTripType() {
        return tripType;
    }

    /**
     * Setter method for property <tt>tripType</tt>.
     *
     * @param tripType value to be assigned to property tripType
     */
    public void setTripType(TripTypeEnum tripType) {
        this.tripType = tripType;
    }

    /**
     * Getter method for property <tt>depAirportCode</tt>.
     *
     * @return property value of depAirportCode
     */
    public String getDepAirportCode() {
        return depAirportCode;
    }

    /**
     * Setter method for property <tt>depAirportCode</tt>.
     *
     * @param depAirportCode value to be assigned to property depAirportCode
     */
    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    /**
     * Getter method for property <tt>arrAirportCode</tt>.
     *
     * @return property value of arrAirportCode
     */
    public String getArrAirportCode() {
        return arrAirportCode;
    }

    /**
     * Setter method for property <tt>arrAirportCode</tt>.
     *
     * @param arrAirportCode value to be assigned to property arrAirportCode
     */
    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    /**
     * Getter method for property <tt>depDate</tt>.
     *
     * @return property value of depDate
     */
    public Date getDepDate() {
        return depDate;
    }

    /**
     * Setter method for property <tt>depDate</tt>.
     *
     * @param depDate value to be assigned to property depDate
     */
    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    /**
     * Getter method for property <tt>retDate</tt>.
     *
     * @return property value of retDate
     */
    public Date getRetDate() {
        return retDate;
    }

    /**
     * Setter method for property <tt>retDate</tt>.
     *
     * @param retDate value to be assigned to property retDate
     */
    public void setRetDate(Date retDate) {
        this.retDate = retDate;
    }

    /**
     * Getter method for property <tt>areaType</tt>.
     *
     * @return property value of areaType
     */
    public AreaTypeEnum getAreaType() {
        return areaType;
    }

    /**
     * Setter method for property <tt>areaType</tt>.
     *
     * @param areaType value to be assigned to property areaType
     */
    public void setAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
    }

    /**
     * Getter method for property <tt>airlineCode</tt>.
     *
     * @return property value of airlineCode
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Setter method for property <tt>airlineCode</tt>.
     *
     * @param airlineCode value to be assigned to property airlineCode
     */
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /**
     * Getter method for property <tt>sourceId</tt>.
     *
     * @return property value of sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Setter method for property <tt>sourceId</tt>.
     *
     * @param sourceId value to be assigned to property sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Getter method for property <tt>memberId</tt>.
     *
     * @return property value of memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Setter method for property <tt>memberId</tt>.
     *
     * @param memberId value to be assigned to property memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * Getter method for property <tt>flightUnitList</tt>.
     *
     * @return property value of flightUnitList
     */
    public List<FlightUnitVO> getFlightUnitList() {
        return flightUnitList;
    }

    /**
     * Setter method for property <tt>flightUnitList</tt>.
     *
     * @param flightUnitList value to be assigned to property flightUnitList
     */
    public void setFlightUnitList(List<FlightUnitVO> flightUnitList) {
        this.flightUnitList = flightUnitList;
    }

    /**
     * 新增航段扩展属性
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
        if (MapUtils.isEmpty(extInfo)) {
            extInfo = Maps.newHashMap();
        }
        return extInfo;
    }
}
