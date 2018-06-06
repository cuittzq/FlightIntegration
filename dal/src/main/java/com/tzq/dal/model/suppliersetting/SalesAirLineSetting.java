package com.tzq.dal.model.suppliersetting;

import java.util.Date;

public class SalesAirLineSetting {
    private String id;

    private String purchaseplatform;

    private String deps;

    private String arrs;

    private String carriers;

    private Integer cachestatus;

    private Integer settingstatus;

    private Date modifytime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPurchaseplatform() {
        return purchaseplatform;
    }

    public void setPurchaseplatform(String purchaseplatform) {
        this.purchaseplatform = purchaseplatform == null ? null : purchaseplatform.trim();
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

    public String getCarriers() {
        return carriers;
    }

    public void setCarriers(String carriers) {
        this.carriers = carriers == null ? null : carriers.trim();
    }

    public Integer getCachestatus() {
        return cachestatus;
    }

    public void setCachestatus(Integer cachestatus) {
        this.cachestatus = cachestatus;
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