package com.tzq.dal.model.rulesetting;

import java.math.BigDecimal;
import java.util.Date;

public class CurrencySetting {
    private String id;

    private String salesplatform;

    private String purchaseplatform;

    private Integer voyagetype;

    private BigDecimal aduitleavemoney;

    private BigDecimal aduitleavepoint;

    private BigDecimal aduittaxaddmoeny;

    private BigDecimal childleavemoney;

    private BigDecimal childleavepoint;

    private BigDecimal childtaxaddmoney;

    private BigDecimal allowlossmoney;

    private Date todepstartdate;

    private Date todependdate;

    private Date backdepstartdate;

    private Date backdependdate;

    private Date startworktime;

    private Date stopworktime;

    private Date salesstartdate;

    private Date salesenddate;

    private Integer settingstatus;

    private Date modifytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSalesplatform() {
        return salesplatform;
    }

    public void setSalesplatform(String salesplatform) {
        this.salesplatform = salesplatform == null ? null : salesplatform.trim();
    }

    public String getPurchaseplatform() {
        return purchaseplatform;
    }

    public void setPurchaseplatform(String purchaseplatform) {
        this.purchaseplatform = purchaseplatform == null ? null : purchaseplatform.trim();
    }

    public Integer getVoyagetype() {
        return voyagetype;
    }

    public void setVoyagetype(Integer voyagetype) {
        this.voyagetype = voyagetype;
    }

    public BigDecimal getAduitleavemoney() {
        return aduitleavemoney;
    }

    public void setAduitleavemoney(BigDecimal aduitleavemoney) {
        this.aduitleavemoney = aduitleavemoney;
    }

    public BigDecimal getAduitleavepoint() {
        return aduitleavepoint;
    }

    public void setAduitleavepoint(BigDecimal aduitleavepoint) {
        this.aduitleavepoint = aduitleavepoint;
    }

    public BigDecimal getAduittaxaddmoeny() {
        return aduittaxaddmoeny;
    }

    public void setAduittaxaddmoeny(BigDecimal aduittaxaddmoeny) {
        this.aduittaxaddmoeny = aduittaxaddmoeny;
    }

    public BigDecimal getChildleavemoney() {
        return childleavemoney;
    }

    public void setChildleavemoney(BigDecimal childleavemoney) {
        this.childleavemoney = childleavemoney;
    }

    public BigDecimal getChildleavepoint() {
        return childleavepoint;
    }

    public void setChildleavepoint(BigDecimal childleavepoint) {
        this.childleavepoint = childleavepoint;
    }

    public BigDecimal getChildtaxaddmoney() {
        return childtaxaddmoney;
    }

    public void setChildtaxaddmoney(BigDecimal childtaxaddmoney) {
        this.childtaxaddmoney = childtaxaddmoney;
    }

    public BigDecimal getAllowlossmoney() {
        return allowlossmoney;
    }

    public void setAllowlossmoney(BigDecimal allowlossmoney) {
        this.allowlossmoney = allowlossmoney;
    }

    public Date getTodepstartdate() {
        return todepstartdate;
    }

    public void setTodepstartdate(Date todepstartdate) {
        this.todepstartdate = todepstartdate;
    }

    public Date getTodependdate() {
        return todependdate;
    }

    public void setTodependdate(Date todependdate) {
        this.todependdate = todependdate;
    }

    public Date getBackdepstartdate() {
        return backdepstartdate;
    }

    public void setBackdepstartdate(Date backdepstartdate) {
        this.backdepstartdate = backdepstartdate;
    }

    public Date getBackdependdate() {
        return backdependdate;
    }

    public void setBackdependdate(Date backdependdate) {
        this.backdependdate = backdependdate;
    }

    public Date getStartworktime() {
        return startworktime;
    }

    public void setStartworktime(Date startworktime) {
        this.startworktime = startworktime;
    }

    public Date getStopworktime() {
        return stopworktime;
    }

    public void setStopworktime(Date stopworktime) {
        this.stopworktime = stopworktime;
    }

    public Date getSalesstartdate() {
        return salesstartdate;
    }

    public void setSalesstartdate(Date salesstartdate) {
        this.salesstartdate = salesstartdate;
    }

    public Date getSalesenddate() {
        return salesenddate;
    }

    public void setSalesenddate(Date salesenddate) {
        this.salesenddate = salesenddate;
    }

    public Integer getSettingstatus() {
        return settingstatus;
    }

    public void setSettingstatus(Integer settingstatus) {
        this.settingstatus = settingstatus;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}