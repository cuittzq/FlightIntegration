package com.tzq.biz.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;

public interface OtaVerifyFlightService {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> req);
}
