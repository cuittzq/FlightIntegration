package com.tzq.dal.model.log;

public class RuleMatchingLogWithBLOBs extends RuleMatchingLog {
    private String platrulevalue;

    private String supplierrulevalue;

    private String currencysalesrulevalue;

    private String exactsalesrulevalue;

    private String refundrulevalue;

    public String getPlatrulevalue() {
        return platrulevalue;
    }

    public void setPlatrulevalue(String platrulevalue) {
        this.platrulevalue = platrulevalue == null ? null : platrulevalue.trim();
    }

    public String getSupplierrulevalue() {
        return supplierrulevalue;
    }

    public void setSupplierrulevalue(String supplierrulevalue) {
        this.supplierrulevalue = supplierrulevalue == null ? null : supplierrulevalue.trim();
    }

    public String getCurrencysalesrulevalue() {
        return currencysalesrulevalue;
    }

    public void setCurrencysalesrulevalue(String currencysalesrulevalue) {
        this.currencysalesrulevalue = currencysalesrulevalue == null ? null : currencysalesrulevalue.trim();
    }

    public String getExactsalesrulevalue() {
        return exactsalesrulevalue;
    }

    public void setExactsalesrulevalue(String exactsalesrulevalue) {
        this.exactsalesrulevalue = exactsalesrulevalue == null ? null : exactsalesrulevalue.trim();
    }

    public String getRefundrulevalue() {
        return refundrulevalue;
    }

    public void setRefundrulevalue(String refundrulevalue) {
        this.refundrulevalue = refundrulevalue == null ? null : refundrulevalue.trim();
    }
}