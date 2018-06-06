package com.tzq.dal.service.rulesetting.impl;

import com.tzq.dal.mapper.rulesetting.ExactSettingMapper;
import com.tzq.dal.model.rulesetting.ExactSetting;
import com.tzq.dal.model.rulesetting.ExactSettingExample;
import com.tzq.dal.service.rulesetting.ExactSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExactSettingServiceImpl implements ExactSettingService {

    @Autowired
    private ExactSettingMapper exactSettingMapper;

    @Override
    public long countByExample(ExactSettingExample example) {
        return exactSettingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ExactSettingExample example) {
        return exactSettingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return exactSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ExactSetting record) {
        return exactSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(ExactSetting record) {
        return exactSettingMapper.insertSelective(record);
    }

    @Override
    public List<ExactSetting> selectByExample(ExactSettingExample example) {
        return exactSettingMapper.selectByExample(example);
    }

    @Override
    public ExactSetting selectByPrimaryKey(String id) {
        return exactSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ExactSetting record, ExactSettingExample example) {
        return exactSettingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ExactSetting record, ExactSettingExample example) {
        return exactSettingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ExactSetting record) {
        return exactSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ExactSetting record) {
        return exactSettingMapper.updateByPrimaryKey(record);
    }
}
