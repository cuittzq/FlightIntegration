package com.tzq.commons.Exception;

/**
 * Created by cl24957 on 2018/5/18.
 */
public class CommonExcetpionConstant {
    /*============ERROR_CODE==========*/
    public static final String SUCCESS="";
    public static final String TIME_OUT_ERROR_CODE = "3";
    public static final String PARAM_ERROR_CODE = "4";
    public static final String NO_PERMISSION_CODE = "5";
    public static final String INTERFACE_INVOKE_ERROR_CODE="6";
    public static final String LCC_VERIFY_DATA_OUT_TIME_CODE = "201";
    public static final String SYSTEM_EXCEPTION_CODE = "9999";


    /*============ERROR_INSTANCE==========*/

    /*航线错误*/
    public static final ServiceErrorMsg LCC_VERIFY_DATA_OUT_TIME = ServiceErrorMsg.Builder.newInstance()
            .setErrorCode(CommonExcetpionConstant.LCC_VERIFY_DATA_OUT_TIME_CODE)
            .setErrorMsg("data错误").build();

    public static final ServiceErrorMsg TIME_OUT_ERROR =ServiceErrorMsg.Builder.newInstance()
            .setErrorCode(CommonExcetpionConstant.TIME_OUT_ERROR_CODE)
            .setErrorMsg("请求第三方超时").build();

    public static final ServiceErrorMsg PARAM_ERROR =ServiceErrorMsg.Builder.newInstance()
            .setErrorCode(CommonExcetpionConstant.PARAM_ERROR_CODE)
            .setErrorMsg("参数错误").build();


    public static  final ServiceErrorMsg NO_PERMISSION =ServiceErrorMsg.Builder.newInstance()
            .setErrorCode(CommonExcetpionConstant.NO_PERMISSION_CODE)
            .setErrorMsg("接口无权限").build();

    public static  final ServiceErrorMsg SYSTEM_EXCEPTION =ServiceErrorMsg.Builder.newInstance()
            .setErrorCode(CommonExcetpionConstant.SYSTEM_EXCEPTION_CODE)
            .setErrorMsg("系统异常").build();
}
