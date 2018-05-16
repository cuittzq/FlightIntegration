package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
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
    public CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<PurchaseEnum> ota2Purchases = new ArrayList<>();
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则默认给LCC
            ota2Purchases.add(PurchaseEnum.LCC);
        }

        return null;
    }
}
