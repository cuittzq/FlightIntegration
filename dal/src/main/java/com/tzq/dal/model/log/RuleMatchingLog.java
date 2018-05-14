package com.tzq.dal.model.log;

import java.util.Date;

public class RuleMatchingLog {
    private Integer id;

    private Integer salesplatform;

    private Integer purchaseplatform;

    private Date requestdate;

    private String requesttype;

    private String carrier;

    private String depcode;

    private String arrcode;

    private Date depdate;

    private Date backdate;

    private String platruleidarray;

    private String platrulevalue;

    private String supplierruleidarray;

    private String supplierrulevalue;

    private String currencysalesruleidarray;

    private String currencysalesrulevalue;

    private String exactsalesruleidarray;

    private String exactsalesrulevalue;

    private String refundruleidarray;

    private String refundrulevalue;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalesplatform() {
        return salesplatform;
    }

    public void setSalesplatform(Integer salesplatform) {
        this.salesplatform = salesplatform;
    }

    public Integer getPurchaseplatform() {
        return purchaseplatform;
    }

    public void setPurchaseplatform(Integer purchaseplatform) {
        this.purchaseplatform = purchaseplatform;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype == null ? null : requesttype.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode == null ? null : depcode.trim();
    }

    public String getArrcode() {
        return arrcode;
    }

    public void setArrcode(String arrcode) {
        this.arrcode = arrcode == null ? null : arrcode.trim();
    }

    public Date getDepdate() {
        return depdate;
    }

    public void setDepdate(Date depdate) {
        this.depdate = depdate;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public String getPlatruleidarray() {
        return platruleidarray;
    }

    public void setPlatruleidarray(String platruleidarray) {
        this.platruleidarray = platruleidarray == null ? null : platruleidarray.trim();
    }

    public String getPlatrulevalue() {
        return platrulevalue;
    }

    public void setPlatrulevalue(String platrulevalue) {
        this.platrulevalue = platrulevalue == null ? null : platrulevalue.trim();
    }

    public String getSupplierruleidarray() {
        return supplierruleidarray;
    }

    public void setSupplierruleidarray(String supplierruleidarray) {
        this.supplierruleidarray = supplierruleidarray == null ? null : supplierruleidarray.trim();
    }

    public String getSupplierrulevalue() {
        return supplierrulevalue;
    }

    public void setSupplierrulevalue(String supplierrulevalue) {
        this.supplierrulevalue = supplierrulevalue == null ? null : supplierrulevalue.trim();
    }

    public String getCurrencysalesruleidarray() {
        return currencysalesruleidarray;
    }

    public void setCurrencysalesruleidarray(String currencysalesruleidarray) {
        this.currencysalesruleidarray = currencysalesruleidarray == null ? null : currencysalesruleidarray.trim();
    }

    public String getCurrencysalesrulevalue() {
        return currencysalesrulevalue;
    }

    public void setCurrencysalesrulevalue(String currencysalesrulevalue) {
        this.currencysalesrulevalue = currencysalesrulevalue == null ? null : currencysalesrulevalue.trim();
    }

    public String getExactsalesruleidarray() {
        return exactsalesruleidarray;
    }

    public void setExactsalesruleidarray(String exactsalesruleidarray) {
        this.exactsalesruleidarray = exactsalesruleidarray == null ? null : exactsalesruleidarray.trim();
    }

    public String getExactsalesrulevalue() {
        return exactsalesrulevalue;
    }

    public void setExactsalesrulevalue(String exactsalesrulevalue) {
        this.exactsalesrulevalue = exactsalesrulevalue == null ? null : exactsalesrulevalue.trim();
    }

    public String getRefundruleidarray() {
        return refundruleidarray;
    }

    public void setRefundruleidarray(String refundruleidarray) {
        this.refundruleidarray = refundruleidarray == null ? null : refundruleidarray.trim();
    }

    public String getRefundrulevalue() {
        return refundrulevalue;
    }

    public void setRefundrulevalue(String refundrulevalue) {
        this.refundrulevalue = refundrulevalue == null ? null : refundrulevalue.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}