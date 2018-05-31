package com.tzq.biz.core.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.biz.cache.PlatSetCache;
import com.tzq.biz.constant.OtaConstants;
import com.tzq.biz.core.OtaVerifyFlightService;
import com.tzq.biz.core.PriceRuleRegulation;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.ExactSetting;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Resource
    PriceRuleRegulation priceRuleRegulation;

    @Autowired
    PlatSetCache platSetCache;
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

            if(context.getT().getNeedCalPrice()) {
                // 留点留钱计算
                priceHandle(context, verifyResVO);
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
     *  价格处理
     * @param context
     * @param verifyResVO
     */
    private void priceHandle(RouteContext<CtripVerifyReqVO> context, CtripVerifyResVO verifyResVO) {

        ExactSetting exactSetting =null;
        CurrencySetting currencySetting=null;
        // 从data中获取精准规则
        if (context.getT().getRouting().getData().containsKey(OtaConstants.EXACT_SETTING)) {
            String exactSetstr = context.getT().getRouting().getData().get(OtaConstants.EXACT_SETTING).toString();
            if (StringUtils.isNotEmpty(exactSetstr)) {
                exactSetting = platSetCache.getExactRulesbyid(exactSetstr);
            }
        }

        // 从data中获取通用规则
        if (context.getT().getRouting().getData().containsKey(OtaConstants.CURRENCY_SETTING)) {
            String currencySetstr = context.getT().getRouting().getData().get(OtaConstants.CURRENCY_SETTING).toString();
            if (StringUtils.isNotEmpty(currencySetstr)) {
                currencySetting = platSetCache.getCurrencyRulesByid(currencySetstr);
            }
        }

//        if(exactSetting ==null && currencySetting==null)
//        {
//            throw  new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorCode(CommonExcetpionConstant.ROUTING_DATA_ERROR).setErrorMsg("routing数据非法！").setStatus(false).build());
//        }
        //
        FlightRoutingsVO vo = context.getT().getRouting();
        vo.setAdultTax(verifyResVO.getRouting().getAdultTax());
        vo.setAdultPrice(verifyResVO.getRouting().getAdultPrice());
        vo.setAdultAgeRestriction(verifyResVO.getRouting().getAdultAgeRestriction());
        vo.setChildTaxType(verifyResVO.getRouting().getChildTaxType());
        vo.setAdultTaxType(verifyResVO.getRouting().getAdultTaxType());
        vo.setChildTax(verifyResVO.getRouting().getChildTax());
        vo.setChildPrice(verifyResVO.getRouting().getChildPrice());

        priceRuleRegulation.flightRegulation(exactSetting,currencySetting,vo);
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
