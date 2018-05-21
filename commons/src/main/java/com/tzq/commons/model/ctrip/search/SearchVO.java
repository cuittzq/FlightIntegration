package com.tzq.commons.model.ctrip.search;

import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.BaseVO;
import com.tzq.commons.model.ctrip.BaseRequest;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchVO extends BaseRequest {


    /**  */
    private static final long serialVersionUID = -1054900646630922989L;

    /**
     * 行程类型 单程 往返 联程
     */
    private TripTypeEnum tripType;

    /**
     * 出发三字码
     */
    private String depAirportCode;

    /**
     * 到达三字码
     */
    private String arrAirportCode;

    /**
     * 出发日期格式为YYYYMMDD
     */
    private String depDate;

    /**
     * 返程日期
     */
    private String arrDate;

    /**
     * 成人个数
     **/
    private int AdultCnt = 1;

    /**
     * 儿童个数
     **/
    private int ChildCnt = 0;

    public TripTypeEnum getTripType() {
        return tripType;
    }

    public void setTripType(TripTypeEnum tripType) {
        this.tripType = tripType;
    }

    public String getDepAirportCode() {
        return depAirportCode;
    }

    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    public String getArrAirportCode() {
        return arrAirportCode;
    }

    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    public String getDepDate() {
        return depDate;
    }

    public void setDepDate(String depDate) {
        this.depDate = depDate;
    }

    public String getArrDate() {
        return arrDate;
    }

    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    public int getAdultCnt() {
        return AdultCnt;
    }

    public void setAdultCnt(int adultCnt) {
        AdultCnt = adultCnt;
    }

    public int getChildCnt() {
        return ChildCnt;
    }

    public void setChildCnt(int childCnt) {
        ChildCnt = childCnt;
    }

    @Override
    public String toString() {
        return "SearchDTO{" + "cid=" + getCid() + ", tripType='" + tripType + '\'' + ", depAirportCode='" + depAirportCode + '\'' + ", arrAirportCode='" + arrAirportCode + '\''
                + ", depDate='" + depDate + '\'' + ", arrDate='" + arrDate + '\'' + '}';
    }
}
