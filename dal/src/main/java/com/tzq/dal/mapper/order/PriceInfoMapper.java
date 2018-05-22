package com.tzq.dal.mapper.order;

import com.tzq.dal.model.order.PriceInfo;
import com.tzq.dal.model.order.PriceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceInfoMapper {
    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByExample(@Param("record") PriceInfo record, @Param("example") PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);
}