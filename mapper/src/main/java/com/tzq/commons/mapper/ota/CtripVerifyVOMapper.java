package com.tzq.commons.mapper.ota;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.search.*;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.service.ctrip.models.search.*;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Mapper(componentModel = "spring",
        uses = {
                AreaTypeEnumConverter.class,
                CurrencyEnumConverter.class,
                InventoryEnumConverter.class,
                PassengerTypeEnumConverter.class,
                SegmentTypeEnumConverter.class,
                StatusEnumConverter.class,
                TripTypeEnumConverter.class,
                CabinGradeEnumConverter.class,
                CardTypeEnumConverter.class,
                EligibilityEnumConverter.class,
                InvoiceTypeEnumConverter.class,
                ReservationTypeEnumConverter.class,
                AgeTypeEunmConverter.class})
public interface CtripVerifyVOMapper {
    CtripVerifyResVO CtripVerifyResdto2vo(CtripVerifyRes verifyRes);

    CtripVerifyRes CtripVerifyResvO2dto(CtripVerifyResVO verifyResVO);

    CtripVerifyReqVO CtripVerifyReqdto2vo(CtripVerifyReq verifyRes);

    CtripVerifyReq CtripVerifyReqvO2dto(CtripVerifyReqVO verifyResVO);


    List<FlightRoutingsDTO> flightRoutingsVO2DTOs(List<FlightRoutingsVO> flightRoutingsVO);

    List<FlightRoutingsVO> flightRoutingsDTO2VOs(List<FlightRoutingsDTO> flightRoutingsVO);


    @Mappings({@Mapping(target = "data", expression = "java(com.tzq.commons.converter.ExtInfoConverter.map2String(vo == null ? null : vo.getData()))")})
    FlightRoutingsDTO flightRoutingsVO2DTO(FlightRoutingsVO vo);

    @Mappings({@Mapping(target = "data", expression = "java(com.tzq.commons.converter.ExtInfoConverter.string2Map(dto == null ? \"\" : dto.getData()))")})
    FlightRoutingsVO flightRoutingsDTO2VO(FlightRoutingsDTO dto);


    List<SegmentDTO> segmentVO2DTOs(List<SegmentVO> segmentVO);

    List<SegmentVO> segmentDTO2VOs(List<SegmentDTO> segmentDTO);

    //
    List<FormatBaggagesDTO> formatBaggagesVO2DTOs(List<FormatBaggagesVO> formatBaggagesVO);

    List<FormatBaggagesVO> formatBaggagesDTO2VOs(List<FormatBaggagesDTO> formatBaggagesDTO);

    //
    List<RefundInfosDTO> refundInfosVO2DTOs(List<RefundInfosVO> vo);

    List<RefundInfosVO> refundInfosDTO2VOs(List<RefundInfosDTO> dto);

    //
    List<ChangesInfosDTO> changesInfosVO2DTOs(List<ChangesInfosVO> vo);

    List<ChangesInfosVO> changesInfosDTO2VOs(List<ChangesInfosDTO> dto);

    SegmentDTO segmentVO2DTO(SegmentVO segmentVO);

    SegmentVO segmentDTO2VO(SegmentDTO segmentDTO);
    //

    //
    FormatBaggagesDTO formatBaggagesVO2DTO(FormatBaggagesVO formatBaggagesVO);

    FormatBaggagesVO formatBaggagesDTO2VO(FormatBaggagesDTO formatBaggagesDTO);

    //
    ChangesInfosDTO changesInfosVO2DTO(ChangesInfosVO vo);

    ChangesInfosVO changesInfosDTO2VO(ChangesInfosDTO dto);

    //
    RefundInfosDTO refundInfosVO2DTO(RefundInfosVO vo);

    RefundInfosVO refundInfosDTO2VO(RefundInfosDTO dto);

    //
    RulesDTO rulesVO2DTO(RulesVO vo);

    RulesVO rulesDTO2VO(RulesDTO dto);

    //
    AirlineAncillariesDTO airlineAncillariesVO2DTO(AirlineAncillariesVO vo);

    AirlineAncillariesVO airlineAncillariesDTO2VO(AirlineAncillariesDTO dto);
}
