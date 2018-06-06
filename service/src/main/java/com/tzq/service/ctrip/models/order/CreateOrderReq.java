package com.tzq.service.ctrip.models.order;

import com.tzq.service.ctrip.models.BaseRequest;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;

import java.util.List;

public class CreateOrderReq extends BaseRequest {


    private CtripOrderIdDTO                ctripOrderId;
    private String                         referenceId;
    private Integer                        tripType;
    private String                         sessionId;
    private FlightRoutingsDTO              routings;
    private ContactDTO                     contact;
    private List<PassengerDTO>             passengers;
    private List<PassengerbaggagesDTO>     passengerbaggages;
    private List<CtripRefRevServiceFeeDTO> ctripRefRevServiceFee;
    private int adultNumber;
    private int childNumber;
    private int infantNumber;
    private int maxSeats;

    public int getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(int adultNumber) {
        this.adultNumber = adultNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getInfantNumber() {
        return infantNumber;
    }

    public void setInfantNumber(int infantNumber) {
        this.infantNumber = infantNumber;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public FlightRoutingsDTO getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutingsDTO routings) {
        this.routings = routings;
    }

    public CtripOrderIdDTO getCtripOrderId() {
        return ctripOrderId;
    }

    public void setCtripOrderId(CtripOrderIdDTO ctripOrderId) {
        this.ctripOrderId = ctripOrderId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getTripType() {
        return tripType;
    }

    public void setTripType(Integer tripType) {
        this.tripType = tripType;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerDTO> passengers) {
        this.passengers = passengers;
    }

    public List<PassengerbaggagesDTO> getPassengerbaggages() {
        return passengerbaggages;
    }

    public void setPassengerbaggages(List<PassengerbaggagesDTO> passengerbaggages) {
        this.passengerbaggages = passengerbaggages;
    }

    public List<CtripRefRevServiceFeeDTO> getCtripRefRevServiceFee() {
        return ctripRefRevServiceFee;
    }

    public void setCtripRefRevServiceFee(List<CtripRefRevServiceFeeDTO> ctripRefRevServiceFee) {
        this.ctripRefRevServiceFee = ctripRefRevServiceFee;
    }


}
