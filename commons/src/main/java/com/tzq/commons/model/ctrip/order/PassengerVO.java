package com.tzq.commons.model.ctrip.order;

import com.tzq.commons.enums.AgeTypeEunm;
import com.tzq.commons.enums.CardTypeEnum;

public class PassengerVO {
    /**
     * name :  Marcus/Tom
     * ageType : 0
     * birthday : 19740225
     * gender : M
     * cardType : PP
     * cardNum : G75678926
     * cardExpired : 20200101
     * cardIssuePlace : CN
     * nationality : CN
     * ffpNo : {"cardNo":"123456","carrier":"CA"}
     */

    private String name;
    // 乘客类型，0 成人/1 儿童/2 婴儿
    private AgeTypeEunm ageType;
    private String birthday;
    private String gender;
    private CardTypeEnum cardType;
    private String cardNum;
    private String cardExpired;
    private String cardIssuePlace;
    private String nationality;
    private FfpNoVO ffpNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeTypeEunm getAgeType() {
        return ageType;
    }

    public void setAgeType(AgeTypeEunm ageType) {
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

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
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

    public FfpNoVO getFfpNo() {
        return ffpNo;
    }

    public void setFfpNo(FfpNoVO ffpNo) {
        this.ffpNo = ffpNo;
    }
}
