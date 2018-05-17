package com.tzq.commons.model.ctrip.search;

public class SegmentVO {
    /**
     * 航司 IATA 二字码，必须与 flightNumber 航司相同
     */
    private String carrier;
    /**
     * 出发机场；IATA 三字码
     */
    private String depAirport;
    /**
     * 起飞日期时间，格式：YYYYMMDDHHMM  例：201203100300 表示 2012 年 3 月 10 日 3 时 0 分
     */
    private String depTime;
    /**
     * 到达机场 IATA 三字码
     */
    private String arrAirport;
    /**
     * 到达日期时间，格式：YYYYMMDDHHMM
     */
    private String arrTime;
    /**
     * 经停机场； IATA 三字码
     */
    private String stopAirports;
    /**
     * 代码共享标识（true 代码共享/false 非代码共享）
     */
    private boolean codeShare;
    /**
     * 子舱位
     */
    private String cabin;
    /**
     * 机型 ，IATA标准3字码,并过滤下列机型运价信息BUS|ICE|LCH|LMO|MTL|RFS|TGV|THS|THT|TRN|TSL|
     */
    private String aircraftCode;
    /**
     * 航班号，如：CA123。
     * 航班号数字前若有多余的数字 0，必须去掉；如 CZ006 需返回 CZ6
     */
    private String flightNumber;
    /**
     * 实际承运航司
     */
    private String operatingCarrier;
    /**
     * 实际承运航班号
     */
    private String operatingFlightNo;
    /**
     * 出发航站楼；使用简写，例如T1
     */
    private String depTerminal;
    /**
     *
     */
    private String arrTerminal;
    /**
     * 舱等；
     * 头等：F；商务：C；超经：S；经济：Y【目前仅支持返回Y】
     */
    private String cabinGrade;
    /**
     * 飞行时长；
     * 单位为分钟，通过时差转换后的结果
     */
    private int duration;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
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

    public String getStopAirports() {
        return stopAirports;
    }

    public void setStopAirports(String stopAirports) {
        this.stopAirports = stopAirports;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
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

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public String getOperatingFlightNo() {
        return operatingFlightNo;
    }

    public void setOperatingFlightNo(String operatingFlightNo) {
        this.operatingFlightNo = operatingFlightNo;
    }

    public String getDepTerminal() {
        return depTerminal;
    }

    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    public String getArrTerminal() {
        return arrTerminal;
    }

    public void setArrTerminal(String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }

    public String getCabinGrade() {
        return cabinGrade;
    }

    public void setCabinGrade(String cabinGrade) {
        this.cabinGrade = cabinGrade;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
