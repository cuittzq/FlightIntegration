package com.tzq.service.ctrip.impl;

import com.tzq.service.ctrip.SearchFlightService;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchFlightServiceImpl implements SearchFlightService {

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
}
