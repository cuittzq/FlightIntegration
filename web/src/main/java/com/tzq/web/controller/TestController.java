package com.tzq.web.controller;

import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.FlightRouteVO;
import com.tzq.commons.model.ctrip.SearchVO;
import com.tzq.web.aop.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/3
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@RestController
@RequestMapping(value = "/demo")
public class TestController {



    @Autowired
    private SearchFlightService lccIntlSearchFlightService;

    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    @UserAccess(desc = "gethello")
    public String gethello() {

        return "hello";
    }

    @RequestMapping(value = "/searchFlight", method = RequestMethod.GET)
    @UserAccess(desc = "searchFlight")
    public String searchFlight() {
        SearchVO searchVO = new SearchVO();
        searchVO.setDepAirportCode("CAN");
        searchVO.setArrAirportCode("SIN");
        searchVO.setTripType(TripTypeEnum.OW);
        searchVO.setDepDate("20180825");
        String                 areaType      = "1";
        String                 airlineCode   = "LCC";
        String                 sourceId      = "10001";
        RouteContext<SearchVO> context       = new RouteContext<>(searchVO, areaType, airlineCode, sourceId);
        FlightRouteVO          flightRouteVO = lccIntlSearchFlightService.searchFlight(context);
        return "hello";
    }
}
