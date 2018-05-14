package com.tzq.dal.conf.orderbd;

import com.tzq.dal.conf.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "orderdb.datasource")
@MapperScan(basePackages = "com.tzq.dal.mapper.order",
        sqlSessionFactoryRef = "orderdbSession")
public class OrderDataBaseConfiguration extends DaoConfigurationBase {
    @Bean("orderdbSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
