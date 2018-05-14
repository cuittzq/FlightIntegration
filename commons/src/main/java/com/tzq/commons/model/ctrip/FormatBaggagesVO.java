package com.tzq.commons.model.ctrip;

public class FormatBaggagesVO {
    /**
     * segmentNo : 1
     * passengerType : 0
     * baggagePiece : 1
     * baggageWeight : 23
     * cnBaggage :
     * enBaggage :
     */

    private int segmentNo;
    private int passengerType;
    private int baggagePiece;
    private int baggageWeight;
    private String cnBaggage;
    private String enBaggage;

    public int getSegmentNo() {
        return segmentNo;
    }

    public void setSegmentNo(int segmentNo) {
        this.segmentNo = segmentNo;
    }

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public int getBaggagePiece() {
        return baggagePiece;
    }

    public void setBaggagePiece(int baggagePiece) {
        this.baggagePiece = baggagePiece;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(int baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public String getCnBaggage() {
        return cnBaggage;
    }

    public void setCnBaggage(String cnBaggage) {
        this.cnBaggage = cnBaggage;
    }

    public String getEnBaggage() {
        return enBaggage;
    }

    public void setEnBaggage(String enBaggage) {
        this.enBaggage = enBaggage;
    }
}
