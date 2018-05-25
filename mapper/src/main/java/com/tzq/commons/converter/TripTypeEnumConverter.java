package com.tzq.commons.converter;

import com.tzq.commons.enums.TripTypeEnum;
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
public class TripTypeEnumConverter {
    public Integer asString(TripTypeEnum tripTypeEnum) {
        if (tripTypeEnum != null) {
            return tripTypeEnum.getCode();
        }
        return null;
    }

    public TripTypeEnum asSegmentTypeEnum(Integer statusType) {
        return TripTypeEnum.getEnumBycode(statusType);
    }
}
