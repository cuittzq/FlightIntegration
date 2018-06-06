package com.tzq.commons.Exception;

/**
 * Created by cl24957 on 2018/5/18.
 */
public class ServiceAbstractException extends RuntimeException {
    private static final long serialVersionUID = -8742311167276890503L;

    protected ServiceErrorMsg serviceErrorMsgModel = CommonExcetpionConstant.SYSTEM_EXCEPTION;
    protected String errorMsg = null;

    public ServiceAbstractException() {
        super();
    }

    public ServiceAbstractException(ServiceErrorMsg flowerbrageErrorMsg) {
        super();
        this.serviceErrorMsgModel = flowerbrageErrorMsg;
    }

    public ServiceAbstractException(String message) {
        super(message);
        this.errorMsg = message;
    }

    public ServiceAbstractException(String message, ServiceErrorMsg serviceErrorMsg) {
        super(message);
        this.serviceErrorMsgModel = serviceErrorMsg;
        this.errorMsg = message;
    }

    public ServiceAbstractException(String message, Throwable cause) {
        super(message, cause);
        this.errorMsg = message;
    }

    public ServiceAbstractException(String message, Throwable cause, ServiceErrorMsg serviceErrorMsg) {
        super(message, cause);
        this.serviceErrorMsgModel = serviceErrorMsg;
        this.errorMsg = message;
    }

    public ServiceAbstractException(Throwable cause) {
        super(cause);
    }

    public ServiceAbstractException(Throwable cause, ServiceErrorMsg serviceErrorMsg) {
        super(cause);
        this.serviceErrorMsgModel = serviceErrorMsg;
    }

    @Override
    public String getMessage() {
        if (serviceErrorMsgModel == null) {
            return super.getMessage();
        }

        String message;

        if (errorMsg != null && !"".equals(errorMsg)) {
            message = errorMsg;
        } else {
            message = serviceErrorMsgModel.getMessage();
        }

        // TODO 统一上下文 requestid
        return "error_message: " + message + ", status: " + serviceErrorMsgModel.getStatus() + ", error_code: " + serviceErrorMsgModel.getErrorCode()
                + ",r=";
    }

    public boolean getStatus() {
        return serviceErrorMsgModel != null ? serviceErrorMsgModel.getStatus() : false;
    }

    public String getErrorCode() {
        return serviceErrorMsgModel != null ? serviceErrorMsgModel.getErrorCode() : CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE;
    }

    public ServiceErrorMsg getForestErrorMsg() {
        return serviceErrorMsgModel;
    }
}
