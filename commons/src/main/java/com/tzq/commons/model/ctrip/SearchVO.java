package com.tzq.commons.model.ctrip;

import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.BaseVO;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/14
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SearchVO extends BaseVO<Long> {


    /**  */
    private static final long serialVersionUID = -1054900646630922989L;

    private Long id;

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
     * 出发日期
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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

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
        return "SearchDTO{" + "id=" + id + ", tripType='" + tripType + '\'' + ", depAirportCode='" + depAirportCode + '\'' + ", arrAirportCode='" + arrAirportCode + '\''
                + ", depDate='" + depDate + '\'' + ", arrDate='" + arrDate + '\'' + '}';
    }
}
