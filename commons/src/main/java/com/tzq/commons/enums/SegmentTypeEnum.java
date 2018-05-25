package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 航段类型
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum SegmentTypeEnum {

    /**
     * 去程
     */
    GO("1", "去程"),
    /**
     * 易宝
     */
    BACK("2", "返程");

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
    private SegmentTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static SegmentTypeEnum getEnumBycode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (SegmentTypeEnum e : SegmentTypeEnum.values()) {
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
