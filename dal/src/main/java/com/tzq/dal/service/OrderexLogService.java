package com.tzq.dal.service;

import com.tzq.dal.model.log.OrderexLog;
import com.tzq.dal.model.log.OrderexLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderexLogService {

    long countByExample(OrderexLogExample example);

    int deleteByExample(OrderexLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderexLog record);

    int insertSelective(OrderexLog record);

    List<OrderexLog> selectByExample(OrderexLogExample example);

    OrderexLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(OrderexLog record, OrderexLogExample example);

    int updateByExample(OrderexLog record, OrderexLogExample example);

    int updateByPrimaryKeySelective(OrderexLog record);

    int updateByPrimaryKey(OrderexLog record);
}
