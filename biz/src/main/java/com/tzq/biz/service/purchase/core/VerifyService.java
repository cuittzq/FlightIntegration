package com.tzq.biz.service.purchase.core;

import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;

/**
 * Created by cl24957 on 2018/5/16.
 */
public interface VerifyService {
    /**
     * 验价
     *
     * @param req
     * @return
     */
    CtripVerifyResVO verifyFlight(RouteContext<CtripVerifyReqVO> req);
}
