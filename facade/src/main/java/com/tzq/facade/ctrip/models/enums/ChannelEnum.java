package com.tzq.facade.ctrip.models.enums;

import org.apache.commons.lang3.StringUtils;

public enum ChannelEnum {

    /**
     * 是
     */
    FlightIntlOnline("F", "FlightIntlOnline"),
    /**
     * 是
     */
    Mobile("M", "Mobile"),
    /**
     * 否
     */
    K("K", "积分票");

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
    private ChannelEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static ChannelEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (ChannelEnum e : ChannelEnum.values()) {
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
