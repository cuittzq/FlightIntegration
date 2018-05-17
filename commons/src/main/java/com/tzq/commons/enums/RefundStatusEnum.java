package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 退票标识
 * T：不可退
 * H：有条件退
 * F：免费退
 * E：按航司客规【公布运价专用】
 */
public enum RefundStatusEnum {
    T("T", "不可退"),
    H("H", "有条件退"),
    F("F", "免费退"),
    E("E", "按航司客规");
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
    private RefundStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static RefundStatusEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (RefundStatusEnum e : RefundStatusEnum.values()) {
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
