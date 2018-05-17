package com.tzq.service.ctrip.models.search;

import java.util.List;

public class RulesDTO {
    /**
     * 【已弃用】服务费规定
     */
    private ServiceFeeDTO serviceFee;
    /**
     * 备注信息，最大 300 个字符
     */
    private String note;
    /**
     * 是否要使用携程退改签：（true 使用；false 不使用）
     */
    private boolean isUseCtripRule;
    /**
     * 公布运价相关参数，地理区间见运价集群编码
     */
    private String tariffNo;
    /**
     * 公布运价相关参数
     */
    private String ruleNo;
    /**
     * 格式化行李额规定
     */
    private List<FormatBaggagesDTO> formatBaggageInfoList;
    /**
     * 退票规定
     */
    private List<RefundInfosDTO> refundInfoList;
    /**
     * 改期规定
     */
    private List<ChangesInfosDTO> changesInfoList;

    public ServiceFeeDTO getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(ServiceFeeDTO serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isUseCtripRule() {
        return isUseCtripRule;
    }

    public void setUseCtripRule(boolean useCtripRule) {
        isUseCtripRule = useCtripRule;
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
