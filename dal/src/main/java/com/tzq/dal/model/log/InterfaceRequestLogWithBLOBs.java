package com.tzq.dal.model.log;

public class InterfaceRequestLogWithBLOBs extends InterfaceRequestLog {
    private String salesplatlogdetail;

    private String purchaseplatlogdetail;

    public String getSalesplatlogdetail() {
        return salesplatlogdetail;
    }

    public void setSalesplatlogdetail(String salesplatlogdetail) {
        this.salesplatlogdetail = salesplatlogdetail == null ? null : salesplatlogdetail.trim();
    }

    public String getPurchaseplatlogdetail() {
        return purchaseplatlogdetail;
    }

    public void setPurchaseplatlogdetail(String purchaseplatlogdetail) {
        this.purchaseplatlogdetail = purchaseplatlogdetail == null ? null : purchaseplatlogdetail.trim();
    }
}