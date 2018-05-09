package com.tzq.biz.common.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public abstract class BaseVO<T extends Serializable> implements Identifiable<T> {

    /**  */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
