package com.tzq.web.controller;

import com.tzq.biz.common.enums.TripTypeEnum;
import com.tzq.biz.common.model.context.RouteContext;
import com.tzq.biz.common.model.integration.FlightRouteVO;
import com.tzq.biz.common.model.integration.SearchVO;
import com.tzq.biz.service.core.SearchFlightService;
import com.tzq.dal.model.Test;
import com.tzq.dal.service.UserService;
import com.tzq.integration.utils.DateUtils;
import com.tzq.web.aop.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
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
    private UserService userService;

    @Autowired
    private SearchFlightService lccIntlSearchFlightService;

    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    @UserAccess(desc = "gethello")
    public String gethello() {
        Test user = new Test();
        user.setId(121);
        user.setName("test");
        user.setUpdatetime(new Date());
        userService.addUser(user);
        return "hello";
    }

    @RequestMapping(value = "/searchFlight", method = RequestMethod.GET)
    @UserAccess(desc = "searchFlight")
    public String searchFlight() {
        SearchVO searchVO = new SearchVO();
        searchVO.setDepAirportCode("CAN");
        searchVO.setArrAirportCode("SIN");
        searchVO.setTripType(TripTypeEnum.OW);
        try {
            searchVO.setDepDate(DateUtils.parseDateNoTime("20180825"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String areaType = "1";
        String airlineCode = "LCC";
        String sourceId = "10001";
        RouteContext<SearchVO> context = new RouteContext<>(searchVO, areaType, airlineCode, sourceId);
        FlightRouteVO flightRouteVO = lccIntlSearchFlightService.searchFlight(context);
        return "hello";
    }
}
