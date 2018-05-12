package com.tzq.integration.service.intl.lcc.model.order;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class Passenger implements Serializable {

    private static final long serialVersionUID = 3097170825390550974L;

    private String name;
    private String ageType;
    private String birthday;
    private String gender;
    private String cardType;
    private String cardNum;
    private String cardExpired;
    private String cardIssuePlace;
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardExpired() {
        return cardExpired;
    }

    public void setCardExpired(String cardExpired) {
        this.cardExpired = cardExpired;
    }

    public String getCardIssuePlace() {
        return cardIssuePlace;
    }

    public void setCardIssuePlace(String cardIssuePlace) {
        this.cardIssuePlace = cardIssuePlace;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"name\":\"").append(name).append('\"');
        sb.append(",             \"ageType\":\"").append(ageType).append('\"');
        sb.append(",             \"birthday\":\"").append(birthday).append('\"');
        sb.append(",             \"gender\":\"").append(gender).append('\"');
        sb.append(",             \"cardType\":\"").append(cardType).append('\"');
        sb.append(",             \"cardNum\":\"").append(cardNum).append('\"');
        sb.append(",             \"cardExpired\":\"").append(cardExpired).append('\"');
        sb.append(",             \"cardIssuePlace\":\"").append(cardIssuePlace).append('\"');
        sb.append(",             \"nationality\":\"").append(nationality).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
