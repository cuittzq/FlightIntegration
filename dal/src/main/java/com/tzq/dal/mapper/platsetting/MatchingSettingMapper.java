package com.tzq.dal.mapper.platsetting;

import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatchingSettingMapper {
    long countByExample(MatchingSettingExample example);

    int deleteByExample(MatchingSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(MatchingSetting record);

    int insertSelective(MatchingSetting record);

    List<MatchingSetting> selectByExample(MatchingSettingExample example);

    MatchingSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MatchingSetting record, @Param("example") MatchingSettingExample example);

    int updateByExample(@Param("record") MatchingSetting record, @Param("example") MatchingSettingExample example);

    int updateByPrimaryKeySelective(MatchingSetting record);

    int updateByPrimaryKey(MatchingSetting record);
}