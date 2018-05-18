package com.tzq.dal.service;

import com.tzq.dal.model.log.OrderLog;
import com.tzq.dal.model.log.OrderLogExample;

import java.util.List;

public interface OrderLogService {

    long countByExample(OrderLogExample example);

    int deleteByExample(OrderLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    List<OrderLog> selectByExample(OrderLogExample example);

    OrderLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(OrderLog record, OrderLogExample example);

    int updateByExample(OrderLog record, OrderLogExample example);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}
