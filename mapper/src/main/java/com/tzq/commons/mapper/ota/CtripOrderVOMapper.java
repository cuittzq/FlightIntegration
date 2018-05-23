package com.tzq.commons.mapper.ota;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.order.*;
import com.tzq.commons.model.ctrip.search.AirlineAncillariesVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.RulesVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.service.ctrip.models.order.*;
import com.tzq.service.ctrip.models.search.AirlineAncillariesDTO;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;
import com.tzq.service.ctrip.models.search.RulesDTO;
import com.tzq.service.ctrip.models.search.SegmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

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
public interface CtripOrderVOMapper {

    CreateOrderReqVO CreateOrderReqDTO2VO(CreateOrderReq createOrderReqVO);

    CreateOrderReq CreateOrderReqVO2DTO(CreateOrderReqVO createOrderReqVO);


    @Mappings({@Mapping(target = "data", expression = "java(com.tzq.commons.converter.ExtInfoConverter.map2String(vo == null ? null : vo.getData()))")})
    FlightRoutingsDTO flightRoutingsVO2DTO(FlightRoutingsVO vo);

    @Mappings({@Mapping(target = "data", expression = "java(com.tzq.commons.converter.ExtInfoConverter.string2Map(dto == null ? \"\" : dto.getData()))")})
    FlightRoutingsVO flightRoutingsDTO2VO(FlightRoutingsDTO dto);

    CreateOrderRes CreateOrderResVO2DTO(CreateOrderResVO createOrderReqVO);

    CtripOrderIdVO CtripOrderIdDTO2VO(CtripOrderIdDTO ctripOrderIdDTO);

    CtripOrderIdDTO CtripOrderIdVO2DTO(CtripOrderIdVO vo);



    List<PassengerVO> PassengerDTO2VOs(List<PassengerDTO> passengerDTO);

    List<PassengerVO> PassengerVO2DTOs(List<PassengerVO> vo);

    List<PassengerbaggagesVO> PassengerbaggagesDTO2VOs(List<PassengerbaggagesDTO> passengerbaggagesDTO);

    List<PassengerbaggagesDTO> PassengerbaggagesVO2DTOs(List<PassengerbaggagesVO> passengerbaggagesVO);

    List<CtripRefRevServiceFeeVO> CtripRefRevServiceFeeDTO2VOs(List<CtripRefRevServiceFeeDTO> dto);

    List<CtripRefRevServiceFeeDTO> CtripRefRevServiceFeeVO2DTOs(List<CtripRefRevServiceFeeVO> vo);

    List<BaggagesVO> BaggagesDTO2VOs(List<BaggagesDTO> baggagesDTO);

    List<BaggagesDTO> BaggagesVO2DTOs(List<BaggagesVO> baggagesVO);

    ContactVO ContactDTO2VO(ContactDTO dto);

    ContactDTO ContactVO2DTO(ContactVO vo);

    BaggagesVO BaggagesDTO2VO(BaggagesDTO baggagesDTO);

    BaggagesDTO BaggagesVO2DTO(BaggagesVO baggagesVO);

    PassengerVO PassengerDTO2VO(PassengerDTO passengerDTO);

    PassengerVO PassengerVO2DTO(PassengerVO vo);

    PassengerbaggagesVO PassengerbaggagesDTO2VO(PassengerbaggagesDTO passengerbaggagesDTO);

    PassengerbaggagesDTO PassengerbaggagesVO2DTO(PassengerbaggagesVO passengerbaggagesVO);

    CtripRefRevServiceFeeVO CtripRefRevServiceFeeDTO2VO(CtripRefRevServiceFeeDTO dto);

    CtripRefRevServiceFeeDTO CtripRefRevServiceFeeVO2DTO(CtripRefRevServiceFeeVO vo);

    AirlineAncillariesVO AirlineAncillariesDTO2VO(AirlineAncillariesDTO dto);

    RulesVO RulesDTO2VO(RulesDTO dto);

    RulesDTO RulesVO2DTO(RulesVO vo);

    SegmentDTO SegmentVO2DTO(SegmentVO vo);

    SegmentVO SegmentDTO2VO(SegmentDTO dto);
}
