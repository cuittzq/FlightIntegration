package com.tzq.biz.core.impl;

import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.cache.PlatSetCache;
import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.platsetting.MatchingSetting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        List<MatchingSetting> matchingSettings = platSetCache.getPlatSeting(String.valueOf(OTAEnum.CTRIP.getId()));
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
            // 分别调用配置的供应商接口数据
            FlightRouteVO flightRouteVO = purchaseProxy.searchFlight(resuestContext);
            // 数据汇总
            if (flightRouteVO != null) {
                flightRouteVOList.add(flightRouteVO);
            }
        });
        try {
            // 数据调控
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
     * @param matchingSettings
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
     * @param flightRouteVOList
     * @return
     */
    private FlightRouteVO flightRegulation(List<FlightRouteVO> flightRouteVOList) {
        return flightRouteVOList.get(0);
    }
}
