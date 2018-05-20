package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.annotation.Route;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.service.purchase.abstracts.AbstractVerifyService;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.mapper.lcc.LccTOVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.ContactVO;
import com.tzq.commons.model.ctrip.order.PassengerVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRouting;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * 验价
     *
     * @return
     */
    @Override
    public CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        VerifyReq verifyReq = request(context);
        VerifyRes verifyRes = lccClient.verifyCabinPrice(verifyReq);
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
        if (verifyRes == null) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg("第三方接口返回空").setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else if (!StringUtils.isBlank(verifyRes.getMsg()) && !StringUtils.equalsIgnoreCase(verifyRes.getMsg(), "success")) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg(verifyRes.getMsg()).setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        }
        return dto2vo(verifyRes);
    }

    /**
     * 验价请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<CtripVerifyReqVO> context) {
        VerifyReq verifyReq = new VerifyReq();
        VerifyRouting verifyRouting = new VerifyRouting();
        verifyRouting.setData(context.getT().getRouting().getData().get(OtaConstants.PURCHANAME_DATA).toString());
        verifyRouting.setFromSegments(flightSegmentVO2IOs(context.getT().getRouting().getFromSegments()));
        verifyRouting.setRetSegments(flightSegmentVO2IOs(context.getT().getRouting().getRetSegments()));
        verifyReq.setRouting(verifyRouting);
        return (T) verifyReq;
    }


    private List<FlightSegment> flightSegmentVO2IOs(List<SegmentVO> segmentVOList) {
        if (CollectionUtils.isEmpty(segmentVOList)) {
            return null;
        }
        List<FlightSegment> flightSegments = new ArrayList<>();
        for (SegmentVO segmentVO : segmentVOList) {
            FlightSegment flightSegment = FlightSegmentVO2IO(segmentVO);
            if (flightSegment != null) {
                flightSegments.add(flightSegment);
            }
        }

        return flightSegments;
    }

    private FlightSegment FlightSegmentVO2IO(SegmentVO segmentVO) {
        if (segmentVO == null) {
            return null;
        }
        FlightSegment flightSegment = new FlightSegment();
        flightSegment.setDepAirport(segmentVO.getDepAirport());
        flightSegment.setDepartureTerminal(segmentVO.getDepTerminal());
        flightSegment.setDepTime(segmentVO.getDepTime());

        flightSegment.setAircraftCode(segmentVO.getAircraftCode());
        flightSegment.setArrAirport(segmentVO.getArrAirport());
        flightSegment.setArrivingTerminal(segmentVO.getArrTerminal());
        flightSegment.setArrTime(segmentVO.getArrTime());

        flightSegment.setCabin(segmentVO.getCabin());
        flightSegment.setCarrier(segmentVO.getCarrier());
        flightSegment.setCodeShare(false);
        flightSegment.setStopCities(segmentVO.getStopAirports());
        flightSegment.setFlightNumber(segmentVO.getFlightNumber());
        return flightSegment;
    }

    public CtripVerifyResVO dto2vo(VerifyRes verifyRes) {

        CtripVerifyResVO resVO = new CtripVerifyResVO();
        resVO.setRule(null);
        resVO.setMaxSeats(verifyRes.getMaxSeats());
        resVO.setSessionId(verifyRes.getSessionId());
        resVO.setRouting(LccTOVOMapper.flightRouteDto2FlightRouteVO(verifyRes.getRouting()));

        return resVO;
    }
}
