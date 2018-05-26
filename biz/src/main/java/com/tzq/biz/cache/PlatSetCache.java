package com.tzq.biz.cache;

import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;
import com.tzq.dal.service.platsetting.MatchingSettingService;
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

    private Map<String, List<MatchingSetting>> matchsetmap = new HashMap<>();


    @Cacheable(value = "platSetCache", key = "#plat + 'dataMap'")
    public List<MatchingSetting> getPlatSeting(String plat) {
        if (matchsetmap.containsKey(plat)) {
            return matchsetmap.get(plat);
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
                if (!matchsetmap.containsKey(key)) {
                    matchsetmap.put(key, new ArrayList<>());
                }
                matchsetmap.get(key).add(matchingSetting);
            });
        }
    }
}
