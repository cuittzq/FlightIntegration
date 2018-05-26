package com.tzq.dal.service.order;

import com.tzq.dal.model.order.PriceInfo;
import com.tzq.dal.model.order.PriceInfoExample;

import java.util.List;

public interface PriceInfoService {
    long countByExample(PriceInfoExample example);

    int deleteByExample(PriceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertSelective(PriceInfo record);

    List<PriceInfo> selectByExample(PriceInfoExample example);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(PriceInfo record, PriceInfoExample example);

    int updateByExample(PriceInfo record, PriceInfoExample example);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

}
