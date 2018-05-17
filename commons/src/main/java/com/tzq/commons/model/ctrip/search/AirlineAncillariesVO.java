package com.tzq.commons.model.ctrip.search;

public class AirlineAncillariesVO {

    /**
     * 行李增值服务（true 包含/false不包含，默认false）
     */
    private boolean baggageService;
    /**
     * 有无免费行李额（True为无免费行李额；默认False，包含免费行李额，或部分无免费行李额）
     */
    private boolean unFreeBaggage;
    /**
     * 值机服务状态 0：不支持在线值机 / 1：支持在线值机 / 2：必须在线值机（此选项代表供应商打包值机价格到机票）
     */
    private int checkInServiceStatus;

    public boolean getBaggageService() {
        return baggageService;
    }

    public void setBaggageService(boolean baggageService) {
        this.baggageService = baggageService;
    }

    public boolean getUnFreeBaggage() {
        return unFreeBaggage;
    }

    public void setUnFreeBaggage(boolean unFreeBaggage) {
        this.unFreeBaggage = unFreeBaggage;
    }

    public int getCheckInServiceStatus() {
        return checkInServiceStatus;
    }

    public void setCheckInServiceStatus(int checkInServiceStatus) {
        this.checkInServiceStatus = checkInServiceStatus;
    }
}
