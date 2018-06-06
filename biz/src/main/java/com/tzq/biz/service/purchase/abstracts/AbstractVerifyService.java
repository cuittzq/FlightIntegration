package com.tzq.biz.service.purchase.abstracts;

import com.tzq.biz.service.purchase.core.VerifyService;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyResVO;

/**
 * Created by cl24957 on 2018/5/16.
 */
public abstract class AbstractVerifyService extends AbstractBaseService implements VerifyService {

    /**
     * 验价返回参数组装
     *
     * @param <T>
     * @param t
     * @return
     */
    protected abstract <T> CtripVerifyResVO response(T t, RouteContext<CtripVerifyReqVO> context);

    /**
     * 验价请求参数组装
     *
     * @param context
     * @return
     */
    protected abstract <T> T request(RouteContext<CtripVerifyReqVO> context);
}
