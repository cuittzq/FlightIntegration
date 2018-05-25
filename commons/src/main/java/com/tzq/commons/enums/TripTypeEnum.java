package com.tzq.commons.enums;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

/**
 * 行程类型枚举
 */
public enum TripTypeEnum {

    /**
     * 单程
     */
    OW(1, "单程"),
    /**
     * 往返
     */
    RT(2, "往返");

    /**
     * 枚举code
     */
    private Integer code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private TripTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static TripTypeEnum getEnumBycode(Integer code) {
        if (1 != code && 2 != code) {
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
    public Integer getCode() {
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