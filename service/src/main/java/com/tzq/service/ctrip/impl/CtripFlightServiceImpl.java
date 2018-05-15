package com.tzq.service.ctrip.impl;

import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.VerifyReq;
import com.tzq.service.ctrip.models.verify.VerifyRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class CtripFlightServiceImpl implements CtripFlightService {

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


        SearchFlightRes searchFlightRes = null;
//        logger.info("调用LCC{}接口,入参{}", LccConstant.SEARCH_FLIGHT, postData);
//        logger.info("调用LCC{}接口,返回{}", LccConstant.SEARCH_FLIGHT, response);
//        searchFlightRes = JSON.parseObject(response, SearchFlightRes.class);


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
