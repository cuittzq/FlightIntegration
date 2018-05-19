package com.tzq.service.ctrip.models.verify;

import com.tzq.service.ctrip.models.BaseResponse;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;
import com.tzq.service.ctrip.models.search.RulesDTO;

public class CtripVerifyRes extends BaseResponse {
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
    private FlightRoutingsDTO routing;

    /**
     * 退改签信息及行李额信息
     */
    private RulesDTO rule;

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

    public FlightRoutingsDTO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsDTO routing) {
        this.routing = routing;
    }

    public RulesDTO getRule() {
        return rule;
    }

    public void setRule(RulesDTO rule) {
        this.rule = rule;
    }
}
