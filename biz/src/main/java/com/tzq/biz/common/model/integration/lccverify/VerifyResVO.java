package com.tzq.biz.common.model.integration.lccverify;

import com.tzq.biz.common.model.integration.FlightRouteVO;
import com.tzq.biz.common.model.integration.FlightUnitVO;
import com.tzq.biz.common.model.integration.SegmentVO;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.search.Rules;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyResVO implements Serializable {
    private static final long serialVersionUID = -3500211036487819181L;
    /**
       结果类型: 0 成功 / 其他 失败
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
    private VerifyResRouting routing;

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

    public VerifyResRouting getRouting() {
        return routing;
    }

    public void setRouting(VerifyResRouting routing) {
        this.routing = routing;
    }


    public  static class VerifyResRouting
    {
        /**
         * 可保存必要信息，之后生单按原值回转。最大 1000 个字符
         */
        private String              data;
        /**
         * 成人单价（以元为单位）
         */
        private int                 adultPrice;
        /**
         * 成人税费（以元为单位）
         */
        private int                 adultTax;
        /**
         * 儿童单价（以元为单位）
         */
        private int                 childPrice;
        /**
         * 儿童税费（以元为单位）
         */
        private int                 childTax;
        /**
         * 报价类型：0 普通价 / 1 留学生价
         */
        private int                 priceType;
        /**
         * 报价类型：0 预定价 / 1 申请价
         */
        private int                 applyType;
        /**
         * 成人税费类型：0 未含税 / 1 已含税
         */
        private int                 adultTaxType;
        /**
         * 儿童税费类型：0 未含税 / 1 已含税
         */
        private int                 childTaxType;
        /**
         * 退改签信息
         */
        private Rules rule;
        /**
         * 参考信息，对查询请求的简化描述
         */
        private String              refData;
        /**
         * 去程航段按顺序
         */
        private List<SegmentVO> fromSegments;
        /**
         * 回程航段按顺序
         */
        private List<SegmentVO> retSegments;

    }
}
