package com.tzq.integration.service.intl.lcc.model.order;

import com.tzq.integration.service.intl.lcc.model.BaseParam;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class OrderReq extends BaseParam implements Serializable {
    private static final long serialVersionUID = 1982438538427154109L;

    private FlightRoutings routing;
    private List<Passenger> passengers;
    private List<Contact> contact;


    public FlightRoutings getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutings routing) {
        this.routing = routing;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
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
