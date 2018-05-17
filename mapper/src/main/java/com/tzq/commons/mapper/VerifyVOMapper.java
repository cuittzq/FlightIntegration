package com.tzq.commons.mapper;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;
import com.tzq.commons.model.integration.lcc.search.FlightSegmentVO;
import com.tzq.commons.model.integration.lcc.search.RulesVO;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.search.Rules;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRouting;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Mapper(componentModel = "spring", uses = {AreaTypeEnumConverter.class, CurrencyEnumConverter.class,
        InventoryEnumConverter.class, PassengerTypeEnumConverter.class, SegmentTypeEnumConverter.class,
        StatusEnumConverter.class, TripTypeEnumConverter.class, FullDateConverter.class})
public interface VerifyVOMapper {

    CtripVerifyResVO VerifyResdto2vo(VerifyRes verifyRes);

    VerifyRes VerifyResvO2dto(CtripVerifyResVO verifyResVO);

    CtripVerifyReqVO VerifyReqVOdto2vo(VerifyReq verifyRes);

    VerifyReq VerifyReqVOvO2dto(CtripVerifyReqVO verifyResVO);


    FlightRoutingsVO VerifyRoutingdto2vo(VerifyRouting verifyRouting);

    VerifyRouting VerifyRoutingvO2dto(FlightRoutingsVO verifyRoutingVO);


    List<FlightSegmentVO> FlightSegmentdtos2vos(List<FlightSegment> flightSegments);

    List<FlightSegment> FlightSegmentvos2dtos(List<FlightSegmentVO> flightSegmentVOS);


    RulesVO Rulesdto2vo(Rules rules);

    Rules Rulesvo2dto(RulesVO rules);

    FlightSegmentVO FlightSegmentdto2vo(FlightSegment flightSegment);

    FlightSegment FlightSegmentvo2dto(FlightSegmentVO flightSegmentVO);
}
