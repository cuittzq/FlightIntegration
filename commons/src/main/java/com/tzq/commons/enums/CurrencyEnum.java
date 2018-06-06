package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 货币枚举
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum CurrencyEnum {
    /** 人民币 */
    CNY("CNY", "人民币");

    /** 枚举编码 */
    private String code;

    /** 枚举描述 */
    private String desc;

    /** 私有构造函数 */
    private CurrencyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static CurrencyEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (CurrencyEnum e : CurrencyEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 判断枚举是否包含某值
     *
     * @param code
     * @return
     */
    public static boolean isExists(String code) {

        if (StringUtils.isEmpty(code)) {
            return false;
        }
        int flag = 0;
        for (CurrencyEnum e : CurrencyEnum.values()) {
            if (code.equals(e.getCode())) {
                flag++;
            }
        }
        if (flag > 0) {
            return true;
        } else {
            return false;
        }
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
