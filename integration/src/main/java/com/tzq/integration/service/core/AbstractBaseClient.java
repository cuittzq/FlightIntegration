package com.tzq.integration.service.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public abstract class AbstractBaseClient {
    // 统一日志记录
    // 错误消息处理
    // 字典配置

    protected final String ENCODING = "utf-8";


    protected Map<String, String> getDefaultHeader() {
        Map<String, String> header = new HashMap<>();
        header.put("Content-type", "application/json");
        header.put("Accept-Encoding", "gzip,deflate");
        return header;
    }
}
