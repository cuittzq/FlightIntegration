package com.tzq.commons.model.integration.lcc.verify;

import com.tzq.commons.model.integration.lcc.BaseParamVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class VerifyReqVO extends BaseParamVO {
    private FlightRoutingsVO routing;

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
        this.routing = routing;
    }
}
