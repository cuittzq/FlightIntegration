package com.tzq.commons.model.integration.lcc.order;

import com.tzq.commons.model.integration.lcc.BaseParamVO;
import com.tzq.commons.model.integration.lcc.search.FlightRoutingsVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/15.
 */
public class OrderReqVO extends BaseParamVO implements Serializable {
    private static final long serialVersionUID = 8499160263822629512L;

    private FlightRoutingsVO routing;
    private List<PassengerVO> passengers;
    private List<ContactVO> contact;

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
        this.routing = routing;
    }

    public List<PassengerVO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerVO> passengers) {
        this.passengers = passengers;
    }

    public List<ContactVO> getContact() {
        return contact;
    }

    public void setContact(List<ContactVO> contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"routing\":").append(routing);
        sb.append(",             \"passengers\":").append(passengers);
        sb.append(",             \"contact\":").append(contact);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
