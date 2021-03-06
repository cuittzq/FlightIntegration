package com.tzq.service.ctrip.models.issueticket;

import com.tzq.service.ctrip.models.BaseResponse;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/21
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class IssueTicketResDTO extends BaseResponse {
    /**
     * 订单号
     */
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
