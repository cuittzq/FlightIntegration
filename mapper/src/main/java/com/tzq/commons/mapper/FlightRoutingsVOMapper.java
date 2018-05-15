package com.tzq.commons.mapper;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.search.*;
import com.tzq.service.ctrip.models.search.*;
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
public interface FlightRoutingsVOMapper {
    FlightRoutingsDTO flightRoutingsVO2DTO(FlightRoutingsVO flightRoutingsVO);

    FlightRoutingsVO flightRoutingsDTO2VO(FlightRoutingsDTO flightRoutingsVO);


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
