package com.tzq.biz.aop;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.enums.InterfaceErrorEnum;
import com.tzq.commons.enums.MethodEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.search.SearchVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.service.log.InterfaceRequestLogService;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/7
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

/**
 * Created by wuwf on 17/4/27.
 * 日志切面
 */
@Aspect
@Component
public class SearchFlightLogAspect {

    @Resource
    InterfaceRequestLogService interfaceRequestLogService;

    @AfterReturning(pointcut = "execution(* com.tzq.biz.core.impl.OtaSearchFlightServiceImpl.*(..))", returning = "returnValue")
    public void log(JoinPoint point, Object returnValue) {
        try {
            ServletRequestAttributes    attributes    = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest          request       = attributes.getRequest();
            HttpServletResponse         response      = attributes.getResponse();
            RouteContext<SearchVO>      paramin       = (RouteContext<SearchVO>) point.getArgs()[0];
            SingleResult<FlightRouteVO> flightRouteVO = new SingleResult();
            if (returnValue != null) {
                flightRouteVO = (SingleResult<FlightRouteVO>) returnValue;
            }
            InterfaceRequestLog interfaceRequestLog = buildLogs(request, response, paramin, flightRouteVO);
            interfaceRequestLogService.insert(interfaceRequestLog);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


    private InterfaceRequestLog buildLogs(HttpServletRequest request, HttpServletResponse response, RouteContext<SearchVO> paramin, SingleResult<FlightRouteVO> flightRouteVO) throws ParseException {
        InterfaceRequestLog interfaceRequestLog = new InterfaceRequestLog();
        interfaceRequestLog.setArrcode(paramin.getT().getArrAirportCode());
        interfaceRequestLog.setDepcode(paramin.getT().getDepAirportCode());
        interfaceRequestLog.setDepdate(DateUtils.parseDateNoTime(paramin.getT().getDepDate(), "yyyyMMdd"));
        if (StringUtils.isNotEmpty(paramin.getT().getArrDate())) {
            interfaceRequestLog.setBackdate(DateUtils.parseDateNoTime(paramin.getT().getArrDate(), "yyyyMMdd"));
        } else {
            interfaceRequestLog.setBackdate(new Date(1990, 1, 1));
        }

        interfaceRequestLog.setCarrier("");
        interfaceRequestLog.setSalesplatform(1);
        interfaceRequestLog.setPurchaseplatform(1);
        interfaceRequestLog.setRequestdate(new Date());
        interfaceRequestLog.setRequesttype(MethodEnum.SEARCHFLIGHT.getCode());
        interfaceRequestLog.setRequestresult(flightRouteVO == null ? 0 : flightRouteVO.isSuccess() ? 1 : 0);
        // 接口结果（接口返回结果）(0-成功 / 1-失败 / 2-CID错误 / 3-非法IP / 4-操作失败 / 5-请求参数错误 / 6-程序异常 / 7-航线管控 / 8-航司过滤 / 9-配置未找到 / 10-访问超时 / 11-访问频繁 / 12-不在销售时间范围内 / 13-不在工作时间范围内 / 14-价格变动 / 15-无座 / 16-不可预订)
        interfaceRequestLog.setInterfaceresult(InterfaceErrorEnum.getEnumByName( flightRouteVO.getErrorCode()).getCode());
        interfaceRequestLog.setOrderno("");
        interfaceRequestLog.setPnr("");
        // 0-单程，1-往返
        interfaceRequestLog.setVoyagetype(paramin.getT().getTripType().getCode() - 1);
        interfaceRequestLog.setSalesplatrequesttime(new Date());
        interfaceRequestLog.setSalesplatresponsetime(new Date());
        interfaceRequestLog.setPurchaseplatrequesttime(new Date());
        interfaceRequestLog.setPurchaseplatresponsetime(new Date());
        interfaceRequestLog.setSalesplatrequestip("192.168.10.10");
        interfaceRequestLog.setPurchaseplatrequestip(request.getRemoteAddr());
        interfaceRequestLog.setSalesplatrequesttipmessage(flightRouteVO.getErrorMessage());
        interfaceRequestLog.setPurchaseplatrequesttipmessage("");
        interfaceRequestLog.setSalesplatlogdetail(JSON.toJSONString(flightRouteVO));
        interfaceRequestLog.setPurchaseplatlogdetail("");
        return interfaceRequestLog;

    }

}