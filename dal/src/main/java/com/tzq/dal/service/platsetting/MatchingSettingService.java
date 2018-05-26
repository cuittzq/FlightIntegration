package com.tzq.dal.service.platsetting;

import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;

import java.util.List;

public interface MatchingSettingService {

    long countByExample(MatchingSettingExample example);

    int deleteByExample(MatchingSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(MatchingSetting record);

    int insertSelective(MatchingSetting record);

    List<MatchingSetting> selectByExample(MatchingSettingExample example);

    MatchingSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(MatchingSetting record, MatchingSettingExample example);

    int updateByExample(MatchingSetting record, MatchingSettingExample example);

    int updateByPrimaryKeySelective(MatchingSetting record);

    int updateByPrimaryKey(MatchingSetting record);
}
