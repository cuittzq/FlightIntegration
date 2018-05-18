package com.tzq.dal.mapper.log;

import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.model.log.InterfaceRequestLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceRequestLogMapper {
    long countByExample(InterfaceRequestLogExample example);

    int deleteByExample(InterfaceRequestLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InterfaceRequestLog record);

    int insertSelective(InterfaceRequestLog record);

    List<InterfaceRequestLog> selectByExample(InterfaceRequestLogExample example);

    InterfaceRequestLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InterfaceRequestLog record, @Param("example") InterfaceRequestLogExample example);

    int updateByExample(@Param("record") InterfaceRequestLog record, @Param("example") InterfaceRequestLogExample example);

    int updateByPrimaryKeySelective(InterfaceRequestLog record);

    int updateByPrimaryKey(InterfaceRequestLog record);
}