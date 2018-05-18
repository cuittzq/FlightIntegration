package com.tzq.dal.service;

import com.tzq.dal.model.log.RuleMatchingLog;
import com.tzq.dal.model.log.RuleMatchingLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleMatchingLogService {
    long countByExample(RuleMatchingLogExample example);

    int deleteByExample(RuleMatchingLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RuleMatchingLog record);

    int insertSelective(RuleMatchingLog record);

    List<RuleMatchingLog> selectByExample(RuleMatchingLogExample example);

    RuleMatchingLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(RuleMatchingLog record, RuleMatchingLogExample example);

    int updateByExample(RuleMatchingLog record, RuleMatchingLogExample example);

    int updateByPrimaryKeySelective(RuleMatchingLog record);

    int updateByPrimaryKey(RuleMatchingLog record);
}
