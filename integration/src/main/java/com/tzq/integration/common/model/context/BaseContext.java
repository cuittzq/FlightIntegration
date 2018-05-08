
package com.tzq.integration.common.model.context;

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
    protected String          areaType;

    /**
     * 航司二字码
     */
    protected String          airlineCode;

    /**
     * 航司或者供应商ID
     */
    protected String          sourceId;

    /**
     * 接口版本
     */
    protected String          version;

    /**
     * 会员Id
     */
    protected String          memberId;

    /**
     * 会员姓名
     */
    protected String          memberName;

    /** 跟踪ID */
    protected String          traceId;

    /**
     * Gets area type.
     *
     * @return the area type
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * Gets airline code.
     *
     * @return the airline code
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Gets member id.
     *
     * @return the member id
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Gets member name.
     *
     * @return the member name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Getter method for property <tt>traceId</tt>.
     * 
     * @return property value of traceId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Setter method for property <tt>traceId</tt>.
     * 
     * @param traceId value to be assigned to property traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

}
