package com.tzq.web.service;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.mapper.FlightRoutingsVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.MethodEnum;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.VerifyReq;
import com.tzq.service.ctrip.models.verify.VerifyRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("ctripFlightService")
public class CtripFlightServiceImpl implements CtripFlightService {

    @Resource
    private OtaSearchFlightService otaSearchFlightService;


    @Resource
    private OtaIssueTicketService otaIssueTicketService;

    @Resource
    FlightRoutingsVOMapper flightRoutingsVOMapper;
    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    @Override
    public SearchFlightRes searchFlight(SearchFlightReq req) {
        RouteContext<SearchVO> context = new RouteContext();
        setDefaultCont(context);
        SearchVO searchVO = new SearchVO();
        searchVO.setDepDate(req.getRetDate());
        searchVO.setDepAirportCode(req.getFromCity());
        searchVO.setArrAirportCode(req.getToCity());
        searchVO.setArrDate(req.getRetDate());
        searchVO.setAdultCnt(req.getAdultNumber());
        searchVO.setChildCnt(req.getChildNumber());
        searchVO.setTripType(req.getTripType().equals(1) ? TripTypeEnum.OW : TripTypeEnum.RT);
        context.setT(searchVO);
        SearchFlightRes searchFlightRes = null;
        logger.info("调用LCC{}接口,入参{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(context));
        SingleResult<FlightRouteVO> response = otaSearchFlightService.searchFlight(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(response));
        if (response.getData() != null) {
            FlightRouteVO flightRouteVO = response.getData();
            searchFlightRes = new SearchFlightRes();
            searchFlightRes.setRoutings(flightRoutingsVOMapper.flightRoutingsVO2DTOs(flightRouteVO.getLightRouteList()));
        }
        return searchFlightRes;
    }

    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    @Override
    public VerifyRes verifyFlight(VerifyReq req) {
        RouteContext<SearchVO> context = new RouteContext();
        context.setAreaType(AreaTypeEnum.INTERNATIONAL);
        context.setOta(OTAEnum.CTRIP);

        CtripVerifyReqVO verifyReqVO = new CtripVerifyReqVO();
        verifyReqVO.setAdultNumber(req.getAdultNumber());
        verifyReqVO.setChildNumber(req.getChildNumber());
        verifyReqVO.setInfantNumber(req.getInfantNumber());
        verifyReqVO.setReferenceId(req.getReferenceId());
        verifyReqVO.setRequesttype(req.getRequesttype());
        verifyReqVO.setTripType(req.getTripType().intValue() == 1 ? TripTypeEnum.OW : TripTypeEnum.RT);


        return null;
    }

    /**
     * 生单
     *
     * @param req
     * @return
     */
    @Override
    public CreateOrderRes createOrder(CreateOrderReq req) {
        return null;
    }

    /**
     * 出票
     *
     * @param req
     * @return
     */
    @Override
    public String issueTicket(String req) {
        RouteContext<String> context = new RouteContext();
        setDefaultCont(context);
        context.setT(req);
        logger.info("调用LCC{}接口,入参{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(context));
        SingleResult<String> response = otaIssueTicketService.issueTicket(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(response));

        return response.getData();
    }

    /**
     * @param routeContext
     */
    private void setDefaultCont(RouteContext routeContext) {
        routeContext.setAreaType(AreaTypeEnum.INTERNATIONAL);
        routeContext.setOta(OTAEnum.CTRIP);
    }
}
