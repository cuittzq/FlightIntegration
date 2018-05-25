package com.tzq.service.ctrip.models;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/14
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class SingleResult<T> extends BaseResult {
    private static final long serialVersionUID = 4101179590769575819L;
    private T data;

    public SingleResult() {
    }

    public SingleResult(T data) {
        this.data = data;
    }

    public SingleResult(T data, String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
        this.data = data;
    }

    public SingleResult(T data, boolean success, String errorCode, String errorMessage) {
        super(success, errorCode, errorMessage);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String        str = super.toString();
        StringBuilder sb  = new StringBuilder();
        sb.append(str).append(",").append(this.data);
        return sb.toString();
    }
}
