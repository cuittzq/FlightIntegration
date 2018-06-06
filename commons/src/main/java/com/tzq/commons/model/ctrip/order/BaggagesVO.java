package com.tzq.commons.model.ctrip.order;

import java.util.List;

public class BaggagesVO {
    /**
     * flight : AA89
     * fromAirport : PEK
     * toAirport : HKG
     * depTime : 201507010920
     * cabin : K
     * baggagePrices : [{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]
     */

    private String flight;
    private String fromAirport;
    private String toAirport;
    private String depTime;
    private String cabin;
    private List<BaggagePricesVO> baggagePrices;

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public List<BaggagePricesVO> getBaggagePrices() {
        return baggagePrices;
    }

    public void setBaggagePrices(List<BaggagePricesVO> baggagePrices) {
        this.baggagePrices = baggagePrices;
    }
}
