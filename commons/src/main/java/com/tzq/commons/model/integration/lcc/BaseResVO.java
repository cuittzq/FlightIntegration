package com.tzq.commons.model.integration.lcc;

import java.io.Serializable;

/**
 * Created by cl24957 on 2018/5/15.
 */
public class BaseResVO implements Serializable {
    private static final long serialVersionUID = 4212486965062815575L;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("            \"status\":").append(status);
        sb.append(",             \"msg\":\"").append(msg).append('\"');
        sb.append(",             \"sessionId\":\"").append(sessionId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
