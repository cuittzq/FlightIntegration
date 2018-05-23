package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.order.PriceInfoMapper;
import com.tzq.dal.model.order.PriceInfo;
import com.tzq.dal.model.order.PriceInfoExample;
import com.tzq.dal.service.PriceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceInfoServiceImpl implements PriceInfoService {

    @Autowired
    PriceInfoMapper priceInfoMapper;


    @Override
    public long countByExample(PriceInfoExample example) {
        return priceInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PriceInfoExample example) {
        return priceInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return priceInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PriceInfo record) {
        return priceInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PriceInfo record) {
        return priceInfoMapper.insertSelective(record);
    }

    @Override
    public List<PriceInfo> selectByExample(PriceInfoExample example) {
        return priceInfoMapper.selectByExample(example);
    }

    @Override
    public PriceInfo selectByPrimaryKey(Long id) {
        return priceInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(PriceInfo record, PriceInfoExample example) {
        return priceInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(PriceInfo record, PriceInfoExample example) {
        return priceInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(PriceInfo record) {
        return priceInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PriceInfo record) {
        return priceInfoMapper.updateByPrimaryKey(record);
    }
}
