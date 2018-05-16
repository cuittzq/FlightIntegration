package com.tzq.service.ctrip.models;

public class BaseResponse {
    /**
     * 0, 成功；3,其他失败原因；4,ctrip请求参数错误；5,程序异常；-1,网络异常(ctrip使用)-2,response数据异常（ctrip使用）【满仓或舱位数不足时，请返回status非0，失败原因为“舱位不足”】
     */
    private int    status;
    private String msg;

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
}
