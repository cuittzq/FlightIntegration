package com.tzq.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.tzq.biz.service.purchase.core.LccBusiService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.FlightRouteVO;
import com.tzq.commons.model.ctrip.SearchVO;
import com.tzq.commons.model.integration.search.FlightSegmentVO;
import com.tzq.commons.model.integration.verify.VerifyReqVO;
import com.tzq.commons.model.integration.verify.VerifyResVO;
import com.tzq.commons.model.integration.verify.VerifyRoutingVO;
import com.tzq.dal.model.Test;
import com.tzq.dal.service.UserService;
import com.tzq.web.aop.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Resource
    private LccBusiService lccBusiService;

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
        searchVO.setDepDate("20180825");
        String                 areaType      = "1";
        String                 airlineCode   = "LCC";
        String                 sourceId      = "10001";
        RouteContext<SearchVO> context       = new RouteContext<>(searchVO, areaType, airlineCode, sourceId);
        FlightRouteVO          flightRouteVO = lccIntlSearchFlightService.searchFlight(context);
        return "hello";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    @UserAccess(desc = "verify")
    public String verify()
    {
        VerifyReqVO verifyReqVO  = new VerifyReqVO();

        verifyReqVO.setTripType("1");
        VerifyRoutingVO vo = new VerifyRoutingVO();
        List<FlightSegmentVO> fromSegments = new ArrayList<>();
        FlightSegmentVO flightSegmentVO = new FlightSegmentVO();
        flightSegmentVO.setArrAirport("SIN");
        flightSegmentVO.setAircraftCode("789");
        flightSegmentVO.setArrivingTerminal("2");
        flightSegmentVO.setArrTime("201811250830");
        flightSegmentVO.setCabin("O1");
        flightSegmentVO.setCarrier("TR");
        flightSegmentVO.setDepAirport("CAN");
        flightSegmentVO.setDepartureTerminal("1");
        flightSegmentVO.setDepTime("201811250345");
        flightSegmentVO.setCodeShare(false);
        fromSegments.add(flightSegmentVO);
        vo.setFromSegments(fromSegments);


        VerifyResVO vors = lccBusiService.verifyCabinAndPrice(verifyReqVO);
        return JSONObject.toJSONString(vo);
    }
}
