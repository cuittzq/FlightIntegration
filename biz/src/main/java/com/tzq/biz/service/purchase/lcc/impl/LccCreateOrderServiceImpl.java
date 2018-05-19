package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.annotation.Route;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.service.purchase.abstracts.AbstractCreateOrderService;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.order.ContactVO;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.order.PassengerVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
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
@Service("lccCreateOrderService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LccCreateOrderServiceImpl extends AbstractCreateOrderService {


    @Resource
    private LccClient lccClient;

    /**
     * 生单
     *
     * @param context
     */
    @Override
    public CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> context) {
        OrderReq orderReq = request(context);
        OrderRes order = lccClient.createOrder(orderReq);
        CreateOrderResVO orderResVO = response(order, context);
        return orderResVO;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> CreateOrderResVO response(T t, RouteContext<CreateOrderReqVO> context) {
        OrderRes orderRes = (OrderRes) t;

        CreateOrderResVO createOrderResVO = new CreateOrderResVO();
//        createOrderResVO.setOrderContact(context.getT().getContact());

        if (orderRes == null) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg("第三方接口返回空").setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else if (!StringUtils.isBlank(orderRes.getMsg())) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg(orderRes.getMsg()).setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else {
//            createOrderResVO = orderVOMapper.orderResIo2Vo(orderRes);
        }

        return createOrderResVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<CreateOrderReqVO> context) {
        CreateOrderReqVO createOrderReqVO = context.getT();
        OrderReq orderReq = new OrderReq();
        orderReq.setContact(new ArrayList<>());
        ContactVO ctripContactVO = createOrderReqVO.getContact();
        Contact contact = contactVO2IO(ctripContactVO);
        if (contact != null) {
            orderReq.getContact().add(contact);
        }

        orderReq.setPassengers(new ArrayList<>());
        for (PassengerVO passengerVO : createOrderReqVO.getPassengers()) {
            Passenger passenger = passengerVO2IO(passengerVO);
            orderReq.getPassengers().add(passenger);
        }
        FlightRoutings routings = flightRoutingsVO2IO(createOrderReqVO.getRouting());
        if (routings != null) {
            orderReq.setRouting(routings);
        }
        return (T) orderReq;
    }


    private FlightRoutings flightRoutingsVO2IO(FlightRoutingsVO flightRoutingsVO) {
        if (flightRoutingsVO == null) {
            return null;
        }
        FlightRoutings flightRoutings = new FlightRoutings();
        flightRoutings.setData(flightRoutingsVO.getData().get(OtaConstants.PURCHANAME_DATA).toString());

        flightRoutings.setApplyType(flightRoutingsVO.getApplyType());
        flightRoutings.setAdultPrice(flightRoutingsVO.getAdultPrice());
        flightRoutings.setAdultTax(flightRoutingsVO.getAdultTax());
        flightRoutings.setAdultTaxType(flightRoutingsVO.getAdultTaxType());

        flightRoutings.setChildPrice(flightRoutingsVO.getChildPrice());
        flightRoutings.setChildTax(flightRoutingsVO.getChildTax());
        flightRoutings.setChildTaxType(flightRoutingsVO.getChildTaxType());

        flightRoutings.setFromSegments(flightSegmentVO2IOs(flightRoutingsVO.getFromSegments()));
        flightRoutings.setRetSegments(flightSegmentVO2IOs(flightRoutingsVO.getRetSegments()));
        flightRoutings.setPriceType(flightRoutingsVO.getPriceType());
        return flightRoutings;
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

    private Contact contactVO2IO(ContactVO contactVO) {
        if (contactVO == null) {
            return null;
        }
        Contact contact = new Contact();
        contact.setAddress(contactVO.getAddress());
        contact.setEmail(contactVO.getEmail());
        contact.setName(contactVO.getName());
        contact.setMobile(contactVO.getMobile());
        contact.setPostcode(contactVO.getPostcode());
        return contact;
    }

    private Passenger passengerVO2IO(PassengerVO passengerVO) {
        if (passengerVO == null) {
            return null;
        }
        Passenger passenger = new Passenger();
        passenger.setAgeType(passengerVO.getAgeType().getCode());
        passenger.setBirthday(passengerVO.getBirthday());
        passenger.setCardExpired(passengerVO.getCardExpired());
        passenger.setCardIssuePlace(passengerVO.getCardIssuePlace());
        passenger.setCardNum(passengerVO.getCardNum());
        passenger.setCardType(passengerVO.getCardType().getCode());
        passenger.setGender(passengerVO.getGender());
        passenger.setName(passengerVO.getName());
        passenger.setNationality(passengerVO.getNationality());
        return passenger;
    }
}
