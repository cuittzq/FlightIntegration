package com.tzq.commons.converter;

import com.tzq.commons.enums.CurrencyEnum;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Component
public class CurrencyEnumConverter {
    public String asString(CurrencyEnum areaTypeEnum) {
        if (areaTypeEnum != null) {
            return areaTypeEnum.getCode();
        }
        return null;
    }

    public CurrencyEnum asCurrencyEnum(String statusType) {
        return CurrencyEnum.getEnumByCode(statusType);
    }
}
