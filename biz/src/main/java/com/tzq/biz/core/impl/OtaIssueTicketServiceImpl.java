package com.tzq.biz.core.impl;

import com.tzq.biz.core.OtaIssueTicketService;
import com.tzq.biz.proxy.PurchaseProxy;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.OrderInfoExample;
import com.tzq.dal.service.OrderInfoService;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.service.ctrip.models.issueticket.IssueTicketReqDTO;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

@Service
public class OtaIssueTicketServiceImpl implements OtaIssueTicketService {

    /**
     * 服务代理类
     */
    @Resource
    PurchaseProxy purchaseProxy;

    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 出票
     *
     * @return
     */
    @Override
    public SingleResult<IssueTicketResVO> issueTicket(RouteContext<IssueTicketReqVO> context) {
        Assert.notNull(context, "RouteContext can not be null ,searchFlight failure");
        // 根据 OrderNo获取订单信息
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andOrdernoEqualTo(context.getT().getOrderNo());
        List<OrderInfo>                orderinfos = orderInfoService.selectByExample(orderInfoExample);
        SingleResult<IssueTicketResVO> response   = null;
        if (CollectionUtils.isEmpty(orderinfos)) {
            response = new SingleResult<>(null, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, "订单库中未查询到该订单信息");
            return response;
        }
        try {
            context.setPurchaseEnum(PurchaseEnum.getEnumById(orderinfos.get(0).getPurchaseplatform()));
            IssueTicketResVO issueTicketResVO = purchaseProxy.issueTicket(context);
            if (issueTicketResVO == null) {
                response = new SingleResult<>(issueTicketResVO, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, "无数据");
                return response;
            }
            response = new SingleResult<>(issueTicketResVO, true, CommonExcetpionConstant.SUCCESS, "");
        } catch (Exception ex) {
            if (ex instanceof ServiceAbstractException) {
                response = new SingleResult<>(null, false, ((ServiceAbstractException) ex).getErrorCode(), ex.getMessage());
            } else {
                response = new SingleResult<>(null, false, CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE, ex.getMessage());
            }
        }

        return response;
    }
}
