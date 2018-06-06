package com.tzq.dal.service.order;

import com.tzq.dal.model.order.SegmentInfo;
import com.tzq.dal.model.order.SegmentInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SegmentInfoService {
    long countByExample(SegmentInfoExample example);

    int deleteByExample(SegmentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SegmentInfo record);

    int insertSelective(SegmentInfo record);

    List<SegmentInfo> selectByExample(SegmentInfoExample example);

    SegmentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(SegmentInfo record, SegmentInfoExample example);

    int updateByExample(SegmentInfo record, SegmentInfoExample example);

    int updateByPrimaryKeySelective(SegmentInfo record);

    int updateByPrimaryKey(SegmentInfo record);
}
