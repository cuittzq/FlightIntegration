package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OtaCreateOrderServiceImpl implements OtaCreateOrderService {
    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;

    /**
     * 生单
     *
     * @param context
     * @return
     */
    @Override
    public SingleResult<CreateOrderResVO> createOrder(RouteContext<CreateOrderReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据OTA配置的销售策略决定调用供应商接口数据(查询平台规则)
        List<PurchaseEnum> ota2Purchases = new ArrayList<>();
        if (CollectionUtils.isEmpty(ota2Purchases)) {
            // 如果没有配置规则默认给LCC
            ota2Purchases.add(PurchaseEnum.LCC);
        }

        List<CreateOrderResVO> resVOS = null;
        SingleResult<CreateOrderResVO> response = null;
        try {
            ota2Purchases.forEach(purchaseEnum -> {
                RouteContext<CreateOrderReqVO> resuestContext = context.clone();
                resuestContext.setPurchaseEnum(purchaseEnum);
                // 分别调用配置的供应商接口数据
                CreateOrderResVO verifyResVO = purchaseProxy.createOrder(resuestContext);

                // 数据汇总
                if (verifyResVO != null) {
                    resVOS.add(verifyResVO);
                }
            });

            // 数据调控
            CreateOrderResVO createOrderResVO = flightRegulation(resVOS);
            if (createOrderResVO == null) {
                response = new SingleResult<>(createOrderResVO, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, "无数据");
                return response;
            }
            // 返回OTA查询数据
            response = new SingleResult<>(createOrderResVO, true, CommonExcetpionConstant.SUCCESS, "");
        } catch (Exception ex) {
            if(ex instanceof ServiceAbstractException)
            {
                response = new SingleResult<>(null, false, ((ServiceAbstractException) ex).getErrorCode(), ex.getMessage());
            }
            else {
                response = new SingleResult<>(null, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, ex.getMessage());
            }
        }

        return response;
    }

    private CreateOrderResVO flightRegulation(List<CreateOrderResVO> resVOS) {
        if (null == resVOS || resVOS.size() == 0) {
            return null;
        } else {
            return resVOS.get(0);
        }
    }
}
