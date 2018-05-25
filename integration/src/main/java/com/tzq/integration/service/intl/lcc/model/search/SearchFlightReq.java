package com.tzq.integration.service.intl.lcc.model.search;

import com.tzq.integration.service.intl.lcc.model.BaseParam;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchFlightReq extends BaseParam {
    /**
     * 行程类型: 1.单程 2.往返
     */
    private Integer tripType;
    /**
     * 出发地城市或机场IATA三字码代码
     */
    private String fromCity;
    /**
     * 目的地城市或机场IATA三字码代码
     */
    private String toCity;
    /**
     * 去程时间，格式为YYYYMMDD
     */
    private String fromDate;
    /**
     * 回程日期，格式为YYYYMMDD（单程时无此参数）
     */
    private String retDate;

    @Override
    public Integer getTripType() {
        return tripType;
    }

    public void setTripType(Integer tripType) {
        this.tripType = tripType;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getRetDate() {
        return retDate;
    }

    public void setRetDate(String retDate) {
        this.retDate = retDate;
    }
}
