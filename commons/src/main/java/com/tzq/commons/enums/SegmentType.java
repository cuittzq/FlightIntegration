package com.tzq.commons.enums;

/**
 * Created by cl24957 on 2018/5/24.
 */
public enum SegmentType {
    /**
     * 去程
     */
    GO(1, "去程"),
    /**
     * 返程
     */
    BACK(2, "返程");

    /**
     * 枚举code
     */
    private Integer code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
     SegmentType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static TripTypeEnum getEnumBycode(Integer code) {
        if (1 != code && 2 != code) {
            return null;
        }
        for (TripTypeEnum e : TripTypeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 获取枚举code
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
