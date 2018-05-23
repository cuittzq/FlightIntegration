package com.tzq.biz.core.impl;

import com.tzq.biz.aop.InterfaceAccess;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.core.OtaCreateOrderService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@Service
public class OtaCreateOrderServiceImpl implements OtaCreateOrderService {
    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;

    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

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
        try {
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
        }

        return response;
    }
}
