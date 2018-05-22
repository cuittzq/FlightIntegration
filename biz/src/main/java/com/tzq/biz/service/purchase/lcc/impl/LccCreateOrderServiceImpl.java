package com.tzq.biz.service.purchase.lcc.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.tzq.biz.annotation.Route;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.service.purchase.abstracts.AbstractCreateOrderService;
import com.tzq.biz.utils.OrderNoUtils;
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
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.OrderLog;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.PassengerInfo;
import com.tzq.dal.service.OrderInfoService;
import com.tzq.dal.service.OrderLogService;
import com.tzq.dal.service.PassengerInfoService;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Resource
    private OrderLogService orderLogService;

    @Resource
    private OrderInfoService orderInfoService;

    @Resource
    private PassengerInfoService passengerInfoService;


    /**
     * 生单
     *
     * @param context
     */
    @Override
    public CreateOrderResVO createOrder(RouteContext<CreateOrderReqVO> context) {
        OrderReq orderReq = null;
        OrderRes order = null;
        CreateOrderResVO orderResVO = null;
        try {
            // 01.构建创建请求
            orderReq = request(context);

            // 02.调用接口创单
            order = lccClient.createOrder(orderReq);

            // 03.组装结果
            orderResVO = response(order, context);
        } catch (ServiceAbstractException ex) {
            throw ex;
        } catch (Exception ex) {

        } finally {
            dbOperator(context, orderResVO);
        }

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
        createOrderResVO.setOrderContact(context.getT().getContact());

        if (orderRes == null) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg("第三方接口返回空").setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else if (!StringUtils.isBlank(orderRes.getMsg()) && orderRes.getStatus() != 0) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg(orderRes.getMsg()).setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else {
            /**构建返回结果**/
            createOrderResVO = createOrderRes2VO(orderRes);
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

        orderReq.setTripType(createOrderReqVO.getTripType().getCode());
        orderReq.setPassengers(new ArrayList<>());
        for (PassengerVO passengerVO : createOrderReqVO.getPassengers()) {
            Passenger passenger = passengerVO2IO(passengerVO);
            orderReq.getPassengers().add(passenger);
        }
        FlightRoutings routings = flightRoutingsVO2IO(createOrderReqVO.getRoutings());
        if (routings != null) {
            orderReq.setRouting(routings);
        }
        return (T) orderReq;
    }

    /**
     * 数据库落库--涉及到多张表的操作,
     */
    @Transactional
    private void dbOperator(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO) {
        PassengerInfo passengerInfo = new PassengerInfo();
        OrderLog orderLog = new OrderLog();

        String orderNo = OrderNoUtils.Builder.newBuilder()
                .setPurchasePlatName(context.getOta().getCode())
                .setSalePlatName(context.getPurchaseEnum().getCode()).getOrderNum();

        /**01.插入订单info**/
        orderInfoService.insert(getOrerInfo(context,orderResVO,orderNo));

        /**02.插入乘客信息**/
        List<PassengerInfo> passList =  etPassengerInfoList(context,orderResVO,orderNo);
        for(PassengerInfo passenger:passList)
        {
            passengerInfoService.insert(passenger);
        }

        /**03.插入订单日志表**/
        orderLogService.insert(getOrderInfoLog(context,orderResVO,orderNo));
    }

    private OrderLog getOrderInfoLog(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, String orderNo) {
        OrderLog orderLog = new OrderLog();
        orderLog.setOrderno(orderNo);
        return  orderLog;
    }

    private List<PassengerInfo> etPassengerInfoList(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, String orderNo) {
        List<PassengerInfo> passList = new ArrayList<>();
        for (PassengerVO passMo : context.getT().getPassengers())
        {
            PassengerInfo passengerInfo = new PassengerInfo();
            passengerInfo.setBirtyday(DateUtils.parseDateLongFormat(passMo.getBirthday()));
            passengerInfo.setOrderno(orderNo);
            passengerInfo.setPassengertype(passMo.getAgeType().getRemark());
            passengerInfo.setGender(stopDBStrNull(passMo.getGender()));
            passengerInfo.setCardtype(stopDBStrNull(passMo.getCardType().getCode()));
            passengerInfo.setCardnum(stopDBStrNull(passMo.getCardNum()));
            passengerInfo.setCardissueplace(1); // todo
            passengerInfo.setCardexpired(DateUtils.parseDateLongFormat(passMo.getCardExpired()));
            passengerInfo.setNationality(stopDBStrNull(passMo.getNationality()));
            passengerInfo.setTicketno(StringUtils.EMPTY);
            passengerInfo.setExtendvalue(StringUtils.EMPTY);
            passengerInfo.setModifytime(new Date());

            passList.add(passengerInfo);
        }

        return  passList;
    }

    private OrderInfo getOrerInfo(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO,String orderNo)
    {
        OrderInfo orderInfo = new OrderInfo();
        /**订单信息组装入库**/
        orderInfo.setOrderno(orderNo);
        orderInfo.setSalesplatform(context.getOta().getId());
        orderInfo.setPurchaseplatform(context.getPurchaseEnum().getId());
        if (orderResVO == null || StringUtils.isBlank(orderResVO.getPnrCode())) {
            orderInfo.setPnr(StringUtils.EMPTY);
            orderInfo.setOrderstate( 0);
            orderInfo.setPurchaseorderno(StringUtils.EMPTY);
        } else {
            orderInfo.setPnr(orderResVO.getPnrCode());
            orderInfo.setOrderstate(0);
            orderInfo.setPurchaseorderno(orderResVO.getOrderNo());
        }

        orderInfo.setSalesorderno(stopDBStrNull(context.getT().getReferenceId()));

        orderInfo.setDepcity(context.getT().getRoutings().getFromSegments().get(0).getDepAirport());
        orderInfo.setArrcity(context.getT().getRoutings().getFromSegments().get(0).getArrAirport());
        orderInfo.setVoyagetype( context.getT().getTripType().getCode().intValue());

        float totalPrice = context.getT().getAdultNumber() * context.getT().getRoutings().getAdultPrice() +
                context.getT().getChildNumber()*context.getT().getRoutings().getChildPrice() +
                context.getT().getInfantNumber()*context.getT().getRoutings().getInfantPrice();

        orderInfo.setTotalsalesprice(new BigDecimal(totalPrice));

        float totalTax =context.getT().getAdultNumber() * context.getT().getRoutings().getAdultTax() +
                context.getT().getChildNumber()*context.getT().getRoutings().getChildTax() +
                context.getT().getInfantNumber()*context.getT().getRoutings().getInfantTax();
        orderInfo.setTotalsalestax(new BigDecimal(totalTax));

        orderInfo.setTotalpurchaseprice(new BigDecimal(0));
        orderInfo.setTotalpurchasetax(new BigDecimal(0));

        orderInfo.setAuditcount(context.getT().getAdultNumber());
        orderInfo.setChildcount(context.getT().getChildNumber());
        orderInfo.setBabycount(context.getT().getInfantNumber());

        orderInfo.setOuttickettype(StringUtils.EMPTY);
        orderInfo.setOutticketcompany(StringUtils.EMPTY);
        orderInfo.setOutticketremark(StringUtils.EMPTY);
        orderInfo.setOuttickettime(DateUtils.parseDateLongFormat("19000101000000"));

        orderInfo.setLinkname(stopDBStrNull(context.getT().getContact().getName()));
        orderInfo.setLinkaddress(stopDBStrNull(context.getT().getContact().getAddress()));
        orderInfo.setLinkemail(stopDBStrNull(context.getT().getContact().getEmail()));
        orderInfo.setLinkmobile(stopDBStrNull(context.getT().getContact().getMobile()));
        orderInfo.setLinkpostcode(stopDBStrNull(context.getT().getContact().getPostcode()));

        Map<String,Object> map = Maps.newHashMap();
        map.put("routing",context.getT().getRoutings());
        orderInfo.setExtendvalue(JSON.toJSONString(map));
        orderInfo.setCreatetime(new Date());
        orderInfo.setModifytime(new Date());

        return orderInfo;
    }

    private String stopDBStrNull(String str)
    {
        if(null == str)
        {
            return StringUtils.EMPTY;
        }

        return str;
    }


    /**
     * 入参转换
     **/
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

    /**
     * 结果转换
     **/
    private CreateOrderResVO createOrderRes2VO(OrderRes res) {
        if (res == null) {
            return null;
        }

        CreateOrderResVO resVO = new CreateOrderResVO();
        resVO.setPnrCode(res.getPnrCode());
        resVO.setOrderNo(res.getOrderNo());
        resVO.setMaxSeats(res.getMaxSeats());
        resVO.setSessionId(res.getSessionId());

        // routings转换
        resVO.setRouting(createOrderRes2VO(res.getRouting()));

        return resVO;
    }

    private FlightRoutingsVO createOrderRes2VO(FlightRoutings routing) {
        if (routing == null) {
            return null;
        }
        FlightRoutingsVO routingsVO = new FlightRoutingsVO();

        Map<String, Object> datamap = new HashMap<>();
        datamap.put(OtaConstants.PURCHANAME, PurchaseEnum.LCC.getCode());
        if (routing.getData() != null) {
            datamap.put(OtaConstants.PURCHANAME_DATA, routing.getData());
        }

        routingsVO.setAdultPrice(routing.getAdultPrice());
        routingsVO.setAdultTax(routing.getAdultTax());

        routingsVO.setChildPrice(routing.getChildPrice());
        routingsVO.setChildTax(routing.getChildTax());
        routingsVO.setPriceType(routing.getPriceType());
        routingsVO.setAdultTaxType(routing.getAdultTaxType());
        routingsVO.setChildTaxType(routing.getChildTaxType());

        routingsVO.setData(datamap);
        routingsVO.setFromSegments(createOrderRes2VO(routing.getFromSegments()));
        routingsVO.setRetSegments(createOrderRes2VO(routing.getRetSegments()));


        return routingsVO;
    }

    private List<SegmentVO> createOrderRes2VO(List<FlightSegment> fromSegments) {
        if (fromSegments == null || fromSegments.size() == 0) {
            return null;
        }

        List<SegmentVO> list = new ArrayList<>();
        for (FlightSegment seg : fromSegments) {
            SegmentVO flightSegment = new SegmentVO();
            flightSegment.setDepAirport(seg.getDepAirport());
            flightSegment.setDepTerminal(seg.getDepartureTerminal());
            flightSegment.setDepTime(seg.getDepTime());

            flightSegment.setAircraftCode(seg.getAircraftCode());
            flightSegment.setArrAirport(seg.getArrAirport());
            flightSegment.setArrTerminal(seg.getArrivingTerminal());
            flightSegment.setArrTime(seg.getArrTime());

            flightSegment.setCabin(seg.getCabin());
            flightSegment.setCarrier(seg.getCarrier());
            flightSegment.setCodeShare(false);
            flightSegment.setFlightNumber(seg.getFlightNumber());

            flightSegment.setStopAirports(seg.getStopCities());

            list.add(flightSegment);
        }

        return list;
    }

}
