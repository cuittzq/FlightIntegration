package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 乘客类型枚举
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum PassengerTypeEnum {

    /** 成人 */
    ADT("ADT", "ADULT", "成人"),
    /** 儿童 */
    CHD("CHD", "CHILD", "儿童"),
    /** 婴儿 */
    INF("INF", "INFANT", "婴儿");
    /** 枚举code */
    private String code;

    /** 枚举code完整描述 */
    private String completeCode;

    /** 枚举描述 */
    private String desc;

    /** 私有构造函数 */
    private PassengerTypeEnum(String code, String completeCode, String desc) {
        this.code = code;
        this.completeCode = completeCode;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static PassengerTypeEnum getEnumBycode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (PassengerTypeEnum e : PassengerTypeEnum.values()) {
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
        for (PassengerTypeEnum e : PassengerTypeEnum.values()) {
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

    public String getCompleteCode() {
        return completeCode;
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
