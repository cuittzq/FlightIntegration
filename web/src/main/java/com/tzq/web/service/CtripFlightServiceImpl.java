package com.tzq.web.service;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.mapper.CtripVerifyVOMapper;
import com.tzq.commons.mapper.FlightRoutingsVOMapper;
import com.tzq.commons.mapper.OrderVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.MethodEnum;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.order.ContactDTO;
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
import java.util.List;

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
    private OtaCreateOrderService otaCreateOrderService;

    @Resource
    FlightRoutingsVOMapper flightRoutingsVOMapper;


    @Resource
    CtripVerifyVOMapper ctripVerifyVOMapper;

    @Resource
    OrderVOMapper orderVOMapper;

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
        CtripVerifyRes response = new CtripVerifyRes();

        CtripVerifyReqVO verifyReqVO = new CtripVerifyReqVO();
        verifyReqVO.setAdultNumber(req.getAdultNumber());
        verifyReqVO.setChildNumber(req.getChildNumber());
        verifyReqVO.setInfantNumber(req.getInfantNumber());
        verifyReqVO.setReferenceId(req.getReferenceId());
        verifyReqVO.setRequesttype(req.getRequesttype());
        verifyReqVO.setTripType(req.getTripType().intValue()==1?TripTypeEnum.OW:TripTypeEnum.RT);

        verifyReqVO.setRouting(flightRoutingsVOMapper.flightRoutingsDTO2VO(req.getRoutings()));
        verifyReqVO.getRouting().setFromSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRoutings().getFromSegments()));
        verifyReqVO.getRouting().setRetSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRoutings().getRetSegments()));

        SingleResult<CtripVerifyResVO> singleResult =   otaVerifyFlightService.verifyFlight(context);

        if (!singleResult.isSuccess() || singleResult.getData() == null) {
            response.setMsg(singleResult.getErrorMessage());
            response.setStatus(StatusEnum.INNER_ERROR.getCode());
            return response;
        }
        response.setStatus(StatusEnum.SUCCEED.getCode());
        response.setMaxSeats(singleResult.getData().getMaxSeats());
        response.setRule(ctripVerifyVOMapper.rulesVO2DTO(singleResult.getData().getRule()));
        response.setRouting(ctripVerifyVOMapper.flightRoutingsVO2DTO(singleResult.getData().getRouting()));

        return response;
    }

    /**
     * 生单
     *
     * @param req
     * @return
     */
    @Override
    public CreateOrderRes createOrder(CreateOrderReq req) {
        RouteContext<CreateOrderReqVO> context = new RouteContext();
        setDefaultCont(context);

        CreateOrderReqVO createOrderReqVO = new CreateOrderReqVO();
        context.setT(createOrderReqVO);

        // 携程订单信息转换
        createOrderReqVO.setCtripOrderId(orderVOMapper.orderCtripDTO2VO(req.getCtripOrderId()));
        List<ContactDTO> contactDTOS = Lists.newArrayList();
        contactDTOS.add(req.getContact());

        // 联系人信息
        createOrderReqVO.setContact(orderVOMapper.orderCtripDTO2VO(contactDTOS));
        createOrderReqVO.setPassengerbaggages(orderVOMapper.orderCtripDTO2VO1(req.getPassengerbaggages()));
        createOrderReqVO.setPassengers(orderVOMapper.orderCtripDTO2VO2(req.getPassengers()));
        createOrderReqVO.setReferenceId(req.getReferenceId());
        createOrderReqVO.setRouting(flightRoutingsVOMapper.flightRoutingsDTO2VO(req.getRouting()));
        createOrderReqVO.getRouting().setFromSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRouting().getFromSegments()));
        createOrderReqVO.getRouting().setRetSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRouting().getRetSegments()));
        createOrderReqVO.getRouting().setRule(flightRoutingsVOMapper.rulesDTO2VO(req.getRouting().getRule()));

        logger.info("调用LCC{}接口,入参{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(context));
        SingleResult<CreateOrderResVO>  singleResult= otaCreateOrderService.createOrder(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(1));
        CreateOrderRes response = new CreateOrderRes();
        if (!singleResult.isSuccess() || singleResult.getData() == null) {
            response.setMsg(singleResult.getErrorMessage());
            response.setStatus(StatusEnum.INNER_ERROR.getCode());
            return response;
        }

        response.setStatus(StatusEnum.SUCCEED.getCode());
        response.setMaxSeats(singleResult.getData().getMaxSeats());
        response.setOrderContact(orderVOMapper.orderCtripVO2DTO( singleResult.getData().getOrderContact()));
        response.setOrderNo(singleResult.getData().getOrderNo());
        response.setPnrCode(singleResult.getData().getPnrCode());
        response.setRouting(ctripVerifyVOMapper.flightRoutingsVO2DTO(singleResult.getData().getRouting()));
        response.setPassengerbaggages(orderVOMapper.orderCtripVO2DTO(singleResult.getData().getPassengerbaggages()));

        return response;
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
