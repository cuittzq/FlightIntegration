package com.tzq.biz.service.purchase.lcc.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.annotation.Route;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.service.purchase.abstracts.AbstractIssueTicketService;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.converter.ExtInfoConverter;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.mapper.ota.FlightRoutingsVOMapper;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.commons.model.ctrip.order.ContactVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.order.PassengerVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.OrderInfoExample;
import com.tzq.dal.service.order.OrderInfoService;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketReq;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketRes;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/21
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lccIntlIssueTicketService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LccIntlIssueTicketServiceImpl extends AbstractIssueTicketService {
    @Resource
    private LccClient lccClient;

    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 生单
     *
     * @param context
     */
    @Override
    public IssueTicketResVO issueTicket(RouteContext<IssueTicketReqVO> context) {
        IssueTicketReq   issueTicketReq   = request(context);
        IssueTicketRes   issueTicketRes   = lccClient.issueTicket(issueTicketReq);
        IssueTicketResVO issueTicketResVO = response(issueTicketRes, context);
        return issueTicketResVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<IssueTicketReqVO> context) {
        IssueTicketReq issueTicketReq = new IssueTicketReq();
        String         OrderNo        = context.getT().getOrderNo();
        // 根据 OrderNo获取订单信息
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andOrdernoEqualTo(OrderNo);
        List<OrderInfo> orderinfos = orderInfoService.selectByExample(orderInfoExample);
        if (CollectionUtils.isNotEmpty(orderinfos)) {
            issueTicketReq.setOrderNo(orderinfos.get(0).getPurchaseorderno());
            issueTicketReq.setPnrCode(orderinfos.get(0).getPnr());
            Map<String, Object> extMap         = ExtInfoConverter.string2Map(orderinfos.get(0).getExtendvalue());
            FlightRoutingsVO    flightRoutings = JSON.parseObject(extMap.get(OtaConstants.ORDER_ROUTING).toString(), FlightRoutingsVO.class);
            issueTicketReq.setRouting(flightRoutingsVO2IO(flightRoutings));
            issueTicketReq.setTripType(orderinfos.get(0).getVoyagetype());
            if(orderinfos.get(0).getVoyagetype()==1)
            {
                issueTicketReq.getRouting().setRetSegments(new ArrayList<>());
            }

        }
        return (T) issueTicketReq;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> IssueTicketResVO response(T t, RouteContext<IssueTicketReqVO> context) {
        IssueTicketRes   issueTicketRes   = (IssueTicketRes) t;
        IssueTicketResVO issueTicketResVO = new IssueTicketResVO();
        if (issueTicketRes == null) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg("第三方接口返回空").setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else if (!StringUtils.isBlank(issueTicketRes.getMsg()) && issueTicketRes.getStatus() != 0) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg(issueTicketRes.getMsg()).setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else {
            /**构建返回结果**/
            issueTicketResVO.setOrderNo(context.getT().getOrderNo());
            issueTicketResVO.setMsg(issueTicketRes.getMsg());
            issueTicketResVO.setStatus(issueTicketRes.getStatus());
        }

        return issueTicketResVO;
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
        if (org.springframework.util.CollectionUtils.isEmpty(segmentVOList)) {
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

}
