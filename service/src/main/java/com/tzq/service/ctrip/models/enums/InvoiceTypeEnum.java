package com.tzq.service.ctrip.models.enums;

import org.apache.commons.lang3.StringUtils;

public enum InvoiceTypeEnum {
    /**
     * 行程单
     */
    T("T", "行程单"),
    /**
     * 发票
     */
    F("F", "发票"),
    /**
     * 电子发票
     */
    E("E", "电子发票");

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
    private InvoiceTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static InvoiceTypeEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (InvoiceTypeEnum e : InvoiceTypeEnum.values()) {
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
