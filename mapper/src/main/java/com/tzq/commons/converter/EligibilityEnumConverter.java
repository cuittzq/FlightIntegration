package com.tzq.commons.converter;

import com.tzq.commons.enums.EligibilityEnum;

public class EligibilityEnumConverter {

    public String asString(EligibilityEnum targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public EligibilityEnum asEnum(String statusType) {
        return EligibilityEnum.getEnumByCode(statusType);
    }
}
