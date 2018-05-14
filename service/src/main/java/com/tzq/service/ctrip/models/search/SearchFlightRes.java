package com.tzq.service.ctrip.models.search;


import com.tzq.service.ctrip.models.BaseResponse;

import java.util.List;

public class SearchFlightRes extends BaseResponse {
    /**
     * status : 0
     * msg : success
     * routings :
     */
    private List<FlightRoutingsDTO> routings;

    public List<FlightRoutingsDTO> getRoutings() {
        return routings;
    }

    public void setRoutings(List<FlightRoutingsDTO> routings) {
        this.routings = routings;
    }
}
