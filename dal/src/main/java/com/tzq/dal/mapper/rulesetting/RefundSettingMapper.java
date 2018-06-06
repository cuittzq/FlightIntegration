package com.tzq.dal.mapper.rulesetting;

import com.tzq.dal.model.rulesetting.RefundSetting;
import com.tzq.dal.model.rulesetting.RefundSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundSettingMapper {
    long countByExample(RefundSettingExample example);

    int deleteByExample(RefundSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(RefundSetting record);

    int insertSelective(RefundSetting record);

    List<RefundSetting> selectByExample(RefundSettingExample example);

    RefundSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RefundSetting record, @Param("example") RefundSettingExample example);

    int updateByExample(@Param("record") RefundSetting record, @Param("example") RefundSettingExample example);

    int updateByPrimaryKeySelective(RefundSetting record);

    int updateByPrimaryKey(RefundSetting record);
}