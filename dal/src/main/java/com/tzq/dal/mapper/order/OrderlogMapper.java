package com.tzq.dal.mapper.order;

import com.tzq.dal.model.order.Orderlog;
import com.tzq.dal.model.order.OrderlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlogMapper {
    long countByExample(OrderlogExample example);

    int deleteByExample(OrderlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orderlog record);

    int insertSelective(Orderlog record);

    List<Orderlog> selectByExample(OrderlogExample example);

    Orderlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orderlog record, @Param("example") OrderlogExample example);

    int updateByExample(@Param("record") Orderlog record, @Param("example") OrderlogExample example);

    int updateByPrimaryKeySelective(Orderlog record);

    int updateByPrimaryKey(Orderlog record);
}