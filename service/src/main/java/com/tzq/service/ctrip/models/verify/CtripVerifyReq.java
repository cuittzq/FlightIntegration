package com.tzq.service.ctrip.models.verify;

import com.tzq.service.ctrip.models.BaseRequest;
import com.tzq.service.ctrip.models.search.FlightRoutingsDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class CtripVerifyReq extends BaseRequest implements Serializable {
    private static final long serialVersionUID = -7162051538785743662L;
    /**
     * 携程关联ID；携程用来查问题用的。
     */
    private String referenceId;
    /**
     * 行程类型，1：单程；2：往返；3：多程。
     */
    private int tripType;
    /**
     * 请求类型，全部为1：验价
     */
    private String requesttype;
    /**
     * 成⼈人数，1-9
     */
    private int adultNumber;
    /**
     * ⼉童⼈数，0-9
     */
    private int childNumber;
    /**
     * 婴儿人数，0-9
     */
    private int infantNumber;
    /**
     * 报价信息，参考搜索返回结果中的 Routing Elements。 1）只含航班信息,航班信息不含经停城市/机场，机型；
     * 2）不含价格信息、退改签信息、行李额信息等。
     */
    private FlightRoutingsDTO routings;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @Size(max = 3,min = 1,message = "行程类型错误 1：单程 2：返程")
    public int getTripType() {
        return tripType;
    }

    public void setTripType(int tripType) {
        this.tripType = tripType;
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype;
    }

    public int getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(int adultNumber) {
        this.adultNumber = adultNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getInfantNumber() {
        return infantNumber;
    }

    public void setInfantNumber(Integer infantNumber) {
        this.infantNumber = infantNumber;
    }

    @NotNull(message="航线不能为空")
    public FlightRoutingsDTO getRoutings() {
        return routings;
    }

    public void setRoutings(FlightRoutingsDTO routings) {
        this.routings = routings;
    }
}
