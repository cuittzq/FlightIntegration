package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * 订座系统
 */
public enum ReservationTypeEnum {
    /**
     * TravelSky
     */
    TravelSky("1E", "TravelSky"),

    /**
     * Amadeus
     */
    Amadeus("1A", "Amadeus"),

    /**
     * Abacus
     */
    Abacus("1B", "Abacus"),

    /**
     * Abacus
     */
    Sabre("1S", "Sabre"),

    /**
     * Abacus
     */
    WorldSpan("1P", "WorldSpan"),

    /**
     * Abacus
     */
    Galileo("1G", "Galileo"),

    OT("OT", "OT");

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
    private ReservationTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static ReservationTypeEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (ReservationTypeEnum e : ReservationTypeEnum.values()) {
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
