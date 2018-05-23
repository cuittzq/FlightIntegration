package com.tzq.dal.service.impl;

import com.tzq.dal.mapper.order.SegmentInfoMapper;
import com.tzq.dal.model.order.SegmentInfo;
import com.tzq.dal.model.order.SegmentInfoExample;
import com.tzq.dal.service.SegmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SegmentInfoServiceImpl implements SegmentInfoService {

    @Autowired
    private SegmentInfoMapper segmentInfoMapper;

    @Override
    public long countByExample(SegmentInfoExample example) {
        return segmentInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SegmentInfoExample example) {
        return segmentInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return segmentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SegmentInfo record) {
        return segmentInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SegmentInfo record) {
        return segmentInfoMapper.insertSelective(record);
    }

    @Override
    public List<SegmentInfo> selectByExample(SegmentInfoExample example) {
        return segmentInfoMapper.selectByExample(example);
    }

    @Override
    public SegmentInfo selectByPrimaryKey(Long id) {
        return segmentInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SegmentInfo record, SegmentInfoExample example) {
        return segmentInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SegmentInfo record, SegmentInfoExample example) {
        return segmentInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SegmentInfo record) {
        return segmentInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SegmentInfo record) {
        return segmentInfoMapper.updateByPrimaryKey(record);
    }
}
