package com.tzq.dal.service.platsetting.impl;

import com.tzq.dal.mapper.platsetting.MatchingSettingMapper;
import com.tzq.dal.model.platsetting.MatchingSetting;
import com.tzq.dal.model.platsetting.MatchingSettingExample;
import com.tzq.dal.service.platsetting.MatchingSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchingSettingServiceImpl implements MatchingSettingService {


    @Autowired
    private MatchingSettingMapper matchingSettingMapper;


    @Override
    public long countByExample(MatchingSettingExample example) {
        return matchingSettingMapper.countByExample(example);
    }

    @Override
    //删除用户数据
    public int deleteByExample(MatchingSettingExample example) {
        return matchingSettingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return matchingSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MatchingSetting record) {
        return matchingSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(MatchingSetting record) {
        return matchingSettingMapper.insertSelective(record);
    }

    @Override
    public List<MatchingSetting> selectByExample(MatchingSettingExample example) {
        return matchingSettingMapper.selectByExample(example);
    }

    @Override
    public MatchingSetting selectByPrimaryKey(String id) {
        return matchingSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MatchingSetting record, MatchingSettingExample example) {
        return matchingSettingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MatchingSetting record, MatchingSettingExample example) {
        return matchingSettingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MatchingSetting record) {
        return matchingSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MatchingSetting record) {
        return matchingSettingMapper.updateByPrimaryKey(record);
    }
}
