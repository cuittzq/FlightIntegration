package com.tzq.integration.common.model.integration;

import com.tzq.integration.common.model.BaseVO;

import java.util.Date;

/**
 * 经停信息
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class StopVO extends BaseVO<Long> {

    /**  */
    private static final long serialVersionUID = -3853011003462772692L;
    /**
     * id
     */
    private Long   id;
    /**
     * 航段信息表_id
     */
    private Long   segmentId;
    /**
     * 主表订单序列号
     */
    private String serialNo;
    /**
     * 同程会员id
     */
    private String memberId;
    /**
     * 经停机场代码
     */
    private String stopAirportCode;
    /**
     * 经停机场名字
     */
    private String stopAirportName;
    /**
     * 经停航站楼
     */
    private String stopAirportTerm;
    /**
     * 经停到达时间
     */
    private Date   stopArrDatetime;
    /**
     * 经停起飞时间
     */
    private Date   stopDepDatetime;

    private int stopDuriation;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 变更时间
     */
    private Date updateTime;

    /**
     * @see
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @see
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>segmentId</tt>.
     *
     * @return property value of segmentId
     */
    public Long getSegmentId() {
        return segmentId;
    }

    /**
     * Setter method for property <tt>segmentId</tt>.
     *
     * @param segmentId value to be assigned to property segmentId
     */
    public void setSegmentId(Long segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * Getter method for property <tt>serialNo</tt>.
     *
     * @return property value of serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Setter method for property <tt>serialNo</tt>.
     *
     * @param serialNo value to be assigned to property serialNo
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * Getter method for property <tt>memberId</tt>.
     *
     * @return property value of memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Setter method for property <tt>memberId</tt>.
     *
     * @param memberId value to be assigned to property memberId
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * Getter method for property <tt>stopAirportCode</tt>.
     *
     * @return property value of stopAirportCode
     */
    public String getStopAirportCode() {
        return stopAirportCode;
    }

    /**
     * Setter method for property <tt>stopAirportCode</tt>.
     *
     * @param stopAirportCode value to be assigned to property stopAirportCode
     */
    public void setStopAirportCode(String stopAirportCode) {
        this.stopAirportCode = stopAirportCode;
    }

    /**
     * Getter method for property <tt>stopAirportName</tt>.
     *
     * @return property value of stopAirportName
     */
    public String getStopAirportName() {
        return stopAirportName;
    }

    /**
     * Setter method for property <tt>stopAirportName</tt>.
     *
     * @param stopAirportName value to be assigned to property stopAirportName
     */
    public void setStopAirportName(String stopAirportName) {
        this.stopAirportName = stopAirportName;
    }

    /**
     * Getter method for property <tt>stopAirportTerm</tt>.
     *
     * @return property value of stopAirportTerm
     */
    public String getStopAirportTerm() {
        return stopAirportTerm;
    }

    /**
     * Setter method for property <tt>stopAirportTerm</tt>.
     *
     * @param stopAirportTerm value to be assigned to property stopAirportTerm
     */
    public void setStopAirportTerm(String stopAirportTerm) {
        this.stopAirportTerm = stopAirportTerm;
    }

    /**
     * Getter method for property <tt>stopArrDatetime</tt>.
     *
     * @return property value of stopArrDatetime
     */
    public Date getStopArrDatetime() {
        return stopArrDatetime;
    }

    /**
     * Setter method for property <tt>stopArrDatetime</tt>.
     *
     * @param stopArrDatetime value to be assigned to property stopArrDatetime
     */
    public void setStopArrDatetime(Date stopArrDatetime) {
        this.stopArrDatetime = stopArrDatetime;
    }

    /**
     * Getter method for property <tt>stopDepDatetime</tt>.
     *
     * @return property value of stopDepDatetime
     */
    public Date getStopDepDatetime() {
        return stopDepDatetime;
    }

    /**
     * Setter method for property <tt>stopDepDatetime</tt>.
     *
     * @param stopDepDatetime value to be assigned to property stopDepDatetime
     */
    public void setStopDepDatetime(Date stopDepDatetime) {
        this.stopDepDatetime = stopDepDatetime;
    }

    public int getStopDuriation() {
        return stopDuriation;
    }

    public void setStopDuriation(int stopDuriation) {
        this.stopDuriation = stopDuriation;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>updateTime</tt>.
     *
     * @return property value of updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter method for property <tt>updateTime</tt>.
     *
     * @param updateTime value to be assigned to property updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
