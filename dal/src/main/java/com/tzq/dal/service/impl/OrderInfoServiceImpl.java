package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.order.OrderInfoMapper;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.OrderInfoExample;
import com.tzq.dal.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public long countByExample(OrderInfoExample example) {
        return orderInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderInfoExample example) {
        return orderInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderInfo record) {
        return orderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderInfo record) {
        return orderInfoMapper.insertSelective(record);
    }

    @Override
    public List<OrderInfo> selectByExample(OrderInfoExample example) {
        return orderInfoMapper.selectByExample(example);
    }

    @Override
    public OrderInfo selectByPrimaryKey(Integer id) {
        return orderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(OrderInfo record, OrderInfoExample example) {
        return orderInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(OrderInfo record, OrderInfoExample example) {
        return orderInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderInfo record) {
        return orderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderInfo record) {
        return orderInfoMapper.updateByPrimaryKey(record);
    }
}
