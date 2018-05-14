package com.tzq.biz.service.purchase.core;

import com.tzq.biz.common.model.integration.lccverify.VerifyReqVO;
import com.tzq.biz.common.model.integration.lccverify.VerifyResVO;

/**
 * Created by cl24957 on 2018/5/11.
 */
public interface LccBusiService {
    VerifyResVO verifyCabinAndPrice(VerifyReqVO vo);
}
