package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OtaVerifyFlightServiceImpl implements OtaVerifyFlightService {

    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;

    /**
     * 查询航班
     *
     * @param context
     * @return
     */
    @Override
    public SingleResult<CtripVerifyResVO> verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<PurchaseEnum> ota2Purchases = new ArrayList<>();
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则默认给LCC
            ota2Purchases.add(PurchaseEnum.LCC);
        }

        List<CtripVerifyResVO> resVOS = new ArrayList<>();

        // 分别调用配置的供应商接口数据
        ota2Purchases.forEach(purchaseEnum -> {
            RouteContext<CtripVerifyReqVO> resuestContext = context.clone();
            resuestContext.setPurchaseEnum(purchaseEnum);
            // 分别调用配置的供应商接口数据
            CtripVerifyResVO verifyResVO = purchaseProxy.verifyFlight(resuestContext);

            // 数据汇总
            if (verifyResVO != null) {
                resVOS.add(verifyResVO);
            }
        });

        SingleResult<CtripVerifyResVO> response = null;
        try {
            // 数据调控
            CtripVerifyResVO verifyResVO = flightRegulation(resVOS);
            if (verifyResVO == null) {
                response = new SingleResult<>(verifyResVO, false, "0001", "无数据");
                return response;
            }

            // 返回OTA查询数据
            response = new SingleResult<>(verifyResVO, true, "", "");
        } catch (Exception ex) {
            response = new SingleResult<>(null, false, "0001", ex.getMessage());
            return response;
        }

        return response;
    }

    /**
     * 数据调控
     *
     * @param resVOS
     * @return
     */
    private CtripVerifyResVO flightRegulation(List<CtripVerifyResVO> resVOS) {
        if(null != resVOS && resVOS.size()>0) {
            return resVOS.get(0);
        }
        else
        {
            return null;
        }
    }
}
