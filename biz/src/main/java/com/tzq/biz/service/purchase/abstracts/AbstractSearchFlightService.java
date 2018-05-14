package com.tzq.biz.service.purchase.abstracts;

import com.tzq.biz.service.purchase.core.SearchFlightService;
import com.tzq.commons.model.ctrip.FlightRouteVO;
import com.tzq.commons.model.ctrip.SearchVO;
import com.tzq.commons.model.context.RouteContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractSearchFlightService extends AbstractBaseService implements SearchFlightService {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    // 查询接口公共方法

    /**
     * 航班查询返回参数组装
     *
     * @param <T>
     * @param t
     * @return
     */
    protected abstract <T> FlightRouteVO response(T t, RouteContext<SearchVO> context);

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    protected abstract <T> T request(RouteContext<SearchVO> context);
}
