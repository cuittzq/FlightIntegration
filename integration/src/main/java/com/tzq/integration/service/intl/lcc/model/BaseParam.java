package com.tzq.integration.service.intl.lcc.model;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class BaseParam implements Serializable {

    private static final long serialVersionUID = 3983876480860786043L;

    private String cid;

    /**
     * 行程类型: 1.单程 2.往返
     */
    private Integer tripType;

    private String sessionId;


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getTripType() {
        return tripType;
    }

    public void setTripType(Integer tripType) {
        this.tripType = tripType;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
