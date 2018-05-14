package com.tzq.service.ctrip.models.search;

public class AirlineAncillaries {
    /**
     * baggageService : True
     * unFreeBaggage : True
     * checkInServiceStatus : 1
     */

    private String baggageService;
    private String unFreeBaggage;
    private int checkInServiceStatus;

    public String getBaggageService() {
        return baggageService;
    }

    public void setBaggageService(String baggageService) {
        this.baggageService = baggageService;
    }

    public String getUnFreeBaggage() {
        return unFreeBaggage;
    }

    public void setUnFreeBaggage(String unFreeBaggage) {
        this.unFreeBaggage = unFreeBaggage;
    }

    public int getCheckInServiceStatus() {
        return checkInServiceStatus;
    }

    public void setCheckInServiceStatus(int checkInServiceStatus) {
        this.checkInServiceStatus = checkInServiceStatus;
    }
}
