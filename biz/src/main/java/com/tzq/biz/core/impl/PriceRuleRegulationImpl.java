package com.tzq.biz.core.impl;

import com.tzq.biz.core.PriceRuleRegulation;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.ExactSetting;
import org.springframework.stereotype.Component;

@Component
public class PriceRuleRegulationImpl implements PriceRuleRegulation {
    /**
     * 数据调控
     *
     * @param exactSetting
     * @param currencySetting
     * @param flightRoutingsVO
     * @return
     */
    @Override
    public FlightRoutingsVO flightRegulation(ExactSetting exactSetting, CurrencySetting currencySetting, FlightRoutingsVO flightRoutingsVO) {
        if (exactSetting == null && currencySetting == null) {
            return flightRoutingsVO;
        }

        if (exactSetting != null) {
            // 精准调控
            //`AduitLeaveMoney` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '成人票面留钱',
            //`AduitLeavePoint` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '成人票面留点',
            //`AduitTaxAddMoeny` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '成人税金加钱',
            //`ChildLeaveMoney` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '儿童票面留钱',
            //`ChildLeavePoint` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '儿童票面留点',
            //`ChildTaxAddMoney` decimal(10,2) NOT NULL COMMENT '儿童税费加钱',
            //`AllowLossMoney` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '允许亏损金额（最大亏损金额）',
        }

        if (currencySetting != null) {
            // 通用规则调控
        }

        return flightRoutingsVO;
    }
}
