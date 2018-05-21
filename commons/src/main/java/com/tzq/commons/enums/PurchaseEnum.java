package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum PurchaseEnum {
    /**
     * 金通
     */
    LCC("LCC", 1, "金通"),
    /**
     * 飞猪
     */
    NA517("517na", 2, "我要去哪");

    /**
     * 枚举编码
     */
    private String code;

    /**
     * 枚举ID
     */
    private int id;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private PurchaseEnum(String code, int id, String desc) {
        this.code = code;
        this.desc = desc;
        this.id = id;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static PurchaseEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (PurchaseEnum e : PurchaseEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }


    /**
     * 获取枚举类型
     *
     * @param id
     * @return
     */
    public static PurchaseEnum getEnumById(int id) {
        if (id > 2) {
            return null;
        }
        for (PurchaseEnum e : PurchaseEnum.values()) {
            if (id == e.getId()) {
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
     * 获取枚举编码
     *
     * @return
     */
    public int getId() {
        return id;
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
