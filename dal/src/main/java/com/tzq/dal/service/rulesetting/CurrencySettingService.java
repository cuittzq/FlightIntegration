package com.tzq.dal.service.rulesetting;

import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.CurrencySettingExample;

import java.util.List;

public interface CurrencySettingService {
    long countByExample(CurrencySettingExample example);

    int deleteByExample(CurrencySettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(CurrencySetting record);

    int insertSelective(CurrencySetting record);

    List<CurrencySetting> selectByExample(CurrencySettingExample example);

    CurrencySetting selectByPrimaryKey(String id);

    int updateByExampleSelective(CurrencySetting record, CurrencySettingExample example);

    int updateByExample(CurrencySetting record, CurrencySettingExample example);

    int updateByPrimaryKeySelective(CurrencySetting record);

    int updateByPrimaryKey(CurrencySetting record);
}
