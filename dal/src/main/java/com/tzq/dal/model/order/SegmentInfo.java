package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.Date;

public class SegmentInfo {
    private Long id;

    private String orderno;

    private Integer segmenttype;

    private BigDecimal depport;

    private BigDecimal arrport;

    private Date depdate;

    private Date deptime;

    private String depterminal;

    private String arrterminal;

    private BigDecimal flightno;

    private Integer shareflag;

    private BigDecimal cabin;

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

    public Integer getSegmenttype() {
        return segmenttype;
    }

    public void setSegmenttype(Integer segmenttype) {
        this.segmenttype = segmenttype;
    }

    public BigDecimal getDepport() {
        return depport;
    }

    public void setDepport(BigDecimal depport) {
        this.depport = depport;
    }

    public BigDecimal getArrport() {
        return arrport;
    }

    public void setArrport(BigDecimal arrport) {
        this.arrport = arrport;
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

    public String getDepterminal() {
        return depterminal;
    }

    public void setDepterminal(String depterminal) {
        this.depterminal = depterminal == null ? null : depterminal.trim();
    }

    public String getArrterminal() {
        return arrterminal;
    }

    public void setArrterminal(String arrterminal) {
        this.arrterminal = arrterminal == null ? null : arrterminal.trim();
    }

    public BigDecimal getFlightno() {
        return flightno;
    }

    public void setFlightno(BigDecimal flightno) {
        this.flightno = flightno;
    }

    public Integer getShareflag() {
        return shareflag;
    }

    public void setShareflag(Integer shareflag) {
        this.shareflag = shareflag;
    }

    public BigDecimal getCabin() {
        return cabin;
    }

    public void setCabin(BigDecimal cabin) {
        this.cabin = cabin;
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