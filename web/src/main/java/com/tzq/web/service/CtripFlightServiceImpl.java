package com.tzq.web.service;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.commons.compress.GZipCompress;
import com.tzq.commons.enums.*;
import com.tzq.commons.mapper.ota.CtripOrderVOMapper;
import com.tzq.commons.mapper.ota.CtripVerifyVOMapper;
import com.tzq.commons.mapper.ota.FlightRoutingsVOMapper;
import com.tzq.commons.mapper.ota.IssueTicketVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.issueticket.IssueTicketReqDTO;
import com.tzq.service.ctrip.models.issueticket.IssueTicketResDTO;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
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
    CtripOrderVOMapper ctripOrderVOMapper;

    @Resource
    IssueTicketVOMapper issueTicketVOMapper;

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
        searchVO.setDepDate(req.getFromDate());
        searchVO.setDepAirportCode(req.getFromCity());
        searchVO.setArrAirportCode(req.getToCity());
        searchVO.setArrDate(req.getRetDate());
        searchVO.setAdultCnt(req.getAdultNumber());
        searchVO.setChildCnt(req.getChildNumber());
        searchVO.setTripType(req.getTripType().equals(1) ? TripTypeEnum.OW : TripTypeEnum.RT);
        context.setT(searchVO);
        context.setDepAirportCode(req.getFromCity());
        context.setArrAirportCode(req.getToCity());
        context.setDepDate(req.getFromDate());
        context.setArrDate(req.getRetDate());
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
        searchFlightRes.setRoutings(flightRoutingsVOMapper.flightRoutingsVO2DTOs(flightRouteVO.getFlightRouteList()));
        if (!CollectionUtils.isEmpty(searchFlightRes.getRoutings())) {
            searchFlightRes.getRoutings().forEach(routing -> {
                try {
                    routing.setData(GZipCompress.rDataCompress(routing.getData()));
                } catch (IOException e) {
                    logger.error("data压缩异常", e);
                }
            });
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
        verifyReqVO.setTripType(req.getTripType() == 1 ? TripTypeEnum.OW : TripTypeEnum.RT);

        if (req.getRoutings() != null) {
            try {
                req.getRoutings().setData(GZipCompress.rDataUnCompress(req.getRoutings().getData()));
            } catch (IOException e) {
                logger.error("data解压缩异常", e);
            }
        }

        verifyReqVO.setRouting(flightRoutingsVOMapper.flightRoutingsDTO2VO(req.getRoutings()));
        verifyReqVO.getRouting().setFromSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRoutings().getFromSegments()));
        verifyReqVO.getRouting().setRetSegments(flightRoutingsVOMapper.segmentDTO2VOs(req.getRoutings().getRetSegments()));
        context.setT(verifyReqVO);
        try {
            SingleResult<CtripVerifyResVO> singleResult = otaVerifyFlightService.verifyFlight(context);

            if (!singleResult.isSuccess() || singleResult.getData() == null) {
                response.setMsg(singleResult.getErrorMessage());
                response.setStatus(StatusEnum.INNER_ERROR.getCode());
                return response;
            }
            response.setStatus(StatusEnum.SUCCEED.getCode());
            response.setMsg("success");
            response.setSessionId("");
            response.setMaxSeats(singleResult.getData().getMaxSeats());
            response.setRule(ctripVerifyVOMapper.rulesVO2DTO(singleResult.getData().getRule()));
            response.setRouting(ctripVerifyVOMapper.flightRoutingsVO2DTO(singleResult.getData().getRouting()));

            if (response.getRouting() != null) {
                try {
                    response.getRouting().setData(GZipCompress.rDataCompress(response.getRouting().getData()));
                } catch (IOException e) {
                    logger.error("data压缩异常", e);
                }
            }
            response.getRouting().setFromSegments(ctripVerifyVOMapper.segmentVO2DTOs(singleResult.getData().getRouting().getFromSegments()));
            response.getRouting().setRetSegments(ctripVerifyVOMapper.segmentVO2DTOs(singleResult.getData().getRouting().getRetSegments()));
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("调用验价接口异常", MethodEnum.CREATEORDER, ex);
        }
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
        RouteContext<CreateOrderReqVO> context  = new RouteContext();
        CreateOrderRes                 response = new CreateOrderRes();
        setDefaultCont(context);
        if (req.getRoutings() == null) {
            response.setMsg("routings can not be null");
            response.setStatus(StatusEnum.PARAM_ERROR.getCode());
            return response;
        }
        try {
            req.getRoutings().setData(GZipCompress.rDataUnCompress(req.getRoutings().getData()));
        } catch (IOException e) {
            logger.error("data解压缩异常", e);
        }

        if (req.getTripType().equals(1)) {
            context.setDepAirportCode(req.getRoutings().getFromSegments().get(0).getDepAirport());
            context.setArrAirportCode(req.getRoutings().getFromSegments().get(0).getArrAirport());
            context.setDepDate(req.getRoutings().getFromSegments().get(0).getDepTime());
            context.setArrDate(req.getRoutings().getFromSegments().get(0).getArrTime());
        } else {
            context.setDepAirportCode(req.getRoutings().getFromSegments().get(0).getDepAirport());
            context.setDepDate(req.getRoutings().getFromSegments().get(0).getDepTime());
            context.setArrAirportCode(req.getRoutings().getRetSegments().get(0).getArrAirport());
            context.setArrDate(req.getRoutings().getRetSegments().get(0).getArrTime());
        }

        context.setT(ctripOrderVOMapper.CreateOrderReqDTO2VO(req));
        logger.info("调用LCC{}接口,入参{}", MethodEnum.CREATEORDER, JSON.toJSONString(context));
        try {
            SingleResult<CreateOrderResVO> singleResult = otaCreateOrderService.createOrder(context);

            logger.info("调用LCC{}接口,返回{}", MethodEnum.CREATEORDER, JSON.toJSONString(1));
            if (!singleResult.isSuccess() || singleResult.getData() == null) {
                response.setMsg(singleResult.getErrorMessage());
                response.setStatus(StatusEnum.INNER_ERROR.getCode());
                return response;
            }

            response = ctripOrderVOMapper.CreateOrderResVO2DTO(singleResult.getData());
            try {
                response.getRouting().setData(GZipCompress.rDataCompress(response.getRouting().getData()));
            } catch (IOException e) {
                logger.error("data压缩异常", e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error("调用创单接口异常", MethodEnum.CREATEORDER, ex);
        }
        return response;
    }

    /**
     * 出票
     *
     * @param req
     * @return
     */
    @Override
    public IssueTicketResDTO issueTicket(IssueTicketReqDTO req) {
        RouteContext<IssueTicketReqVO> context = new RouteContext();
        setDefaultCont(context);
        context.setT(issueTicketVOMapper.IssueTicketReqDTO2VO(req));
        logger.info("调用LCC{}接口,入参{}", MethodEnum.OOTTICKET, JSON.toJSONString(context));
        SingleResult<IssueTicketResVO> response = otaIssueTicketService.issueTicket(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.OOTTICKET, JSON.toJSONString(response));
        IssueTicketResDTO issueTicketResDTO = new IssueTicketResDTO();
        if (response == null) {
            issueTicketResDTO.setStatus(-1);
            issueTicketResDTO.setMsg(response.getErrorMessage());
            issueTicketResDTO.setOrderNo(req.getOrderNo());
            return issueTicketResDTO;
        } else {
            issueTicketResDTO.setOrderNo(req.getOrderNo());
            if (response.getData() != null) {
                issueTicketResDTO.setStatus(response.getData().getStatus());
                issueTicketResDTO.setMsg(response.getData().getMsg());
                return issueTicketResDTO;
            }

            issueTicketResDTO.setStatus(-1);
            issueTicketResDTO.setMsg(response.getErrorMessage());
            return issueTicketResDTO;
        }
    }


    /**
     * @param routeContext
     */

    private void setDefaultCont(RouteContext routeContext) {
        routeContext.setAreaType(AreaTypeEnum.INTERNATIONAL);
        routeContext.setOta(OTAEnum.CTRIP);
    }

    private Map<String, Object> filterdata(String data) {

        if (StringUtils.isEmpty(data)) {
            return null;
        }

        Map<String, Object> datamap = JSON.parseObject(data, Map.class);

        return datamap;
    }
}
