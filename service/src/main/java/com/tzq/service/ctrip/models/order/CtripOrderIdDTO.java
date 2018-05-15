package com.tzq.service.ctrip.models.order;

public class CtripOrderIdDTO {
    /**
     * adultOrderId : 2360250238
     * childOrderId : 2360250239
     * infantOrderId : 2360250240
     */

    private String adultOrderId;
    private String childOrderId;
    private String infantOrderId;

    public String getAdultOrderId() {
        return adultOrderId;
    }

    public void setAdultOrderId(String adultOrderId) {
        this.adultOrderId = adultOrderId;
    }

    public String getChildOrderId() {
        return childOrderId;
    }

    public void setChildOrderId(String childOrderId) {
        this.childOrderId = childOrderId;
    }

    public String getInfantOrderId() {
        return infantOrderId;
    }

    public void setInfantOrderId(String infantOrderId) {
        this.infantOrderId = infantOrderId;
    }
}
