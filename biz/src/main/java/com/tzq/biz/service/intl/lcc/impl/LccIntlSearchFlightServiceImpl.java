package com.tzq.biz.service.intl.lcc.impl;

import com.tzq.biz.common.enums.TripTypeEnum;
import com.tzq.biz.common.model.context.RouteContext;
import com.tzq.biz.common.model.integration.FlightRouteVO;
import com.tzq.biz.common.model.integration.SearchVO;
import com.tzq.biz.service.abstracts.AbstractSearchFlightService;
import com.tzq.commons.utils.DateUtils;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("lccIntlSearchFlightService")
public class LccIntlSearchFlightServiceImpl extends AbstractSearchFlightService {

    @Resource
    private LccClient lccClient;

    /**
     * 查询
     *
     * @param context
     */
    @Override
    public FlightRouteVO searchFlight(RouteContext<SearchVO> context) {
        FlightRouteVO flightRouteVO = null;
        try {
            SearchFlightReq searchFlightReq = request(context);
            SearchFlightRes searchFlightResponse = lccClient.searchFlight(searchFlightReq);
            flightRouteVO = response(searchFlightResponse, context);
        } catch (Exception e) {
            logger.error("航班查询异常", e);
        }
        return flightRouteVO;
    }

    /**
     * 航班查询返回参数组装
     *
     * @param t
     * @param context
     * @return
     */
    @Override
    protected <T> FlightRouteVO response(T t, RouteContext<SearchVO> context) {

        return null;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<SearchVO> context) {
        SearchVO searchVO = context.getT();
        SearchFlightReq searchFlightReq = new SearchFlightReq();
        searchFlightReq.setFromCity(searchVO.getDepAirportCode());
        searchFlightReq.setFromDate(DateUtils.getDateString(searchVO.getDepDate()));
        searchFlightReq.setToCity(searchVO.getArrAirportCode());
        searchFlightReq.setTripType(searchVO.getTripType().getCode().equals(TripTypeEnum.OW.getCode()) ? "1" : "2");
        if (searchVO.getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
            searchFlightReq.setRetDate(DateUtils.getDateString(searchVO.getArrDate()));
        }
        return (T) searchFlightReq;
    }
}
