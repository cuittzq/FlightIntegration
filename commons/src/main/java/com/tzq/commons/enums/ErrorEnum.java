package com.tzq.commons.enums;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum ErrorEnum {
    SUCCEED(0, "成功"),
    NOT_ENOUGH(1, "舱位不足"),
    OTHERS(3, "其他失败原因"),
    PARAM_ERROR(4, "请求参数错误"),
    INNER_ERROR(5, "程序异常"),
    NET_ERROR(-1, "网络异常"),
    DATA_ERROR(-2, "response数据异常");


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
    private ErrorEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static ErrorEnum getEnumByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (ErrorEnum e : ErrorEnum.values()) {
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
