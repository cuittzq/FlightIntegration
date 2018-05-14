package com.tzq.service.ctrip.models.search;


import com.tzq.service.ctrip.models.BaseRequest;
import com.tzq.service.ctrip.models.enums.ChannelEnum;

public class SearchFlightReq extends BaseRequest {

    /**
     * 行程类型，1：单程；2：往返；3：多程（暂不支持）；
     */
    private String      tripType;
    /**
     * 出发地城市 IATA 三字码代码 【注意请求的是城市不是机场】
     * （如果为多程，会按照 PEK/HKG，HKG/SHA 格式请求，第一程为北京->香港，第二程为香港->上海）
     */
    private String      fromCity;
    /**
     * 目的地城市 IATA 三字码代码【注意请求的是城市不是机场】
     */
    private String      toCity;
    /**
     * 出发日期，格式为 YYYYMMDD
     */
    private String      fromDate;
    /**
     * 回程日期，格式为 YYYYMMDD（留空表示单程/多程）
     */
    private String      retDate;
    /**
     * 成⼈人数，1-9，供应商请按照实际请求出行人数返回相关运价数据【特别注意：查询请求是带人数的】
     */
    private int         adultNumber;
    /**
     * ⼉童人数，0-9（新上线供应商默认只开放成人，不开放多乘客类型）
     */
    private int         childNumber;
    /**
     * 婴儿人数，0-9
     */
    private int         infantNumber;
    /**
     * 搜索请求渠道来源：F：FlightIntlOnline；M：Mobile ; K:积分票(对于积分票的查询请求, 查询返回报文的productType务必赋值为JFP,否则过滤)
     * 1）若为F，要求在7S内返回结果；若为M，要求在5S内返回结果；
     * 2） 若查询超时，直接熔断。
     * 3）此字段非常重要，请务必注意
     */
    private ChannelEnum channel;

    /**
     * 标识供应商查询返回报文是否需要压缩
     * 1) 默认不压缩；如果为T，压缩编码；
     * 2）若需要压缩，请联系我们处理。
     */
    private String isCompressEncode;

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getRetDate() {
        return retDate;
    }

    public void setRetDate(String retDate) {
        this.retDate = retDate;
    }

    public int getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(int adultNumber) {
        this.adultNumber = adultNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getInfantNumber() {
        return infantNumber;
    }

    public void setInfantNumber(int infantNumber) {
        this.infantNumber = infantNumber;
    }

    public ChannelEnum getChannel() {
        return channel;
    }

    public void setChannel(ChannelEnum channel) {
        this.channel = channel;
    }
}
