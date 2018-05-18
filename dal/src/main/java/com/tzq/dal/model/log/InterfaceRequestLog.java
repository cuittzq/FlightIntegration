package com.tzq.dal.model.log;

import java.util.Date;

public class InterfaceRequestLog {
    private Long id;

    /**
     * 销售平台
     */
    private Integer salesplatform;

    /**
     * 采购平台
     */
    private Integer purchaseplatform;

    /**
     * 请求日期
     */
    private Date requestdate;

    /**
     * 请求类型(Search-查询 / Verify-校验 / Order-创单 / PayCheck-支付校验 / OutTicket-出票)
     */
    private String requesttype;

    /**
     * 请求结果（接口请求的结果）(0-成功 / 1-失败)
     */
    private Integer requestresult;

    /**
     * 接口结果（接口返回结果）(0-成功 / 1-失败 / 2-CID错误 / 3-非法IP / 4-操作失败 / 5-请求参数错误 / 6-程序异常 / 7-航线管控 / 8-航司过滤 / 9-配置未找到 / 10-访问超时 / 11-访问频繁 / 12-不在销售时间范围内 / 13-不在工作时间范围内 / 14-价格变动 / 15-无座 / 16-不可预订)
     */
    private Integer interfaceresult;

    /**
     * 航司
     */
    private String carrier;

    /**
     * 出发地
     */
    private String depcode;

    /**
     * 到达地
     */
    private String arrcode;

    /**
     * 出发日期
     */
    private Date depdate;

    /**
     * 返程日期
     */
    private Date backdate;

    /**
     * 航程类型：0-单程，1-往返
     */
    private Integer voyagetype;

    /**
     * 销售平台请求时间
     */
    private Date salesplatrequesttime;

    /**
     * 销售平台响应时间
     */
    private Date salesplatresponsetime;

    /**
     * 采购平台请求时间
     */
    private Date purchaseplatrequesttime;

    /**
     * 采购平响应时间
     */
    private Date purchaseplatresponsetime;

    /**
     * 销售平台请求IP
     */
    private String salesplatrequestip;

    /**
     * 采购平台请求IP
     */
    private String purchaseplatrequestip;

    /**
     * 销售平台请求提示消息
     */
    private String salesplatrequesttipmessage;

    /**
     * 采购平台请求提示消息
     */
    private String purchaseplatrequesttipmessage;

    /**
     * 销售平台日志详细（JSON）
     */
    private String salesplatlogdetail;

    /**
     * 采购平台日志详细（JSON）(查询不记录)
     */
    private String purchaseplatlogdetail;

    /**
     * 订单号（创单有）(什么时候有什么时候记录)
     */
    private String orderno;

    /**
     * PNR(什么时候有什么时候记录)
     */
    private String pnr;

    /**
     * 时间戳
     */
    private Date modifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSalesplatform() {
        return salesplatform;
    }

    public void setSalesplatform(Integer salesplatform) {
        this.salesplatform = salesplatform;
    }

    public Integer getPurchaseplatform() {
        return purchaseplatform;
    }

    public void setPurchaseplatform(Integer purchaseplatform) {
        this.purchaseplatform = purchaseplatform;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype == null ? null : requesttype.trim();
    }

    public Integer getRequestresult() {
        return requestresult;
    }

    public void setRequestresult(Integer requestresult) {
        this.requestresult = requestresult;
    }

    public Integer getInterfaceresult() {
        return interfaceresult;
    }

    public void setInterfaceresult(Integer interfaceresult) {
        this.interfaceresult = interfaceresult;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getDepcode() {
        return depcode;
    }

    public void setDepcode(String depcode) {
        this.depcode = depcode == null ? null : depcode.trim();
    }

    public String getArrcode() {
        return arrcode;
    }

    public void setArrcode(String arrcode) {
        this.arrcode = arrcode == null ? null : arrcode.trim();
    }

    public Date getDepdate() {
        return depdate;
    }

    public void setDepdate(Date depdate) {
        this.depdate = depdate;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public Integer getVoyagetype() {
        return voyagetype;
    }

    public void setVoyagetype(Integer voyagetype) {
        this.voyagetype = voyagetype;
    }

    public Date getSalesplatrequesttime() {
        return salesplatrequesttime;
    }

    public void setSalesplatrequesttime(Date salesplatrequesttime) {
        this.salesplatrequesttime = salesplatrequesttime;
    }

    public Date getSalesplatresponsetime() {
        return salesplatresponsetime;
    }

    public void setSalesplatresponsetime(Date salesplatresponsetime) {
        this.salesplatresponsetime = salesplatresponsetime;
    }

    public Date getPurchaseplatrequesttime() {
        return purchaseplatrequesttime;
    }

    public void setPurchaseplatrequesttime(Date purchaseplatrequesttime) {
        this.purchaseplatrequesttime = purchaseplatrequesttime;
    }

    public Date getPurchaseplatresponsetime() {
        return purchaseplatresponsetime;
    }

    public void setPurchaseplatresponsetime(Date purchaseplatresponsetime) {
        this.purchaseplatresponsetime = purchaseplatresponsetime;
    }

    public String getSalesplatrequestip() {
        return salesplatrequestip;
    }

    public void setSalesplatrequestip(String salesplatrequestip) {
        this.salesplatrequestip = salesplatrequestip == null ? null : salesplatrequestip.trim();
    }

    public String getPurchaseplatrequestip() {
        return purchaseplatrequestip;
    }

    public void setPurchaseplatrequestip(String purchaseplatrequestip) {
        this.purchaseplatrequestip = purchaseplatrequestip == null ? null : purchaseplatrequestip.trim();
    }

    public String getSalesplatrequesttipmessage() {
        return salesplatrequesttipmessage;
    }

    public void setSalesplatrequesttipmessage(String salesplatrequesttipmessage) {
        this.salesplatrequesttipmessage = salesplatrequesttipmessage == null ? null : salesplatrequesttipmessage.trim();
    }

    public String getPurchaseplatrequesttipmessage() {
        return purchaseplatrequesttipmessage;
    }

    public void setPurchaseplatrequesttipmessage(String purchaseplatrequesttipmessage) {
        this.purchaseplatrequesttipmessage = purchaseplatrequesttipmessage == null ? null : purchaseplatrequesttipmessage.trim();
    }

    public String getSalesplatlogdetail() {
        return salesplatlogdetail;
    }

    public void setSalesplatlogdetail(String salesplatlogdetail) {
        this.salesplatlogdetail = salesplatlogdetail == null ? null : salesplatlogdetail.trim();
    }

    public String getPurchaseplatlogdetail() {
        return purchaseplatlogdetail;
    }

    public void setPurchaseplatlogdetail(String purchaseplatlogdetail) {
        this.purchaseplatlogdetail = purchaseplatlogdetail == null ? null : purchaseplatlogdetail.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr == null ? null : pnr.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}