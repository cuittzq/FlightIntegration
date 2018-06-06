/**
 * LTC.COM.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.tzq.commons.model.context;

import com.tzq.commons.enums.AreaTypeEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * 路由上下文
 *
 * @param <T> the type parameter
 * @author czj12867
 * @version $Id : RouteContext.java, v 0.1 2016年10月20日 下午6:56:51 czj12867 Exp $
 */
public class RouteContext<T> extends BaseContext implements Cloneable {

    /**
     * The Serial version uid.
     */
    private static final long serialVersionUID = 4322769621917365128L;

    /**
     * 具体参数
     */
    private T t;

    /**
     * 中间信息
     */
    private Map<String, Object> attribute = new HashMap<>();

    /**
     * 默认
     */
    public RouteContext() {

    }


    /**
     * Getter method for property <tt>t</tt>.
     *
     * @return property value of t
     */
    public T getT() {
        return t;
    }

    /**
     * Sets t.
     *
     * @param t the t
     * @return the t
     */
    @SuppressWarnings({"rawtypes"})
    public RouteContext setT(T t) {
        this.t = t;
        return this;
    }

    /**
     * Sets attribute.
     *
     * @param attribute the attribute
     * @return the attribute
     */
    @SuppressWarnings({"rawtypes"})
    public RouteContext setAttribute(Map<String, Object> attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * 取得属性
     *
     * @param key the key
     * @return attribute attribute
     */
    public Object getAttribute(String key) {
        if (attribute == null) {
            return null;
        }
        return attribute.get(key);
    }

    /**
     * 设置属性
     *
     * @param key the key
     * @param obj the obj
     * @return the attribute
     */
    @SuppressWarnings({"rawtypes"})
    public RouteContext setAttribute(String key, Object obj) {
        if (attribute == null) {
            attribute = new HashMap<>();
        }
        attribute.put(key, obj);
        return this;
    }

    /**
     * Getter method for property <tt>attribute</tt>.
     *
     * @return property value of attribute
     */
    public Map<String, Object> getAttribute() {
        return attribute;
    }

    /**
     * @return
     */
    public Object getValue(String key) {
        if (attribute == null) {
            attribute = new HashMap<>();
        }
        return attribute.get(key);
    }

    /**
     * remove
     *
     * @param key
     */
    public void remove(String key) {
        attribute.remove(key);
    }

    /**
     * Copy from.
     *
     * @param context the context
     * @return the route context
     */
    public <K> RouteContext<K> copyFrom(RouteContext<?> context) {
        RouteContext<K> t = new RouteContext<>();
        t.areaType = context.getAreaType();
        t.airlineCode = context.getAirlineCode();
        t.version = context.getVersion();
        t.traceId = context.getTraceId();
        t.memberId = context.getMemberId();
        t.memberName = context.getMemberName();
        t.attribute = context.getAttribute();
        return t;
    }

    /**
     * To string string.
     *
     * @return the string
     * @see Object#toString() java.lang.Object#toString()java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RouteContext [areaType=" + getAreaType() + ", airlineCode=" + getAirlineCode() + "version = " + getVersion()
                + ", memberName=" + getMemberName() + ", traceId=" + getTraceId() + "]" + (t == null ? "" : t.toString());
    }

    /**
     * Sets area type.
     *
     * @param areaType the area type
     * @return the area type
     */
    @SuppressWarnings("rawtypes")
    public RouteContext setAreaType(String areaType) {
        this.areaType = AreaTypeEnum.getEnumByCode(areaType);
        return this;
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public RouteContext<T> clone() {
        RouteContext<T> context = null;
        try {
            context = (RouteContext<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return context;
    }
}
