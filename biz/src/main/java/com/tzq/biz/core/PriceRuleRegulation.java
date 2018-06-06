package com.tzq.biz.core;

import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.ExactSetting;

public interface PriceRuleRegulation {
    /**
     * 数据调控
     *
     * @param exactSetting
     * @param currencySetting
     * @param flightRoutingsVO
     * @return
     */
    FlightRoutingsVO flightRegulation(ExactSetting exactSetting, CurrencySetting currencySetting, FlightRoutingsVO flightRoutingsVO);
}
