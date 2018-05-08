package com.tzq.integration.service.intl.lcc;

import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface LccClient {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    public SearchFlightRes searchFlight(SearchFlightReq req);
}
