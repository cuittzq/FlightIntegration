package com.tzq.commons.Exception;

import com.tzq.commons.enums.InterfaceErrorEnum;

/**
 * 功能描述 接口内部异常
 *
 * @Author tzq24955
 * @Created on 2018/6/6
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
public class InnerInterfaceException extends Exception {


    /**  */
    private static final long serialVersionUID = 1L;

    /**
     * 错误描述
     */
    private String message;

    /**
     * 错误消息对象
     */
    private InterfaceErrorEnum interfaceErrorEnum;

    /**
     * 构造方法
     *
     * @param error 错误实例
     */
    public InnerInterfaceException(InterfaceErrorEnum error) {
        super();
        setError(error);
    }

    /**
     * 构造方法
     *
     * @param error 错误实例
     * @param message
     */
    public InnerInterfaceException(InterfaceErrorEnum error, String message) {
        setError(error);
        appendMessage(message);
    }

    /**
     * 构造方法
     *
     * @param error 错误实例
     * @param cause 异常
     */
    public InnerInterfaceException(InterfaceErrorEnum error, Throwable cause) {
        setError(error);
    }

    /**
     * 获取该异常的错误消息
     *
     * @return 错误消息
     */
    public InterfaceErrorEnum getError() {
        return interfaceErrorEnum;
    }

    /**
     * 获取错误消息的错误码
     *
     * @return
     */
    public String getErrorCode() {
        return interfaceErrorEnum == null ? InterfaceErrorEnum.INNER_ERROR.name() : interfaceErrorEnum.name();
    }

    /**
     * @return
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 在原错误信息基础上，添加额外错误描述
     *
     * @param s
     */
    protected void appendMessage(String s) {
        message += s;
    }

    /**
     * 预处理消息
     *
     * @param s
     */
    protected void prependMessage(String s) {
        message = message + ". " + s;
    }

    /**
     * 设置异常的错误消息
     * <p>
     * 一般来说，一条错误消息针对资源文件中的一条配置记录
     * 错误码＝错误描述
     *
     * @param error 资源文件描述的错误消息
     */
    protected void setError(InterfaceErrorEnum error) {
        this.message = error.getDesc();
        this.interfaceErrorEnum = error;
    }

}
