package com.tzq.commons.converter;

import com.tzq.commons.enums.AgeTypeEunm;

public class AgeTypeEunmConverter {
    public Integer asString(AgeTypeEunm targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public AgeTypeEunm asEnum(int statusType) {
        return AgeTypeEunm.getEnumByCode(statusType);
    }
}
