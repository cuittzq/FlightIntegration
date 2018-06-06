package com.tzq.dal.service.suppliersetting.impl;

import com.tzq.dal.mapper.suppliersetting.SalesAirLineSettingMapper;
import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSettingExample;
import com.tzq.dal.service.suppliersetting.SalesAirLineSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesAirLineSettingServiceImpl implements SalesAirLineSettingService {

    @Autowired
    private SalesAirLineSettingMapper salesAirLineSettingMapper;

    @Override
    public long countByExample(SalesAirLineSettingExample example) {
        return salesAirLineSettingMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SalesAirLineSettingExample example) {
        return salesAirLineSettingMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SalesAirLineSetting record) {
        return salesAirLineSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(SalesAirLineSetting record) {
        return salesAirLineSettingMapper.insertSelective(record);
    }

    @Override
    public List<SalesAirLineSetting> selectByExample(SalesAirLineSettingExample example) {
        return salesAirLineSettingMapper.selectByExample(example);
    }

    @Override
    public SalesAirLineSetting selectByPrimaryKey(String id) {
        return salesAirLineSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SalesAirLineSetting record, SalesAirLineSettingExample example) {
        return salesAirLineSettingMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SalesAirLineSetting record, SalesAirLineSettingExample example) {
        return salesAirLineSettingMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SalesAirLineSetting record) {
        return salesAirLineSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SalesAirLineSetting record) {
        return salesAirLineSettingMapper.updateByPrimaryKey(record);
    }
}
