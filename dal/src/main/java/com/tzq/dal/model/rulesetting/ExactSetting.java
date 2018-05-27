package com.tzq.dal.model.rulesetting;

import java.math.BigDecimal;
import java.util.Date;

public class ExactSetting {
    private String id;

    private String salesplatform;

    private String purchaseplatform;

    private String carrier;

    private String cabins;

    private String flightnos;

    private String deps;

    private String arrs;

    private String excludedeps;

    private String excludearrs;

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

    private String outticketremark;

    private Integer settingstatus;

    private Date modifytime;

    private Date salesstartdate;

    private Date salesenddate;

    private Integer salesdayenable;

    private Integer voyagetype;

    private Integer salesstartday;

    private Integer salesendday;

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

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getCabins() {
        return cabins;
    }

    public void setCabins(String cabins) {
        this.cabins = cabins == null ? null : cabins.trim();
    }

    public String getFlightnos() {
        return flightnos;
    }

    public void setFlightnos(String flightnos) {
        this.flightnos = flightnos == null ? null : flightnos.trim();
    }

    public String getDeps() {
        return deps;
    }

    public void setDeps(String deps) {
        this.deps = deps == null ? null : deps.trim();
    }

    public String getArrs() {
        return arrs;
    }

    public void setArrs(String arrs) {
        this.arrs = arrs == null ? null : arrs.trim();
    }

    public String getExcludedeps() {
        return excludedeps;
    }

    public void setExcludedeps(String excludedeps) {
        this.excludedeps = excludedeps == null ? null : excludedeps.trim();
    }

    public String getExcludearrs() {
        return excludearrs;
    }

    public void setExcludearrs(String excludearrs) {
        this.excludearrs = excludearrs == null ? null : excludearrs.trim();
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

    public String getOutticketremark() {
        return outticketremark;
    }

    public void setOutticketremark(String outticketremark) {
        this.outticketremark = outticketremark == null ? null : outticketremark.trim();
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

    public Integer getSalesdayenable() {
        return salesdayenable;
    }

    public void setSalesdayenable(Integer salesdayenable) {
        this.salesdayenable = salesdayenable;
    }

    public Integer getVoyagetype() {
        return voyagetype;
    }

    public void setVoyagetype(Integer voyagetype) {
        this.voyagetype = voyagetype;
    }

    public Integer getSalesstartday() {
        return salesstartday;
    }

    public void setSalesstartday(Integer salesstartday) {
        this.salesstartday = salesstartday;
    }

    public Integer getSalesendday() {
        return salesendday;
    }

    public void setSalesendday(Integer salesendday) {
        this.salesendday = salesendday;
    }
}