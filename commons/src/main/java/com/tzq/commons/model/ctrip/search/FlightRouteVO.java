package com.tzq.commons.model.ctrip.search;

import com.tzq.commons.model.BaseVO;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightRouteVO extends BaseVO<Long> {

    /**  */
    private static final long serialVersionUID = 2400324495088848428L;
    private Long id;


    /**
     * 行程类型
     */
    private Integer tripType;

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
    private String depDate;

    /**
     * 回程日期
     */
    private String retDate;

    /**
     * 国内国际区分
     */
    private String areaType;

    /**
     * 扩展字段
     */
    private String extInfo;

    /**
     * 航班组列表
     */
    private List<FlightRoutingsVO> lightRouteList = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTripType() {
        return tripType;
    }

    public void setTripType(Integer tripType) {
        this.tripType = tripType;
    }

    public String getDepAirportCode() {
        return depAirportCode;
    }

    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    public String getArrAirportCode() {
        return arrAirportCode;
    }

    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getRetDate() {
        return retDate;
    }

    public void setRetDate(String retDate) {
        this.retDate = retDate;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public List<FlightRoutingsVO> getLightRouteList() {
        return lightRouteList;
    }

    public void setLightRouteList(List<FlightRoutingsVO> lightRouteList) {
        this.lightRouteList = lightRouteList;
    }
}
