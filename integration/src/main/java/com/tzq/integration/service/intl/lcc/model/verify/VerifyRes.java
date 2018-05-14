package com.tzq.integration.service.intl.lcc.model.verify;

import com.tzq.integration.service.intl.lcc.model.BaseRes;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyRes extends BaseRes {


    /**
     * 最大舱位数
     */
    private Integer maxSeats;

    /**
     * 航线价格信息
     */
    private FlightRoutings routing;


    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public FlightRoutings getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutings routing) {
        this.routing = routing;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"maxSeats\":").append(maxSeats);
        sb.append(",             \"routing\":").append(routing);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
