package com.tzq.commons.model.integration.verify;

import com.tzq.commons.model.integration.BaseParamVO;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class VerifyReqVO extends BaseParamVO {
    private VerifyRoutingVO routing;

    public VerifyRoutingVO getRouting() {
        return routing;
    }

    public void setRouting(VerifyRoutingVO routing) {
        this.routing = routing;
    }
}
