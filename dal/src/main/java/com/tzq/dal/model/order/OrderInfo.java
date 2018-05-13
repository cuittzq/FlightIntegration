package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Integer id;

    private Integer salesplatform;

    private Integer purchaseplatform;

    private Date creattime;

    private Date outtickettime;

    private String orderno;

    private String pnr;

    private String ticketno;

    private Byte orderstate;

    private String depcode;

    private String arrcode;

    private Date depdate;

    private Date deptime;

    private Date backdate;

    private Date backtime;

    private String cabin;

    private String backcabin;

    private String flightno;

    private String backflightno;

    private BigDecimal aduitsalesprice;

    private BigDecimal aduitpurchasepirce;

    private BigDecimal childsalesprice;

    private BigDecimal childpurchasepirce;

    private BigDecimal babysalesprice;

    private BigDecimal babypurchasepirce;

    private BigDecimal backaduitsalesprice;

    private BigDecimal backaduitpurchasepirce;

    private BigDecimal backchildsalesprice;

    private BigDecimal backchildpurchasepirce;

    private BigDecimal backbabysalesprice;

    private BigDecimal backbabypurchasepirce;

    private BigDecimal totalsalesprice;

    private BigDecimal totalpurchaseprice;

    private Integer auditcount;

    private Integer childcount;

    private Integer babycount;

    private String outtickettype;

    private String outticketcompany;

    private String linkname;

    private String linkmobile;

    private String linkemail;

    private String linkaddress;

    private String linkpostcode;

    private String extendvalue;

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

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getOuttickettime() {
        return outtickettime;
    }

    public void setOuttickettime(Date outtickettime) {
        this.outtickettime = outtickettime;
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

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    public Byte getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Byte orderstate) {
        this.orderstate = orderstate;
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

    public Date getDeptime() {
        return deptime;
    }

    public void setDeptime(Date deptime) {
        this.deptime = deptime;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin == null ? null : cabin.trim();
    }

    public String getBackcabin() {
        return backcabin;
    }

    public void setBackcabin(String backcabin) {
        this.backcabin = backcabin == null ? null : backcabin.trim();
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno == null ? null : flightno.trim();
    }

    public String getBackflightno() {
        return backflightno;
    }

    public void setBackflightno(String backflightno) {
        this.backflightno = backflightno == null ? null : backflightno.trim();
    }

    public BigDecimal getAduitsalesprice() {
        return aduitsalesprice;
    }

    public void setAduitsalesprice(BigDecimal aduitsalesprice) {
        this.aduitsalesprice = aduitsalesprice;
    }

    public BigDecimal getAduitpurchasepirce() {
        return aduitpurchasepirce;
    }

    public void setAduitpurchasepirce(BigDecimal aduitpurchasepirce) {
        this.aduitpurchasepirce = aduitpurchasepirce;
    }

    public BigDecimal getChildsalesprice() {
        return childsalesprice;
    }

    public void setChildsalesprice(BigDecimal childsalesprice) {
        this.childsalesprice = childsalesprice;
    }

    public BigDecimal getChildpurchasepirce() {
        return childpurchasepirce;
    }

    public void setChildpurchasepirce(BigDecimal childpurchasepirce) {
        this.childpurchasepirce = childpurchasepirce;
    }

    public BigDecimal getBabysalesprice() {
        return babysalesprice;
    }

    public void setBabysalesprice(BigDecimal babysalesprice) {
        this.babysalesprice = babysalesprice;
    }

    public BigDecimal getBabypurchasepirce() {
        return babypurchasepirce;
    }

    public void setBabypurchasepirce(BigDecimal babypurchasepirce) {
        this.babypurchasepirce = babypurchasepirce;
    }

    public BigDecimal getBackaduitsalesprice() {
        return backaduitsalesprice;
    }

    public void setBackaduitsalesprice(BigDecimal backaduitsalesprice) {
        this.backaduitsalesprice = backaduitsalesprice;
    }

    public BigDecimal getBackaduitpurchasepirce() {
        return backaduitpurchasepirce;
    }

    public void setBackaduitpurchasepirce(BigDecimal backaduitpurchasepirce) {
        this.backaduitpurchasepirce = backaduitpurchasepirce;
    }

    public BigDecimal getBackchildsalesprice() {
        return backchildsalesprice;
    }

    public void setBackchildsalesprice(BigDecimal backchildsalesprice) {
        this.backchildsalesprice = backchildsalesprice;
    }

    public BigDecimal getBackchildpurchasepirce() {
        return backchildpurchasepirce;
    }

    public void setBackchildpurchasepirce(BigDecimal backchildpurchasepirce) {
        this.backchildpurchasepirce = backchildpurchasepirce;
    }

    public BigDecimal getBackbabysalesprice() {
        return backbabysalesprice;
    }

    public void setBackbabysalesprice(BigDecimal backbabysalesprice) {
        this.backbabysalesprice = backbabysalesprice;
    }

    public BigDecimal getBackbabypurchasepirce() {
        return backbabypurchasepirce;
    }

    public void setBackbabypurchasepirce(BigDecimal backbabypurchasepirce) {
        this.backbabypurchasepirce = backbabypurchasepirce;
    }

    public BigDecimal getTotalsalesprice() {
        return totalsalesprice;
    }

    public void setTotalsalesprice(BigDecimal totalsalesprice) {
        this.totalsalesprice = totalsalesprice;
    }

    public BigDecimal getTotalpurchaseprice() {
        return totalpurchaseprice;
    }

    public void setTotalpurchaseprice(BigDecimal totalpurchaseprice) {
        this.totalpurchaseprice = totalpurchaseprice;
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