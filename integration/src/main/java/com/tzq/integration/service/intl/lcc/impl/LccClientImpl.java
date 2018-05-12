package com.tzq.integration.service.intl.lcc.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.utils.HttpClientUtil;
import com.tzq.integration.service.core.AbstractBaseClient;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.constants.LccConstant;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lccClient")
public class LccClientImpl extends AbstractBaseClient implements LccClient {
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
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.SEARCH_FLIGHT);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String              postData        = JSON.toJSONString(req);
        Map<String, String> header          = getDefaultHeader();
        String              response;
        SearchFlightRes     searchFlightRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.SEARCH_FLIGHT, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.SEARCH_FLIGHT, response);
            searchFlightRes = JSON.parseObject(response, SearchFlightRes.class);
        } catch (IOException e) {
            logger.error("调用LCC接口失败", e);
        }
        return searchFlightRes;
    }

    /**
     * 验舱验价
     * @param req
     * @return
     */
    @Override
    public VerifyRes verifyCabinPrice(VerifyReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.VERIFY);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String              postData        = JSON.toJSONString(req);
        Map<String, String> header          = getDefaultHeader();
        String              response;
        VerifyRes     verifyRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.VERIFY, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.VERIFY, response);
            verifyRes = JSON.parseObject(response, VerifyRes.class);
        } catch (IOException e) {
            logger.error("调用LCC验舱验价接口失败", e);
        }
        finally {
            // TODO 记录接口访问日志
        }

        return verifyRes;
    }

    @Override
    public OrderRes createOrder(OrderReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.CREATE_ORDER);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String              postData        = JSON.toJSONString(req);
        Map<String, String> header          = getDefaultHeader();
        String              response;
        OrderRes     orderRes = null;
        try
        {
            logger.info("调用LCC{}接口,入参{}", LccConstant.CREATE_ORDER, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.CREATE_ORDER, response);

            // TODO:解密

        }
        catch (IOException e)
        {
            logger.error("调用LCC创单接口失败", e);
        }
        finally {
            // TODO 记录接口访问日志
        }

        return orderRes;
    }

}
