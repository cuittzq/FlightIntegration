package com.tzq.commons.model.ctrip;

public class BaseRequest {
    /**
     * 接口身份标识用户名（渠道唯一标识）
     */
    private String cid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
