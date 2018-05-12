package com.tzq.biz.service.intl.lcc.impl;

import com.tzq.biz.common.model.integration.lccverify.VerifyReqVO;
import com.tzq.biz.common.model.integration.lccverify.VerifyResVO;
import com.tzq.biz.service.abstracts.AbstractLccBusiService;
import com.tzq.biz.service.mapper.LccBusiMapper;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cl24957 on 2018/5/11.
 */
@Service
public class LccIntlBusiServiceImpl extends AbstractLccBusiService {
    @Resource
    private LccClient lccClient;

    @Override
    public VerifyResVO verifyCabinAndPrice(VerifyReqVO vo) {
        VerifyResVO resVO = null;

        VerifyReq req = LccBusiMapper.vo2io(vo);
        resVO =  LccBusiMapper.io2vo( lccClient.verifyCabinPrice(req));

        return resVO;
    }
}
