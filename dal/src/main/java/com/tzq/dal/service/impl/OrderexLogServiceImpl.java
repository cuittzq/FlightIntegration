package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.log.OrderexLogMapper;
import com.tzq.dal.model.log.OrderexLog;
import com.tzq.dal.model.log.OrderexLogExample;
import com.tzq.dal.service.OrderexLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderexLogServiceImpl implements OrderexLogService {

    @Autowired
    private OrderexLogMapper orderexLogMapper;

    @Override
    public long countByExample(OrderexLogExample example) {
        return orderexLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderexLogExample example) {
        return orderexLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderexLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderexLog record) {
        return orderexLogMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderexLog record) {
        return orderexLogMapper.insertSelective(record);
    }

    @Override
    public List<OrderexLog> selectByExample(OrderexLogExample example) {
        return orderexLogMapper.selectByExample(example);
    }

    @Override
    public OrderexLog selectByPrimaryKey(Integer id) {
        return orderexLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(OrderexLog record, OrderexLogExample example) {
        return orderexLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderexLog record, OrderexLogExample example) {
        return orderexLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderexLog record) {
        return orderexLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderexLog record) {
        return orderexLogMapper.updateByPrimaryKey(record);
    }
}
