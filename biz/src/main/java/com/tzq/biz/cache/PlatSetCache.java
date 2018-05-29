package com.tzq.biz.cache;

import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.CurrencySettingExample;
import com.tzq.dal.model.rulesetting.ExactSetting;
import com.tzq.dal.model.rulesetting.ExactSettingExample;
import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSettingExample;
import com.tzq.dal.service.platsetting.MatchingSettingService;
import com.tzq.dal.service.rulesetting.CurrencySettingService;
import com.tzq.dal.service.rulesetting.ExactSettingService;
import com.tzq.dal.service.suppliersetting.SalesAirLineSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PlatSetCache {
    @Autowired
    private MatchingSettingService matchingSettingService;

    @Autowired
    private SalesAirLineSettingService salesAirLineSettingService;

    @Autowired
    private ExactSettingService exactSettingService;

    @Autowired
    private CurrencySettingService currencySettingService;

    // 平台规则
    private Map<String, List<MatchingSetting>> plateMatchsetmap = new HashMap<>();

    // 供应规则
    private Map<String, List<SalesAirLineSetting>> salesMatchsetmap = new HashMap<>();

    // 精准规则
    private Map<String, List<ExactSetting>> exactMatchsetmap = new HashMap<>();

    // 通用规则
    private Map<String, List<CurrencySetting>> currencytMatchsetmap = new HashMap<>();

    /**
     * @param salePlat OTA平台ID
     * @return
     */
    @Cacheable(value = "platSetCache", key = "#salePlat + 'dataMap'")
    public List<MatchingSetting> getPlatRules(String salePlat) {
        reloadplateData();
        if (plateMatchsetmap.containsKey(salePlat)) {
            return plateMatchsetmap.get(salePlat);
        }
        return null;
    }


    /**
     * @param purchPlat 供应平台ID
     * @return
     */
    @Cacheable(value = "salesAirLineSetCache", key = "#purchPlat + 'dataMap'")
    public List<SalesAirLineSetting> getSaleAirLineRules(String purchPlat) {
        reloadsalesData();
        if (salesMatchsetmap.containsKey(purchPlat)) {
            return salesMatchsetmap.get(purchPlat);
        }
        return null;
    }

    /**
     * @param purchPlat 供应平台ID
     * @return
     */
    @Cacheable(value = "exactSetCache", key = "#purchPlat + 'dataMap'")
    public List<ExactSetting> getExactRules(String purchPlat) {
        reloadexactData();
        if (exactMatchsetmap.containsKey(purchPlat)) {
            return exactMatchsetmap.get(purchPlat);
        }
        return null;
    }


    /**
     * @param salePlat  OTA平台ID
     * @param purchPlat 供应平台ID
     * @return
     */
    @Cacheable(value = "currencySetCache", key = "#salePlat + #purchPlat+ 'dataMap'")
    public List<CurrencySetting> getCurrencyRules(String salePlat, String purchPlat) {
        reloadcurrencytData();
        String key = salePlat + "-" + purchPlat;
        if (currencytMatchsetmap.containsKey(key)) {
            return currencytMatchsetmap.get(key);
        }
        return null;
    }


    @PostConstruct
    private void initData() {
        reloadplateData();
        reloadsalesData();
        reloadexactData();
        reloadcurrencytData();
    }


    private void reloadplateData() {
        MatchingSettingExample example = new MatchingSettingExample();
        example.createCriteria().andSettingstatusEqualTo(0);
        List<MatchingSetting> matchingSettings = matchingSettingService.selectByExample(example);
        if (!CollectionUtils.isEmpty(matchingSettings)) {
            matchingSettings.forEach(matchingSetting -> {
                String key = matchingSetting.getSalesplatform();
                if (!plateMatchsetmap.containsKey(key)) {
                    plateMatchsetmap.put(key, new ArrayList<>());
                }
                plateMatchsetmap.get(key).add(matchingSetting);
            });
        }
    }

    private void reloadsalesData() {
        SalesAirLineSettingExample salesAirLineSettingExample = new SalesAirLineSettingExample();
        salesAirLineSettingExample.createCriteria().andSettingstatusEqualTo(0);
        List<SalesAirLineSetting> salesAirLineSettings = salesAirLineSettingService.selectByExample(salesAirLineSettingExample);
        if (!CollectionUtils.isEmpty(salesAirLineSettings)) {
            salesAirLineSettings.forEach(salesAirLineSetting -> {
                String key = salesAirLineSetting.getPurchaseplatform();
                if (!salesMatchsetmap.containsKey(key)) {
                    salesMatchsetmap.put(key, new ArrayList<>());
                }
                salesMatchsetmap.get(key).add(salesAirLineSetting);
            });
        }
    }

    private void reloadexactData() {
        ExactSettingExample exactSettingExample = new ExactSettingExample();
        exactSettingExample.createCriteria().andSettingstatusEqualTo(0);
        List<ExactSetting> exactSettings = exactSettingService.selectByExample(exactSettingExample);
        if (!CollectionUtils.isEmpty(exactSettings)) {
            exactSettings.forEach(exactSetting -> {
                String key = exactSetting.getPurchaseplatform();
                if (!exactMatchsetmap.containsKey(key)) {
                    exactMatchsetmap.put(key, new ArrayList<>());
                }
                exactMatchsetmap.get(key).add(exactSetting);
            });
        }
    }

    private void reloadcurrencytData() {
        CurrencySettingExample currencySettingExample = new CurrencySettingExample();
        currencySettingExample.createCriteria().andSettingstatusEqualTo(0);
        List<CurrencySetting> currencySettings = currencySettingService.selectByExample(currencySettingExample);
        if (!CollectionUtils.isEmpty(currencySettings)) {
            currencySettings.forEach(currencySetting -> {
                String key = currencySetting.getSalesplatform() + "-" + currencySetting.getPurchaseplatform();
                if (!currencytMatchsetmap.containsKey(key)) {
                    currencytMatchsetmap.put(key, new ArrayList<>());
                }
                currencytMatchsetmap.get(key).add(currencySetting);
            });
        }
    }
}
