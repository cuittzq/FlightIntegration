package com.tzq.biz.service.abstracts;

import com.tzq.biz.common.model.context.RouteContext;
import com.tzq.biz.common.model.integration.FlightRouteVO;
import com.tzq.biz.common.model.integration.SearchVO;
import com.tzq.biz.service.core.SearchFlightService;
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
