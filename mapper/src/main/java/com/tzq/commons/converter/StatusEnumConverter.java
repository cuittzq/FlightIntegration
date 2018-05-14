package com.tzq.commons.converter;

import com.tzq.commons.enums.StatusEnum;
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
public class StatusEnumConverter {
    public Integer asString(StatusEnum statusEnum) {
        if (statusEnum != null) {
            return statusEnum.getCode();
        }
        return null;
    }

    public StatusEnum asStatusEnum(Integer statusType) {
        return StatusEnum.getEnumByCode(statusType);
    }
}
