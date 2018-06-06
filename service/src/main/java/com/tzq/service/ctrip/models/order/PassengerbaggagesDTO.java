package com.tzq.service.ctrip.models.order;

import java.util.List;

public class PassengerbaggagesDTO {
    /**
     * passengerName : Marcus/Tom
     * baggages : [{"flight":"AA89","fromAirport":"PEK","toAirport":"HKG","depTime":"201507010920","cabin":"K","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]},{"flight":"CA189","fromAirport":"HKG","toAirport":"TPE","depTime":"201507010920","cabin":"K","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]}]
     */

    private String passengerName;
    private List<BaggagesDTO> baggages;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public List<BaggagesDTO> getBaggages() {
        return baggages;
    }

    public void setBaggages(List<BaggagesDTO> baggages) {
        this.baggages = baggages;
    }
}
