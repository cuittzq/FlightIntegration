package com.tzq.dal.mapper.log;

import com.tzq.dal.model.log.OrderexLog;
import com.tzq.dal.model.log.OrderexLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderexLogMapper {
    long countByExample(OrderexLogExample example);

    int deleteByExample(OrderexLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderexLog record);

    int insertSelective(OrderexLog record);

    List<OrderexLog> selectByExample(OrderexLogExample example);

    OrderexLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderexLog record, @Param("example") OrderexLogExample example);

    int updateByExample(@Param("record") OrderexLog record, @Param("example") OrderexLogExample example);

    int updateByPrimaryKeySelective(OrderexLog record);

    int updateByPrimaryKey(OrderexLog record);
}