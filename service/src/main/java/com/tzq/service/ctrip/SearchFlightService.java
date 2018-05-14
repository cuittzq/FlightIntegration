package com.tzq.service.ctrip;

import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface SearchFlightService {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    public SearchFlightRes searchFlight(SearchFlightReq req);
}
