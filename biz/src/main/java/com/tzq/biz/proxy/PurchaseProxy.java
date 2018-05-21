package com.tzq.biz.proxy;

import com.tzq.biz.service.purchase.core.CreateOrderService;
import com.tzq.biz.service.purchase.core.IssueTicketService;
import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.biz.service.purchase.core.VerifyService;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/16
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public interface PurchaseProxy extends CreateOrderService, SearchFlightService, VerifyService, IssueTicketService {
}
