package com.tzq.biz.service.purchase.core;


import com.tzq.commons.model.integration.lcc.verify.VerifyReqVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyResVO;

/**
 * Created by cl24957 on 2018/5/11.
 */
public interface LccBusiService {
    VerifyResVO verifyCabinAndPrice(VerifyReqVO vo);


}
