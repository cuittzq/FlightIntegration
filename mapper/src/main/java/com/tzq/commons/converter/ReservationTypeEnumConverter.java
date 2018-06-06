package com.tzq.commons.converter;

import com.tzq.commons.enums.ReservationTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class ReservationTypeEnumConverter {
    public String asString(ReservationTypeEnum targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public ReservationTypeEnum asEnum(String statusType) {
        return ReservationTypeEnum.getEnumByCode(statusType);
    }
}
