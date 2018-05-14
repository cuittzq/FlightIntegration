package com.tzq.dal.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

public class DaoConfigurationBase {

    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String mappinglocation;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getMappinglocation() {
        return mappinglocation;
    }

    public void setMappinglocation(String mappinglocation) {
        this.mappinglocation = mappinglocation;
    }

    protected DataSource dataSource() {
        return DataSourceBuilder.create().url(url).username(username)
                .password(password).driverClassName(driverClassName).build();
    }

    protected SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources(mappinglocation));
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}
