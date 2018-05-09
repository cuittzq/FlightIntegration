package com.tzq.biz.service.core;

import com.tzq.biz.common.model.context.RouteContext;
import com.tzq.biz.common.model.integration.FlightRouteVO;
import com.tzq.biz.common.model.integration.SearchVO;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface SearchFlightService {
    /**
     * 查询
     * @param context
     */
    public FlightRouteVO searchFlight(RouteContext<SearchVO> context);
}
