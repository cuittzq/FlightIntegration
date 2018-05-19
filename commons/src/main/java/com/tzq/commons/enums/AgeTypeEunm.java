package com.tzq.commons.enums;

public enum AgeTypeEunm {

    // 0 成人/1 儿童/2 婴儿

    ADT(0, "成人"),
    CHD(1, "儿童"),
    INF(2, "婴儿"),;

    /**
     * 枚举编码
     */
    private int code;

    /**
     * 枚举描述
     */
    private String desc;

    /**
     * 私有构造函数
     */
    private AgeTypeEunm(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static AgeTypeEunm getEnumByCode(int code) {
        if (code < 0 || code > 2) {
            return null;
        }
        for (AgeTypeEunm e : AgeTypeEunm.values()) {
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
