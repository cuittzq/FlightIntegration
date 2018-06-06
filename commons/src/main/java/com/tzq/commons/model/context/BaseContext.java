
package com.tzq.commons.model.context;

import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;
import com.tzq.commons.enums.PurchaseEnum;

import java.io.Serializable;

/**
 * 上下文基本属性
 *
 * @version $Id : BaseContext.java, v 0.1 2016年10月20日 下午6:47:00 czj12867 Exp $
 */
public class BaseContext implements Serializable {

    /**
     * The Serial version uid.
     */
    private static final long serialVersionUID = -1758869306422443436L;

    /**
     * 国内国际区分
     */
    protected AreaTypeEnum areaType;

    /**
     * 航司二字码
     */
    protected String airlineCode;

    /**
     * ota
     */
    protected OTAEnum ota;


    /**
     * 供应商
     */
    protected PurchaseEnum purchaseEnum;

    /**
     * 接口版本
     */
    protected String version;

    /**
     * 会员Id
     */
    protected String memberId;

    /**
     * 会员姓名
     */
    protected String memberName;

    /**
     * 跟踪ID
     */
    protected String traceId;

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


    public AreaTypeEnum getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaTypeEnum areaType) {
        this.areaType = areaType;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public OTAEnum getOta() {
        return ota;
    }

    public void setOta(OTAEnum ota) {
        this.ota = ota;
    }

    public PurchaseEnum getPurchaseEnum() {
        return purchaseEnum;
    }

    public void setPurchaseEnum(PurchaseEnum purchaseEnum) {
        this.purchaseEnum = purchaseEnum;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
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
}
