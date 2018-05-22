package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.annotation.Route;
import com.tzq.biz.service.purchase.abstracts.AbstractIssueTicketService;
import com.tzq.commons.Exception.CommonExcetpionConstant;
import com.tzq.commons.Exception.ServiceAbstractException;
import com.tzq.commons.Exception.ServiceErrorMsg;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.OrderInfoExample;
import com.tzq.dal.service.OrderInfoService;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketReq;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketRes;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/21
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lccIntlIssueTicketService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
public class LccIntlIssueTicketServiceImpl extends AbstractIssueTicketService {
    @Resource
    private LccClient lccClient;

    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 生单
     *
     * @param context
     */
    @Override
    public IssueTicketResVO issueTicket(RouteContext<IssueTicketReqVO> context) {
        IssueTicketReq   issueTicketReq   = request(context);
        IssueTicketRes   issueTicketRes   = lccClient.issueTicket(issueTicketReq);
        IssueTicketResVO issueTicketResVO = response(issueTicketRes, context);
        return issueTicketResVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<IssueTicketReqVO> context) {
        IssueTicketReq issueTicketReq = new IssueTicketReq();
        String         OrderNo        = context.getT().getOrderNo();
        // 根据 OrderNo获取订单信息
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        orderInfoExample.createCriteria().andOrdernoEqualTo(OrderNo);
        List<OrderInfo> orderinfos = orderInfoService.selectByExample(orderInfoExample);
        if (CollectionUtils.isNotEmpty(orderinfos)) {
            issueTicketReq.setOrderNo(orderinfos.get(0).getPurchaseorderno());
            issueTicketReq.setPnrCode(orderinfos.get(0).getPnr());
            FlightRoutings flightRoutings = new FlightRoutings();
            issueTicketReq.setReqRouting(flightRoutings);
        }
        return (T) issueTicketReq;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> IssueTicketResVO response(T t, RouteContext<IssueTicketReqVO> context) {
        IssueTicketRes   issueTicketRes   = (IssueTicketRes) t;
        IssueTicketResVO issueTicketResVO = new IssueTicketResVO();
        if (issueTicketRes == null) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg("第三方接口返回空").setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else if (!StringUtils.isBlank(issueTicketRes.getMsg()) && issueTicketRes.getStatus() != 0) {
            throw new ServiceAbstractException(ServiceErrorMsg.Builder.newInstance().setErrorMsg(issueTicketRes.getMsg()).setErrorCode(CommonExcetpionConstant.INTERFACE_INVOKE_ERROR_CODE).build());
        } else {
            /**构建返回结果**/

            issueTicketResVO.setOrderNo(context.getT().getOrderNo());
            issueTicketResVO.setPnrCode(issueTicketRes.getPnrCode());
            issueTicketResVO.setOrderState(issueTicketRes.getOrderState());
        }

        return issueTicketResVO;
    }
}
