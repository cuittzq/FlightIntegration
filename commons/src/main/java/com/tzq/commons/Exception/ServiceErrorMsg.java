package com.tzq.commons.Exception;

/**
 * Created by cl24957 on 2018/5/18.
 */
public class ServiceErrorMsg {

    private static final long serialVersionUID = 4909459500370103048L;

    private boolean status = Boolean.FALSE;
    private String errorCode = "999";
    private String message;


    public ServiceErrorMsg() {
    }

    public boolean getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder {
        private ServiceErrorMsg errorMsg;

        Builder() {
        }

        public static Builder newInstance() {
            Builder fragment = new Builder();
            fragment.errorMsg = new ServiceErrorMsg();
            return fragment;
        }

        public Builder setStatus(boolean status) {
            errorMsg.status = status;
            return this;
        }

        public Builder setErrorCode(String errorCode) {
            errorMsg.errorCode = errorCode;
            return this;
        }

        public Builder setErrorMsg(String errorMsgStr) {
            errorMsg.message = errorMsgStr;
            return this;
        }

        public ServiceErrorMsg build() {
            return errorMsg;
        }
    }
}
