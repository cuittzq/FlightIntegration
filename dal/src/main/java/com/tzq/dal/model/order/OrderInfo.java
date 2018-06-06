package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Long id;

    private Integer salesplatform;

    private Integer purchaseplatform;

    private String pnr;

    private String orderno;

    private String salesorderno;

    private String purchaseorderno;

    private String depcity;

    private String arrcity;

    private Integer voyagetype;

    private BigDecimal totalsalesprice;

    private BigDecimal totalsalestax;

    private BigDecimal totalpurchaseprice;

    private BigDecimal totalpurchasetax;

    private Integer auditcount;

    private Integer childcount;

    private Integer babycount;

    private String outtickettype;

    private String outticketcompany;

    private String outticketremark;

    private String linkname;

    private String linkmobile;

    private String linkemail;

    private String linkaddress;

    private String linkpostcode;

    private Integer orderstate;

    private Date createtime;

    private Date outtickettime;

    private String extendvalue;

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

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr == null ? null : pnr.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getSalesorderno() {
        return salesorderno;
    }

    public void setSalesorderno(String salesorderno) {
        this.salesorderno = salesorderno == null ? null : salesorderno.trim();
    }

    public String getPurchaseorderno() {
        return purchaseorderno;
    }

    public void setPurchaseorderno(String purchaseorderno) {
        this.purchaseorderno = purchaseorderno == null ? null : purchaseorderno.trim();
    }

    public String getDepcity() {
        return depcity;
    }

    public void setDepcity(String depcity) {
        this.depcity = depcity == null ? null : depcity.trim();
    }

    public String getArrcity() {
        return arrcity;
    }

    public void setArrcity(String arrcity) {
        this.arrcity = arrcity == null ? null : arrcity.trim();
    }

    public Integer getVoyagetype() {
        return voyagetype;
    }

    public void setVoyagetype(Integer voyagetype) {
        this.voyagetype = voyagetype;
    }

    public BigDecimal getTotalsalesprice() {
        return totalsalesprice;
    }

    public void setTotalsalesprice(BigDecimal totalsalesprice) {
        this.totalsalesprice = totalsalesprice;
    }

    public BigDecimal getTotalsalestax() {
        return totalsalestax;
    }

    public void setTotalsalestax(BigDecimal totalsalestax) {
        this.totalsalestax = totalsalestax;
    }

    public BigDecimal getTotalpurchaseprice() {
        return totalpurchaseprice;
    }

    public void setTotalpurchaseprice(BigDecimal totalpurchaseprice) {
        this.totalpurchaseprice = totalpurchaseprice;
    }

    public BigDecimal getTotalpurchasetax() {
        return totalpurchasetax;
    }

    public void setTotalpurchasetax(BigDecimal totalpurchasetax) {
        this.totalpurchasetax = totalpurchasetax;
    }

    public Integer getAuditcount() {
        return auditcount;
    }

    public void setAuditcount(Integer auditcount) {
        this.auditcount = auditcount;
    }

    public Integer getChildcount() {
        return childcount;
    }

    public void setChildcount(Integer childcount) {
        this.childcount = childcount;
    }

    public Integer getBabycount() {
        return babycount;
    }

    public void setBabycount(Integer babycount) {
        this.babycount = babycount;
    }

    public String getOuttickettype() {
        return outtickettype;
    }

    public void setOuttickettype(String outtickettype) {
        this.outtickettype = outtickettype == null ? null : outtickettype.trim();
    }

    public String getOutticketcompany() {
        return outticketcompany;
    }

    public void setOutticketcompany(String outticketcompany) {
        this.outticketcompany = outticketcompany == null ? null : outticketcompany.trim();
    }

    public String getOutticketremark() {
        return outticketremark;
    }

    public void setOutticketremark(String outticketremark) {
        this.outticketremark = outticketremark == null ? null : outticketremark.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkmobile() {
        return linkmobile;
    }

    public void setLinkmobile(String linkmobile) {
        this.linkmobile = linkmobile == null ? null : linkmobile.trim();
    }

    public String getLinkemail() {
        return linkemail;
    }

    public void setLinkemail(String linkemail) {
        this.linkemail = linkemail == null ? null : linkemail.trim();
    }

    public String getLinkaddress() {
        return linkaddress;
    }

    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress == null ? null : linkaddress.trim();
    }

    public String getLinkpostcode() {
        return linkpostcode;
    }

    public void setLinkpostcode(String linkpostcode) {
        this.linkpostcode = linkpostcode == null ? null : linkpostcode.trim();
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getOuttickettime() {
        return outtickettime;
    }

    public void setOuttickettime(Date outtickettime) {
        this.outtickettime = outtickettime;
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