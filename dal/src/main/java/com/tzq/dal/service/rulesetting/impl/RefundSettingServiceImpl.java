package com.tzq.dal.service.rulesetting.impl;

import com.tzq.dal.mapper.rulesetting.RefundSettingMapper;
import com.tzq.dal.model.rulesetting.RefundSetting;
import com.tzq.dal.model.rulesetting.RefundSettingExample;
import com.tzq.dal.service.rulesetting.RefundSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefundSettingServiceImpl implements RefundSettingService {

    @Autowired
    private RefundSettingMapper refundSettingMapper;

    @Override
    public long countByExample(RefundSettingExample example) {
        return refundSettingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RefundSettingExample example) {
        return refundSettingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return refundSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RefundSetting record) {
        return refundSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(RefundSetting record) {
        return refundSettingMapper.insertSelective(record);
    }

    @Override
    public List<RefundSetting> selectByExample(RefundSettingExample example) {
        return refundSettingMapper.selectByExample(example);
    }

    @Override
    public RefundSetting selectByPrimaryKey(String id) {
        return refundSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(RefundSetting record, RefundSettingExample example) {
        return refundSettingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RefundSetting record, RefundSettingExample example) {
        return refundSettingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(RefundSetting record) {
        return refundSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RefundSetting record) {
        return refundSettingMapper.updateByPrimaryKey(record);
    }
}
