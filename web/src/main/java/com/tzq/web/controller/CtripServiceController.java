package com.tzq.web.controller;

import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;
import com.tzq.web.aop.UserAccess;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
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
    public SearchFlightRes searchFlight(@RequestBody SearchFlightReq searchFlightReq, BindingResult bindingResult) {
        SearchFlightRes searchFlightRes = new SearchFlightRes();
        if (bindingResult.hasErrors()) {
            searchFlightRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            searchFlightRes.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return searchFlightRes;
        }
        searchFlightRes = ctripFlightService.searchFlight(searchFlightReq);
        if (searchFlightRes == null) {
            searchFlightRes = new SearchFlightRes();
            searchFlightRes.setStatus(StatusEnum.DATA_ERROR.getCode());
            searchFlightRes.setMsg(StatusEnum.DATA_ERROR.getDesc());
        }
        return searchFlightRes;
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    @UserAccess(desc = "verify")
    public CtripVerifyRes Verify(@RequestBody CtripVerifyReq verifyReq, BindingResult bindingResult) {

        CtripVerifyRes verifyRes = new CtripVerifyRes();
        if (bindingResult.hasErrors()) {
            verifyRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            verifyRes.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return verifyRes;
        }

        verifyRes = ctripFlightService.verifyFlight(verifyReq);
        return verifyRes;
    }

    @RequestMapping(value = "/createorder", method = RequestMethod.POST)
    @UserAccess(desc = "createorder")
    public CreateOrderRes CreateOrder(@RequestBody CreateOrderReq createOrderReq, BindingResult bindingResult) {

        CreateOrderRes createOrderRes = new CreateOrderRes();
        if (bindingResult.hasErrors()) {
            createOrderRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            createOrderRes.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return createOrderRes;
        }

        createOrderRes = ctripFlightService.createOrder(createOrderReq);
        return createOrderRes;
    }
}
