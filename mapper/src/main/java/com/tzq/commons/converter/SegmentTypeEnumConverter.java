package com.tzq.commons.converter;

import com.tzq.commons.enums.SegmentTypeEnum;
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
public class SegmentTypeEnumConverter {
    public String asString(SegmentTypeEnum segmentTypeEnum) {
        if (segmentTypeEnum != null) {
            return segmentTypeEnum.getCode();
        }
        return null;
    }

    public SegmentTypeEnum asSegmentTypeEnum(String statusType) {
        return SegmentTypeEnum.getEnumBycode(statusType);
    }
}
