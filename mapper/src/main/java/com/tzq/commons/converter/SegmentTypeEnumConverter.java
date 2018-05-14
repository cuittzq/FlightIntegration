package com.tzq.commons.converter;

import com.tzq.commons.enums.SegmentTypeEnum;
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
