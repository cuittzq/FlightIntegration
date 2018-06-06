package com.tzq.commons.model.integration.lcc.verify.search;

import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

import java.util.List;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchFlightResVO {
    /**
     * 结果类型: 0 成功 / 其他 失败
     */
    private int    status;
    /**
     * 提示信息，长度小于64个字符
     */
    private String msg;

    private List<FlightRoutingsVO> routings;

    public List<FlightRoutingsVO> getRoutings() {
        return routings;
    }

    public void setRoutings(List<FlightRoutingsVO> routings) {
        this.routings = routings;
    }
}
