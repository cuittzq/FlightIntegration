package com.tzq.dal.model.log;

import java.util.Date;

public class InterfaceRequestLog {
    private Long id;

    private Integer salesplatform;

    private Integer purchaseplatform;

    private Date requestdate;

    private String requesttype;

    private Integer requestresult;

    private Integer interfaceresult;

    private String carrier;

    private String depcode;

    private String arrcode;

    private Date depdate;

    private Date backdate;

    private Integer voyagetype;

    private Date salesplatrequesttime;

    private Date salesplatresponsetime;

    private Date purchaseplatrequesttime;

    private Date purchaseplatresponsetime;

    private String salesplatrequestip;

    private String purchaseplatrequestip;

    private String salesplatrequesttipmessage;

    private String purchaseplatrequesttipmessage;

    private String salesplatlogdetail;

    private String purchaseplatlogdetail;

    private String orderno;

    private String pnr;

    private Date modifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getRequestresult() {
        return requestresult;
    }

    public void setRequestresult(Integer requestresult) {
        this.requestresult = requestresult;
    }

    public Integer getInterfaceresult() {
        return interfaceresult;
    }

    public void setInterfaceresult(Integer interfaceresult) {
        this.interfaceresult = interfaceresult;
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

    public Integer getVoyagetype() {
        return voyagetype;
    }

    public void setVoyagetype(Integer voyagetype) {
        this.voyagetype = voyagetype;
    }

    public Date getSalesplatrequesttime() {
        return salesplatrequesttime;
    }

    public void setSalesplatrequesttime(Date salesplatrequesttime) {
        this.salesplatrequesttime = salesplatrequesttime;
    }

    public Date getSalesplatresponsetime() {
        return salesplatresponsetime;
    }

    public void setSalesplatresponsetime(Date salesplatresponsetime) {
        this.salesplatresponsetime = salesplatresponsetime;
    }

    public Date getPurchaseplatrequesttime() {
        return purchaseplatrequesttime;
    }

    public void setPurchaseplatrequesttime(Date purchaseplatrequesttime) {
        this.purchaseplatrequesttime = purchaseplatrequesttime;
    }

    public Date getPurchaseplatresponsetime() {
        return purchaseplatresponsetime;
    }

    public void setPurchaseplatresponsetime(Date purchaseplatresponsetime) {
        this.purchaseplatresponsetime = purchaseplatresponsetime;
    }

    public String getSalesplatrequestip() {
        return salesplatrequestip;
    }

    public void setSalesplatrequestip(String salesplatrequestip) {
        this.salesplatrequestip = salesplatrequestip == null ? null : salesplatrequestip.trim();
    }

    public String getPurchaseplatrequestip() {
        return purchaseplatrequestip;
    }

    public void setPurchaseplatrequestip(String purchaseplatrequestip) {
        this.purchaseplatrequestip = purchaseplatrequestip == null ? null : purchaseplatrequestip.trim();
    }

    public String getSalesplatrequesttipmessage() {
        return salesplatrequesttipmessage;
    }

    public void setSalesplatrequesttipmessage(String salesplatrequesttipmessage) {
        this.salesplatrequesttipmessage = salesplatrequesttipmessage == null ? null : salesplatrequesttipmessage.trim();
    }

    public String getPurchaseplatrequesttipmessage() {
        return purchaseplatrequesttipmessage;
    }

    public void setPurchaseplatrequesttipmessage(String purchaseplatrequesttipmessage) {
        this.purchaseplatrequesttipmessage = purchaseplatrequesttipmessage == null ? null : purchaseplatrequesttipmessage.trim();
    }

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

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr == null ? null : pnr.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}