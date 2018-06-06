package com.tzq.dal.mapper.log;

import com.tzq.dal.model.log.RuleMatchingLog;
import com.tzq.dal.model.log.RuleMatchingLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleMatchingLogMapper {
    long countByExample(RuleMatchingLogExample example);

    int deleteByExample(RuleMatchingLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RuleMatchingLog record);

    int insertSelective(RuleMatchingLog record);

    List<RuleMatchingLog> selectByExample(RuleMatchingLogExample example);

    RuleMatchingLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RuleMatchingLog record, @Param("example") RuleMatchingLogExample example);

    int updateByExample(@Param("record") RuleMatchingLog record, @Param("example") RuleMatchingLogExample example);

    int updateByPrimaryKeySelective(RuleMatchingLog record);

    int updateByPrimaryKey(RuleMatchingLog record);
}