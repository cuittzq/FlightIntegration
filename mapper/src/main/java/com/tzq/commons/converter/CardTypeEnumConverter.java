package com.tzq.commons.converter;

import com.tzq.commons.enums.CardTypeEnum;

public class CardTypeEnumConverter {
    public String asString(CardTypeEnum targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public CardTypeEnum asEnum(String statusType) {
        return CardTypeEnum.getEnumByCode(statusType);
    }
}
