package com.tzq.integration.service.intl.lcc.model.order;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/12.
 */
public class Passenger implements Serializable {

    private static final long serialVersionUID = 3097170825390550974L;

    /**
     * 英文名按"LastName/FirstName/MiddleName"，中文名按"姓/名"（中间名部分可省略）
     */
    private String name;
    /**
     * 乘客类型，0 成人/1 儿童
     */
    private int ageType;
    /**
     * 生日，格式：YYYYMMDD
     */
    private String birthday;
    /**
     * 乘客性别，M 男 / F 女
     */
    private String gender;
    /**
     * 证件类型：PP - 护照 / GA – 港澳通行证（仅内地与香港通航航段适用）
     */
    private String cardType;
    /**
     * 证件号码，最大 15 个字符
     */
    private String cardNum;
    /**
     * 证件有效时间，格式：YYYYMMDD
     */
    private String cardExpired;
    /**
     * 证件发行国家，国家二字码
     */
    private String cardIssuePlace;
    /**
     * 乘客国籍，国家二字码
     */
    private String nationality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeType() {
        return ageType;
    }

    public void setAgeType(int ageType) {
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
