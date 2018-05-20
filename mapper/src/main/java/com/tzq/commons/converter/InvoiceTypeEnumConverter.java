package com.tzq.commons.converter;

import com.tzq.commons.enums.InvoiceTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class InvoiceTypeEnumConverter {

    public String asString(InvoiceTypeEnum targEnum) {
        if (targEnum != null) {
            return targEnum.getCode();
        }
        return null;
    }

    public InvoiceTypeEnum asEnum(String statusType) {
        return InvoiceTypeEnum.getEnumByCode(statusType);
    }
}
