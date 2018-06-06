package com.tzq.dal.model.rulesetting;

import java.math.BigDecimal;
import java.util.Date;

public class RefundSetting {
    private String id;

    private String salesplatform;

    private String purchaseplatform;

    private String passengertype;

    private BigDecimal allnotuserefundmoney;

    private BigDecimal partnotuserefundmoney;

    private Integer refundnoshowtimelimit;

    private BigDecimal refundnoshowmoney;

    private String refundchdesc;

    private String refundendesc;

    private BigDecimal beforetakeoffchangemoney;

    private BigDecimal aftertakoffchangemoney;

    private Integer changenoshowtimelimit;

    private BigDecimal changenoswhomoney;

    private String changechdesc;

    private String changeendesc;

    private String applycarriers;

    private Integer ownpackageonoff;

    private Integer packagevalue;

    private String packagetype;

    private String packageendesc;

    private String packagechdesc;

    private String otherchdesc;

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

    public String getPassengertype() {
        return passengertype;
    }

    public void setPassengertype(String passengertype) {
        this.passengertype = passengertype == null ? null : passengertype.trim();
    }

    public BigDecimal getAllnotuserefundmoney() {
        return allnotuserefundmoney;
    }

    public void setAllnotuserefundmoney(BigDecimal allnotuserefundmoney) {
        this.allnotuserefundmoney = allnotuserefundmoney;
    }

    public BigDecimal getPartnotuserefundmoney() {
        return partnotuserefundmoney;
    }

    public void setPartnotuserefundmoney(BigDecimal partnotuserefundmoney) {
        this.partnotuserefundmoney = partnotuserefundmoney;
    }

    public Integer getRefundnoshowtimelimit() {
        return refundnoshowtimelimit;
    }

    public void setRefundnoshowtimelimit(Integer refundnoshowtimelimit) {
        this.refundnoshowtimelimit = refundnoshowtimelimit;
    }

    public BigDecimal getRefundnoshowmoney() {
        return refundnoshowmoney;
    }

    public void setRefundnoshowmoney(BigDecimal refundnoshowmoney) {
        this.refundnoshowmoney = refundnoshowmoney;
    }

    public String getRefundchdesc() {
        return refundchdesc;
    }

    public void setRefundchdesc(String refundchdesc) {
        this.refundchdesc = refundchdesc == null ? null : refundchdesc.trim();
    }

    public String getRefundendesc() {
        return refundendesc;
    }

    public void setRefundendesc(String refundendesc) {
        this.refundendesc = refundendesc == null ? null : refundendesc.trim();
    }

    public BigDecimal getBeforetakeoffchangemoney() {
        return beforetakeoffchangemoney;
    }

    public void setBeforetakeoffchangemoney(BigDecimal beforetakeoffchangemoney) {
        this.beforetakeoffchangemoney = beforetakeoffchangemoney;
    }

    public BigDecimal getAftertakoffchangemoney() {
        return aftertakoffchangemoney;
    }

    public void setAftertakoffchangemoney(BigDecimal aftertakoffchangemoney) {
        this.aftertakoffchangemoney = aftertakoffchangemoney;
    }

    public Integer getChangenoshowtimelimit() {
        return changenoshowtimelimit;
    }

    public void setChangenoshowtimelimit(Integer changenoshowtimelimit) {
        this.changenoshowtimelimit = changenoshowtimelimit;
    }

    public BigDecimal getChangenoswhomoney() {
        return changenoswhomoney;
    }

    public void setChangenoswhomoney(BigDecimal changenoswhomoney) {
        this.changenoswhomoney = changenoswhomoney;
    }

    public String getChangechdesc() {
        return changechdesc;
    }

    public void setChangechdesc(String changechdesc) {
        this.changechdesc = changechdesc == null ? null : changechdesc.trim();
    }

    public String getChangeendesc() {
        return changeendesc;
    }

    public void setChangeendesc(String changeendesc) {
        this.changeendesc = changeendesc == null ? null : changeendesc.trim();
    }

    public String getApplycarriers() {
        return applycarriers;
    }

    public void setApplycarriers(String applycarriers) {
        this.applycarriers = applycarriers == null ? null : applycarriers.trim();
    }

    public Integer getOwnpackageonoff() {
        return ownpackageonoff;
    }

    public void setOwnpackageonoff(Integer ownpackageonoff) {
        this.ownpackageonoff = ownpackageonoff;
    }

    public Integer getPackagevalue() {
        return packagevalue;
    }

    public void setPackagevalue(Integer packagevalue) {
        this.packagevalue = packagevalue;
    }

    public String getPackagetype() {
        return packagetype;
    }

    public void setPackagetype(String packagetype) {
        this.packagetype = packagetype == null ? null : packagetype.trim();
    }

    public String getPackageendesc() {
        return packageendesc;
    }

    public void setPackageendesc(String packageendesc) {
        this.packageendesc = packageendesc == null ? null : packageendesc.trim();
    }

    public String getPackagechdesc() {
        return packagechdesc;
    }

    public void setPackagechdesc(String packagechdesc) {
        this.packagechdesc = packagechdesc == null ? null : packagechdesc.trim();
    }

    public String getOtherchdesc() {
        return otherchdesc;
    }

    public void setOtherchdesc(String otherchdesc) {
        this.otherchdesc = otherchdesc == null ? null : otherchdesc.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}