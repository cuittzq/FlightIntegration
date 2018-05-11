package com.tzq.integration.service.intl.lcc.model.verify;

import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyRes {
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
    private FlightRoutings routing;

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

    public FlightRoutings getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutings routing) {
        this.routing = routing;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"status\":").append(status);
        sb.append(",             \"msg\":\"").append(msg).append('\"');
        sb.append(",             \"sessionId\":\"").append(sessionId).append('\"');
        sb.append(",             \"maxSeats\":").append(maxSeats);
        sb.append(",             \"routing\":").append(routing);
        sb.append('}');
        return sb.toString();
    }
}
