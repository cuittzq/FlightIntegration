package com.tzq.dal.model.platsetting;

import java.util.Date;

public class MatchingSetting {
    private String id;

    private String salesplatform;

    private String purchaseplatform;

    private Integer voyagetype;

    private Integer salesstartday;

    private Integer salesendday;

    private Integer refundrulestatus;

    private String weeklimit;

    private Date salesstartdate;

    private Date salesenddate;

    private Date startworktime;

    private Date stopworktime;

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

    public Integer getRefundrulestatus() {
        return refundrulestatus;
    }

    public void setRefundrulestatus(Integer refundrulestatus) {
        this.refundrulestatus = refundrulestatus;
    }

    public String getWeeklimit() {
        return weeklimit;
    }

    public void setWeeklimit(String weeklimit) {
        this.weeklimit = weeklimit == null ? null : weeklimit.trim();
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