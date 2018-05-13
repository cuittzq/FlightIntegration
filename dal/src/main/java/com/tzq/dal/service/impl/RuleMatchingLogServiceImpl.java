package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.log.RuleMatchingLogMapper;
import com.tzq.dal.model.log.RuleMatchingLog;
import com.tzq.dal.model.log.RuleMatchingLogExample;
import com.tzq.dal.service.RuleMatchingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleMatchingLogServiceImpl implements RuleMatchingLogService {

    @Autowired
    RuleMatchingLogMapper ruleMatchingLogMapper;

    @Override
    public long countByExample(RuleMatchingLogExample example) {
        return ruleMatchingLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RuleMatchingLogExample example) {
        return ruleMatchingLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ruleMatchingLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RuleMatchingLog record) {
        return ruleMatchingLogMapper.insert(record);
    }

    @Override
    public int insertSelective(RuleMatchingLog record) {
        return ruleMatchingLogMapper.insertSelective(record);
    }

    @Override
    public List<RuleMatchingLog> selectByExample(RuleMatchingLogExample example) {
        return ruleMatchingLogMapper.selectByExample(example);
    }

    @Override
    public RuleMatchingLog selectByPrimaryKey(Integer id) {
        return ruleMatchingLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(RuleMatchingLog record, RuleMatchingLogExample example) {
        return ruleMatchingLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RuleMatchingLog record, RuleMatchingLogExample example) {
        return ruleMatchingLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(RuleMatchingLog record) {
        return ruleMatchingLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RuleMatchingLog record) {
        return ruleMatchingLogMapper.updateByPrimaryKey(record);
    }
}
