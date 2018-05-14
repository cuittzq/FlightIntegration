package com.tzq.integration.service.intl.lcc.model.verify;

import com.tzq.integration.service.intl.lcc.model.BaseParam;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyReq extends BaseParam{

    private VerifyRouting routing;

    public VerifyRouting getRouting() {
        return routing;
    }

    public void setRouting(VerifyRouting routing) {
        this.routing = routing;
    }
}
