package com.tzq.commons.enums;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
/**
 * 状态枚举 通用
 * @author czj12867
 * @version $Id: StatusEnum.java, v 0.1 2016年10月21日 下午1:50:19 czj12867 Exp $
 */
public enum StatusEnum {
    /** 是 */
    TRUE(1, "是"),
    /** 否 */
    FALSE(0, "否");

    /** 枚举编码 */
    private int    code;

    /** 枚举描述 */
    private String desc;

    /** 私有构造函数 */
    private StatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static StatusEnum getEnumByCode(int code) {
        for (StatusEnum e : StatusEnum.values()) {
            if (code == e.getCode()) {
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
    public int getCode() {
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
