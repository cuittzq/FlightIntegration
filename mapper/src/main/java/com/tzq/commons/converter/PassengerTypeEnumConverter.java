package com.tzq.commons.converter;

import com.tzq.commons.enums.PassengerTypeEnum;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Component
public class PassengerTypeEnumConverter {
    public String asString(PassengerTypeEnum passengerTypeEnum) {
        if (passengerTypeEnum != null) {
            return passengerTypeEnum.getCode();
        }
        return null;
    }

    public PassengerTypeEnum aspassengerTypeEnum(String statusType) {
        return PassengerTypeEnum.getEnumBycode(statusType);
    }
}
