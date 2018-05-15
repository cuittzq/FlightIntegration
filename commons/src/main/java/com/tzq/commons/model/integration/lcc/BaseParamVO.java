package com.tzq.commons.model.integration.lcc;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class BaseParamVO implements Serializable {

    private static final long serialVersionUID = 3983876480860786043L;

    private String cid;

    /**
     * 行程类型: 1.单程 2.往返
     */
    private String tripType;

    private String sessionId;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"cid\":\"").append(cid).append('\"');
        sb.append(",             \"tripType\":\"").append(tripType).append('\"');
        sb.append(",             \"sessionId\":\"").append(sessionId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
