package com.tzq.commons.model.ctrip.verify;

import com.tzq.commons.model.ctrip.BaseResponse;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;
import com.tzq.commons.model.ctrip.search.RulesVO;

public class CtripVerifyResVO extends BaseResponse {
    /**
     * 会话标识：标记服务接口调用的唯一标识；
     * 数字或字母，长度小于 20个字符 。
     */
    private String sessionId;

    /**
     * int 可预订的座位数，最大为9；供应商需要确保下maxSeats不小于验价请求人数。
     */
    private int maxSeats;

    /**
     * 报价信息
     */
    private FlightRoutingsVO routing;

    /**
     * 退改签信息及行李额信息
     */
    private RulesVO rule;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
        this.routing = routing;
    }

    public RulesVO getRule() {
        return rule;
    }

    public void setRule(RulesVO rule) {
        this.rule = rule;
    }
}
