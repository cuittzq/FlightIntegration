package com.tzq.dal.mapper.rulesetting;

import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.CurrencySettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurrencySettingMapper {
    long countByExample(CurrencySettingExample example);

    int deleteByExample(CurrencySettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(CurrencySetting record);

    int insertSelective(CurrencySetting record);

    List<CurrencySetting> selectByExample(CurrencySettingExample example);

    CurrencySetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CurrencySetting record, @Param("example") CurrencySettingExample example);

    int updateByExample(@Param("record") CurrencySetting record, @Param("example") CurrencySettingExample example);

    int updateByPrimaryKeySelective(CurrencySetting record);

    int updateByPrimaryKey(CurrencySetting record);
}