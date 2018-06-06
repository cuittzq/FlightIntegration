package com.tzq.dal.conf.platsetting;

import com.tzq.dal.conf.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "platsettingdb.datasource")
@MapperScan(basePackages = "com.tzq.dal.mapper.platsetting",
        sqlSessionFactoryRef = "platsettingdbSession")
public class PlatsettingDataBaseConfiguration extends DaoConfigurationBase {
    @Bean("platsettingdbSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
