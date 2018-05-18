package com.tzq.dal.model.order;

import java.util.Date;

public class PassengerInfo {
    private Long id;

    private String orderno;

    private String passengername;

    private String passengernametype;

    private Date birtyday;

    private String gender;

    private String cardtype;

    private String cardnum;

    private Integer cardissueplace;

    private Date cardexpired;

    private String nationality;

    private String ticketno;

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

    public String getPassengername() {
        return passengername;
    }

    public void setPassengername(String passengername) {
        this.passengername = passengername == null ? null : passengername.trim();
    }

    public String getPassengernametype() {
        return passengernametype;
    }

    public void setPassengernametype(String passengernametype) {
        this.passengernametype = passengernametype == null ? null : passengernametype.trim();
    }

    public Date getBirtyday() {
        return birtyday;
    }

    public void setBirtyday(Date birtyday) {
        this.birtyday = birtyday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }

    public Integer getCardissueplace() {
        return cardissueplace;
    }

    public void setCardissueplace(Integer cardissueplace) {
        this.cardissueplace = cardissueplace;
    }

    public Date getCardexpired() {
        return cardexpired;
    }

    public void setCardexpired(Date cardexpired) {
        this.cardexpired = cardexpired;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getTicketno() {
        return ticketno;
    }

    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
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