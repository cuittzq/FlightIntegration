package com.tzq.service.ctrip.models.search;



import com.tzq.service.ctrip.models.BaseResponse;

import java.util.List;

public class SearchFlightRes extends BaseResponse {
    /**
     * status : 0
     * msg : success
     * routings :
     */
    private List<FlightRoutings> routings;

    public List<FlightRoutings> getRoutings() {
        return routings;
    }

    public void setRoutings(List<FlightRoutings> routings) {
        this.routings = routings;
    }
}
