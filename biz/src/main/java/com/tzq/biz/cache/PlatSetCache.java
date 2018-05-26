package com.tzq.biz.cache;

import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;
import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSettingExample;
import com.tzq.dal.service.platsetting.MatchingSettingService;
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

    private Map<String, List<MatchingSetting>> plateMatchsetmap = new HashMap<>();

    private Map<String, List<SalesAirLineSetting>> salesMatchsetmap = new HashMap<>();

    @Cacheable(value = "platSetCache", key = "#plat + 'dataMap'")
    public List<MatchingSetting> getPlatSeting(String plat) {
        if (plateMatchsetmap.containsKey(plat)) {
            return plateMatchsetmap.get(plat);
        }
        return null;
    }


    @Cacheable(value = "platSetCache", key = "#plat + 'dataMap'")
    public List<SalesAirLineSetting> getSaleAirLineSeting(String plat) {
        if (salesMatchsetmap.containsKey(plat)) {
            return salesMatchsetmap.get(plat);
        }
        return null;
    }


    @PostConstruct
    private void initData() {
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
}
