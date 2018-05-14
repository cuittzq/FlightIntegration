package com.tzq.commons.mapper;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.integration.search.FlightSegmentVO;
import com.tzq.commons.model.integration.search.RulesVO;
import com.tzq.commons.model.integration.verify.VerifyReqVO;
import com.tzq.commons.model.integration.verify.VerifyResVO;
import com.tzq.commons.model.integration.verify.VerifyRoutingVO;
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
        StatusEnumConverter.class, TripTypeEnumConverter.class})
public interface VerifyVOMapper {

    VerifyResVO VerifyResdto2vo(VerifyRes verifyRes);

    VerifyRes VerifyResvO2dto(VerifyResVO verifyResVO);

    VerifyReqVO VerifyReqVOdto2vo(VerifyReq verifyRes);

    VerifyReq VerifyReqVOvO2dto(VerifyReqVO verifyResVO);


    VerifyRoutingVO VerifyRoutingdto2vo(VerifyRouting verifyRouting);

    VerifyRouting VerifyRoutingvO2dto(VerifyRoutingVO verifyRoutingVO);


    List<FlightSegmentVO> FlightSegmentdtos2vos(List<FlightSegment> flightSegments);

    List<FlightSegment> FlightSegmentvos2dtos(List<FlightSegmentVO> flightSegmentVOS);


    RulesVO Rulesdto2vo(Rules rules);

    Rules Rulesvo2dto(RulesVO rules);

    FlightSegmentVO FlightSegmentdto2vo(FlightSegment flightSegment);

    FlightSegment FlightSegmentvo2dto(FlightSegmentVO flightSegmentVO);
}
