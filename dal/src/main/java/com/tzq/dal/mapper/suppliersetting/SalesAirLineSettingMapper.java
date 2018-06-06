package com.tzq.dal.mapper.suppliersetting;

import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesAirLineSettingMapper {
    long countByExample(SalesAirLineSettingExample example);

    int deleteByExample(SalesAirLineSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalesAirLineSetting record);

    int insertSelective(SalesAirLineSetting record);

    List<SalesAirLineSetting> selectByExample(SalesAirLineSettingExample example);

    SalesAirLineSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SalesAirLineSetting record, @Param("example") SalesAirLineSettingExample example);

    int updateByExample(@Param("record") SalesAirLineSetting record, @Param("example") SalesAirLineSettingExample example);

    int updateByPrimaryKeySelective(SalesAirLineSetting record);

    int updateByPrimaryKey(SalesAirLineSetting record);
}