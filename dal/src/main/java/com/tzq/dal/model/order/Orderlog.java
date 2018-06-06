package com.tzq.dal.model.order;

import java.util.Date;

public class Orderlog {
    private Long id;

    private String orderno;

    private String logtype;

    private String logvalue;

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

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getLogvalue() {
        return logvalue;
    }

    public void setLogvalue(String logvalue) {
        this.logvalue = logvalue == null ? null : logvalue.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}