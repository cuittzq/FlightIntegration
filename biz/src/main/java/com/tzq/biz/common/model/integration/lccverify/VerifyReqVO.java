package com.tzq.biz.common.model.integration.lccverify;

import com.tzq.biz.common.enums.SegmentTypeEnum;
import com.tzq.biz.common.model.integration.SegmentVO;

import java.util.List;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class VerifyReqVO  {
    /**
     * 行程类型
     */
    private SegmentTypeEnum tripType;

    /**
     * 验舱验价routing类
     */
    private VerifyReqVORouting routing;

    public SegmentTypeEnum getTripType() {
        return tripType;
    }

    public void setTripType(SegmentTypeEnum tripType) {
        this.tripType = tripType;
    }

    public VerifyReqVORouting getRouting() {
        return routing;
    }

    public void setRouting(VerifyReqVORouting routing) {
        this.routing = routing;
    }

    public static class VerifyReqVORouting
    {
        private String data;
        private List<SegmentVO> fromSegments;
        private List<SegmentVO> retSegments;
        private String refData;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public List<SegmentVO> getFromSegments() {
            return fromSegments;
        }

        public void setFromSegments(List<SegmentVO> fromSegments) {
            this.fromSegments = fromSegments;
        }

        public List<SegmentVO> getRetSegments() {
            return retSegments;
        }

        public void setRetSegments(List<SegmentVO> retSegments) {
            this.retSegments = retSegments;
        }

        public String getRefData() {
            return refData;
        }

        public void setRefData(String refData) {
            this.refData = refData;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("{");
            sb.append("            \"data\":\"").append(data).append('\"');
            sb.append(",             \"fromSegments\":").append(fromSegments);
            sb.append(",             \"retSegments\":").append(retSegments);
            sb.append(",             \"refData\":\"").append(refData).append('\"');
            sb.append('}');
            return sb.toString();
        }
    }
}
