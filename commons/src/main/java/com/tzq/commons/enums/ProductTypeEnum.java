package com.tzq.commons.enums;

import org.apache.commons.lang3.StringUtils;

public enum ProductTypeEnum {

    PUB("PUB", "公布运价"),
    KWP("KWP", "控位产品"),
    JFP("JFP", "积分票产品");
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
    private ProductTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static ProductTypeEnum getEnumByCode(String code) {
        if (StringUtils.isEmpty(code)) {
            return null;
        }
        for (ProductTypeEnum e : ProductTypeEnum.values()) {
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
