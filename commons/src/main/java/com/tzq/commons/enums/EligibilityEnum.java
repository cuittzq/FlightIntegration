package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

public enum EligibilityEnum {

    NOR("NOR", "普通成人"),
    LAB("LAB", "劳务人员"),

    SEA("SEA", "海员"),

    STU("SEA", "学生"),

    YOU("SEA", "青年"),

    SNR("SNR", "老年人");

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
    private EligibilityEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static EligibilityEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (EligibilityEnum e : EligibilityEnum.values()) {
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
