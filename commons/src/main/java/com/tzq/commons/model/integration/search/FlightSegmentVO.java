package com.tzq.commons.model.integration.search;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class FlightSegmentVO {

    /**
     * 航司 IATA 二字码，必须与 flightNumber 航司相同
     */
    private String carrier;
    /**
     * 航班号，如：123
     */
    private String flightNumber;
    /**
     * 出发机场 IATA 三字码
     */
    private String depAirport;
    /**
     * 起飞日期时间，格式：YYYYMMDDHHMM 例：201203100300 表示 2012 年 3 月 10 日 3 时 0 分
     */
    private String depTime;
    /**
     * 到达机场 IATA 三字码
     */
    private String arrAirport;
    /**
     * 抵达日期时间，格式：YYYYMMDDHHMM 例：201203101305 表示 2012 年 3 月 10 日 13 时 5 分
     */
    private String arrTime;

    /**
     * 经停地，/分隔城市三字码 （非必须）
     */
    private String  stopCities;
    /**
     * 代码共享标识（true 代码共享/false 非代码共享）
     */
    private boolean codeShare;

    /**
     * 共享航班号（非必须，codeShare为true时请提供）
     */
    private String sharingFlightNumber;
    /**
     * 出发航站楼（非必须）
     */
    private String departureTerminal;
    /**
     * 到达航站楼（非必须）
     */
    private String arrivingTerminal;
    /**
     * 舱位
     */
    private String cabin;
    /**
     * 机型
     */
    private String aircraftCode;
    /**
     * 舱位数
     */
    private int    seatCount;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getStopCities() {
        return stopCities;
    }

    public void setStopCities(String stopCities) {
        this.stopCities = stopCities;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }

    public String getSharingFlightNumber() {
        return sharingFlightNumber;
    }

    public void setSharingFlightNumber(String sharingFlightNumber) {
        this.sharingFlightNumber = sharingFlightNumber;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(String departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public String getArrivingTerminal() {
        return arrivingTerminal;
    }

    public void setArrivingTerminal(String arrivingTerminal) {
        this.arrivingTerminal = arrivingTerminal;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"carrier\":\"").append(carrier).append('\"');
        sb.append(",             \"flightNumber\":\"").append(flightNumber).append('\"');
        sb.append(",             \"depAirport\":\"").append(depAirport).append('\"');
        sb.append(",             \"depTime\":\"").append(depTime).append('\"');
        sb.append(",             \"arrAirport\":\"").append(arrAirport).append('\"');
        sb.append(",             \"arrTime\":\"").append(arrTime).append('\"');
        sb.append(",             \"stopCities\":\"").append(stopCities).append('\"');
        sb.append(",             \"codeShare\":").append(codeShare);
        sb.append(",             \"sharingFlightNumber\":\"").append(sharingFlightNumber).append('\"');
        sb.append(",             \"departureTerminal\":\"").append(departureTerminal).append('\"');
        sb.append(",             \"arrivingTerminal\":\"").append(arrivingTerminal).append('\"');
        sb.append(",             \"cabin\":\"").append(cabin).append('\"');
        sb.append(",             \"aircraftCode\":\"").append(aircraftCode).append('\"');
        sb.append(",             \"seatCount\":").append(seatCount);
        sb.append('}');
        return sb.toString();
    }
}
