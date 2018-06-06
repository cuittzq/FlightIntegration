package com.tzq.dal.service.rulesetting.impl;

import com.tzq.dal.mapper.rulesetting.CurrencySettingMapper;
import com.tzq.dal.model.rulesetting.CurrencySetting;
import com.tzq.dal.model.rulesetting.CurrencySettingExample;
import com.tzq.dal.service.rulesetting.CurrencySettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencySettingServiceImpl implements CurrencySettingService {

    @Autowired
    private CurrencySettingMapper currencySettingMapper;

    @Override
    public long countByExample(CurrencySettingExample example) {
        return currencySettingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CurrencySettingExample example) {
        return currencySettingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return currencySettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CurrencySetting record) {
        return currencySettingMapper.insert(record);
    }

    @Override
    public int insertSelective(CurrencySetting record) {
        return currencySettingMapper.insertSelective(record);
    }

    @Override
    public List<CurrencySetting> selectByExample(CurrencySettingExample example) {
        return currencySettingMapper.selectByExample(example);
    }

    @Override
    public CurrencySetting selectByPrimaryKey(String id) {
        return currencySettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CurrencySetting record, CurrencySettingExample example) {
        return currencySettingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CurrencySetting record, CurrencySettingExample example) {
        return currencySettingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CurrencySetting record) {
        return currencySettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CurrencySetting record) {
        return currencySettingMapper.updateByPrimaryKey(record);
    }
}
