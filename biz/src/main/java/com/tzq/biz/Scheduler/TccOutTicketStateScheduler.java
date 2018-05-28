package com.tzq.biz.Scheduler;

import com.tzq.dal.model.order.OrderInfo;
import com.tzq.dal.model.order.OrderInfoExample;
import com.tzq.dal.service.order.OrderInfoService;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusReq;
import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cl24957 on 2018/5/28.
 */
@Component
public class TccOutTicketStateScheduler {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerConstants.class);

    @Resource
    private LccClient lccClient;

    @Resource
    private OrderInfoService orderInfoService;

    private ExecutorService executorService = Executors.newFixedThreadPool(20);

    /**
     *  出票状态job
     */
    @Scheduled(cron = SchedulerConstants.CRON_FOR_TCC_TICKET_STATE_JOB)
    public void ticketStateJob()
    {
        System.out.println("开始扫描订单单库数据");
        logger.info("开始扫描订单单库数据");
        // 01.获取需要扫描的订单
        List<OrderInfo> orderInfos = getOrderInfoLst();
        logger.info("开始扫描订单单库数据结束，一共有{}条数据！",orderInfos==null?0:orderInfos.size());

        // 02.开启线程池扫描
        if(orderInfos != null && orderInfos.size()>0)
        {
//            orderInfos.forEach(event->
//                executorService.execute(new Runnable() {
//                    @Override
//                    public void run() {
                        ticketStateScan(orderInfos.get(0));
//                    }
//                })
//            );
        }

    }

    private List<OrderInfo> getOrderInfoLst() {
        //扫描订单状态为0 并且有PNR的订单
        OrderInfoExample example = new OrderInfoExample();
        example.or().andOrderstateEqualTo(1).andPnrIsNotNull();

        List<OrderInfo> orderInfos = orderInfoService.selectByExample(example);
        return  orderInfos;
    }

    /**
     *  出票状态扫描
     * @param orderInfo
     */
    private void ticketStateScan(OrderInfo orderInfo)
    {

        try {
            // 01.获取状态
            GetStatusRes res= lccClient.getStatus(getStatusReq(orderInfo));

            if(res != null && res.getMsg().equalsIgnoreCase("success"))
            {
                orderInfo.setOrderstate(this.getResStatus(res.getStatus()));
                orderInfoService.updateByPrimaryKey(orderInfo);
            }

        } catch (Exception e) {
           logger.error("修改");
        } finally {
        }
    }

    private int getResStatus(int status) {
        int resStatus = 1;

        switch (status)
        {
            case 2:
                resStatus=3;break;
            case 3:
                resStatus=6;break;
            case 4:
                resStatus=8; break;
            case 5:
                resStatus=13; break;
            case 6:
                resStatus=14; break;
                default: break;
        }

        return resStatus;
    }

    private GetStatusReq getStatusReq( OrderInfo orderInfo)
    {
        GetStatusReq getStatusReq = new GetStatusReq();
        getStatusReq.setOrderNo(orderInfo.getPurchaseorderno());
        getStatusReq.setPnrCode(orderInfo.getPnr());
        getStatusReq.setTripType(orderInfo.getVoyagetype());

        return getStatusReq;
    }
}
