package com.tzq.biz.aop;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.enums.MethodEnum;
import com.tzq.commons.enums.TripTypeEnum;
import com.tzq.commons.model.context.RouteContext;
import com.tzq.commons.model.context.SingleResult;
import com.tzq.commons.model.ctrip.order.CreateOrderReqVO;
import com.tzq.commons.model.ctrip.order.CreateOrderResVO;
import com.tzq.commons.utils.DateUtils;
import com.tzq.dal.model.log.InterfaceRequestLog;
import com.tzq.dal.service.log.InterfaceRequestLogService;
import org.apache.commons.lang3.StringUtils;
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
import java.util.Arrays;
import java.util.Date;

/**
 * Created by cl24957 on 2018/5/21.
 */
@Aspect
@Component
public class CreateOrderLogAspect {
    @Resource
    InterfaceRequestLogService interfaceRequestLogService;

    @AfterReturning(pointcut = "execution(* com.tzq.biz.core.impl.OtaCreateOrderServiceImpl.*(..))", returning = "returnValue")
    public void log(JoinPoint point, Object returnValue) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpServletResponse response = attributes.getResponse();

        RouteContext<CreateOrderReqVO> paramin = (RouteContext<CreateOrderReqVO>) point.getArgs()[0];
        SingleResult<CreateOrderResVO> flightRouteVO = new SingleResult();
        if (returnValue != null) {
            flightRouteVO = (SingleResult<CreateOrderResVO>) returnValue;
        }
        InterfaceRequestLog interfaceRequestLog = buildLogs(request, response, paramin, flightRouteVO);

        Thread td = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    interfaceRequestLogService.insert(interfaceRequestLog);
                }
                catch (Exception e){
                }
            }
        });
        td.start();

        // 记录下请求内容
        System.out.println("URL : " + request.getRequestURL().toString());
        System.out.println("HTTP_METHOD : " + request.getMethod());
        System.out.println("IP : " + request.getRemoteAddr());
        System.out.println("CLASS_METHOD : " + point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName());
        System.out.println("ARGS : " + Arrays.toString(point.getArgs()));
    }

    private InterfaceRequestLog buildLogs(HttpServletRequest request, HttpServletResponse response, RouteContext<CreateOrderReqVO> paramin, SingleResult<CreateOrderResVO> flightRouteVO) {
        InterfaceRequestLog interfaceRequestLog = new InterfaceRequestLog();
        interfaceRequestLog.setArrcode(paramin.getT().getRoutings().getFromSegments().get(0).getArrAirport());
        interfaceRequestLog.setDepcode(paramin.getT().getRoutings().getFromSegments().get(0).getDepAirport());
        try {
            interfaceRequestLog.setDepdate(DateUtils.parseDateNoTime(paramin.getT().getRoutings().getFromSegments().get(0).getDepTime(), "yyyyMMdd"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (paramin.getT().getTripType() == TripTypeEnum.RT && paramin.getT().getRoutings().getRetSegments() != null && paramin.getT().getRoutings().getRetSegments().size() > 0) {
            try {
                interfaceRequestLog.setBackdate(DateUtils.parseDateNoTime(paramin.getT().getRoutings().getRetSegments().get(0).getDepTime(), "yyyyMMdd"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            interfaceRequestLog.setBackdate(new Date(1990, 1, 1));
        }

        interfaceRequestLog.setCarrier(paramin.getT().getRoutings().getFromSegments().get(0).getCarrier());
        interfaceRequestLog.setSalesplatform(1);
        interfaceRequestLog.setPurchaseplatform(1);
        interfaceRequestLog.setRequestdate(new Date());
        interfaceRequestLog.setRequesttype(MethodEnum.CREATEORDER.getCode());

        if (flightRouteVO.isSuccess() && !StringUtils.isEmpty(flightRouteVO.getData().getPnrCode())) {
            interfaceRequestLog.setRequestresult(0);
            interfaceRequestLog.setInterfaceresult(0);
            interfaceRequestLog.setOrderno(flightRouteVO.getData().getOrderNo());
            interfaceRequestLog.setPnr(flightRouteVO.getData().getPnrCode());
        } else {
            interfaceRequestLog.setRequestresult(1);
            interfaceRequestLog.setInterfaceresult(1);
            interfaceRequestLog.setOrderno("");
            interfaceRequestLog.setPnr("");
        }

        // 0-单程，1-往返
        interfaceRequestLog.setVoyagetype(paramin.getT().getTripType().getCode());
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
