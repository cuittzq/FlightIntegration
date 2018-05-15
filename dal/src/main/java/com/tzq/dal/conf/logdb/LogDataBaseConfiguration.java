package com.tzq.dal.conf.logdb;

import com.tzq.dal.conf.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "logdb.datasource")
@MapperScan(basePackages = "com.tzq.dal.mapper.log",
        sqlSessionFactoryRef = "logdbSession")
public class LogDataBaseConfiguration extends DaoConfigurationBase {
    @Bean("logdbSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
