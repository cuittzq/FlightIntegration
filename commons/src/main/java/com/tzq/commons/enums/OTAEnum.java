package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/16
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public enum OTAEnum {
    /**
     * 携程
     */
    CTRIP("Ctrip", "携程",1),
    /**
     * 飞猪
     */
    FLIGGY("fliggy", "飞猪",2);

    /**
     * 枚举编码
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    private int id;

    /**
     * 私有构造函数
     */
    private OTAEnum(String code, String desc,int id) {
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
    public static OTAEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (OTAEnum e : OTAEnum.values()) {
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

    /**
     * 获取ID
     * @return
     */
    public int getId(){return id;}
}
