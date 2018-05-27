package com.tzq.biz.core.impl;

import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.cache.PlatSetCache;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.search.SegmentVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.ExactSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@Service
public class OtaSearchFlightServiceImpl implements OtaSearchFlightService {

    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;

    @Autowired
    PlatSetCache platSetCache;

    @Override
    @InterfaceAccess(desc = "SEARCHFLIGHT")
    public SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        SingleResult<FlightRouteVO> response = null;
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<MatchingSetting> matchingSettings = platSetCache.getPlatRules(String.valueOf(OTAEnum.CTRIP.getId()));
        if (CollectionUtils.isEmpty(matchingSettings)) {
            return response;
        }
        // 筛选适合的规则
        List<MatchingSetting> matchedSetting = getMatchedSetting(matchingSettings, context);
        List<PurchaseEnum> ota2Purchases = getPurchases(matchedSetting);
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则直接返回空
            return response;
        }

        List<FlightRouteVO> flightRouteVOList = new ArrayList<>();
        // 分别调用配置的供应商接口数据
        ota2Purchases.forEach(purchaseEnum -> {
            RouteContext<SearchVO> resuestContext = context.clone();
            resuestContext.setPurchaseEnum(purchaseEnum);
            FlightRouteVO flightRouteVO = purchaseProxy.searchFlight(resuestContext);
            if (flightRouteVO != null) {
                List<FlightRoutingsVO> flightRoutingsVOS = new ArrayList<>();
                flightRouteVO.getFlightRouteList().forEach(flightRoutingsVO -> {
                    // 供应销售规则匹配
                    if (salelimit(flightRoutingsVO, resuestContext, purchaseEnum)) {
                        // 精准规则匹配
                        // 通用规则匹配
                        flightRoutingsVOS.add(flightRoutingsVO);
                    }
                });
                flightRouteVO.setFlightRouteList(flightRoutingsVOS);
            }
            if (!CollectionUtils.isEmpty(flightRouteVO.getFlightRouteList())) {
                flightRouteVOList.add(flightRouteVO);
            }
        });

        try {
            // 精准数据调控
            FlightRouteVO flightRouteVO = flightRegulation(flightRouteVOList);
            if (flightRouteVO == null) {
                response = new SingleResult<>(flightRouteVO, false, "0001", "无数据");
                return response;
            }
            // 返回OTA查询数据
            response = new SingleResult<>(flightRouteVO, true, "", "");
        } catch (Exception ex) {
            response = new SingleResult<>(null, false, "0001", ex.getMessage());
            return response;
        }
        return response;
    }


    /**
     * 采购规则限制
     *
     * @param flightRoutingsVO
     * @param context
     * @param purchaseEnum
     * @return
     */
    private boolean salelimit(FlightRoutingsVO flightRoutingsVO, RouteContext<SearchVO> context, PurchaseEnum purchaseEnum) {
        // 获取采购规则
        List<SalesAirLineSetting> salesAirLineSettings = platSetCache.getSaleAirLineRules(String.valueOf(purchaseEnum.getId()));
        List<SalesAirLineSetting> salesMatchedSettings = new ArrayList<>();
        salesAirLineSettings.forEach(salesAirLineSetting -> {
            // 出发地限制
            if (!StringUtils.isEmpty(salesAirLineSetting.getDeps())) {
                String[] depports = salesAirLineSetting.getDeps().split(",");
                if (depports.length > 0) {
                    if (!Arrays.asList(depports).contains(context.getDepAirportCode())) {
                        return;
                    }
                }
            }
            // 抵达地限制
            if (!StringUtils.isEmpty(salesAirLineSetting.getArrs())) {
                String[] arrports = salesAirLineSetting.getArrs().split(",");
                if (arrports.length > 0) {
                    if (!Arrays.asList(arrports).contains(context.getArrAirportCode())) {
                        return;
                    }
                }
            }
            // 航司限制
            if (!StringUtils.isEmpty(salesAirLineSetting.getCarriers())) {
                String[] airlines = salesAirLineSetting.getCarriers().split(",");
                if (airlines.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(airlines).contains(segmentVO.getCarrier())) {
                            return;
                        }
                    }

                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(airlines).contains(segmentVO.getCarrier())) {
                                return;
                            }
                        }
                    }
                }
            }

            salesMatchedSettings.add(salesAirLineSetting);
        });

        return !CollectionUtils.isEmpty(salesMatchedSettings);
    }

    private boolean currencyLimit(FlightRoutingsVO flightRoutingsVO, RouteContext<SearchVO> context, PurchaseEnum purchaseEnum) {
        List<CurrencySetting> currencySettings = platSetCache.getCurrencyRules(String.valueOf(purchaseEnum.getId()));
        List<CurrencySetting> currencyMatchedRules = new ArrayList<>();
        currencySettings.forEach(currencySetting -> {

        });
        return false;
    }

    private boolean exactLimit(FlightRoutingsVO flightRoutingsVO, RouteContext<SearchVO> context, PurchaseEnum purchaseEnum) {
        List<ExactSetting> exactSettings = platSetCache.getExactRules(String.valueOf(purchaseEnum.getId()));
        List<ExactSetting> exactMatchedRules = new ArrayList<>();
        exactSettings.forEach(exactSetting -> {
            // 行程类型过滤
            if (exactSetting.getVoyagetype() != context.getT().getTripType().getCode() - 1) {
                return;
            }

            // 排除出发地过滤
            if (!StringUtils.isEmpty(exactSetting.getExcludedeps())) {
                String[] excludedeps = exactSetting.getExcludedeps().split(",");
                if (excludedeps.length > 0) {
                    if (Arrays.asList(excludedeps).contains(context.getT().getDepAirportCode())) {
                        return;
                    }
                }
            }

            // 排除抵达地过滤
            if (!StringUtils.isEmpty(exactSetting.getExcludearrs())) {
                String[] excludearrs = exactSetting.getExcludearrs().split(",");
                if (excludearrs.length > 0) {
                    if (Arrays.asList(excludearrs).contains(context.getT().getArrAirportCode())) {
                        return;
                    }
                }
            }

            // 出发地限制

            // 抵达地限制

            // 航司过滤
            if (!StringUtils.isEmpty(exactSetting.getCarrier())) {
                for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                    if (!exactSetting.getCarrier().equals(segmentVO.getCarrier())) {
                        return;
                    }
                }
                if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                        if (!exactSetting.getCarrier().equals(segmentVO.getCarrier())) {
                            return;
                        }
                    }
                }
            }

            // 仓位过滤
            if (!StringUtils.isEmpty(exactSetting.getCabins())) {
                String[] cabins = exactSetting.getCabins().split(",");
                if (cabins.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(cabins).contains(segmentVO.getCabin())) {
                            return;
                        }
                    }

                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(cabins).contains(segmentVO.getCabin())) {
                                return;
                            }
                        }
                    }
                }
            }

            // 航班号过滤
            if (!StringUtils.isEmpty(exactSetting.getFlightnos())) {
                String[] flightNos = exactSetting.getCabins().split(",");
                if (flightNos.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(flightNos).contains(segmentVO.getFlightNumber())) {
                            return;
                        }
                    }

                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(flightNos).contains(segmentVO.getFlightNumber())) {
                                return;
                            }
                        }
                    }
                }
            }


            exactMatchedRules.add(exactSetting);
        });
        return false;
    }

    /**
     * @param matchingSettings
     * @param context
     * @return
     */
    private List<MatchingSetting> getMatchedSetting(List<MatchingSetting> matchingSettings, RouteContext<SearchVO> context) {
        List<MatchingSetting> matchedSettings = new ArrayList<>();
        matchingSettings.forEach(matchingSetting -> {
            // 销售日期控制
            Date nowdate = new Date();
            if (nowdate.after(matchingSetting.getSalesenddate()) || nowdate.before(matchingSetting.getSalesstartdate())) {
                return;
            }

            LocalDate nowlocaldate = LocalDate.now();
            // 销售星期控制
            if (matchingSetting.getWeeklimit().indexOf(String.valueOf(nowlocaldate.getDayOfWeek().getValue())) < 0) {
                return;
            }

            // 工作时间控制
            if (nowdate.getHours() > matchingSetting.getStopworktime().getHours()) {
                return;
            }
            if (nowdate.getHours() == matchingSetting.getStopworktime().getHours() && nowdate.getMinutes() > matchingSetting.getStopworktime().getMinutes()) {
                return;
            }
            if (nowdate.getHours() < matchingSetting.getStartworktime().getHours()) {
                return;
            }
            if (nowdate.getHours() == matchingSetting.getStartworktime().getHours() && nowdate.getMinutes() < matchingSetting.getStartworktime().getMinutes()) {
                return;
            }
            // 行程类型
            if (matchingSetting.getVoyagetype() != 2 && matchingSetting.getVoyagetype() != context.getT().getTripType().getCode() - 1) {
                return;
            }
            // 5.出发日期，要在几天后销售日期范围内:CURDATE()+SalesEndDay>=depDate=>CURDATE()+SalesStartDay
            Date depDate = null;
            try {
                depDate = DateUtils.parseDateNoTime(context.getT().getDepDate());
                Date saleStartDate = DateUtils.addDays(nowdate, matchingSetting.getSalesstartday());
                Date saleEndDate = DateUtils.addDays(nowdate, matchingSetting.getSalesendday());
                if (depDate.after(saleEndDate) || depDate.before(saleStartDate)) {
                    return;
                }
            } catch (ParseException e) {
                logger.error("出发日期转化失败！", e);
            }
            matchedSettings.add(matchingSetting);
        });

        return matchedSettings;
    }

    /**
     * @param matchedSettings
     * @return
     */
    private List<PurchaseEnum> getPurchases(List<MatchingSetting> matchedSettings) {
        List<PurchaseEnum> ota2Purchases = new ArrayList<>();
        matchedSettings.forEach(p -> {
            PurchaseEnum pa = PurchaseEnum.getEnumById(Integer.parseInt(p.getPurchaseplatform()));
            if (!ota2Purchases.contains(pa)) {
                ota2Purchases.add(pa);
            }
        });

        return ota2Purchases;
    }

    /**
     * 数据调控
     *
     * @param flightRouteVO
     * @param purchaseEnum
     * @return
     */
    private FlightRouteVO flightRegulation(List<FlightRouteVO> flightRouteVOs) {
        // 精准规则
//        List<ExactSetting> exactSettings = platSetCache.getExactRules(String.valueOf(purchaseEnum.getId()));

        FlightRouteVO flightRouteVO = flightRouteVOs.get(0);

//        flightRouteVO.getFlightRouteList().forEach(flightRoutingsVO -> {
//            if (!CollectionUtils.isEmpty(exactSettings)) {
//                // 1.根据航司、出发、到达、舱位先查找精准规则（优先级：舱位>到达&出发>航司）；
//                // 2.如果存在精准规则，如果有多条，则以ModifyTime倒序排序选择第一条；
//                ExactSetting exactSetting = exactSettings.stream().filter(p -> p.getCarrier().equals())
//            }
//
//            //  3.如果有精准规则，根据精准规则，对数据进行处理；否则根据通用规则进行处理；
//            //  4.如果不存在精准规则同时也不存在精准规则，则原数据返回；
//
//        });


        return flightRouteVO;
    }
}
