package com.tzq.web.service;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.mapper.CtripVerifyVOMapper;
import com.tzq.commons.mapper.FlightRoutingsVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.MethodEnum;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;
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
    private OtaVerifyFlightService otaVerifyFlightService;

    @Resource
    FlightRoutingsVOMapper flightRoutingsVOMapper;


    @Resource
    CtripVerifyVOMapper ctripVerifyVOMapper;
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
        SearchFlightRes searchFlightRes = new SearchFlightRes();
        logger.info("调用LCC{}接口,入参{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(context));
        SingleResult<FlightRouteVO> response = otaSearchFlightService.searchFlight(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(response));

        if (!response.isSuccess()) {
            searchFlightRes.setMsg(response.getErrorMessage());
            searchFlightRes.setStatus(StatusEnum.INNER_ERROR.getCode());
            return searchFlightRes;
        }

        searchFlightRes.setMsg(response.getErrorMessage());
        searchFlightRes.setStatus(StatusEnum.SUCCEED.getCode());
        FlightRouteVO flightRouteVO = response.getData();
        searchFlightRes.setRoutings(flightRoutingsVOMapper.flightRoutingsVO2DTOs(flightRouteVO.getLightRouteList()));
        return searchFlightRes;
    }

    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    @Override
    public CtripVerifyRes verifyFlight(CtripVerifyReq req) {
        RouteContext<CtripVerifyReqVO> context = new RouteContext();
        setDefaultCont(context);
        context.setT(ctripVerifyVOMapper.CtripVerifyReqdto2vo(req));
        SingleResult<CtripVerifyResVO> ctripVerifyResult = otaVerifyFlightService.verifyFlight(context);

        CtripVerifyRes response = new CtripVerifyRes();
        if (!ctripVerifyResult.isSuccess()) {
            response.setMsg(ctripVerifyResult.getErrorMessage());
            response.setStatus(StatusEnum.INNER_ERROR.getCode());
            return response;
        }

        response.setMsg(ctripVerifyResult.getErrorMessage());
        response.setStatus(StatusEnum.SUCCEED.getCode());
        CtripVerifyResVO ctripVerifyResVO = ctripVerifyResult.getData();
        return ctripVerifyVOMapper.CtripVerifyResvO2dto(ctripVerifyResVO);
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
