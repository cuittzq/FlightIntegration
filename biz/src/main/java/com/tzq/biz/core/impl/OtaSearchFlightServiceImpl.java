package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaSearchFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OtaSearchFlightServiceImpl implements OtaSearchFlightService {

    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;


    @Override
    public SingleResult<FlightRouteVO> searchFlight(RouteContext<SearchVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<PurchaseEnum> ota2Purchases = new ArrayList<>();
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则默认给LCC
            ota2Purchases.add(PurchaseEnum.LCC);
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

        SingleResult<FlightRouteVO> response = null;
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
     * 数据调控
     *
     * @param flightRouteVOList
     * @return
     */
    private FlightRouteVO flightRegulation(List<FlightRouteVO> flightRouteVOList) {
        return flightRouteVOList.get(0);
    }
}
