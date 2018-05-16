package com.tzq.web;

import com.alibaba.fastjson.JSON;
import com.tzq.service.ctrip.models.enums.ChannelEnum;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/3
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableScheduling
@ComponentScan(basePackages = {"com.tzq", "com.tzq.service"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SearchFlightReq searchFlightReq = new SearchFlightReq();
        searchFlightReq.setAdultNumber(1);
        searchFlightReq.setChannel(ChannelEnum.FlightIntlOnline.getCode());
        searchFlightReq.setChildNumber(0);
        searchFlightReq.setFromCity("CTU");
        searchFlightReq.setFromDate("20180910");
        searchFlightReq.setAdultNumber(1);
        searchFlightReq.setRetDate("");
        searchFlightReq.setToCity("PEK");
        searchFlightReq.setTripType(1);
        searchFlightReq.setCid("12312");
        String request = JSON.toJSONString(searchFlightReq);
        SpringApplication.run(Application.class, args);
    }
}
