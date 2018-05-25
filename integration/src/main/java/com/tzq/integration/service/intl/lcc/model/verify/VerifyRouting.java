package com.tzq.integration.service.intl.lcc.model.verify;

import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;

import java.util.List;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class VerifyRouting {
    private String              data;
    private List<FlightSegment> fromSegments;
    private List<FlightSegment> retSegments;
    private String              refData;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getRefData() {
        return refData;
    }

    public void setRefData(String refData) {
        this.refData = refData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"data\":\"").append(data).append('\"');
        sb.append(",             \"fromSegments\":").append(fromSegments);
        sb.append(",             \"retSegments\":").append(retSegments);
        sb.append(",             \"refData\":\"").append(refData).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
