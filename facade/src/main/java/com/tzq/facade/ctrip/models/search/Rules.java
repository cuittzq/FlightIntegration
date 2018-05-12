package com.tzq.facade.ctrip.models.search;

import java.util.List;

public class Rules {
    /**
     * formatBaggageInfoList : [{"segmentNo":1,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""},{"segmentNo":2,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""},{"segmentNo":3,"passengerType":0,"baggagePiece":1,"baggageWeight":15,"cnBaggage":"","enBaggage":""}]
     * refundInfoList : [{"passengerType":0,"refundType":0,"refundStatus":"H","refundFee":100,"currency":"CNY","refNoshow":"H","refNoShowCondition":2,"refNoshowFee":200,"cnRefRemark":"","enRefRemark":""},{"passengerType":0,"refundType":1,"refundStatus":"T","refundFee":"","currency":"CNY","refNoshow":"T","refNoShowCondition":0,"refNoshowFee":"","cnRefRemark":"","enRefRemark":""}]
     * changesInfoList : [{"passengerType":0,"changesType":0,"changesStatus":"T","changesFee":0,"currency":"CNY","revNoshow":"T","revNoShowCondition":2,"revNoshowFee":0,"cnRevRemark":"","enRevRemark":""},{"passengerType":0,"changesType":1,"changesStatus":"T","changesFee":0,"currency":"CNY","revNoshow":"T","revNoShowCondition":0,"revNoshowFee":0,"cnRevRemark":"","enRevRemark":""}]
     * serviceFee : {"revalidationFeeByCarrier ":100,"refundFeeByCarrier":100,"currency":"CNY"}
     * note : 不得升舱，不得累积里程
     * isUseCtripRule  : true
     * tariffNo  : 001
     * ruleNo  : WPEU
     */

    private ServiceFee serviceFee;
    private String note;
    private String isUseCtripRule;
    private String tariffNo;
    private String ruleNo;
    private List<FormatBaggages> formatBaggageInfoList;
    private List<RefundInfos> refundInfoList;
    private List<ChangesInfos> changesInfoList;

    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(ServiceFee serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getIsUseCtripRule() {
        return isUseCtripRule;
    }

    public void setIsUseCtripRule(String isUseCtripRule) {
        this.isUseCtripRule = isUseCtripRule;
    }

    public String getTariffNo() {
        return tariffNo;
    }

    public void setTariffNo(String tariffNo) {
        this.tariffNo = tariffNo;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public List<FormatBaggages> getFormatBaggageInfoList() {
        return formatBaggageInfoList;
    }

    public void setFormatBaggageInfoList(List<FormatBaggages> formatBaggageInfoList) {
        this.formatBaggageInfoList = formatBaggageInfoList;
    }

    public List<RefundInfos> getRefundInfoList() {
        return refundInfoList;
    }

    public void setRefundInfoList(List<RefundInfos> refundInfoList) {
        this.refundInfoList = refundInfoList;
    }

    public List<ChangesInfos> getChangesInfoList() {
        return changesInfoList;
    }

    public void setChangesInfoList(List<ChangesInfos> changesInfoList) {
        this.changesInfoList = changesInfoList;
    }
}
