package com.tzq.web.service;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
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

        context.setAreaType("1");
        SearchFlightRes searchFlightRes = null;
        logger.info("调用LCC{}接口,入参{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(context));
        SingleResult<FlightRouteVO> response = otaSearchFlightService.searchFlight(context);
        logger.info("调用LCC{}接口,返回{}", MethodEnum.SEARCHFLIGHT, JSON.toJSONString(response));

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
}
