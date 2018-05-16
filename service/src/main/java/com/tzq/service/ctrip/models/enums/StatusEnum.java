package com.tzq.service.ctrip.models.enums;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum StatusEnum {
    // 0, 成功；3,其他失败原因；4,ctrip请求参数错误；5,程序异常；-1,网络异常(ctrip使用)-2,response数据异常（ctrip使用）【满仓或舱位数不足时，请返回status非0，失败原因为“舱位不足”】
    SUCCEED(0, "成功"),
    OTHERS(3, "其他失败原因"),
    PARAM_ERROR(4, "请求参数错误"),
    INNER_ERROR(5, "程序异常"),
    NET_ERROR(-1, "网络异常"),
    DATA_ERROR(-2, "response数据异常"),
    NOT_ENOUGH(1, "舱位不足");


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
    private StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static StatusEnum getEnumByCode(Integer code) {
        if (code == null) {
            return null;
        }
        for (StatusEnum e : StatusEnum.values()) {
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
