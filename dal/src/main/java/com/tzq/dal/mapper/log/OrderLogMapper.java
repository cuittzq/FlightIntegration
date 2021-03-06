package com.tzq.dal.mapper.log;

import com.tzq.dal.model.log.OrderLog;
import com.tzq.dal.model.log.OrderLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLogMapper {
    long countByExample(OrderLogExample example);

    int deleteByExample(OrderLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    List<OrderLog> selectByExample(OrderLogExample example);

    OrderLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByExample(@Param("record") OrderLog record, @Param("example") OrderLogExample example);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}