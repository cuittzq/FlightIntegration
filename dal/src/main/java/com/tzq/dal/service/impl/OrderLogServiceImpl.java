package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.log.OrderLogMapper;
import com.tzq.dal.model.log.OrderLog;
import com.tzq.dal.model.log.OrderLogExample;
import com.tzq.dal.service.OrderLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLogServiceImpl implements OrderLogService {

    @Autowired
    private OrderLogMapper orderLogMapper;

    @Override
    public long countByExample(OrderLogExample example) {
        return orderLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderLogExample example) {
        return orderLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return orderLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderLog record) {
        return orderLogMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderLog record) {
        return orderLogMapper.insertSelective(record);
    }

    @Override
    public List<OrderLog> selectByExample(OrderLogExample example) {
        return orderLogMapper.selectByExample(example);
    }

    @Override
    public OrderLog selectByPrimaryKey(Long id) {
        return orderLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(OrderLog record, OrderLogExample example) {
        return orderLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderLog record, OrderLogExample example) {
        return orderLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderLog record) {
        return orderLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderLog record) {
        return orderLogMapper.updateByPrimaryKey(record);
    }
}
