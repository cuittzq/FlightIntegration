package com.tzq.integration.service.intl.lcc.model.order;

import com.tzq.integration.service.intl.lcc.model.BaseParam;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class OrderReq extends BaseParam implements Serializable {
    private static final long serialVersionUID = 1982438538427154109L;

    private OrderReqRouting routing;
    private List<Passenger> passengers;
    private List<Contact> contact;


    public OrderReqRouting getRouting() {
        return routing;
    }

    public void setRouting(OrderReqRouting routing) {
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
        return sb.toString();
    }

    public  static class OrderReqRouting
    {
        private String data;
        private List<FlightSegment> fromSegments;
        private List<FlightSegment> retSegments;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public List<FlightSegment> getFromSegments() {
            return fromSegments;
        }

        public void setFromSegments(List<FlightSegment> fromSegments) {
            this.fromSegments = fromSegments;
        }

        public List<FlightSegment> getRetSegments() {
            return retSegments;
        }

        public void setRetSegments(List<FlightSegment> retSegments) {
            this.retSegments = retSegments;
        }
    }
}
