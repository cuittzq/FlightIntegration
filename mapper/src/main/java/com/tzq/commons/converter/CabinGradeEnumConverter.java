package com.tzq.commons.converter;

import com.tzq.commons.enums.CabinGradeEnum;

public class CabinGradeEnumConverter {

    public String asString(CabinGradeEnum targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public CabinGradeEnum asEnum(String statusType) {
        return CabinGradeEnum.getEnumByCode(statusType);
    }
}
