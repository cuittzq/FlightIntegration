package com.tzq.integration.service.intl.lcc.model;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class BaseParam implements Serializable {

    private static final long serialVersionUID = 3983876480860786043L;

    private String cid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
