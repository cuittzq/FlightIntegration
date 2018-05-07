package com.tzq.dal.mapper;

import com.tzq.dal.model.TestOrder;
import com.tzq.dal.model.TestOrderExample;
import com.tzq.dal.model.TestOrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestOrderMapper {
    long countByExample(TestOrderExample example);

    int deleteByExample(TestOrderExample example);

    int deleteByPrimaryKey(TestOrderKey key);

    int insert(TestOrder record);

    int insertSelective(TestOrder record);

    List<TestOrder> selectByExample(TestOrderExample example);

    TestOrder selectByPrimaryKey(TestOrderKey key);

    int updateByExampleSelective(@Param("record") TestOrder record, @Param("example") TestOrderExample example);

    int updateByExample(@Param("record") TestOrder record, @Param("example") TestOrderExample example);

    int updateByPrimaryKeySelective(TestOrder record);

    int updateByPrimaryKey(TestOrder record);
}