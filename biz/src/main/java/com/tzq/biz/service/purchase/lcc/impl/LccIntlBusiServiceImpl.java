package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.service.purchase.abstracts.AbstractLccBusiService;
import com.tzq.commons.cache.LCCDataGuavaCache;
import com.tzq.commons.mapper.VerifyVOMapper;
import com.tzq.commons.model.integration.lcc.verify.VerifyReqVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyResVO;
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

    @Resource
    private VerifyVOMapper verifyVOMapper;

    @Override
    public VerifyResVO verifyCabinAndPrice(VerifyReqVO vo) {
        VerifyResVO resVO = null;

        VerifyReq req = verifyVOMapper.VerifyReqVOvO2dto(vo);

        // 获取缓存的价格
        String routDataKey = String.format("%s%s%s", req.getRouting().getFromSegments().get(0).getDepAirport(),
                req.getRouting().getFromSegments().get(0).getArrAirport(),
                req.getRouting().getFromSegments().get(0).getDepTime().substring(0,8));
        req.getRouting().setData(LCCDataGuavaCache.instance().get(routDataKey));

        resVO = verifyVOMapper.VerifyResdto2vo(lccClient.verifyCabinPrice(req));

        return resVO;
    }
}
