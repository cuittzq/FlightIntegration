package com.tzq.commons.converter;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class ExtInfoConverter {
    public static String map2String(Map<String, Object> extInfo) {
        if (MapUtils.isEmpty(extInfo)) {
            extInfo = Maps.newHashMap();
        }
        return JSON.toJSONString(extInfo);
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> string2Map(String extInfo) {
        if (StringUtils.isBlank(extInfo)) {
            return Maps.newHashMap();
        }
        return JSON.parseObject(extInfo, Map.class);
    }
}
