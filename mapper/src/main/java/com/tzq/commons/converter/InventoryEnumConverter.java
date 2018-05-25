package com.tzq.commons.converter;

import com.tzq.commons.enums.InventoryEnum;
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
