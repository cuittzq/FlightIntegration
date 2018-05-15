package com.tzq.commons.mapper;

import com.tzq.commons.converter.AreaTypeEnumConverter;
import com.tzq.commons.converter.CurrencyEnumConverter;
import com.tzq.commons.converter.FullDateConverter;
import com.tzq.commons.converter.InventoryEnumConverter;
import com.tzq.commons.converter.PassengerTypeEnumConverter;
import com.tzq.commons.converter.SegmentTypeEnumConverter;
import com.tzq.commons.converter.StatusEnumConverter;
import com.tzq.commons.converter.TripTypeEnumConverter;
import com.tzq.commons.model.integration.lcc.order.ContactVO;
import com.tzq.commons.model.integration.lcc.order.OrderReqVO;
import com.tzq.commons.model.integration.lcc.order.OrderResVO;
import com.tzq.commons.model.integration.lcc.order.PassengerVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import org.mapstruct.Mapper;

/**
 * Created by cl24957 on 2018/5/15.
 */
@Mapper(componentModel = "spring", uses = {AreaTypeEnumConverter.class, CurrencyEnumConverter.class,
        InventoryEnumConverter.class, PassengerTypeEnumConverter.class, SegmentTypeEnumConverter.class,
        StatusEnumConverter.class, TripTypeEnumConverter.class, FullDateConverter.class})
public interface OrderVOMapper {
    OrderReq orderReqVo2Io(OrderReqVO reqVO);

    Passenger orderReqVo2Io(PassengerVO passengerVO);

    Contact orderReqVo2Io(ContactVO contactVO);

    FlightRoutings orderReqVo2Io(FlightRoutingsVO routingsVO);

    OrderResVO orderResIo2Vo(OrderRes res);

    PassengerVO orderResIo2Vo(Passenger passenger);

    ContactVO orderResIo2Vo(Contact contact);

    FlightRoutingsVO orderResIo2Vo(FlightRoutings flightRoutings);
}
