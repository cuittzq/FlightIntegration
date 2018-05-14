package com.tzq.commons.model.integration.verify;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyResVO implements Serializable {
    private static final long serialVersionUID = -3500211036487819181L;
    /**
     * 结果类型: 0 成功 / 其他 失败
     */
    private int    status;
    /**
     * 提示信息，长度小于64个字符
     */
    private String msg;

    /**
     * sessionId
     */
    private String sessionId;

    /**
     * 最大舱位数
     */
    private Integer maxSeats;

    /**
     * 航线价格信息
     */
    private VerifyRoutingVO routing;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public VerifyRoutingVO getRouting() {
        return routing;
    }

    public void setRouting(VerifyRoutingVO routing) {
        this.routing = routing;
    }
}
