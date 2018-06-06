package com.tzq.dal.service.rulesetting;

import com.tzq.dal.model.rulesetting.ExactSetting;
import com.tzq.dal.model.rulesetting.ExactSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExactSettingService {
    long countByExample(ExactSettingExample example);

    int deleteByExample(ExactSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExactSetting record);

    int insertSelective(ExactSetting record);

    List<ExactSetting> selectByExample(ExactSettingExample example);

    ExactSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(ExactSetting record, ExactSettingExample example);

    int updateByExample(ExactSetting record, ExactSettingExample example);

    int updateByPrimaryKeySelective(ExactSetting record);

    int updateByPrimaryKey(ExactSetting record);
}
