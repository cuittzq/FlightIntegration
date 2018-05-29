package com.tzq.web;

import com.alibaba.fastjson.JSON;
import com.tzq.service.ctrip.models.enums.ChannelEnum;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/3
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
@EnableCaching
@ComponentScan(basePackages = {"com.tzq", "com.tzq.service"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
