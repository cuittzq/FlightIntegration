package com.tzq.dal.service;

import com.tzq.dal.model.order.PassengerInfo;
import com.tzq.dal.model.order.PassengerInfoExample;

import java.util.List;

public interface PassengerInfoService {
    long countByExample(PassengerInfoExample example);

    int deleteByExample(PassengerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PassengerInfo record);

    int insertSelective(PassengerInfo record);

    List<PassengerInfo> selectByExample(PassengerInfoExample example);

    PassengerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(PassengerInfo record, PassengerInfoExample example);

    int updateByExample(PassengerInfo record, PassengerInfoExample example);

    int updateByPrimaryKeySelective(PassengerInfo record);

    int updateByPrimaryKey(PassengerInfo record);
}
