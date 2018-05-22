package com.tzq.dal.mapper.order;

import com.tzq.dal.model.order.SegmentInfo;
import com.tzq.dal.model.order.SegmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SegmentInfoMapper {
    long countByExample(SegmentInfoExample example);

    int deleteByExample(SegmentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SegmentInfo record);

    int insertSelective(SegmentInfo record);

    List<SegmentInfo> selectByExample(SegmentInfoExample example);

    SegmentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SegmentInfo record, @Param("example") SegmentInfoExample example);

    int updateByExample(@Param("record") SegmentInfo record, @Param("example") SegmentInfoExample example);

    int updateByPrimaryKeySelective(SegmentInfo record);

    int updateByPrimaryKey(SegmentInfo record);
}