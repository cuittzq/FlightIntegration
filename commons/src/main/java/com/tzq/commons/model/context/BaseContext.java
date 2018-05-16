
package com.tzq.commons.model.context;

import com.tzq.commons.enums.AreaTypeEnum;
import com.tzq.commons.enums.OTAEnum;

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
     * 航司或者供应商ID
     */
    protected String sourceId;

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

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
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
}
