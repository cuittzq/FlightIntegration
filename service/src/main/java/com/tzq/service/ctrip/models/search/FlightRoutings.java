package com.tzq.service.ctrip.models.search;

import java.util.List;

public class FlightRoutings {
    private String data;
    private int publishPrice;
    private int adultPrice;
    private int adultTax;
    private int childPublishPrice;
    private int childPrice;
    private int childTax;
    private int infantPublishPrice;
    private int infantPrice;
    private int infantTax;
    private int adultTaxType;
    private int childTaxType;
    private int priceType;
    private int applyType;
    private String exchange;
    private String adultAgeRestriction;
    private String eligibility;
    private String nationality;
    private String forbiddenNationality;
    private int planCategory;
    private String invoiceType;
    private String minStay;
    private String maxStay;
    private int minPassengerCount;
    private int maxPassengerCount;
    private String bookingOfficeNo;
    private String ticketingOfficeNo;
    private String validatingCarrier;
    private String reservationType;
    private String productType;
    private String fareBasis;
    private AirlineAncillaries airlineAncillaries;
    private Rules rule;
    private List<Segment> fromSegments;
    private List<Segment> retSegments;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPublishPrice() {
        return publishPrice;
    }

    public void setPublishPrice(int publishPrice) {
        this.publishPrice = publishPrice;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    public int getAdultTax() {
        return adultTax;
    }

    public void setAdultTax(int adultTax) {
        this.adultTax = adultTax;
    }

    public int getChildPublishPrice() {
        return childPublishPrice;
    }

    public void setChildPublishPrice(int childPublishPrice) {
        this.childPublishPrice = childPublishPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public int getChildTax() {
        return childTax;
    }

    public void setChildTax(int childTax) {
        this.childTax = childTax;
    }

    public int getInfantPublishPrice() {
        return infantPublishPrice;
    }

    public void setInfantPublishPrice(int infantPublishPrice) {
        this.infantPublishPrice = infantPublishPrice;
    }

    public int getInfantPrice() {
        return infantPrice;
    }

    public void setInfantPrice(int infantPrice) {
        this.infantPrice = infantPrice;
    }

    public int getInfantTax() {
        return infantTax;
    }

    public void setInfantTax(int infantTax) {
        this.infantTax = infantTax;
    }

    public int getAdultTaxType() {
        return adultTaxType;
    }

    public void setAdultTaxType(int adultTaxType) {
        this.adultTaxType = adultTaxType;
    }

    public int getChildTaxType() {
        return childTaxType;
    }

    public void setChildTaxType(int childTaxType) {
        this.childTaxType = childTaxType;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public int getApplyType() {
        return applyType;
    }

    public void setApplyType(int applyType) {
        this.applyType = applyType;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getAdultAgeRestriction() {
        return adultAgeRestriction;
    }

    public void setAdultAgeRestriction(String adultAgeRestriction) {
        this.adultAgeRestriction = adultAgeRestriction;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getForbiddenNationality() {
        return forbiddenNationality;
    }

    public void setForbiddenNationality(String forbiddenNationality) {
        this.forbiddenNationality = forbiddenNationality;
    }

    public int getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(int planCategory) {
        this.planCategory = planCategory;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getMinStay() {
        return minStay;
    }

    public void setMinStay(String minStay) {
        this.minStay = minStay;
    }

    public String getMaxStay() {
        return maxStay;
    }

    public void setMaxStay(String maxStay) {
        this.maxStay = maxStay;
    }

    public int getMinPassengerCount() {
        return minPassengerCount;
    }

    public void setMinPassengerCount(int minPassengerCount) {
        this.minPassengerCount = minPassengerCount;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount) {
        this.maxPassengerCount = maxPassengerCount;
    }

    public String getBookingOfficeNo() {
        return bookingOfficeNo;
    }

    public void setBookingOfficeNo(String bookingOfficeNo) {
        this.bookingOfficeNo = bookingOfficeNo;
    }

    public String getTicketingOfficeNo() {
        return ticketingOfficeNo;
    }

    public void setTicketingOfficeNo(String ticketingOfficeNo) {
        this.ticketingOfficeNo = ticketingOfficeNo;
    }

    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public AirlineAncillaries getAirlineAncillaries() {
        return airlineAncillaries;
    }

    public void setAirlineAncillaries(AirlineAncillaries airlineAncillaries) {
        this.airlineAncillaries = airlineAncillaries;
    }

    public Rules getRule() {
        return rule;
    }

    public void setRule(Rules rule) {
        this.rule = rule;
    }

    public List<Segment> getFromSegments() {
        return fromSegments;
    }

    public void setFromSegments(List<Segment> fromSegments) {
        this.fromSegments = fromSegments;
    }

    public List<Segment> getRetSegments() {
        return retSegments;
    }

    public void setRetSegments(List<Segment> retSegments) {
        this.retSegments = retSegments;
    }
}
