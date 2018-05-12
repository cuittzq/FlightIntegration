package com.tzq.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.tzq.biz.common.model.integration.lccverify.VerifyReqVO;
import com.tzq.biz.common.model.integration.lccverify.VerifyResVO;
import com.tzq.biz.service.core.LccBusiService;
import com.tzq.web.aop.UserAccess;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by cl24957 on 2018/5/12.
 */
@RestController
@RequestMapping(value = "/lcc")
public class LccIntController {

    @Resource
    private LccBusiService lccBusiService;

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @UserAccess(desc = "lccVerify")
    public String Verify(VerifyReqVO verifyReqVO) {
        VerifyResVO vo= lccBusiService.verifyCabinAndPrice(verifyReqVO);
        return JSONObject.toJSONString(vo);
    }
}
