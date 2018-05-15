package com.tzq.commons.model.integration.lcc.verify;

import com.tzq.commons.model.integration.lcc.BaseResVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyResVO extends BaseResVO implements Serializable {
    private static final long serialVersionUID = -3500211036487819181L;

    /**
     * 最大舱位数
     */
    private Integer maxSeats;

    /**
     * 航线价格信息
     */
    private FlightRoutingsVO routing;

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
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
