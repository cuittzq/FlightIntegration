package com.tzq.commons.mapper.lcc;

import com.tzq.commons.converter.ExtInfoConverter;
import com.tzq.commons.enums.*;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.search.Rules;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

/**
 * Created by cl24957 on 2018/5/18.
 */
public class LccTOVOMapper {

    /**
     * @param flightRoutings
     * @return
     */
    public static FlightRoutingsVO flightRouteDto2FlightRouteVO(FlightRoutings flightRoutings) {
        FlightRoutingsVO flightRoutingsVO = new FlightRoutingsVO();

        /**
         * 可保存必要信息，验价时会放在请求报文中传给供应商；最大 1000 个字符
         */
        flightRoutingsVO.setData(ExtInfoConverter.string2Map(flightRoutings.getData()));
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
        flightRoutingsVO.setEligibility(EligibilityEnum.NOR);


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
        flightRoutingsVO.setReservationType(ReservationTypeEnum.OT);
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

    private static SegmentVO buildSegment(FlightSegment flightSegment) {
        if (flightSegment == null) {
            return null;
        }

        SegmentVO segmentVO1 = new SegmentVO();
        segmentVO1.setAircraftCode(flightSegment.getAircraftCode());
        segmentVO1.setArrAirport(flightSegment.getArrAirport());
        segmentVO1.setArrTerminal(flightSegment.getArrivingTerminal());
        segmentVO1.setArrTime(flightSegment.getArrTime());
        segmentVO1.setDepAirport(flightSegment.getDepAirport());
        segmentVO1.setDepTerminal(flightSegment.getDepartureTerminal());
        segmentVO1.setDepTime(flightSegment.getDepTime());
        segmentVO1.setCabin(flightSegment.getCabin());
        segmentVO1.setCabinGrade(CabinGradeEnum.getEnumByCode(flightSegment.getCabin()));
        segmentVO1.setCarrier(flightSegment.getCarrier());
        segmentVO1.setStopAirports(flightSegment.getStopCities());
        segmentVO1.setCodeShare(StringUtils.isNotEmpty(flightSegment.getSharingFlightNumber()));
        segmentVO1.setOperatingCarrier(flightSegment.getSharingFlightNumber());
        segmentVO1.setOperatingFlightNo(flightSegment.getFlightNumber());
        segmentVO1.setFlightNumber(flightSegment.getFlightNumber());

        return segmentVO1;
    }
}
