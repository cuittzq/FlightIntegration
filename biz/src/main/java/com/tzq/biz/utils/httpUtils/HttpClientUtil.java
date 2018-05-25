package com.tzq.biz.utils.httpUtils;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.util.Arrays;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2017/10/24
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class HttpClientUtil {

    /**
     * 配置成JSON发送和接收
     */
    protected WebClient configToJson(String baseAddress) {
        try {
            return WebClient.create(baseAddress, Arrays.asList(new JacksonJaxbJsonProvider())).type(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE);
        } catch (Exception e) {
            System.out.print("创建客户端失败");
        }
        return null;

    }
}
