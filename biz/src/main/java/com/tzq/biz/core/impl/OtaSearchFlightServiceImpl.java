package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import org.springframework.stereotype.Service;

@Service
public class OtaSearchFlightServiceImpl implements OtaSearchFlightService {
    @Override
    public SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context) {
        return null;
    }
}
