package com.tzq.service.ctrip.models.order;

public class BaggagePricesDTO {
    /**
     * weight : 5
     * bookSalePrice : 100
     * ticketSalePrice : 200
     * airportSalePrice : 300
     * refundFee : 100
     * desc :
     */

    private int weight;
    private int bookSalePrice;
    private int ticketSalePrice;
    private int airportSalePrice;
    private int refundFee;
    private String desc;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBookSalePrice() {
        return bookSalePrice;
    }

    public void setBookSalePrice(int bookSalePrice) {
        this.bookSalePrice = bookSalePrice;
    }

    public int getTicketSalePrice() {
        return ticketSalePrice;
    }

    public void setTicketSalePrice(int ticketSalePrice) {
        this.ticketSalePrice = ticketSalePrice;
    }

    public int getAirportSalePrice() {
        return airportSalePrice;
    }

    public void setAirportSalePrice(int airportSalePrice) {
        this.airportSalePrice = airportSalePrice;
    }

    public int getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(int refundFee) {
        this.refundFee = refundFee;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
