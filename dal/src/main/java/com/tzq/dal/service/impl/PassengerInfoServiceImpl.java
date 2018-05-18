package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.order.PassengerInfoMapper;
import com.tzq.dal.model.order.PassengerInfo;
import com.tzq.dal.model.order.PassengerInfoExample;
import com.tzq.dal.service.PassengerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerInfoServiceImpl implements PassengerInfoService {

    @Autowired
    private PassengerInfoMapper passengerInfoMapper;

    @Override
    public long countByExample(PassengerInfoExample example) {
        return passengerInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PassengerInfoExample example) {
        return passengerInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return passengerInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PassengerInfo record) {
        return passengerInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PassengerInfo record) {
        return passengerInfoMapper.insertSelective(record);
    }

    @Override
    public List<PassengerInfo> selectByExample(PassengerInfoExample example) {
        return passengerInfoMapper.selectByExample(example);
    }

    @Override
    public PassengerInfo selectByPrimaryKey(Long id) {
        return passengerInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(PassengerInfo record, PassengerInfoExample example) {
        return passengerInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(PassengerInfo record, PassengerInfoExample example) {
        return passengerInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(PassengerInfo record) {
        return passengerInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PassengerInfo record) {
        return passengerInfoMapper.updateByPrimaryKey(record);
    }
}
