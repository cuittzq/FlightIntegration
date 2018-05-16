package com.tzq.biz.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.verify.VerifyReqVO;
import com.tzq.commons.model.ctrip.verify.VerifyResVO;

public interface OtaVerifyFlightService {
    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    VerifyResVO verifyFlight(RouteContext<VerifyReqVO> req);
}
