package com.tzq.commons.mapper;

import com.tzq.commons.converter.AreaTypeEnumConverter;
import com.tzq.commons.converter.CurrencyEnumConverter;
import com.tzq.commons.converter.FullDateConverter;
import com.tzq.commons.converter.InventoryEnumConverter;
import com.tzq.commons.converter.PassengerTypeEnumConverter;
import com.tzq.commons.converter.SegmentTypeEnumConverter;
import com.tzq.commons.converter.StatusEnumConverter;
import com.tzq.commons.converter.TripTypeEnumConverter;
import com.tzq.commons.model.ctrip.order.ContactVO;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;

import com.tzq.commons.model.ctrip.order.CtripOrderIdVO;
import com.tzq.commons.model.ctrip.order.CtripRefRevServiceFeeVO;
import com.tzq.commons.model.ctrip.order.PassengerVO;
import com.tzq.commons.model.ctrip.order.PassengerbaggagesVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.commons.model.integration.lcc.search.FlightSegmentVO;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.service.ctrip.models.order.ContactDTO;
import com.tzq.service.ctrip.models.order.CtripOrderIdDTO;
import com.tzq.service.ctrip.models.order.CtripRefRevServiceFeeDTO;
import com.tzq.service.ctrip.models.order.PassengerDTO;
import com.tzq.service.ctrip.models.order.PassengerbaggagesDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by cl24957 on 2018/5/15.
 */
@Mapper(componentModel = "spring", uses = {AreaTypeEnumConverter.class, CurrencyEnumConverter.class,
        InventoryEnumConverter.class, PassengerTypeEnumConverter.class, SegmentTypeEnumConverter.class,
        StatusEnumConverter.class, TripTypeEnumConverter.class, FullDateConverter.class})
public interface OrderVOMapper {
    OrderReq orderReqVo2Io(CreateOrderReqVO reqVO);

    Passenger orderReqVo2Io(PassengerVO passengerVO);

    Contact orderReqVo2Io(ContactVO contactVO);

    FlightRoutings orderReqVo2Io(FlightRoutingsVO routingsVO);

    FlightSegment orderReqVo2Io(FlightSegmentVO flightSegmentVO);


    CreateOrderResVO orderResIo2Vo(OrderRes res);

    PassengerVO orderResIo2Vo(Passenger passenger);

    ContactVO orderResIo2Vo(Contact contact);

    FlightRoutingsVO orderResIo2Vo(FlightRoutings flightRoutings);

    CtripOrderIdVO  orderCtripDTO2VO(CtripOrderIdDTO dto);
    List<ContactVO> orderCtripDTO2VO(List<ContactDTO> contactDTOS);
    List<PassengerbaggagesVO> orderCtripDTO2VO1(List<PassengerbaggagesDTO> dtos);
    List<PassengerVO> orderCtripDTO2VO2(List<PassengerDTO> dtos);
    List<CtripRefRevServiceFeeVO> orderCtripDTO2VO3(List<CtripRefRevServiceFeeDTO> dtos);

    ContactDTO orderCtripVO2DTO(ContactVO vo);
    List<PassengerbaggagesDTO> orderCtripVO2DTO(List<PassengerbaggagesVO> vos);

    List<FlightSegment> orderCtripDTO2VO4(List<SegmentVO> fromSegmentVOS);
}
