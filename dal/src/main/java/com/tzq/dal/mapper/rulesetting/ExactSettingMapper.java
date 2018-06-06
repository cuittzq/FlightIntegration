package com.tzq.dal.mapper.rulesetting;

import com.tzq.dal.model.rulesetting.ExactSetting;
import com.tzq.dal.model.rulesetting.ExactSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExactSettingMapper {
    long countByExample(ExactSettingExample example);

    int deleteByExample(ExactSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExactSetting record);

    int insertSelective(ExactSetting record);

    List<ExactSetting> selectByExample(ExactSettingExample example);

    ExactSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExactSetting record, @Param("example") ExactSettingExample example);

    int updateByExample(@Param("record") ExactSetting record, @Param("example") ExactSettingExample example);

    int updateByPrimaryKeySelective(ExactSetting record);

    int updateByPrimaryKey(ExactSetting record);
}