package com.tzq.service.ctrip.models.search;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class FlightRoutingsDTO implements Serializable {
    private static final long serialVersionUID = 4648720182385388979L;
    /**
     * 可保存必要信息，验价时会放在请求报文中传给供应商；最大 1000 个字符
     */
    private String data;
    /**
     * 【公布运价强校验】成人公布价（以CNY为单位），不含税
     */
    private int publishPrice;
    /**
     * 成人单价，不含税
     */
    private int adultPrice;
    /**
     * 成人税费【注意不能是0，若存在为0的情况，请与我们联系】
     */
    private int adultTax;
    /**
     * 儿童公布价，不含税
     */
    private int childPublishPrice;
    /**
     * 儿童单价，不含税【对于含儿童的查询，必须返回】
     */
    private int childPrice;
    /**
     * 儿童税费
     * 1）对于含儿童的查询，必须返回；
     * 2）不能是0，若存在为0的情况，请与我们联系。
     */
    private int childTax;
    /**
     * 婴儿公布价
     */
    private int infantPublishPrice;
    /**
     * 婴儿单价，不含税【对于含婴儿的查询，必须返回】
     */
    private int infantPrice;
    /**
     * 婴儿税费
     * 1）对于含婴儿的查询，必须返回；
     * 2）可以为0。
     */
    private int infantTax;
    /**
     * 成人税费类型：0 未含税 / 1 已含税 【正常赋0，如赋1请提前告知】
     */
    private int adultTaxType;
    /**
     * 儿童税费类型：0 未含税 / 1 已含税 【正常赋0，如赋1请提前告知】
     */
    private int childTaxType;
    /**
     * 报价类型：0 普通价 / 1 留学生价 【请全部赋0】
     */
    private int priceType = 0;
    /**
     * 报价类型：0 预定价 / 1 申请价 【请全部赋0】
     */
    private int applyType = 0;
    /**
     * 【公布运价强校验】汇率
     */
    private BigDecimal exchange;
    /**
     * 适用年龄区间【如要使用此字段请提前通知我们，盲目使用会影响价格展示】
     * 1）使用“-”表示“至”，例如*-12，表示12岁及以下；
     * 2）置空表示无限制
     */
    private String adultAgeRestriction;
    /**
     * 【公布运价强校验】
     * 1）旅客资质，标准三字码：
     * 	NOR：普通成人
     * 	LAB：劳务人员
     * 	SEA：海员
     * 	SNR：老年人
     * 	STU：学生
     * 	YOU：青年
     * 2）如果投放非NOR的政策，请提前告知我们。
     */
    private String eligibility;
    /**
     * 允许国籍，使用标准国家二字码
     * 【如要使用此字段请提前通知我们，盲目使用会影响价格展示】
     * 1）置空表示无限制（一般都是置空的）；
     * 2）若多个使用“/”分割；
     * 3）与forbiddenNationality只能2选1，若同时出现，为非法数据，将被过滤。
     */
    private String nationality;
    /**
     * 禁用国籍，使用标准国家二字码
     * 【如要使用此字段请提前通知我们，盲目使用会影响价格展示】
     * 1）置空表示无限制（一般都是置空的）；
     * 2）若多个使用“/”分割；
     * 3）与nationality只能2选1，若同时出现，为非法数据，将被过滤。
     */
    private String forbiddenNationality;
    /**
     * 公布运价强校验】
     * 产品类型：0 旅行套餐 /1 商务优选/2 特惠推荐
     * 新上线供应商请赋值为0
     */
    private int planCategory;
    /**
     * 报销凭证：T 行程单 / F 发票 / E 电子发票
     * 默认发票；廉航票台可赋值为E
     */
    private String invoiceType;

    /**
     * 最短停留时间【单位是天】【如要使用此字段请提前通知我们，盲目使用会影响价格展示】
     */
    private String minStay;
    /**
     * 最长停留时间【单位是天】【如要使用此字段请提前通知我们，盲目使用会影响价格展示】
     */
    private String maxStay;
    /**
     * 最小出行人数【无返回，默认为1】
     * 【小团政策最小出行人数，出退改，同进同退】
     * 【同进同退的标签仅限允许退改的机票】
     */
    private int minPassengerCount;
    /**
     * 最大出行人数【无返回，默认为9】
     */
    private int maxPassengerCount;
    /**
     * 订位Office号【可为空】
     */
    private String bookingOfficeNo;
    /**
     * 出票Office号【可为空】
     */
    private String ticketingOfficeNo;
    /**
     * 【公布运价强校验】出票航司
     * 1）整个行程只能赋一个航司；
     * 2）如不赋值会取行程第一航段的carrier作为出票航司；
     * 3）此字段非常重要，请务必准确赋值。
     */
    private String validatingCarrier;
    /**
     * 【公布运价强校验】政策来源
     * 1）非公布运价此字段可不赋值；
     * 2）公布运价此字段必须按要求返回，否则产品将按照未知订座系统，输出到旅行套餐；
     * 3）使用IATA标准2字代码
     * 	1E：TravelSky
     * 	1A：Amadeus
     * 	1B：Abacus
     * 	1S：Sabre
     * 	1P：WorldSpan
     * 	1G：Galileo
     * OT：未知订座系统来源
     */
    private String reservationType;
    /**
     * 【公布运价强校验】运价类型
     * 1）公布运价请赋值为：PUB：公布运价；
     * 2）控位产品请务必赋值为：KWP
     * 3 ) 积分票产品请务必赋值为：JFP(只有在积分票查询请求时,返回积分票产品才有意义)
     */
    private String productType;
    /**
     * 【公布运价强校验】
     * 每航段1个，使用“ ; ”分割
     */
    private String fareBasis;
    /**
     * 增值服务信息
     */
    private AirlineAncillariesDTO airlineAncillaries;
    /**
     *
     */
    private RulesDTO rule;
    /**
     * 去程航段
     */
    private List<SegmentDTO> fromSegments;
    /**
     * 回程航段
     */
    private List<SegmentDTO> retSegments;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPublishPrice() {
        return publishPrice;
    }

    public void setPublishPrice(int publishPrice) {
        this.publishPrice = publishPrice;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    public int getAdultTax() {
        return adultTax;
    }

    public void setAdultTax(int adultTax) {
        this.adultTax = adultTax;
    }

    public int getChildPublishPrice() {
        return childPublishPrice;
    }

    public void setChildPublishPrice(int childPublishPrice) {
        this.childPublishPrice = childPublishPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public int getChildTax() {
        return childTax;
    }

    public void setChildTax(int childTax) {
        this.childTax = childTax;
    }

    public int getInfantPublishPrice() {
        return infantPublishPrice;
    }

    public void setInfantPublishPrice(int infantPublishPrice) {
        this.infantPublishPrice = infantPublishPrice;
    }

    public int getInfantPrice() {
        return infantPrice;
    }

    public void setInfantPrice(int infantPrice) {
        this.infantPrice = infantPrice;
    }

    public int getInfantTax() {
        return infantTax;
    }

    public void setInfantTax(int infantTax) {
        this.infantTax = infantTax;
    }

    public int getAdultTaxType() {
        return adultTaxType;
    }

    public void setAdultTaxType(int adultTaxType) {
        this.adultTaxType = adultTaxType;
    }

    public int getChildTaxType() {
        return childTaxType;
    }

    public void setChildTaxType(int childTaxType) {
        this.childTaxType = childTaxType;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public int getApplyType() {
        return applyType;
    }

    public void setApplyType(int applyType) {
        this.applyType = applyType;
    }

    public BigDecimal getExchange() {
        return exchange;
    }

    public void setExchange(BigDecimal exchange) {
        this.exchange = exchange;
    }

    public String getAdultAgeRestriction() {
        return adultAgeRestriction;
    }

    public void setAdultAgeRestriction(String adultAgeRestriction) {
        this.adultAgeRestriction = adultAgeRestriction;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getForbiddenNationality() {
        return forbiddenNationality;
    }

    public void setForbiddenNationality(String forbiddenNationality) {
        this.forbiddenNationality = forbiddenNationality;
    }

    public int getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(int planCategory) {
        this.planCategory = planCategory;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getMinStay() {
        return minStay;
    }

    public void setMinStay(String minStay) {
        this.minStay = minStay;
    }

    public String getMaxStay() {
        return maxStay;
    }

    public void setMaxStay(String maxStay) {
        this.maxStay = maxStay;
    }

    public int getMinPassengerCount() {
        return minPassengerCount;
    }

    public void setMinPassengerCount(int minPassengerCount) {
        this.minPassengerCount = minPassengerCount;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount) {
        this.maxPassengerCount = maxPassengerCount;
    }

    public String getBookingOfficeNo() {
        return bookingOfficeNo;
    }

    public void setBookingOfficeNo(String bookingOfficeNo) {
        this.bookingOfficeNo = bookingOfficeNo;
    }

    public String getTicketingOfficeNo() {
        return ticketingOfficeNo;
    }

    public void setTicketingOfficeNo(String ticketingOfficeNo) {
        this.ticketingOfficeNo = ticketingOfficeNo;
    }

    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public AirlineAncillariesDTO getAirlineAncillaries() {
        return airlineAncillaries;
    }

    public void setAirlineAncillaries(AirlineAncillariesDTO airlineAncillaries) {
        this.airlineAncillaries = airlineAncillaries;
    }

    public RulesDTO getRule() {
        return rule;
    }

    public void setRule(RulesDTO rule) {
        this.rule = rule;
    }

    public List<SegmentDTO> getFromSegments() {
        return fromSegments;
    }

    public void setFromSegments(List<SegmentDTO> fromSegments) {
        this.fromSegments = fromSegments;
    }

    public List<SegmentDTO> getRetSegments() {
        return retSegments;
    }

    public void setRetSegments(List<SegmentDTO> retSegments) {
        this.retSegments = retSegments;
    }
}
