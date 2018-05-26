package com.tzq.dal.conf.suppliersetting;

import com.tzq.dal.conf.DaoConfigurationBase;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "suppliersettingdb.datasource")
@MapperScan(basePackages = "com.tzq.dal.mapper.suppliersetting",
        sqlSessionFactoryRef = "suppliersettingdbSession")
public class SupplierSettingDataBaseConfiguration extends DaoConfigurationBase {
    @Bean("suppliersettingdbSession")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {
        return super.sqlSessionFactory();
    }
}
