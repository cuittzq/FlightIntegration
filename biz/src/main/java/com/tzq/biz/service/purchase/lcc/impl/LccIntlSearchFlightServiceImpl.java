package com.tzq.biz.service.purchase.lcc.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.annotation.Route;
import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.service.purchase.abstracts.AbstractSearchFlightService;
import com.tzq.commons.enums.*;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.search.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service("lccIntlSearchFlightService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LccIntlSearchFlightServiceImpl extends AbstractSearchFlightService {

    @Resource
    private LccClient lccClient;

    /**
     * 查询
     *
     * @param context
     */
    @Override
    public FlightRouteVO searchFlight(RouteContext<SearchVO> context) {
        SearchFlightReq searchFlightReq = request(context);
        SearchFlightRes searchFlightResponse = lccClient.searchFlight(searchFlightReq);
        FlightRouteVO flightRouteVO = response(searchFlightResponse, context);
        return flightRouteVO;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> FlightRouteVO response(T t, RouteContext<SearchVO> context) {
        SearchFlightRes searchFlightResponse = (SearchFlightRes) t;
        //把data记录缓存，下单验价出票需要用，强强要干掉的话，自己看着办
        FlightRouteVO flightRouteVO = new FlightRouteVO();
        flightRouteVO.setStatus(searchFlightResponse.getStatus());
        flightRouteVO.setMsg(searchFlightResponse.getMsg());
        flightRouteVO.setAreaType(context.getAreaType().getCode());
        flightRouteVO.setDepAirportCode(context.getT().getDepAirportCode());
        flightRouteVO.setArrAirportCode(context.getT().getArrAirportCode());
        flightRouteVO.setDepDate(context.getT().getDepDate());
        flightRouteVO.setTripType(context.getT().getTripType().getCode());
        flightRouteVO.setFlightRouteList(new ArrayList<>());
        searchFlightResponse.getRoutings().forEach(flightRoutings -> {
            FlightRoutingsVO flightRoutingsVO = flightRouteDto2FlightRouteVO(flightRoutings);
            if (flightRoutingsVO != null) {
                flightRouteVO.getFlightRouteList().add(flightRoutingsVO);
            }
        });
        return flightRouteVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<SearchVO> context) {
        SearchVO searchVO = context.getT();
        SearchFlightReq searchFlightReq = new SearchFlightReq();
        searchFlightReq.setFromCity(searchVO.getDepAirportCode());
        searchFlightReq.setFromDate(searchVO.getDepDate());
        searchFlightReq.setToCity(searchVO.getArrAirportCode());
        searchFlightReq.setTripType(searchVO.getTripType().getCode().equals(TripTypeEnum.OW.getCode()) ? 1 : 2);
        if (searchVO.getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
            searchFlightReq.setRetDate(searchVO.getArrDate());
        }
        return (T) searchFlightReq;
    }

    /**
     * @param flightRoutings
     * @return
     */
    private FlightRoutingsVO flightRouteDto2FlightRouteVO(FlightRoutings flightRoutings) {
        FlightRoutingsVO flightRoutingsVO = new FlightRoutingsVO();
        if (flightRoutings == null) {
            return null;
        }
        Map<String, Object> datamap = new HashMap<>();
        datamap.put(OtaConstants.PURCHANAME, PurchaseEnum.LCC.getCode());
        if (flightRoutings.getData() != null) {
            datamap.put(OtaConstants.PURCHANAME_DATA, flightRoutings.getData());
        }
        /**
         * 可保存必要信息，验价时会放在请求报文中传给供应商；最大 1000 个字符
         */
        flightRoutingsVO.setData(JSON.toJSONString(datamap));
        /**
         * 【公布运价强校验】成人公布价（以CNY为单位），不含税
         */
        flightRoutingsVO.setPublishPrice(flightRoutings.getAdultPrice());
        /**
         * 成人单价，不含税
         */
        flightRoutingsVO.setAdultPrice(flightRoutings.getAdultPrice());
        /**
         * 成人税费【注意不能是0，若存在为0的情况，请与我们联系】
         */
        flightRoutingsVO.setAdultTax(flightRoutings.getAdultTax());
        /**
         * 儿童公布价，不含税
         */
        flightRoutingsVO.setChildPublishPrice(flightRoutings.getChildPrice());
        /**
         * 儿童单价，不含税【对于含儿童的查询，必须返回】
         */
        flightRoutingsVO.setChildPrice(flightRoutings.getChildPrice());
        /**
         * 儿童税费
         * 1）对于含儿童的查询，必须返回；
         * 2）不能是0，若存在为0的情况，请与我们联系。
         */
        flightRoutingsVO.setChildTax(flightRoutings.getChildTax());


        /**
         * 成人税费类型：0 未含税 / 1 已含税 【正常赋0，如赋1请提前告知】
         */
        flightRoutingsVO.setAdultTaxType(flightRoutings.getAdultTaxType());
        /**
         * 儿童税费类型：0 未含税 / 1 已含税 【正常赋0，如赋1请提前告知】
         */
        flightRoutingsVO.setChildTaxType(flightRoutings.getChildTaxType());
        /**
         * 报价类型：0 普通价 / 1 留学生价 【请全部赋0】
         */
        flightRoutingsVO.setPriceType(flightRoutings.getPriceType());
        /**
         * 报价类型：0 预定价 / 1 申请价 【请全部赋0】
         */
        flightRoutingsVO.setApplyType(flightRoutings.getApplyType());
        /**
         * 【公布运价强校验】汇率
         */
        flightRoutingsVO.setExchange("");
        /**
         * 【公布运价强校验】
         * 1）旅客资质，标准三字码：
         * 	NOR：普通成人
         * 	LAB：劳务人员
         * 	SEA：海员
         * 	SNR：老年人
         * 	STU：学生
         * 	YOU：青年
         * 2）如果投放非NOR的政策，请提前告知我们。
         */
        flightRoutingsVO.setEligibility(EligibilityEnum.NOR.getCode());


        /**
         * 公布运价强校验】
         * 产品类型：0 旅行套餐 /1 商务优选/2 特惠推荐
         * 新上线供应商请赋值为0
         */
        flightRoutingsVO.setPlanCategory(0);
        /**
         * 报销凭证：T 行程单 / F 发票 / E 电子发票
         * 默认发票；廉航票台可赋值为E
         */
        flightRoutingsVO.setInvoiceType(InvoiceTypeEnum.E.getCode());

        /**
         * 【公布运价强校验】政策来源
         * 1）非公布运价此字段可不赋值；
         * 2）公布运价此字段必须按要求返回，否则产品将按照未知订座系统，输出到旅行套餐；
         * 3）使用IATA标准2字代码
         * 	1E：TravelSky
         * 	1A：Amadeus
         * 	1B：Abacus
         * 	1S：Sabre
         * 	1P：WorldSpan
         * 	1G：Galileo
         * OT：未知订座系统来源
         */
        flightRoutingsVO.setReservationType(ReservationTypeEnum.OT.getCode());
        /**
         * 【公布运价强校验】运价类型
         * 1）公布运价请赋值为：PUB：公布运价；
         * 2）控位产品请务必赋值为：KWP
         * 3 ) 积分票产品请务必赋值为：JFP(只有在积分票查询请求时,返回积分票产品才有意义)
         */
        flightRoutingsVO.setProductType(ProductTypeEnum.PUB.getCode());

        Rules rules = flightRoutings.getRule();
        // 解析退改规则
        // flightRoutingsVO.setRule();
        flightRoutingsVO.setFromSegments(new ArrayList<>());
        flightRoutings.getFromSegments().forEach(flightSegment -> {
            SegmentVO segmentVO = buildSegment(flightSegment);
            if (segmentVO != null) {
                flightRoutingsVO.getFromSegments().add(segmentVO);
            }
        });

        /**
         * 回程航段
         */
        flightRoutingsVO.setRetSegments(new ArrayList<>());
        flightRoutings.getRetSegments().forEach(retflightSegment -> {
            SegmentVO segmentVO = buildSegment(retflightSegment);
            if (segmentVO != null) {
                flightRoutingsVO.getRetSegments().add(segmentVO);
            }
        });

        return flightRoutingsVO;
    }


    private SegmentVO buildSegment(FlightSegment flightSegment) {
        if (flightSegment == null) {
            return null;
        }
        SegmentVO segmentVO = new SegmentVO();
        segmentVO.setAircraftCode(flightSegment.getAircraftCode());
        segmentVO.setArrAirport(flightSegment.getArrAirport());
        segmentVO.setArrTerminal(flightSegment.getArrivingTerminal());
        segmentVO.setArrTime(flightSegment.getArrTime());
        segmentVO.setDepAirport(flightSegment.getDepAirport());
        segmentVO.setDepTerminal(flightSegment.getDepartureTerminal());
        segmentVO.setDepTime(flightSegment.getDepTime());
        // segmentVO.setDuration(flightSegment.get);
        segmentVO.setCabin(flightSegment.getCabin());
        segmentVO.setCabinGrade(flightSegment.getCabin());
        segmentVO.setCarrier(flightSegment.getCarrier());
        segmentVO.setCodeShare(StringUtils.isNotEmpty(flightSegment.getSharingFlightNumber()));
        segmentVO.setOperatingCarrier(flightSegment.getSharingFlightNumber());
        segmentVO.setOperatingFlightNo(flightSegment.getFlightNumber());
        segmentVO.setFlightNumber(flightSegment.getFlightNumber());
        segmentVO.setStopAirports(flightSegment.getStopCities());
        return segmentVO;
    }
}
