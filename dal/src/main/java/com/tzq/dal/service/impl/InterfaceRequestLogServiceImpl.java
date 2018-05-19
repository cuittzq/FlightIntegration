package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.log.InterfaceRequestLogMapper;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.model.log.InterfaceRequestLogExample;
import com.tzq.dal.service.InterfaceRequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterfaceRequestLogServiceImpl implements InterfaceRequestLogService {

    @Autowired
    InterfaceRequestLogMapper interfaceRequestLogMapper;

    @Override
    public long countByExample(InterfaceRequestLogExample example) {
        return interfaceRequestLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(InterfaceRequestLogExample example) {
        return interfaceRequestLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return interfaceRequestLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InterfaceRequestLog record) {
        return interfaceRequestLogMapper.insert(record);
    }

    @Override
    public int insertSelective(InterfaceRequestLog record) {
        return interfaceRequestLogMapper.insertSelective(record);
    }

    @Override
    public List<InterfaceRequestLog> selectByExample(InterfaceRequestLogExample example) {
        return interfaceRequestLogMapper.selectByExample(example);
    }

    @Override
    public InterfaceRequestLog selectByPrimaryKey(Long id) {
        return interfaceRequestLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(InterfaceRequestLog record, InterfaceRequestLogExample example) {
        return interfaceRequestLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(InterfaceRequestLog record, InterfaceRequestLogExample example) {
        return interfaceRequestLogMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(InterfaceRequestLog record) {
        return interfaceRequestLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InterfaceRequestLog record) {
        return interfaceRequestLogMapper.updateByPrimaryKey(record);
    }
}
