package com.tzq.commons.model.ctrip.search;

import com.tzq.commons.model.BaseVO;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightRouteVO extends BaseVO<Long> {

    private int status;

    private String msg;

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
    private List<FlightRoutingsVO> flightRouteList = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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

    public List<FlightRoutingsVO> getFlightRouteList() {
        return flightRouteList;
    }

    public void setFlightRouteList(List<FlightRoutingsVO> flightRouteList) {
        this.flightRouteList = flightRouteList;
    }
}
