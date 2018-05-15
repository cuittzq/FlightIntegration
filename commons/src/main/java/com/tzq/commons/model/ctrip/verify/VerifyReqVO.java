package com.tzq.commons.model.ctrip.verify;

import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.ctrip.search.FlightRoutingsVO;

public class VerifyReqVO {
    /**
     * 携程关联ID；携程用来查问题用的。
     */
    private String referenceId;
    /**
     * 行程类型，1：单程；2：往返；3：多程。
     */
    private TripTypeEnum tripType;
    /**
     * 请求类型，全部为1：验价
     */
    private String requesttype;
    /**
     * 成⼈人数，1-9
     */
    private Integer adultNumber;
    /**
     * ⼉童⼈数，0-9
     */
    private Integer childNumber;
    /**
     * 婴儿人数，0-9
     */
    private Integer infantNumber;
    /**
     * 报价信息，参考搜索返回结果中的 Routing Elements。 1）只含航班信息,航班信息不含经停城市/机场，机型；
     * 2）不含价格信息、退改签信息、行李额信息等。
     */
    private FlightRoutingsVO routing;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public TripTypeEnum getTripType() {
        return tripType;
    }

    public void setTripType(TripTypeEnum tripType) {
        this.tripType = tripType;
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype;
    }

    public Integer getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(Integer adultNumber) {
        this.adultNumber = adultNumber;
    }

    public Integer getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(Integer childNumber) {
        this.childNumber = childNumber;
    }

    public Integer getInfantNumber() {
        return infantNumber;
    }

    public void setInfantNumber(Integer infantNumber) {
        this.infantNumber = infantNumber;
    }

    public FlightRoutingsVO getRouting() {
        return routing;
    }

    public void setRouting(FlightRoutingsVO routing) {
        this.routing = routing;
    }
}
