package com.tzq.dal.service.rulesetting;

import com.tzq.dal.model.rulesetting.RefundSetting;
import com.tzq.dal.model.rulesetting.RefundSettingExample;

import java.util.List;

public interface RefundSettingService {
    long countByExample(RefundSettingExample example);

    int deleteByExample(RefundSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(RefundSetting record);

    int insertSelective(RefundSetting record);

    List<RefundSetting> selectByExample(RefundSettingExample example);

    RefundSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(RefundSetting record, RefundSettingExample example);

    int updateByExample(RefundSetting record, RefundSettingExample example);

    int updateByPrimaryKeySelective(RefundSetting record);

    int updateByPrimaryKey(RefundSetting record);
}
