package com.tzq.commons.model.ctrip.order;

import com.tzq.commons.model.ctrip.BaseResponse;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;

import java.util.List;

public class CreateOrderResVO extends BaseResponse {


    /**
     * sessionId : S12345
     * orderNo : Ticket-AAA-2013031209-0001
     * pnrCode : HUICDE
     * maxSeats : 9
     * orderContact : {"email":" 123456@qq.com","mobile":"13000000000"}
     * routing : {"data":"3da0a93eba26c6e8f28955fe65f426fadbec03d9","publishPrice":700,"adultPrice":800,"adultTax":66,"childPublishPrice":380,"childPrice":400,"childTax":66,"infantPublishPrice":180,"infantPrice":200,"infantTax":16,"adultTaxType":0,"childTaxType":0,"priceType":0,"applyType":0,"exchange":"","adultAgeRestriction":"","eligibility":"NOR","nationality":"","forbiddenNationality":"","planCategory":1,"invoiceType":"F","minStay":"","maxStay":"","minPassengerCount":1,"maxPassengerCount":8,"bookingOfficeNo":"","ticketingOfficeNo":"","validatingCarrier":"AA","reservationType":"","productType":"","fareBasis":"LLEECN;LLEECN","fromSegments":[{"carrier":"AA","depAirport":"LAX","depTime":"201203140140","arrAirport":"PEK","arrTime":"201203150530","stopAirports":"","codeShare":false,"cabin":"B","aircraftCode":"777","flightNumber":"AA89","operatingCarrier":"","operatingFlightNo":"","depTerminal":"T2","arrTerminal":"T1","cabinGrade":"Y","duration":130},{"carrier":"CA","depAirport":"PEK","depTime":"201203151400","arrAirport":"TPE","arrTime":"201203151715","stopAirports":"","codeShare":false,"cabin":"M","aircraftCode":"737","flightNumber":"CA189","operatingCarrier":"","operatingFlightNo":"","depTerminal":"T2","arrTerminal":"T2","cabinGrade":"Y","duration":100}],"retSegments":[],"rule":{"formatBaggageInfoList":[{"segmentNo":1,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""},{"segmentNo":2,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""}],"refundInfoList":[{"refundType":0,"refundStatus":"H","refundFee":100,"currency":"CNY","passengerType":0,"refNoshow":"H","refNoShowCondition":0,"refNoshowFee":200,"cnRefRemark":"","enRefRemark":""}],"changesInfoList":[{"changesType":0,"changesStatus":"T","changesFee":0,"currency":"CNY","passengerType":0,"revNoshow":"T","revNoShowCondition":0,"revNoshowFee":0,"cnRevRemark":"","enRevRemark":""}],"serviceFee":{"revalidationFeeByCarrier ":100,"refundFeeByCarrier":100,"currency":"CNY"},"note":"不得升舱，不得累积里程；"}}
     * passengerbaggages : [{"passengerName":"Marcus/Tom","baggages":[{"flight":"AA89","fromAirport":"PEK","toAirport":"HKG","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]},{"flight":"CA189","fromAirport":"HKG","toAirport":"TPE","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]}]},{"passengerName":"Marcus/Jack","baggages":[{"flight":"AA89","fromAirport":"PEK","toAirport":"HKG","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]},{"flight":"CA189","fromAirport":"HKG","toAirport":"TPE","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]}]}]
     */

    private String                    sessionId;
    private String                    orderNo;
    private String                    pnrCode;
    private int                       maxSeats;
    private ContactVO                 orderContact;
    private FlightRoutingsVO          routing;
    private List<PassengerbaggagesVO> passengerbaggages;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPnrCode() {
        return pnrCode;
    }

    public void setPnrCode(String pnrCode) {
        this.pnrCode = pnrCode;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public ContactVO getOrderContact() {
        return orderContact;
    }

    public void setOrderContact(ContactVO orderContact) {
        this.orderContact = orderContact;
    }

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
        this.routing = routing;
    }

    public List<PassengerbaggagesVO> getPassengerbaggages() {
        return passengerbaggages;
    }

    public void setPassengerbaggages(List<PassengerbaggagesVO> passengerbaggages) {
        this.passengerbaggages = passengerbaggages;
    }
}
