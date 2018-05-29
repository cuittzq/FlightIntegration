package com.tzq.biz.core.impl;

import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.biz.core.PriceRuleRegulation;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询航班
     *
     * @param context
     * @return
     */
    @Override
    public SingleResult<CtripVerifyResVO> verifyFlight(RouteContext<CtripVerifyReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据查询的data确定调用供应商
        String purchaseEnum = context.getT().getRouting().getData().get(OtaConstants.PURCHANAME).toString();
        context.setPurchaseEnum(PurchaseEnum.getEnumByCode(purchaseEnum));
        SingleResult<CtripVerifyResVO> response = null;
        try {
            // 调用供应商接口数据
            CtripVerifyResVO verifyResVO = purchaseProxy.verifyFlight(context);
            if (verifyResVO == null) {
                response = new SingleResult<>(verifyResVO, false, "0001", "无数据");
                return response;
            }

            // 返回OTA查询数据
            response = new SingleResult<>(verifyResVO, true, "", "");
        } catch (Exception ex) {
            if (ex instanceof ServiceAbstractException) {
                response = new SingleResult<>(null, false, ((ServiceAbstractException) ex).getErrorCode(), ex.getMessage());
            } else {
                response = new SingleResult<>(null, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, ex.getMessage());
            }

            logger.error(ex.getMessage(),ex);
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
        if (null != resVOS && resVOS.size() > 0) {
            return resVOS.get(0);
        } else {
            return null;
        }
    }
}
