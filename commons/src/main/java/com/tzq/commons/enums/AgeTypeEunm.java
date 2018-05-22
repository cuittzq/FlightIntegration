package com.tzq.commons.enums;

public enum AgeTypeEunm {

    // 0 成人/1 儿童/2 婴儿

    ADT(0, "成人","ADT"),
    CHD(1, "儿童","CHD"),
    INF(2, "婴儿","INF"),;

    /**
     * 枚举编码
     */
    private int code;

    /**
     * 枚举描述
     */
    private String desc;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 私有构造函数
     */
     AgeTypeEunm(int code, String desc,String remark) {
        this.code = code;
        this.desc = desc;
        this.remark = remark;
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
