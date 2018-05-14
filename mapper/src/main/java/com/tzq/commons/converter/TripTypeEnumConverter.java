package com.tzq.commons.converter;

import com.tzq.commons.enums.TripTypeEnum;
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
public class TripTypeEnumConverter {
    public String asString(TripTypeEnum tripTypeEnum) {
        if (tripTypeEnum != null) {
            return tripTypeEnum.getCode();
        }
        return null;
    }

    public TripTypeEnum asSegmentTypeEnum(String statusType) {
        return TripTypeEnum.getEnumBycode(statusType);
    }
}
