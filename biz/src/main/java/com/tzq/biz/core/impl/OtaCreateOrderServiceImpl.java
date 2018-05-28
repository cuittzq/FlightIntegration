package com.tzq.biz.core.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.biz.utils.DateConvert;
import com.tzq.biz.utils.OrderNoUtils;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.converter.ExtInfoConverter;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.enums.SegmentType;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.order.PassengerVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.OrderLog;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.PassengerInfo;
import com.tzq.dal.model.order.PriceInfo;
import com.tzq.dal.model.order.SegmentInfo;
import com.tzq.dal.service.order.OrderInfoService;
import com.tzq.dal.service.log.OrderLogService;
import com.tzq.dal.service.order.PassengerInfoService;
import com.tzq.dal.service.order.PriceInfoService;
import com.tzq.dal.service.order.SegmentInfoService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OtaCreateOrderServiceImpl implements OtaCreateOrderService {
    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;


    @Resource
    private OrderLogService orderLogService;

    @Resource
    private OrderInfoService orderInfoService;

    @Resource
    private PassengerInfoService passengerInfoService;

    @Resource
    private SegmentInfoService segmentInfoService;

    @Resource
    private PriceInfoService priceInfoService;

    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private OtaVerifyFlightService otaVerifyFlightService;

    /**
     * 生单
     *
     * @param context
     * @return
     */
    @Override
    @InterfaceAccess(desc = "CREATEORDER")
    public SingleResult<CreateOrderResVO> createOrder(RouteContext<CreateOrderReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        String purchaseEnum = context.getT().getRoutings().getData().get(OtaConstants.PURCHANAME).toString();
        context.setPurchaseEnum(PurchaseEnum.getEnumByCode(purchaseEnum));
        SingleResult<CreateOrderResVO> response = null;
        CtripVerifyResVO priceVerifyResVO = null;
        try {
            //1.获取验价规则

            //2.验价
            priceVerifyResVO = this.priceVerify(context);

            //3.下单
            CreateOrderResVO verifyResVO = purchaseProxy.createOrder(context);
            if (verifyResVO == null) {
                response = new SingleResult<>(verifyResVO, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, "无数据");
                return response;
            }
            response = new SingleResult<>(verifyResVO, true, CommonExcetpionConstant.SUCCESS, "");
        } catch (Exception ex) {
            if (ex instanceof ServiceAbstractException) {
                response = new SingleResult<>(null, false, ((ServiceAbstractException) ex).getErrorCode(), ex.getMessage());
            } else {
                response = new SingleResult<>(null, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, ex.getMessage());
            }

            logger.error(ex.getMessage(), ex);
        } finally {
            //4.落库
            dbOperator(context, response.getData(),priceVerifyResVO);
        }

        return response;
    }

    /**
     *  验证价格
     * @param context
     */
    private CtripVerifyResVO priceVerify(RouteContext<CreateOrderReqVO> context) {
        // 组装验价接口请求参数
        SingleResult<CtripVerifyResVO> singleResult = otaVerifyFlightService.verifyFlight(getVerifyParam(context));

        // 调用强强规则接口价格校验 价格匹配
        if(singleResult.isSuccess() && singleResult.getData() != null)
        {
            return  singleResult.getData();
        }
        return null;
    }

    /**
     *  获取验价请求参数
     * @param context  上下文
     * @return
     */
    private RouteContext<CtripVerifyReqVO> getVerifyParam(RouteContext<CreateOrderReqVO> context) {
        RouteContext<CtripVerifyReqVO> verifyReqVORouteContext = new RouteContext<CtripVerifyReqVO>();

        CtripVerifyReqVO reqVO = new CtripVerifyReqVO();
        reqVO.setRouting(context.getT().getRoutings());
        reqVO.setTripType(context.getT().getTripType());

        // 根据查询的data确定调用供应商
        String purchaseEnum = context.getT().getRoutings().getData().get(OtaConstants.PURCHANAME).toString();
        verifyReqVORouteContext.setPurchaseEnum(PurchaseEnum.getEnumByCode(purchaseEnum));
        verifyReqVORouteContext.setAreaType(AreaTypeEnum.INTERNATIONAL);
        verifyReqVORouteContext.setOta(OTAEnum.CTRIP);
        verifyReqVORouteContext.setT(reqVO);

        return verifyReqVORouteContext;
    }


    /**
     * 数据库落库--涉及到多张表的操作,
     */
    @Transactional
    public void dbOperator(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO,CtripVerifyResVO priceVerifyResVO) {
        try {
            PassengerInfo passengerInfo = new PassengerInfo();
            OrderLog orderLog = new OrderLog();

            String orderNo = OrderNoUtils.Builder.newBuilder()
                    .setPurchasePlatName(String.valueOf(context.getOta().getId()))
                    .setSalePlatName(String.valueOf(context.getPurchaseEnum().getId())).getOrderNum();

            /**01.插入订单info**/
            OrderInfo orderInfo = getOrerInfo(context, orderResVO,priceVerifyResVO ,orderNo);
            orderInfoService.insert(orderInfo);
            // OrderInfo orderInfo = getOrerInfo(context, orderResVO, orderNo);

            /**02.插入乘客信息**/
            List<PassengerInfo> passList = etPassengerInfoList(context, orderResVO, orderNo);
            for (PassengerInfo passenger : passList) {
                passengerInfoService.insert(passenger);
            }

            /**03.插入订单日志表**/
            // orderLogService.insert(getOrderInfoLog(context, orderResVO, orderNo));


            /**04.插入航段表**/
            List<SegmentInfo> segmentInfos = getSegments(context, orderResVO, orderNo);
            for (SegmentInfo segmentInfo : segmentInfos) {
                segmentInfoService.insert(segmentInfo);
            }

            /**05.插入价格表**/
            priceInfoService.insert(getPriceInfo(orderInfo, orderNo, priceVerifyResVO));

        } catch (Exception ex) {
            logger.error("订单记录入库异常", ex);
        }
    }

    private PriceInfo getPriceInfo(OrderInfo orderInfo, String orderNo,CtripVerifyResVO priceVerifyResVO) {
        PriceInfo priceInfo = new PriceInfo();
        priceInfo.setOrderno(orderNo);
        priceInfo.setPolicyreturnpoint(new BigDecimal(0));

        priceInfo.setPurchaseprice(orderInfo.getTotalpurchaseprice());
        priceInfo.setPurchasetax(orderInfo.getTotalpurchasetax());
        priceInfo.setPricetype(StringUtils.EMPTY);
        priceInfo.setExtendvalue(StringUtils.EMPTY);
        priceInfo.setSalesprice(orderInfo.getTotalsalesprice());
        priceInfo.setSalestax(orderInfo.getTotalsalestax());
        priceInfo.setSegmentid(1);
        priceInfo.setSettlementprice(orderInfo.getTotalpurchaseprice());

        return priceInfo;
    }

    private List<SegmentInfo> getSegments(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, String orderNo) {
        List<SegmentInfo> segmentInfos = Lists.newArrayList();

        // 去程航段
        if (context.getT().getRoutings().getFromSegments() != null && context.getT().getRoutings().getFromSegments().size() > 0) {
            for (SegmentVO seg : context.getT().getRoutings().getFromSegments()) {
                segmentInfos.add(segmentChange(seg, orderNo, SegmentType.GO));
            }
        }

        // 返程航班
        if (context.getT().getRoutings().getRetSegments() != null && context.getT().getRoutings().getRetSegments().size() > 0) {
            for (SegmentVO seg : context.getT().getRoutings().getRetSegments()) {
                segmentInfos.add(segmentChange(seg, orderNo, SegmentType.BACK));
            }
        }

        return segmentInfos;
    }

    /**
     * 航段model转换
     *
     * @param seg
     * @param orderNo
     * @param segmentType
     * @return
     */
    private SegmentInfo segmentChange(SegmentVO seg, String orderNo, SegmentType segmentType) {
        SegmentInfo segmentInfo = new SegmentInfo();
        segmentInfo.setArrport(stopDBStrNull(seg.getArrAirport()));
        segmentInfo.setArrterminal(stopDBStrNull(seg.getArrTerminal()));
        segmentInfo.setCabin(stopDBStrNull(seg.getCabin()));
        try {
            segmentInfo.setDepdate(DateConvert.getDateFromStrByFormat(seg.getDepTime(), DateConvert.LCC_VERIFY_DATE_FORMAT));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        segmentInfo.setDepport(stopDBStrNull(seg.getDepAirport()));
        segmentInfo.setDepterminal(stopDBStrNull(seg.getDepTerminal()));
        try {
            segmentInfo.setDeptime(DateConvert.getDateFromStrByFormat(seg.getDepTime(), DateConvert.LCC_VERIFY_DATE_FORMAT));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        segmentInfo.setExtendvalue(StringUtils.EMPTY);

        String flightNo  = seg.getCarrier()+ Integer.valueOf(seg.getFlightNumber());

        segmentInfo.setFlightno(stopDBStrNull(flightNo));
        segmentInfo.setOrderno(orderNo);
        segmentInfo.setModifytime(new Date());
        segmentInfo.setArrterminal(stopDBStrNull(seg.getArrTerminal()));
        segmentInfo.setSegmenttype(segmentType.getCode());
        segmentInfo.setShareflag(seg.isCodeShare() ? 1 : 0);

        return segmentInfo;
    }

    private OrderLog getOrderInfoLog(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, String orderNo) {
        OrderLog orderLog = new OrderLog();
        orderLog.setOrderno(orderNo);
        return orderLog;
    }

    private List<PassengerInfo> etPassengerInfoList(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, String orderNo) throws ParseException {
        List<PassengerInfo> passList = new ArrayList<>();
        for (PassengerVO passMo : context.getT().getPassengers()) {
            PassengerInfo passengerInfo = new PassengerInfo();
            passengerInfo.setBirtyday(DateUtils.parseDateLongFormat(passMo.getBirthday()));
            passengerInfo.setOrderno(orderNo);
            passengerInfo.setPassengertype(passMo.getAgeType().getRemark());
            passengerInfo.setGender(stopDBStrNull(passMo.getGender()));
            passengerInfo.setCardtype(stopDBStrNull(passMo.getCardType().getCode()));
            passengerInfo.setCardnum(stopDBStrNull(passMo.getCardNum()));
            passengerInfo.setCardissueplace(1); // todo
            passengerInfo.setNationality(stopDBStrNull(passMo.getNationality()));
            passengerInfo.setTicketno(StringUtils.EMPTY);
            passengerInfo.setExtendvalue(StringUtils.EMPTY);
            passengerInfo.setModifytime(new Date());
            passengerInfo.setPassengername(stopDBStrNull(passMo.getName()));
            passengerInfo.setBirtyday(DateUtils.parseDateNoTime(passMo.getBirthday()));
            passengerInfo.setCardexpired(DateUtils.parseDateNoTime(passMo.getCardExpired()));

            passList.add(passengerInfo);
        }

        return passList;
    }

    private OrderInfo getOrerInfo(RouteContext<CreateOrderReqVO> context, CreateOrderResVO orderResVO, CtripVerifyResVO priceVerifyResVO,String orderNo) {
        OrderInfo orderInfo = new OrderInfo();
        /**订单信息组装入库**/
        orderInfo.setOrderno(orderNo);
        orderInfo.setSalesplatform(context.getOta().getId());
        orderInfo.setPurchaseplatform(context.getPurchaseEnum().getId());
        if (orderResVO == null || StringUtils.isBlank(orderResVO.getPnrCode())) {
            orderInfo.setPnr(StringUtils.EMPTY);
            orderInfo.setOrderstate(0);
            orderInfo.setPurchaseorderno(StringUtils.EMPTY);
        } else {
            orderInfo.setPnr(orderResVO.getPnrCode());
            orderInfo.setOrderstate(0);
            orderInfo.setPurchaseorderno(orderResVO.getOrderNo());
        }

        orderInfo.setSalesorderno(stopDBStrNull(context.getT().getReferenceId()));

        orderInfo.setDepcity(context.getT().getRoutings().getFromSegments().get(0).getDepAirport());
        orderInfo.setArrcity(context.getT().getRoutings().getFromSegments().get(0).getArrAirport());
        orderInfo.setVoyagetype(context.getT().getTripType().getCode().intValue());

        float totalPrice = context.getT().getAdultNumber() * context.getT().getRoutings().getAdultPrice() +
                context.getT().getChildNumber() * context.getT().getRoutings().getChildPrice() +
                context.getT().getInfantNumber() * context.getT().getRoutings().getInfantPrice();

        float totalSellsPrice = context.getT().getAdultNumber() * priceVerifyResVO.getRouting().getAdultPrice() +
                context.getT().getChildNumber() * priceVerifyResVO.getRouting().getChildPrice() +
                context.getT().getInfantNumber() * priceVerifyResVO.getRouting().getInfantPrice();
        orderInfo.setTotalpurchaseprice(new BigDecimal(totalSellsPrice));
        orderInfo.setTotalsalesprice(new BigDecimal(totalPrice));


        float totalTax = context.getT().getAdultNumber() * context.getT().getRoutings().getAdultTax() +
                context.getT().getChildNumber() * context.getT().getRoutings().getChildTax() +
                context.getT().getInfantNumber() * context.getT().getRoutings().getInfantTax();

        float totalSellsTax = context.getT().getAdultNumber() * priceVerifyResVO.getRouting().getAdultTax() +
                context.getT().getChildNumber() * priceVerifyResVO.getRouting().getChildTax() +
                context.getT().getInfantNumber() * priceVerifyResVO.getRouting().getInfantTax();

        orderInfo.setTotalsalestax(new BigDecimal(totalTax));
        orderInfo.setTotalpurchasetax(new BigDecimal(totalSellsTax));

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

        Map<String, Object> map = Maps.newHashMap();
        map.put(OtaConstants.ORDER_ROUTING, context.getT().getRoutings());
        orderInfo.setExtendvalue(ExtInfoConverter.map2String(map));
        orderInfo.setCreatetime(new Date());
        orderInfo.setModifytime(new Date());

        return orderInfo;
    }

    private String stopDBStrNull(String str) {
        if (null == str) {
            return StringUtils.EMPTY;
        }

        return str;
    }

}
