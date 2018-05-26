package com.tzq.dal.service.suppliersetting;

import com.tzq.dal.model.suppliersetting.SalesAirLineSetting;
import com.tzq.dal.model.suppliersetting.SalesAirLineSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalesAirLineSettingService {
    long countByExample(SalesAirLineSettingExample example);

    int deleteByExample(SalesAirLineSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(SalesAirLineSetting record);

    int insertSelective(SalesAirLineSetting record);

    List<SalesAirLineSetting> selectByExample(SalesAirLineSettingExample example);

    SalesAirLineSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(SalesAirLineSetting record, SalesAirLineSettingExample example);

    int updateByExample(SalesAirLineSetting record, SalesAirLineSettingExample example);

    int updateByPrimaryKeySelective(SalesAirLineSetting record);

    int updateByPrimaryKey(SalesAirLineSetting record);
}
