package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OtaSearchFlightServiceImpl implements OtaSearchFlightService {

    @Resource
    SearchFlightService searchFlightService;

    @Override
    public SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context) {


        return null;
    }
}
