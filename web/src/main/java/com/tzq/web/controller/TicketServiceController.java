package com.tzq.web.controller;

import com.tzq.service.ctrip.CtripFlightService;
import com.tzq.service.ctrip.models.enums.StatusEnum;
import com.tzq.service.ctrip.models.issueticket.IssueTicketReqDTO;
import com.tzq.service.ctrip.models.issueticket.IssueTicketResDTO;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/21
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

@RestController
@RequestMapping(value = "/ticket")
public class TicketServiceController {

    @Resource
    private CtripFlightService ctripFlightService;


    @RequestMapping(value = "/issueticket", method = RequestMethod.POST)
    public IssueTicketResDTO searchFlight(@Valid @RequestBody IssueTicketReqDTO issueTicketReqDTO, BindingResult bindingResult) {
        IssueTicketResDTO issueTicketResDTO = new IssueTicketResDTO();
        if (bindingResult.hasErrors()) {
            issueTicketResDTO.setStatus(StatusEnum.PARAM_ERROR.getCode());
            issueTicketResDTO.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return issueTicketResDTO;
        }
        issueTicketResDTO = ctripFlightService.issueTicket(issueTicketReqDTO);
        if (issueTicketResDTO == null) {
            issueTicketResDTO = new IssueTicketResDTO();
            issueTicketResDTO.setStatus(StatusEnum.DATA_ERROR.getCode());
            issueTicketResDTO.setMsg(StatusEnum.DATA_ERROR.getDesc());
        }
        return issueTicketResDTO;
    }
}
