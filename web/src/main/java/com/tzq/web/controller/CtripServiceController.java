package com.tzq.web.controller;

import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.order.CreateOrderReq;
import com.tzq.service.ctrip.models.order.CreateOrderRes;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;
import com.tzq.service.ctrip.models.search.SearchFlightReq;
import com.tzq.service.ctrip.models.search.SearchFlightRes;
import com.tzq.service.ctrip.models.search.SegmentDTO;
import com.tzq.service.ctrip.models.verify.CtripVerifyReq;
import com.tzq.service.ctrip.models.verify.CtripVerifyRes;
import com.tzq.web.aop.UserAccess;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/ctrip")
public class CtripServiceController {

    @Resource
    private CtripFlightService ctripFlightService;

    @RequestMapping(value = "/searchflight", method = RequestMethod.POST)
    public SearchFlightRes searchFlight(@Valid @RequestBody SearchFlightReq searchFlightReq, BindingResult bindingResult) {
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
    CtripVerifyRes Verify(@RequestBody CtripVerifyReq verifyReq, BindingResult bindingResult) {

        CtripVerifyRes verifyRes = new CtripVerifyRes();
        if (bindingResult.hasErrors()) {
            verifyRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            verifyRes.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return verifyRes;
        }

        if (verifyReq == null) {
            verifyRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            verifyRes.setMsg("请求参数不能为空");
            return verifyRes;
        }

        if (verifyReq.getTripType() == 0 || verifyReq.getTripType() > 2) {
            verifyRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            verifyRes.setMsg("行程类型错误 1：单�2：往�);
            return verifyRes;
        }

        String verifyResMsg = baseRoutingParamVerify(verifyReq.getRoutings(), verifyReq.getTripType());
        if (!StringUtils.isBlank(verifyResMsg)) {
            verifyRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            verifyRes.setMsg(verifyResMsg);
            return verifyRes;
        }

        verifyRes = ctripFlightService.verifyFlight(verifyReq);
        return verifyRes;
    }

    @RequestMapping(value = "/createorder", method = RequestMethod.POST)
    @UserAccess(desc = "createorder")
    public CreateOrderRes CreateOrder(@Valid @RequestBody CreateOrderReq createOrderReq, BindingResult bindingResult) {
        CreateOrderRes createOrderRes = new CreateOrderRes();
        if (bindingResult.hasErrors()) {
            createOrderRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            createOrderRes.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return createOrderRes;
        }

        if (createOrderReq == null) {
            createOrderRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            createOrderRes.setMsg("请求参数不能为空");

            return createOrderRes;
        }

        if (createOrderReq.getTripType() == 0 || createOrderReq.getTripType() > 2) {
            createOrderRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            createOrderRes.setMsg("行程类型错误 1：单�2：往�);

            return createOrderRes;
        }

        String verifyResMsg = baseRoutingParamVerify(createOrderReq.getRoutings(), createOrderReq.getTripType());
        if (!StringUtils.isBlank(verifyResMsg)) {
            createOrderRes.setStatus(StatusEnum.PARAM_ERROR.getCode());
            createOrderRes.setMsg(verifyResMsg);

            return createOrderRes;
        }

        createOrderRes = ctripFlightService.createOrder(createOrderReq);
        return createOrderRes;
    }

    /**
     *  基本的routing验证
     * @param routingsDTO
     * @param type
     * @return
     */
    private String baseRoutingParamVerify(FlightRoutingsDTO routingsDTO, int type) {
        if (routingsDTO == null) {
            return "行程不能为空";
        }

        if (StringUtils.isEmpty(routingsDTO.getData())) {
            return "data不能为空，必须为查询的data";
        }


        String result = validateSeg(routingsDTO.getFromSegments());
        if (!StringUtils.isEmpty(result)) {
            return result;
        }

        if (type == 2) {
            result = validateSeg(routingsDTO.getRetSegments());
            if (!StringUtils.isEmpty(result)) {
                return result;
            }
        }

        return StringUtils.EMPTY;
    }

    private String validateSeg(List<SegmentDTO> segments) {
        if (segments == null || segments.size() == 0) {
            return "航段信息不能为空";
        }
        for (SegmentDTO dto : segments) {
            if (StringUtils.isEmpty(dto.getCarrier())) {
                return "航司不能为空";
            }

            if (StringUtils.isEmpty(dto.getDepAirport())) {
                return "起飞机场不能为空";
            }

            if (StringUtils.isEmpty(dto.getDepTime())) {
                return "起飞时间不能为空";
            }

            if (StringUtils.isEmpty(dto.getArrAirport())) {
                return "抵达机场不能为空";
            }

            if (StringUtils.isEmpty(dto.getArrTime())) {
                return "抵达时间不能为空";
            }
        }

        return StringUtils.EMPTY;
    }
}
