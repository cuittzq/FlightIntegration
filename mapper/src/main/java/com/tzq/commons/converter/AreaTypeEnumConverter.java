package com.tzq.commons.converter;

import com.tzq.commons.enums.AreaTypeEnum;
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
public class AreaTypeEnumConverter {
    public String asString(AreaTypeEnum areaTypeEnum) {
        if (areaTypeEnum != null) {
            return areaTypeEnum.getCode();
        }
        return null;
    }

    public AreaTypeEnum asAreaTypeEnum(String statusType) {
        return AreaTypeEnum.getEnumByCode(statusType);
    }
}
