package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.Date;

public class PriceInfo {
    private Long id;

    private String orderno;

    private Integer segmentid;

    private BigDecimal salesprice;

    private BigDecimal salestax;

    private String pricetype;

    private BigDecimal purchaseprice;

    private BigDecimal purchasetax;

    private BigDecimal policyreturnpoint;

    private BigDecimal settlementprice;

    private String extendvalue;

    private Date modifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getSegmentid() {
        return segmentid;
    }

    public void setSegmentid(Integer segmentid) {
        this.segmentid = segmentid;
    }

    public BigDecimal getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }

    public BigDecimal getSalestax() {
        return salestax;
    }

    public void setSalestax(BigDecimal salestax) {
        this.salestax = salestax;
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype == null ? null : pricetype.trim();
    }

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public BigDecimal getPurchasetax() {
        return purchasetax;
    }

    public void setPurchasetax(BigDecimal purchasetax) {
        this.purchasetax = purchasetax;
    }

    public BigDecimal getPolicyreturnpoint() {
        return policyreturnpoint;
    }

    public void setPolicyreturnpoint(BigDecimal policyreturnpoint) {
        this.policyreturnpoint = policyreturnpoint;
    }

    public BigDecimal getSettlementprice() {
        return settlementprice;
    }

    public void setSettlementprice(BigDecimal settlementprice) {
        this.settlementprice = settlementprice;
    }

    public String getExtendvalue() {
        return extendvalue;
    }

    public void setExtendvalue(String extendvalue) {
        this.extendvalue = extendvalue == null ? null : extendvalue.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}