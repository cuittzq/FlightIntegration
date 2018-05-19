package com.tzq.dal.service;

import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.model.log.InterfaceRequestLogExample;

import java.util.List;

public interface InterfaceRequestLogService {

    long countByExample(InterfaceRequestLogExample example);

    int deleteByExample(InterfaceRequestLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterfaceRequestLog record);

    int insertSelective(InterfaceRequestLog record);

    List<InterfaceRequestLog> selectByExample(InterfaceRequestLogExample example);

    InterfaceRequestLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(InterfaceRequestLog record, InterfaceRequestLogExample example);

    int updateByExample(InterfaceRequestLog record, InterfaceRequestLogExample example);

    int updateByPrimaryKeySelective(InterfaceRequestLog record);

    int updateByPrimaryKey(InterfaceRequestLog record);
}
