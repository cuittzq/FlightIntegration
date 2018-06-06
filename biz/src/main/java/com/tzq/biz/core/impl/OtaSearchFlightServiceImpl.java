package com.tzq.biz.core.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.cache.PlatSetCache;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.core.PriceRuleRegulation;
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

    @Autowired
    PriceRuleRegulation priceRuleRegulation;

    @Override
    @InterfaceAccess(desc = "SEARCHFLIGHT")
    public SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        SingleResult<FlightRouteVO> response = null;
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<MatchingSetting> matchingSettings = platSetCache.getPlatRules(String.valueOf(OTAEnum.CTRIP.getId()));
        if (CollectionUtils.isEmpty(matchingSettings)) {
            response = new SingleResult<>(null, false, "0001", "没有配置平台规则规则");
            return response;
        }
        // 筛选适合的规则
        List<MatchingSetting> matchedSetting = getMatchedSetting(matchingSettings, context);
        List<PurchaseEnum>    ota2Purchases  = getPurchases(matchedSetting);
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则直接返回空
            response = new SingleResult<>(null, false, "0001", "没有配置采购规则");
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
                        ExactSetting exactSetting = exactLimit(flightRoutingsVO, resuestContext, purchaseEnum);
                        // 通用规则匹配
                        CurrencySetting currencySetting = currencyLimit(resuestContext, purchaseEnum);
                        flightRoutingsVO.getData().put(OtaConstants.EXACT_SETTING, exactSetting != null ? exactSetting.getId() : "");
                        flightRoutingsVO.getData().put(OtaConstants.CURRENCY_SETTING, currencySetting != null ? currencySetting.getId() : "");
                        // 价格调控
                        logger.info("价格调控前{}", JSON.toJSONString(flightRoutingsVO));
                        flightRoutingsVO = priceRuleRegulation.flightRegulation(exactSetting, currencySetting, flightRoutingsVO);
                        logger.info("价格调控后{}", JSON.toJSONString(flightRoutingsVO));
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
            // 数据汇总
            FlightRouteVO flightRouteVO = flightRouteVOList.get(0);
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
                String[] depports = salesAirLineSetting.getDeps().split(",|/");
                if (depports.length > 0) {
                    if (!Arrays.asList(depports).contains(context.getDepAirportCode())) {
                        logger.info(" 供应销售规则匹配 出发地限制 过滤 原始:{},出发地限制{}", context.getDepAirportCode(), salesAirLineSetting.getDeps());
                        return;
                    }
                }
            }
            // 抵达地限制
            if (!StringUtils.isEmpty(salesAirLineSetting.getArrs())) {
                String[] arrports = salesAirLineSetting.getArrs().split(",|/");
                if (arrports.length > 0) {
                    if (!Arrays.asList(arrports).contains(context.getArrAirportCode())) {
                        logger.info(" 供应销售规则匹配 抵达地限制 过滤 原始:{},出发地限制{}", context.getArrAirportCode(), salesAirLineSetting.getArrs());
                        return;
                    }
                }
            }
            // 航司限制
            if (!StringUtils.isEmpty(salesAirLineSetting.getCarriers())) {
                String[] airlines = salesAirLineSetting.getCarriers().split(",|/");
                if (airlines.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(airlines).contains(segmentVO.getCarrier())) {
                            logger.info("供应销售规则匹配 去程航司限制 过滤");
                            return;
                        }
                    }

                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(airlines).contains(segmentVO.getCarrier())) {
                                logger.info("供应销售规则匹配 返程航司限制 过滤");
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

    /**
     * 通用规则匹配
     *
     * @param context
     * @param purchaseEnum
     * @return
     */
    private CurrencySetting currencyLimit(RouteContext<SearchVO> context, PurchaseEnum purchaseEnum) {
        List<CurrencySetting> currencySettings     = platSetCache.getCurrencyRules(String.valueOf(OTAEnum.CTRIP.getId()), String.valueOf(purchaseEnum.getId()));
        List<CurrencySetting> currencyMatchedRules = new ArrayList<>();
        currencySettings.forEach(currencySetting -> {
            // 行程类型过滤
            if (currencySetting.getVoyagetype() != context.getT().getTripType().getCode() - 1) {
                logger.info("通用规则匹配 行程类型 过滤");
                return;
            }

            // 销售日期控制
            Date nowdate = new Date();
            if (nowdate.after(currencySetting.getSalesenddate()) || nowdate.before(currencySetting.getSalesstartdate())) {
                logger.info("通用规则匹配 销售日期控制 过滤");
                return;
            }
            // 工作时间限制
            if (!workTimeLimit(currencySetting.getStartworktime(), currencySetting.getStopworktime())) {
                logger.info("通用规则匹配 工作时间限制 过滤");
                return;
            }
            // 旅行日期 过滤
            try {
                if (DateUtils.parseDateNoTime(context.getT().getDepDate()).before(currencySetting.getTodepstartdate()) || DateUtils.parseDateNoTime(context.getT().getDepDate()).after(currencySetting.getTodependdate())) {
                    logger.info("通用规则匹配 旅行日期 过滤");
                    return;
                }

                if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                    if (DateUtils.parseDateNoTime(context.getT().getArrDate()).before(currencySetting.getBackdepstartdate()) || DateUtils.parseDateNoTime(context.getT().getArrDate()).after(currencySetting.getBackdependdate())) {
                        logger.info("通用规则匹配 返程旅行日期 过滤");
                        return;
                    }
                }
            } catch (ParseException e) {
                logger.error("通用规则匹配 旅行日期 过滤异常", e);
            }

            currencyMatchedRules.add(currencySetting);
        });
        if (CollectionUtils.isEmpty(currencyMatchedRules)) {
            return null;
        }

        // 如果有多条就用最近修改的那条
        Optional<CurrencySetting> currencySetting = currencyMatchedRules.stream().max(Comparator.comparing(CurrencySetting::getModifytime));
        return currencySetting.get();
    }

    /**
     * 精确规则匹配
     *
     * @param flightRoutingsVO
     * @param context
     * @param purchaseEnum
     * @return
     */
    private ExactSetting exactLimit(FlightRoutingsVO flightRoutingsVO, RouteContext<SearchVO> context, PurchaseEnum purchaseEnum) {
        List<ExactSetting> exactSettings     = platSetCache.getExactRules(String.valueOf(purchaseEnum.getId()));
        List<ExactSetting> exactMatchedRules = new ArrayList<>();
        exactSettings.forEach(exactSetting -> {
            // 行程类型过滤
            if (exactSetting.getVoyagetype() != context.getT().getTripType().getCode() - 1) {
                logger.info("精准规则匹配 行程类型 过滤");
                return;
            }

            // 排除出发地过滤
            if (!StringUtils.isEmpty(exactSetting.getExcludedeps())) {
                String[] excludedeps = exactSetting.getExcludedeps().split(",|/");
                if (excludedeps.length > 0) {
                    if (Arrays.asList(excludedeps).contains(context.getT().getDepAirportCode())) {
                        logger.info("精准规则匹配 排除出发地 过滤");
                        return;
                    }
                }
            }

            // 排除抵达地过滤
            if (!StringUtils.isEmpty(exactSetting.getExcludearrs())) {
                String[] excludearrs = exactSetting.getExcludearrs().split(",|/");
                if (excludearrs.length > 0) {
                    if (Arrays.asList(excludearrs).contains(context.getT().getArrAirportCode())) {
                        logger.info("精准规则匹配 排除抵达地 过滤");
                        return;
                    }
                }
            }

            // 出发地限制
            if (!StringUtils.isEmpty(exactSetting.getDeps())) {
                String[] deps = exactSetting.getDeps().split(",|/");
                if (deps.length > 0) {
                    if (!Arrays.asList(deps).contains(context.getT().getDepAirportCode())) {
                        logger.info("精准规则匹配 出发地限制 过滤");
                        return;
                    }
                }
            }

            // 抵达地限制
            if (!StringUtils.isEmpty(exactSetting.getArrs())) {
                String[] arrs = exactSetting.getArrs().split(",|/");
                if (arrs.length > 0) {
                    if (!Arrays.asList(arrs).contains(context.getT().getArrAirportCode())) {
                        logger.info("精准规则匹配 抵达地限制 过滤");
                        return;
                    }
                }
            }

            // 销售日期控制
            Date nowdate = new Date();
            if (nowdate.after(exactSetting.getSalesenddate()) || nowdate.before(exactSetting.getSalesstartdate())) {
                logger.info("精准规则匹配 销售日期 过滤");
                return;
            }

            // 旅行日期 过滤
            try {
                if (DateUtils.parseDateNoTime(context.getT().getDepDate()).before(exactSetting.getTodepstartdate()) || DateUtils.parseDateNoTime(context.getT().getDepDate()).after(exactSetting.getTodependdate())) {
                    logger.info("精准规则匹配 去程旅行日期 过滤");
                    return;
                }

                if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                    if (DateUtils.parseDateNoTime(context.getT().getArrDate()).before(exactSetting.getBackdepstartdate()) || DateUtils.parseDateNoTime(context.getT().getArrDate()).after(exactSetting.getBackdependdate())) {
                        logger.info("精准规则匹配 返程旅行日期 过滤");
                        return;
                    }
                }
            } catch (ParseException e) {
                logger.error("精准规则匹配 旅行日期 过滤异常", e);
            }

            // 工作时间限制
            if (!workTimeLimit(exactSetting.getStartworktime(), exactSetting.getStopworktime())) {
                logger.info("精准规则匹配 工作时间限制 过滤");
                return;
            }

            // 提前销售天数过滤
            Date depDate = null;
            if (exactSetting.getSalesdayenable().equals(1)) {
                try {
                    depDate = DateUtils.parseDateNoTime(context.getT().getDepDate());
                    Date saleStartDate = DateUtils.addDays(nowdate, exactSetting.getSalesstartday());
                    Date saleEndDate   = DateUtils.addDays(nowdate, exactSetting.getSalesendday());
                    if (depDate.after(saleEndDate) || depDate.before(saleStartDate)) {
                        logger.info("精准规则匹配 提前销售天数 过滤");
                        return;
                    }
                } catch (ParseException e) {
                    logger.error("精准规则匹配 出发日期转化失败！", e);
                }
            }

            // 航司过滤
            if (!StringUtils.isEmpty(exactSetting.getCarrier())) {
                for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                    if (!exactSetting.getCarrier().equals(segmentVO.getCarrier())) {
                        logger.info("精准规则匹配 去程航司 过滤");
                        return;
                    }
                }
                if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                        if (!exactSetting.getCarrier().equals(segmentVO.getCarrier())) {
                            logger.info("精准规则匹配 返程航司 过滤");
                            return;
                        }
                    }
                }
            }

            // 仓位过滤
            if (!StringUtils.isEmpty(exactSetting.getCabins())) {
                String[] cabins = exactSetting.getCabins().split(",|/");
                if (cabins.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(cabins).contains(segmentVO.getCabin())) {
                            logger.info("精准规则匹配 去程仓位 过滤");
                            return;
                        }
                    }
                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(cabins).contains(segmentVO.getCabin())) {
                                logger.info("精准规则匹配 返程仓位 过滤");
                                return;
                            }
                        }
                    }
                }
            }

            // 航班号过滤
            if (!StringUtils.isEmpty(exactSetting.getFlightnos())) {
                String[] flightNos = exactSetting.getCabins().split(",|/");
                if (flightNos.length > 0) {
                    for (SegmentVO segmentVO : flightRoutingsVO.getFromSegments()) {
                        if (!Arrays.asList(flightNos).contains(segmentVO.getFlightNumber())) {
                            logger.info("精准规则匹配 去程航班号 过滤");
                            return;
                        }
                    }

                    if (context.getT().getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
                        for (SegmentVO segmentVO : flightRoutingsVO.getRetSegments()) {
                            if (!Arrays.asList(flightNos).contains(segmentVO.getFlightNumber())) {
                                logger.info("精准规则匹配 返程航班号 过滤");
                                return;
                            }
                        }
                    }
                }
            }
            exactMatchedRules.add(exactSetting);
        });

        if (CollectionUtils.isEmpty(exactMatchedRules)) {
            return null;
        }

        // 如果有多条就用最近修改的那条
        Optional<ExactSetting> exactSetting = exactMatchedRules.stream().max(Comparator.comparing(ExactSetting::getModifytime));
        return exactSetting.get();
    }

    /**
     * 平台规则匹配
     *
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
                logger.info("销售日期 过滤");
                return;
            }

            LocalDate nowlocaldate = LocalDate.now();
            // 销售星期控制
            if (matchingSetting.getWeeklimit().indexOf(String.valueOf(nowlocaldate.getDayOfWeek().getValue())) < 0) {
                logger.info("销售星期控制 过滤");
                return;
            }

            // 工作时间控制
            if (!workTimeLimit(matchingSetting.getStartworktime(), matchingSetting.getStopworktime())) {
                logger.info("工作时间控制 过滤");
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
                Date saleEndDate   = DateUtils.addDays(nowdate, matchingSetting.getSalesendday());
                if (depDate.after(saleEndDate) || depDate.before(saleStartDate)) {
                    logger.info("出发日期 过滤");
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
     * 工作时间限制
     *
     * @param startworktime
     * @param stopworktime
     * @return
     */
    private boolean workTimeLimit(Date startworktime, Date stopworktime) {
        Date nowdate = new Date();
        if (nowdate.getHours() > stopworktime.getHours()) {
            return false;
        }
        if (nowdate.getHours() == stopworktime.getHours() && nowdate.getMinutes() > stopworktime.getMinutes()) {
            return false;
        }
        if (nowdate.getHours() < startworktime.getHours()) {
            return false;
        }
        if (nowdate.getHours() == startworktime.getHours() && nowdate.getMinutes() < startworktime.getMinutes()) {
            return false;
        }
        return true;
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
}
