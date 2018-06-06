package com.tzq.dal.conf.rulesetting;

import com.tzq.dal.conf.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "rulesettingdb.datasource")
@MapperScan(basePackages = "com.tzq.dal.mapper.rulesetting",
        sqlSessionFactoryRef = "rulesettingdbSession")
public class RulesettingDataBaseConfiguration extends DaoConfigurationBase {
    @Bean("rulesettingdbSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
