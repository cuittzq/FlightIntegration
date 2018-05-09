package com.tzq.biz.common.model.integration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tzq.biz.common.enums.SegmentTypeEnum;
import com.tzq.biz.common.enums.StatusEnum;
import com.tzq.biz.common.model.BaseVO;
import com.tzq.biz.common.model.Money;
import org.apache.commons.collections.MapUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 航段信息
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SegmentVO extends BaseVO<Long> implements Comparable<SegmentVO> {

    /**
     * The Serial version uid.
     */
    private static final long serialVersionUID = -1144426575643058998L;
    /**
     * id
     */
    private Long            id;
    /**
     * 主表订单序列号
     */
    private String          serialNo;
    /**
     * 同程会员id
     */
    private String          memberId;
    /**
     * 航段类型(1. 去程，2. 返程)
     */
    private SegmentTypeEnum segmentType;
    /**
     * 航段索引
     */
    private int             segmentIndex;
    /**
     * 出发城市机场三字码
     */
    private String          depAirportCode;
    /**
     * 出发城市机场名称
     */
    private String          depAirportName;
    /**
     * 出发日期时间
     */
    private Date            depDatetime;
    /**
     * 出发航站楼
     */
    private String          depAirportTerm;
    /**
     * 到达城市机场三字码
     */
    private String          arrAirportCode;
    /**
     * 到达城市机场名称
     */
    private String          arrAirportName;
    /**
     * 到达日期时间
     */
    private Date            arrDatetime;
    /**
     * 到达机场航站楼
     */
    private String          arrAirportTerm;
    /**
     * 航空公司代码
     */
    private String          airlineCode;
    /**
     * 是否共享航班
     */
    private StatusEnum      codeShare;
    /**
     * 市场航班号
     */
    private String          marketFlightNo;
    /**
     * 承运航班号
     */
    private String          operateFlightNo;
    /**
     * 经停标识
     */
    private StatusEnum      stopFlag;
    /**
     * 经停数
     */
    private int             stopQuantity;
    /**
     * 机型
     */
    private String          aircraftStyle;
    /**
     * 飞行时长（分钟）
     */
    private int             duration;
    /**
     * 飞行里程
     */
    private Long            mileage;

    /**
     * 航班基础价格
     */
    private Money baseFare = new Money();
    ;

    /**
     * 餐食
     */
    private StatusEnum meal;
    /**
     * 舱位
     */
    private CabinVO    cabin;
    /**
     * 创建时间
     */
    private Date       createTime;
    /**
     * 变更时间
     */
    private Date       updateTime;

    /**
     * 扩展字段
     */
    private Map<String, Object> extInfo = Maps.newHashMap();

    /**
     * 经停点
     */
    private List<StopVO> stopList = Lists.newArrayList();

    /**
     * 运价信息
     */
    private List<FareVO> fareList = Lists.newArrayList();

    /**
     * 退改规则
     */
    private RuleVO rule;


    /**
     * Gets id.
     *
     * @return the id
     * @see
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @see
     */
    @Override
    public void setId(Long id) {
        this.id = id;
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
     * Getter method for property <tt>segmentType</tt>.
     *
     * @return property value of segmentType
     */
    public SegmentTypeEnum getSegmentType() {
        return segmentType;
    }

    /**
     * Setter method for property <tt>segmentType</tt>.
     *
     * @param segmentType value to be assigned to property segmentType
     */
    public void setSegmentType(SegmentTypeEnum segmentType) {
        this.segmentType = segmentType;
    }

    /**
     * Getter method for property <tt>segmentIndex</tt>.
     *
     * @return property value of segmentIndex
     */
    public int getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Setter method for property <tt>segmentIndex</tt>.
     *
     * @param segmentIndex value to be assigned to property segmentIndex
     */
    public void setSegmentIndex(int segmentIndex) {
        this.segmentIndex = segmentIndex;
    }

    /**
     * Getter method for property <tt>depAirportCode</tt>.
     *
     * @return property value of depAirportCode
     */
    public String getDepAirportCode() {
        return depAirportCode;
    }

    /**
     * Setter method for property <tt>depAirportCode</tt>.
     *
     * @param depAirportCode value to be assigned to property depAirportCode
     */
    public void setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
    }

    /**
     * Getter method for property <tt>depDatetime</tt>.
     *
     * @return property value of depDatetime
     */
    public Date getDepDatetime() {
        return depDatetime;
    }

    /**
     * Setter method for property <tt>depDatetime</tt>.
     *
     * @param depDatetime value to be assigned to property depDatetime
     */
    public void setDepDatetime(Date depDatetime) {
        this.depDatetime = depDatetime;
    }

    /**
     * Getter method for property <tt>depAirportTerm</tt>.
     *
     * @return property value of depAirportTerm
     */
    public String getDepAirportTerm() {
        return depAirportTerm;
    }

    /**
     * Setter method for property <tt>depAirportTerm</tt>.
     *
     * @param depAirportTerm value to be assigned to property depAirportTerm
     */
    public void setDepAirportTerm(String depAirportTerm) {
        this.depAirportTerm = depAirportTerm;
    }

    /**
     * Getter method for property <tt>arrAirportCode</tt>.
     *
     * @return property value of arrAirportCode
     */
    public String getArrAirportCode() {
        return arrAirportCode;
    }

    /**
     * Setter method for property <tt>arrAirportCode</tt>.
     *
     * @param arrAirportCode value to be assigned to property arrAirportCode
     */
    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    /**
     * Getter method for property <tt>arrDatetime</tt>.
     *
     * @return property value of arrDatetime
     */
    public Date getArrDatetime() {
        return arrDatetime;
    }

    /**
     * Setter method for property <tt>arrDatetime</tt>.
     *
     * @param arrDatetime value to be assigned to property arrDatetime
     */
    public void setArrDatetime(Date arrDatetime) {
        this.arrDatetime = arrDatetime;
    }

    /**
     * Getter method for property <tt>arrAirportTerm</tt>.
     *
     * @return property value of arrAirportTerm
     */
    public String getArrAirportTerm() {
        return arrAirportTerm;
    }

    /**
     * Setter method for property <tt>arrAirportTerm</tt>.
     *
     * @param arrAirportTerm value to be assigned to property arrAirportTerm
     */
    public void setArrAirportTerm(String arrAirportTerm) {
        this.arrAirportTerm = arrAirportTerm;
    }

    /**
     * Getter method for property <tt>airlineCode</tt>.
     *
     * @return property value of airlineCode
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Setter method for property <tt>airlineCode</tt>.
     *
     * @param airlineCode value to be assigned to property airlineCode
     */
    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    /**
     * Getter method for property <tt>marketFlightNo</tt>.
     *
     * @return property value of marketFlightNo
     */
    public String getMarketFlightNo() {
        return marketFlightNo;
    }

    /**
     * Setter method for property <tt>marketFlightNo</tt>.
     *
     * @param marketFlightNo value to be assigned to property marketFlightNo
     */
    public void setMarketFlightNo(String marketFlightNo) {
        this.marketFlightNo = marketFlightNo;
    }

    /**
     * Getter method for property <tt>operateFlightNo</tt>.
     *
     * @return property value of operateFlightNo
     */
    public String getOperateFlightNo() {
        return operateFlightNo;
    }

    /**
     * Setter method for property <tt>operateFlightNo</tt>.
     *
     * @param operateFlightNo value to be assigned to property operateFlightNo
     */
    public void setOperateFlightNo(String operateFlightNo) {
        this.operateFlightNo = operateFlightNo;
    }

    /**
     * Getter method for property <tt>stopQuantity</tt>.
     *
     * @return property value of stopQuantity
     */
    public int getStopQuantity() {
        return stopQuantity;
    }

    /**
     * Setter method for property <tt>stopQuantity</tt>.
     *
     * @param stopQuantity value to be assigned to property stopQuantity
     */
    public void setStopQuantity(int stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    /**
     * Getter method for property <tt>aircraftStyle</tt>.
     *
     * @return property value of aircraftStyle
     */
    public String getAircraftStyle() {
        return aircraftStyle;
    }

    /**
     * Setter method for property <tt>aircraftStyle</tt>.
     *
     * @param aircraftStyle value to be assigned to property aircraftStyle
     */
    public void setAircraftStyle(String aircraftStyle) {
        this.aircraftStyle = aircraftStyle;
    }

    /**
     * Getter method for property <tt>codeShare</tt>.
     *
     * @return property value of codeShare
     */
    public StatusEnum getCodeShare() {
        return codeShare;
    }

    /**
     * Setter method for property <tt>codeShare</tt>.
     *
     * @param codeShare value to be assigned to property codeShare
     */
    public void setCodeShare(StatusEnum codeShare) {
        this.codeShare = codeShare;
    }

    /**
     * Getter method for property <tt>stopFlag</tt>.
     *
     * @return property value of stopFlag
     */
    public StatusEnum getStopFlag() {
        return stopFlag;
    }

    /**
     * Setter method for property <tt>stopFlag</tt>.
     *
     * @param stopFlag value to be assigned to property stopFlag
     */
    public void setStopFlag(StatusEnum stopFlag) {
        this.stopFlag = stopFlag;
    }

    /**
     * Getter method for property <tt>meal</tt>.
     *
     * @return property value of meal
     */
    public StatusEnum getMeal() {
        return meal;
    }

    /**
     * Setter method for property <tt>meal</tt>.
     *
     * @param meal value to be assigned to property meal
     */
    public void setMeal(StatusEnum meal) {
        this.meal = meal;
    }

    /**
     * Getter method for property <tt>duration</tt>.
     *
     * @return property value of duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Setter method for property <tt>duration</tt>.
     *
     * @param duration value to be assigned to property duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Getter method for property <tt>mileage</tt>.
     *
     * @return property value of mileage
     */
    public Long getMileage() {
        return mileage;
    }

    /**
     * Setter method for property <tt>mileage</tt>.
     *
     * @param mileage value to be assigned to property mileage
     */
    public void setMileage(Long mileage) {
        this.mileage = mileage;
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

    /**
     * Getter method for property <tt>stopList</tt>.
     *
     * @return property value of stopList
     */
    public List<StopVO> getStopList() {
        if (stopList == null) {
            stopList = Lists.newArrayList();
        }
        return stopList;
    }

    /**
     * Setter method for property <tt>stopList</tt>.
     *
     * @param stopList value to be assigned to property stopList
     */
    public void setStopList(List<StopVO> stopList) {
        this.stopList = stopList;
    }

    /**
     * Getter method for property <tt>fareList</tt>.
     *
     * @return property value of fareList
     */
    public List<FareVO> getFareList() {
        return fareList;
    }

    /**
     * Setter method for property <tt>fareList</tt>.
     *
     * @param fareList value to be assigned to property fareList
     */
    public void setFareList(List<FareVO> fareList) {
        this.fareList = fareList;
    }

    /**
     * Getter method for property <tt>rule</tt>.
     *
     * @return property value of rule
     */
    public RuleVO getRule() {
        return rule;
    }

    /**
     * Setter method for property <tt>rule</tt>.
     *
     * @param rule value to be assigned to property rule
     */
    public void setRule(RuleVO rule) {
        this.rule = rule;
    }

    /**
     * Getter method for property <tt>cabin</tt>.
     *
     * @return property value of cabin
     */
    public CabinVO getCabin() {
        return cabin;
    }

    /**
     * Setter method for property <tt>cabin</tt>.
     *
     * @param cabin value to be assigned to property cabin
     */
    public void setCabin(CabinVO cabin) {
        this.cabin = cabin;
    }

    /**
     * Getter method for property <tt>baseFare</tt>.
     *
     * @return property value of baseFare
     */
    public Money getBaseFare() {
        return baseFare;
    }

    /**
     * Setter method for property <tt>baseFare</tt>.
     *
     * @param baseFare value to be assigned to property baseFare
     */
    public void setBaseFare(Money baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Setter method for property <tt>extInfo</tt>.
     *
     * @param extInfo value to be assigned to property extInfo
     */
    public void setExtInfo(Map<String, Object> extInfo) {
        this.extInfo = extInfo;
    }

    /**
     * Getter method for property <tt>depAirportName</tt>.
     *
     * @return property value of depAirportName
     */
    public String getDepAirportName() {
        return depAirportName;
    }

    /**
     * Setter method for property <tt>depAirportName</tt>.
     *
     * @param depAirportName value to be assigned to property depAirportName
     */
    public void setDepAirportName(String depAirportName) {
        this.depAirportName = depAirportName;
    }

    /**
     * Getter method for property <tt>arrAirportName</tt>.
     *
     * @return property value of arrAirportName
     */
    public String getArrAirportName() {
        return arrAirportName;
    }

    /**
     * Setter method for property <tt>arrAirportName</tt>.
     *
     * @param arrAirportName value to be assigned to property arrAirportName
     */
    public void setArrAirportName(String arrAirportName) {
        this.arrAirportName = arrAirportName;
    }
    /**
     * 新增航段扩展属性
     *
     * @param key
     * @param value
     */
    public void addAttribute(String key, Object value) {
        if (MapUtils.isEmpty(extInfo)) {
            extInfo = Maps.newHashMap();
        }
        extInfo.put(key, value);
    }

    /**
     * 获取属性
     *
     * @param key
     * @return
     */
    public Object getAttribute(String key) {
        if (extInfo == null) {
            return null;
        }
        return extInfo.get(key);
    }

    public Map<String, Object> getExtInfo() {
        return extInfo;
    }

    @Override
    public int compareTo(SegmentVO o) {
        return this.getSegmentIndex() - o.getSegmentIndex();
    }
}