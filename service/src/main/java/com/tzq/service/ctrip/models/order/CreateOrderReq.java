package com.tzq.service.ctrip.models.order;

import com.tzq.service.ctrip.models.BaseRequest;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;

import java.util.List;

public class CreateOrderReq extends BaseRequest {

    /**
     * ctripOrderId : {"adultOrderId":"2360250238","childOrderId":"2360250239","infantOrderId":"2360250240"}
     * referenceId : 5116052316000152592
     * tripType : 1
     * sessionId : S12345
     * routing : {"data":"3da0a93eba26c6e8f28955fe65f426fadbec03d9","fromSegments":[{"carrier":"AA","depAirport":"PEK","depTime":"201203140140","arrAirport":"HKG","arrTime":"201203150530","stopAirports":"","codeShare":false,"cabin":"E","aircraftCode":"777","flightNumber":"AA89","operatingCarrier":"","operatingFlightNo":""},{"carrier":"CA","depAirport":"HKG","depTime":"201204151400","arrAirport":"TPE","arrTime":"201204151715","stopAirports":"","codeShare":false,"cabin":"E","aircraftCode":"737","flightNumber":"CA189","operatingCarrier":"","operatingFlightNo":""}],"retSegments":[]}
     * passengers : [{"name":" Marcus/Tom","ageType":0,"birthday":"19740225","gender":"M","cardType":"PP","cardNum":"G75678926","cardExpired":"20200101","cardIssuePlace":"CN","nationality":"CN","ffpNo":{"cardNo":"123456","carrier":"CA"}},{"name":" Marcus/Jack","ageType":1,"birthday":"20060225","gender":"M","cardType":"PP","cardNum":"G75675889","cardExpired":"20200101","cardIssuePlace":"CN","nationality":"CN","ffpNo":{"cardNo":"654321","carrier":"CA"}},{"name":" Marcus/Mike","ageType":2,"birthday":"20160225","gender":"M","cardType":"PP","cardNum":"G12345689","cardExpired":"20200101","cardIssuePlace":"CN","nationality":"CN","ffpNo":{"cardNo":"","carrier":""}}]
     * contact : {"name":"Marcus/Tom","address":"xxxx spring valley road","postcode":"12345","email":"","mobile":"13800000000"}
     * passengerbaggages : [{"passengerName":"Marcus/Tom","baggages":[{"flight":"AA89","fromAirport":"PEK","toAirport":"HKG","depTime":"201507010920","cabin":"K","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]},{"flight":"CA189","fromAirport":"HKG","toAirport":"TPE","depTime":"201507010920","cabin":"K","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]}]},{"passengerName":"Marcus/Jack","baggages":[{"flight":"AA89","fromAirport":"PEK","toAirport":"HKG","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":5,"bookSalePrice":100,"ticketSalePrice":200,"airportSalePrice":300,"refundFee":100,"desc":""}]},{"flight":"CA189","fromAirport":"HKG","toAirport":"TPE","cabin":"K","depTime":"201507010920","baggagePrices":[{"weight":"5.00","bookSalePrice":"100.00","ticketSalePrice":"200.00","airportSalePrice":"300.00","refundFee":"100.00","desc":""}]}]}]
     * ctripRefRevServiceFee : [{"id":2360250238,"status":0,"outboundRevalidationFee":100,"outRevFeeCurrency":"RMB","inboundRevalidationFee":100,"inRevFeeCurrency":"RMB","revalidationFeeByConsolidator":50,"outNonChg":"T","inNonChg":"T","outNonRev":"T","inNonRev":"T","outRevChdFee":100,"inRevChdFee":100,"revHasNoShow":"T","outRevNoShowFee":100,"inRevNoShowFee":100,"outRevNoShowChdFee":100,"inRevNoShowChdFee":100,"revNoShowCondition":0,"inRefundFee":100,"inRefCurrency":"RMB","outRefundFee":100,"outRefCurrency":"RMB","refundFeeByConsolidator":50,"outNonRef":"T","inNonRef":"F","outRefChdFee":100,"inRefChdFee":100,"refHasNoShow":"T","outRefNoShowFee":100,"inRefNoShowFee":100,"outRefNoShowChdFee":100,"inRefNoShowChdFee":100,"refNoShowCondition":0}]
     */

    private CtripOrderIdDTO ctripOrderId;
    private String referenceId;
    private Integer tripType;
    private String sessionId;
    private FlightRoutingsDTO routing;
    private ContactDTO contact;
    private List<PassengerDTO> passengers;
    private List<PassengerbaggagesDTO> passengerbaggages;
    private List<CtripRefRevServiceFeeDTO> ctripRefRevServiceFee;

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

    public FlightRoutingsDTO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsDTO routing) {
        this.routing = routing;
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
