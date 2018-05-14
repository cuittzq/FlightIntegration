package com.tzq.commons.converter;

import com.tzq.commons.enums.InventoryEnum;
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
public class InventoryEnumConverter {
    public String asString(InventoryEnum inventoryEnum) {
        if (inventoryEnum != null) {
            return inventoryEnum.getCode();
        }
        return null;
    }

    public InventoryEnum asInventoryEnum(String statusType) {
        return InventoryEnum.getEnumByCode(statusType);
    }
}
