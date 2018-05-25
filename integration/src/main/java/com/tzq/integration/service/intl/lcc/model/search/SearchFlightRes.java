package com.tzq.integration.service.intl.lcc.model.search;

import java.util.List;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchFlightRes {
    /**
     * 结果类型: 0 成功 / 其他 失败
     */
    private int    status;
    /**
     * 提示信息，长度小于64个字符
     */
    private String msg;

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

    private List<FlightRoutings> routings;

    public List<FlightRoutings> getRoutings() {
        return routings;
    }

    public void setRoutings(List<FlightRoutings> routings) {
        this.routings = routings;
    }
}
