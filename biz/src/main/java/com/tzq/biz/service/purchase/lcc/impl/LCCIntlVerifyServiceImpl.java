package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.annotation.Route;
import com.tzq.biz.service.purchase.abstracts.AbstractVerifyService;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.mapper.VerifyVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lCCIntlVerifyService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LCCIntlVerifyServiceImpl extends AbstractVerifyService {
    @Resource
    private LccClient lccClient;

    @Resource
    private VerifyVOMapper verifyVOMapper;

    /**
     * 验价
     *
     * @return
     */
    @Override
    public CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        VerifyReq        verifyReq   = request(context);
        VerifyRes        verifyRes   = lccClient.verifyCabinPrice(verifyReq);
        CtripVerifyResVO verifyResVO = response(verifyRes, context);
        return verifyResVO;
    }

    /**
     * 验价返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> CtripVerifyResVO response(T t, RouteContext<CtripVerifyReqVO> context) {
        VerifyRes verifyRes = (VerifyRes) t;
        CtripVerifyResVO verifyResVO = verifyVOMapper.VerifyResdto2vo(verifyRes);
        verifyResVO.getRouting().setFromSegments(verifyVOMapper.FlightSegmentdtos2vos(verifyRes.getRouting().getFromSegments()));
        verifyResVO.getRouting().setRetSegments(verifyVOMapper.FlightSegmentdtos2vos(verifyRes.getRouting().getRetSegments()));
        verifyResVO.getRouting().setRule(verifyVOMapper.Rulesdto2vo(verifyRes.getRouting().getRule()));
        return verifyResVO;
    }

    /**
     * 验价请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<CtripVerifyReqVO> context) {
        CtripVerifyReqVO ctripVerifyReqVO = context.getT();
        VerifyReq verifyReq = verifyVOMapper.VerifyReqVOvO2dto(ctripVerifyReqVO);
        verifyReq.getRouting().setFromSegments(verifyVOMapper.FlightSegmentvos2dtos(ctripVerifyReqVO.getRouting().getFromSegments()));
        verifyReq.getRouting().setRetSegments(verifyVOMapper.FlightSegmentvos2dtos(ctripVerifyReqVO.getRouting().getRetSegments()));

        return (T) verifyReq;
    }
}
