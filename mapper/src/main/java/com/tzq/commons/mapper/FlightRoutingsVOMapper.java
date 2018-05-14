package com.tzq.commons.mapper;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.FlightRoutingsVO;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;
import org.mapstruct.Mapper;

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
}
