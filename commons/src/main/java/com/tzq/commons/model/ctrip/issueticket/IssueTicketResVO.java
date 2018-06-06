package com.tzq.commons.model.ctrip.issueticket;


/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/21
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class IssueTicketResVO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 结果类型: 0 成功 / 其他 失败
     */
    private int status;
    /**
     * 提示信息，长度小于64个字符
     */
    private String msg;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
