package com.tzq.commons.model.ctrip;

public class ServiceFeeVO {
    /**
     * revalidationFeeByCarrier  : 100
     * refundFeeByCarrier : 100
     * currency : CNY
     */

    private int revalidationFeeByCarrier;
    private int refundFeeByCarrier;
    private String currency;

    public int getRevalidationFeeByCarrier() {
        return revalidationFeeByCarrier;
    }

    public void setRevalidationFeeByCarrier(int revalidationFeeByCarrier) {
        this.revalidationFeeByCarrier = revalidationFeeByCarrier;
    }

    public int getRefundFeeByCarrier() {
        return refundFeeByCarrier;
    }

    public void setRefundFeeByCarrier(int refundFeeByCarrier) {
        this.refundFeeByCarrier = refundFeeByCarrier;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
