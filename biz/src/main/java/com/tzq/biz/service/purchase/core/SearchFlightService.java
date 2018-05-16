package com.tzq.biz.service.purchase.core;


import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.context.RouteContext;

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
     *
     * @param context
     */
    FlightRouteVO searchFlight(RouteContext<SearchVO> context);
}
