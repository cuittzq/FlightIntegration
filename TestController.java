package com.tzq.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.tzq.biz.service.purchase.core.LccBusiService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;
import com.tzq.commons.model.integration.lcc.search.FlightSegmentVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyReqVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyResVO;
import com.tzq.dal.model.log.RuleMatchingLog;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.service.OrderInfoService;
import com.tzq.dal.service.RuleMatchingLogService;
import com.tzq.web.aop.UserAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
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

//    @Autowired
//    private UserService userService;

    @Resource
    private LccBusiService lccBusiService;

    @Resource
    private OrderInfoService orderInfoService;
    @Autowired
    private SearchFlightService lccIntlSearchFlightService;

    @Autowired
    private RuleMatchingLogService ruleMatchingLogService;

    @RequestMapping(value = "/gethello", method = RequestMethod.GET)
    @UserAccess(desc = "gethello")
    public String gethello() {

//        Test user = new Test();
//        user.setId(121);
//        user.setName("test");
//        user.setUpdatetime(new Date());
//        userService.addUser(user);
        RuleMatchingLog ruleMatchingLog = new RuleMatchingLog();
//        private Integer salesplatform;
//        private Integer purchaseplatform;
//        private Date requestdate;
//        private String requesttype;
//        private String carrier;
//        private String depcode;
//        private String arrcode;
//        private Date depdate;
//        private Date backdate;
//        private String platruleidarray;
//        private String platrulevalue;
//        private String supplierruleidarray;
//        private String supplierrulevalue;
//        private String currencysalesruleidarray;
//        private String currencysalesrulevalue;
//        private String exactsalesruleidarray;
//        private String exactsalesrulevalue;
//        private String refundruleidarray;
//        private String refundrulevalue;
//        private Date modifytime;
        ruleMatchingLog.setRequesttype("");
        ruleMatchingLog.setArrcode("");
        ruleMatchingLog.setBackdate(new Date());
        ruleMatchingLog.setCarrier("");
        ruleMatchingLog.setRequestdate(new Date());
        ruleMatchingLog.setCurrencysalesruleidarray("");
        ruleMatchingLog.setCurrencysalesrulevalue("");
        ruleMatchingLog.setDepcode("");
        ruleMatchingLog.setDepdate(new Date());
        ruleMatchingLog.setModifytime(new Date());
        ruleMatchingLog.setPlatruleidarray("");
        ruleMatchingLog.setRefundruleidarray("");
        ruleMatchingLog.setSupplierrulevalue("");
        ruleMatchingLog.setSalesplatform(1);
        ruleMatchingLog.setPurchaseplatform(1);
        ruleMatchingLog.setSalesplatform(1);

        ruleMatchingLogService.insert(ruleMatchingLog);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setSalesplatform(1);

        orderInfo.setPurchaseplatform(1);

        orderInfo.setCreattime(new Date());

        orderInfo.setOuttickettime(new Date());

        orderInfo.setOrderno("");

        orderInfo.setPnr("");

        orderInfo.setTicketno("");

        orderInfo.setOrderstate((byte) 1);

        orderInfo.setDepcode("");

        orderInfo.setArrcode("");

        orderInfo.setDepdate(new Date());

        orderInfo.setDeptime(new Date());

        orderInfo.setBackdate(new Date());

        orderInfo.setBacktime(new Date());

        orderInfo.setCabin("");

        orderInfo.setBackcabin("");

        orderInfo.setFlightno("");

        orderInfo.setBackflightno("");

        orderInfo.setAduitsalesprice(new BigDecimal(1));

        orderInfo.setAduitpurchasepirce(new BigDecimal(1));

        orderInfo.setChildsalesprice(new BigDecimal(1));

        orderInfo.setChildpurchasepirce(new BigDecimal(1));

        orderInfo.setBabysalesprice(new BigDecimal(1));

        orderInfo.setBabypurchasepirce(new BigDecimal(1));

        orderInfo.setBackaduitsalesprice(new BigDecimal(1));

        orderInfo.setBackaduitpurchasepirce(new BigDecimal(1));

        orderInfo.setBackchildsalesprice(new BigDecimal(1));

        orderInfo.setBackchildpurchasepirce(new BigDecimal(1));

        orderInfo.setBackbabysalesprice(new BigDecimal(1));

        orderInfo.setBackbabypurchasepirce(new BigDecimal(1));

        orderInfo.setTotalsalesprice(new BigDecimal(1));

        orderInfo.setTotalpurchaseprice(new BigDecimal(1));

        orderInfo.setAuditcount(1);

        orderInfo.setChildcount(1);

        orderInfo.setBabycount(1);

        orderInfo.setOuttickettype("");

        orderInfo.setOutticketcompany("");

        orderInfo.setLinkname("");

        orderInfo.setLinkmobile("");

        orderInfo.setLinkemail("");

        orderInfo.setLinkaddress("");

        orderInfo.setLinkpostcode("");

        orderInfo.setExtendvalue("");

        orderInfo.setModifytime(new Date());
        orderInfoService.insert(orderInfo);
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
        String areaType = "1";
        String airlineCode = "LCC";
        String sourceId = "10001";
        RouteContext<SearchVO> context = new RouteContext<>(searchVO, areaType, airlineCode, sourceId);
        FlightRouteVO flightRouteVO = lccIntlSearchFlightService.searchFlight(context);
        return "hello";
    }

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    @UserAccess(desc = "verify")
    public String verify() {
        VerifyReqVO verifyReqVO = new VerifyReqVO();

        verifyReqVO.setTripType(1);
        FlightRoutingsVO vo = new FlightRoutingsVO();
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
        flightSegmentVO.setFlightNumber("107");
        flightSegmentVO.setCodeShare(false);
        fromSegments.add(flightSegmentVO);
        vo.setFromSegments(fromSegments);
        verifyReqVO.setRouting(vo);

        VerifyResVO vors = lccBusiService.verifyCabinAndPrice(verifyReqVO);

        return JSONObject.toJSONString(vors);
    }
}
