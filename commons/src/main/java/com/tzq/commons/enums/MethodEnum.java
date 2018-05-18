package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/18
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum MethodEnum {
    SEARCHFLIGHT("Search", "查询"),
    VERIFY("Verify", "校验"),
    CREATEORDER("Order", "创单"),
    PAYCHECK("PayCheck", "请求参数错误"),
    OOTTICKET("OutTicket", "出票");


    /**
     * 枚举编码
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private MethodEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static MethodEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (MethodEnum e : MethodEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举编码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取枚举描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }
}
