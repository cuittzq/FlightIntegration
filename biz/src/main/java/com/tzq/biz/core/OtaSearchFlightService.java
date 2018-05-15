package com.tzq.biz.core;


import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface OtaSearchFlightService {
    SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context);
}
