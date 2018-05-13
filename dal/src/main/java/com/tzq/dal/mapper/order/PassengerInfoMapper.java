package com.tzq.dal.mapper.order;

import com.tzq.dal.model.order.PassengerInfo;
import com.tzq.dal.model.order.PassengerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassengerInfoMapper {
    long countByExample(PassengerInfoExample example);

    int deleteByExample(PassengerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PassengerInfo record);

    int insertSelective(PassengerInfo record);

    List<PassengerInfo> selectByExample(PassengerInfoExample example);

    PassengerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PassengerInfo record, @Param("example") PassengerInfoExample example);

    int updateByExample(@Param("record") PassengerInfo record, @Param("example") PassengerInfoExample example);

    int updateByPrimaryKeySelective(PassengerInfo record);

    int updateByPrimaryKey(PassengerInfo record);
}