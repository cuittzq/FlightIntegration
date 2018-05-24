package com.tzq.biz.aop;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.enums.MethodEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.search.FlightRouteVO;
import com.tzq.commons.model.ctrip.verify.CtripVerifyReqVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.service.InterfaceRequestLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by cl24957 on 2018/5/21.
 */
@Aspect
@Component
public class VerifyLogAspect {
    @Resource
    InterfaceRequestLogService interfaceRequestLogService;

    @AfterReturning(pointcut = "execution(* com.tzq.biz.core.impl.OtaVerifyFlightServiceImpl.*(..))", returning = "returnValue")
    public void log(JoinPoint point, Object returnValue)
    {
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            HttpServletResponse response = attributes.getResponse();

            RouteContext<CtripVerifyReqVO> paramin = (RouteContext<CtripVerifyReqVO>) point.getArgs()[0];
            SingleResult<FlightRouteVO> flightRouteVO = new SingleResult();
            if (returnValue != null) {
                flightRouteVO = (SingleResult<FlightRouteVO>) returnValue;
            }
            InterfaceRequestLog interfaceRequestLog = buildLogs(request, response, paramin, flightRouteVO);
            interfaceRequestLogService.insert(interfaceRequestLog);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    private InterfaceRequestLog buildLogs(HttpServletRequest request, HttpServletResponse response, RouteContext<CtripVerifyReqVO> paramin, SingleResult<FlightRouteVO> flightRouteVO) {
        InterfaceRequestLog interfaceRequestLog = new InterfaceRequestLog();
        interfaceRequestLog.setArrcode(paramin.getT().getRouting().getFromSegments().get(0).getArrAirport());
        interfaceRequestLog.setDepcode(paramin.getT().getRouting().getFromSegments().get(0).getDepAirport());
        try {
            interfaceRequestLog.setDepdate(DateUtils.parseDateNoTime(paramin.getT().getRouting().getFromSegments().get(0).getDepTime(),"yyyyMMdd"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (paramin.getT().getTripType() == TripTypeEnum.RT && paramin.getT().getRouting().getRetSegments() != null && paramin.getT().getRouting().getRetSegments().size() >0) {
            try {
                interfaceRequestLog.setBackdate(DateUtils.parseDateNoTime(paramin.getT().getRouting().getRetSegments().get(0).getDepTime(), "yyyyMMdd"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            interfaceRequestLog.setBackdate(new Date(1990, 1, 1));
        }

        interfaceRequestLog.setCarrier(paramin.getT().getRouting().getFromSegments().get(0).getCarrier());
        interfaceRequestLog.setSalesplatform(1);
        interfaceRequestLog.setPurchaseplatform(1);
        interfaceRequestLog.setRequestdate(new Date());
        interfaceRequestLog.setRequesttype(MethodEnum.VERIFY.getCode());

        interfaceRequestLog.setRequestresult(1);
        interfaceRequestLog.setInterfaceresult(1);

        interfaceRequestLog.setOrderno("");
        interfaceRequestLog.setPnr("");
        // 0-单程，1-往返
        interfaceRequestLog.setVoyagetype(0);
        interfaceRequestLog.setSalesplatrequesttime(new Date());
        interfaceRequestLog.setSalesplatresponsetime(new Date());
        interfaceRequestLog.setPurchaseplatrequesttime(new Date());
        interfaceRequestLog.setPurchaseplatresponsetime(new Date());
        interfaceRequestLog.setSalesplatrequestip("192.168.10.10");
        interfaceRequestLog.setPurchaseplatrequestip(request.getRemoteAddr());
        interfaceRequestLog.setSalesplatrequesttipmessage("");
        interfaceRequestLog.setPurchaseplatrequesttipmessage("");
        interfaceRequestLog.setSalesplatlogdetail("");
        interfaceRequestLog.setPurchaseplatlogdetail(JSON.toJSONString(flightRouteVO));
        return interfaceRequestLog;
    }


}
