package com.tzq.biz.core.impl;

import com.tzq.biz.core.PriceRuleRegulation;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.ExactSetting;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

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
            // 成人票面留点\留钱
            BigDecimal adultprice = new BigDecimal(flightRoutingsVO.getAdultPrice()).multiply(exactSetting.getAduitleavepoint().divide(new BigDecimal(100)).add(new BigDecimal(1))).add(exactSetting.getAduitleavemoney());
            flightRoutingsVO.setAdultPrice(adultprice.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 儿童票面留点\留钱
            BigDecimal childprice = new BigDecimal(flightRoutingsVO.getChildPrice()).multiply(exactSetting.getChildleavepoint().divide(new BigDecimal(100)).add(new BigDecimal(1))).add(exactSetting.getChildleavemoney());
            flightRoutingsVO.setChildPrice(childprice.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 成人税金加钱
            BigDecimal adultpriceTax = new BigDecimal(flightRoutingsVO.getAdultTax()).add(exactSetting.getAduittaxaddmoeny());
            flightRoutingsVO.setAdultTax(adultpriceTax.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 儿童税费加钱
            BigDecimal childpriceTax = new BigDecimal(flightRoutingsVO.getChildTax()).add(exactSetting.getChildtaxaddmoney());
            flightRoutingsVO.setChildTax(childpriceTax.setScale(0, BigDecimal.ROUND_UP).intValue());
        } else if (currencySetting != null) {
            // 通用规则调控
            // 成人票面留点\留钱
            BigDecimal adultprice = new BigDecimal(flightRoutingsVO.getAdultPrice()).multiply(currencySetting.getAduitleavepoint().divide(new BigDecimal(100)).add(new BigDecimal(1))).add(currencySetting.getAduitleavemoney());
            flightRoutingsVO.setAdultPrice(adultprice.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 儿童票面留点\留钱
            BigDecimal childprice = new BigDecimal(flightRoutingsVO.getChildPrice()).multiply(currencySetting.getChildleavepoint().divide(new BigDecimal(100)).add(new BigDecimal(1))).add(currencySetting.getChildleavemoney());
            flightRoutingsVO.setChildPrice(childprice.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 成人税金加钱
            BigDecimal adultpriceTax = new BigDecimal(flightRoutingsVO.getAdultTax()).add(currencySetting.getAduittaxaddmoeny());
            flightRoutingsVO.setAdultTax(adultpriceTax.setScale(0, BigDecimal.ROUND_UP).intValue());

            // 儿童税费加钱
            BigDecimal childpriceTax = new BigDecimal(flightRoutingsVO.getChildTax()).add(currencySetting.getChildtaxaddmoney());
            flightRoutingsVO.setChildTax(childpriceTax.setScale(0, BigDecimal.ROUND_UP).intValue());
        }

        return flightRoutingsVO;
    }
}
