package com.tzq.biz.service.purchase.lcc.impl;

import com.sun.xml.bind.v2.TODO;
import com.tzq.biz.annotation.Route;
import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.PurchaseEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.biz.service.purchase.abstracts.AbstractSearchFlightService;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("lccIntlSearchFlightService")
@Route(area = AreaTypeEnum.INTERNATIONAL, purchase = PurchaseEnum.LCC)
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
        SearchFlightReq searchFlightReq      = request(context);
        SearchFlightRes searchFlightResponse = lccClient.searchFlight(searchFlightReq);
        FlightRouteVO   flightRouteVO        = response(searchFlightResponse, context);
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
        SearchFlightRes searchFlightResponse = (SearchFlightRes) t;
        FlightRouteVO   flightRouteVO        = new FlightRouteVO();

        // TODO 响应解析
        return flightRouteVO;
    }

    /**
     * 航班查询请求参数组装
     *
     * @param context
     * @return
     */
    @Override
    protected <T> T request(RouteContext<SearchVO> context) {
        SearchVO        searchVO        = context.getT();
        SearchFlightReq searchFlightReq = new SearchFlightReq();
        searchFlightReq.setFromCity(searchVO.getDepAirportCode());
        searchFlightReq.setFromDate(searchVO.getDepDate());
        searchFlightReq.setToCity(searchVO.getArrAirportCode());
        searchFlightReq.setTripType(searchVO.getTripType().getCode().equals(TripTypeEnum.OW.getCode()) ? 1 : 2);
        if (searchVO.getTripType().getCode().equals(TripTypeEnum.RT.getCode())) {
            searchFlightReq.setRetDate(searchVO.getArrDate());
        }
        return (T) searchFlightReq;
    }
}
