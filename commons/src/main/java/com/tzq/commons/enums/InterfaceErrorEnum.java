package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/31
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum InterfaceErrorEnum {
    SUCCEED(0, "成功"),
    FAIL(1, "失败"),
    CID(2, "CID错误"),
    ILLEGAL_IP(3, "非法IP"),
    OPERATE_ERROR(4, "操作失败"),
    PARAM_ERROR(5, "请求参数错误"),
    INNER_ERROR(6, "程序异常"),
    OD_ERROR(7, "航线管控"),
    AIRLINE_ERROR(8, "航司过滤"),
    CONFIG_NOT_FIND(9, "配置未找到"),
    TIME_OUT(10, "访问超时"),
    FREQUENCY_LIMIT(11, "访问频繁"),
    OUT_OF_SALE_DATE(12, "不在销售时间范围内"),
    OUT_OF_WORK_DATE(13, "不在工作时间范围内"),
    PRICE_CHANGED(14, "价格变动"),
    NO_SEAT(15, "无座"),
    UN_BOOKING(16, "不可预订"),;


    /**
     * 枚举编码
     */
    private Integer code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private InterfaceErrorEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static InterfaceErrorEnum getEnumByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (InterfaceErrorEnum e : InterfaceErrorEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举类型
     *
     * @param name
     * @return
     */
    public static InterfaceErrorEnum getEnumByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InterfaceErrorEnum e : InterfaceErrorEnum.values()) {
            if (name.equals(e.name())) {
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
