package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

public enum CardTypeEnum {
    PP("PP", "护照"),
    GA("GA", "港澳通行证"),
    TW("TW", "台湾通行证"),
    TB("TB", "台胞证"),
    HX("HX", "回乡证"),
    HY("HY", "国际海员证");
    /**
     * 枚举编码
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private CardTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static CardTypeEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (CardTypeEnum e : CardTypeEnum.values()) {
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
}
