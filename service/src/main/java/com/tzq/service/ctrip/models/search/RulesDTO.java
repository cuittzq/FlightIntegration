package com.tzq.service.ctrip.models.search;

import java.util.List;

public class RulesDTO {
    /**
     * formatBaggageInfoList : [{"segmentNo":1,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""},{"segmentNo":2,"passengerType":0,"baggagePiece":1,"baggageWeight":23,"cnBaggage":"","enBaggage":""},{"segmentNo":3,"passengerType":0,"baggagePiece":1,"baggageWeight":15,"cnBaggage":"","enBaggage":""}]
     * refundInfoList : [{"passengerType":0,"refundType":0,"refundStatus":"H","refundFee":100,"currency":"CNY","refNoshow":"H","refNoShowCondition":2,"refNoshowFee":200,"cnRefRemark":"","enRefRemark":""},{"passengerType":0,"refundType":1,"refundStatus":"T","refundFee":"","currency":"CNY","refNoshow":"T","refNoShowCondition":0,"refNoshowFee":"","cnRefRemark":"","enRefRemark":""}]
     * changesInfoList : [{"passengerType":0,"changesType":0,"changesStatus":"T","changesFee":0,"currency":"CNY","revNoshow":"T","revNoShowCondition":2,"revNoshowFee":0,"cnRevRemark":"","enRevRemark":""},{"passengerType":0,"changesType":1,"changesStatus":"T","changesFee":0,"currency":"CNY","revNoshow":"T","revNoShowCondition":0,"revNoshowFee":0,"cnRevRemark":"","enRevRemark":""}]
     * serviceFeeDTO : {"revalidationFeeByCarrier ":100,"refundFeeByCarrier":100,"currency":"CNY"}
     * note : 不得升舱，不得累积里程
     * isUseCtripRule  : true
     * tariffNo  : 001
     * ruleNo  : WPEU
     */

    private ServiceFeeDTO           serviceFeeDTO;
    private String                  note;
    private String                  isUseCtripRule;
    private String                  tariffNo;
    private String                  ruleNo;
    private List<FormatBaggagesDTO> formatBaggageInfoList;
    private List<RefundInfosDTO>    refundInfoList;
    private List<ChangesInfosDTO>   changesInfoList;

    public ServiceFeeDTO getServiceFeeDTO() {
        return serviceFeeDTO;
    }

    public void setServiceFeeDTO(ServiceFeeDTO serviceFeeDTO) {
        this.serviceFeeDTO = serviceFeeDTO;
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

    public List<FormatBaggagesDTO> getFormatBaggageInfoList() {
        return formatBaggageInfoList;
    }

    public void setFormatBaggageInfoList(List<FormatBaggagesDTO> formatBaggageInfoList) {
        this.formatBaggageInfoList = formatBaggageInfoList;
    }

    public List<RefundInfosDTO> getRefundInfoList() {
        return refundInfoList;
    }

    public void setRefundInfoList(List<RefundInfosDTO> refundInfoList) {
        this.refundInfoList = refundInfoList;
    }

    public List<ChangesInfosDTO> getChangesInfoList() {
        return changesInfoList;
    }

    public void setChangesInfoList(List<ChangesInfosDTO> changesInfoList) {
        this.changesInfoList = changesInfoList;
    }
}
