package com.tzq.dal.mapper;

import com.tzq.dal.model.TestOrder;
import com.tzq.dal.model.TestOrderKey;

public interface TestOrderMapper {
    int deleteByPrimaryKey(TestOrderKey key);

    int insert(TestOrder record);

    int insertSelective(TestOrder record);

    TestOrder selectByPrimaryKey(TestOrderKey key);

    int updateByPrimaryKeySelective(TestOrder record);

    int updateByPrimaryKey(TestOrder record);
}