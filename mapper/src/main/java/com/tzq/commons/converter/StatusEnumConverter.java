package com.tzq.commons.converter;

import com.tzq.service.ctrip.models.enums.StatusEnum;
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
