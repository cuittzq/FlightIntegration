package com.tzq.web.controller;

import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.VerifyReq;
import com.tzq.service.ctrip.models.verify.VerifyRes;
import com.tzq.web.aop.UserAccess;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/ctrip")
public class CtripServiceController {

    @Resource
    private CtripFlightService ctripFlightService;

    @RequestMapping(value = "/searchflight", method = RequestMethod.POST)
    @UserAccess(desc = "searchflight")
    public SearchFlightRes searchFlight(SearchFlightReq searchFlightReq) {
        SearchFlightRes vo = ctripFlightService.searchFlight(searchFlightReq);
        return vo;
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @UserAccess(desc = "verify")
    public VerifyRes Verify(VerifyReq verifyReq) {
        VerifyRes vo = ctripFlightService.verifyFlight(verifyReq);
        return vo;
    }

    @RequestMapping(value = "/createorder", method = RequestMethod.POST)
    @UserAccess(desc = "createorder")
    public CreateOrderRes CreateOrder(CreateOrderReq createOrderReq) {
        CreateOrderRes vo = ctripFlightService.createOrder(createOrderReq);
        return vo;
    }
}
