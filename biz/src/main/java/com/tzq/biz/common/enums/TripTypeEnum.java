package com.tzq.biz.common.enums;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

import org.apache.commons.lang3.StringUtils;

/**
 * 行程类型枚举
 *
 */
public enum TripTypeEnum {

    /**
     * 单程
     */
    OW("OW", "单程"),
    /**
     * 往返
     */
    RT("RT", "往返");

    /**
     * 枚举code
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private TripTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static TripTypeEnum getEnumBycode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (TripTypeEnum e : TripTypeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举code
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