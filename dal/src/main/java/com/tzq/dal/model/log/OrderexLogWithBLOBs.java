package com.tzq.dal.model.log;

public class OrderexLogWithBLOBs extends OrderexLog {
    private String flightinfo;

    private String linkinfo;

    private String passengerinfo;

    private String outticketinfo;

    private String refundinfo;

    private String changeinfo;

    private String flightchangeinfo;

    private String otherinfo;

    public String getFlightinfo() {
        return flightinfo;
    }

    public void setFlightinfo(String flightinfo) {
        this.flightinfo = flightinfo == null ? null : flightinfo.trim();
    }

    public String getLinkinfo() {
        return linkinfo;
    }

    public void setLinkinfo(String linkinfo) {
        this.linkinfo = linkinfo == null ? null : linkinfo.trim();
    }

    public String getPassengerinfo() {
        return passengerinfo;
    }

    public void setPassengerinfo(String passengerinfo) {
        this.passengerinfo = passengerinfo == null ? null : passengerinfo.trim();
    }

    public String getOutticketinfo() {
        return outticketinfo;
    }

    public void setOutticketinfo(String outticketinfo) {
        this.outticketinfo = outticketinfo == null ? null : outticketinfo.trim();
    }

    public String getRefundinfo() {
        return refundinfo;
    }

    public void setRefundinfo(String refundinfo) {
        this.refundinfo = refundinfo == null ? null : refundinfo.trim();
    }

    public String getChangeinfo() {
        return changeinfo;
    }

    public void setChangeinfo(String changeinfo) {
        this.changeinfo = changeinfo == null ? null : changeinfo.trim();
    }

    public String getFlightchangeinfo() {
        return flightchangeinfo;
    }

    public void setFlightchangeinfo(String flightchangeinfo) {
        this.flightchangeinfo = flightchangeinfo == null ? null : flightchangeinfo.trim();
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo == null ? null : otherinfo.trim();
    }
}