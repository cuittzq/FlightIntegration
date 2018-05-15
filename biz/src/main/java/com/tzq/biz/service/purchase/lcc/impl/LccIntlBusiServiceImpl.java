package com.tzq.biz.service.purchase.lcc.impl;

import com.tzq.biz.service.purchase.abstracts.AbstractLccBusiService;
import com.tzq.commons.cache.LCCDataGuavaCache;
import com.tzq.commons.mapper.OrderVOMapper;
import com.tzq.commons.mapper.VerifyVOMapper;
import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.integration.lcc.issueticket.IssueTicketResVO;
import com.tzq.commons.model.integration.lcc.order.OrderReqVO;
import com.tzq.commons.model.integration.lcc.order.OrderResVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyReqVO;
import com.tzq.commons.model.integration.lcc.verify.VerifyResVO;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cl24957 on 2018/5/11.
 */
@Service
public class LccIntlBusiServiceImpl extends AbstractLccBusiService {
    @Resource
    private LccClient lccClient;

    @Resource
    private VerifyVOMapper verifyVOMapper;

    @Resource
    private OrderVOMapper orderVOMapper;

    /**
     *  验舱验价
     * @param vo
     * @return
     */
    @Override
    public VerifyResVO verifyCabinAndPrice(VerifyReqVO vo) {
        VerifyResVO resVO = null;

        VerifyReq req = verifyVOMapper.VerifyReqVOvO2dto(vo);

        // 获取缓存的价格
        String routDataKey = String.format("%s%s%s", req.getRouting().getFromSegments().get(0).getDepAirport(),
                req.getRouting().getFromSegments().get(0).getArrAirport(),
                req.getRouting().getFromSegments().get(0).getDepTime().substring(0,8));
        resVO.getRouting().setData(LCCDataGuavaCache.instance().get(routDataKey));

        resVO = verifyVOMapper.VerifyResdto2vo(lccClient.verifyCabinPrice(req));

        return resVO;
    }

    /**
     *  创单
     * @param reqVO
     * @return
     */
    public OrderResVO crateOrder(OrderReqVO reqVO)
    {
        OrderResVO resVO = null;

        OrderReq orderReq = orderVOMapper.orderReqVo2Io(reqVO);

        // 获取缓存的价格
        String routDataKey = String.format("%s%s%s", reqVO.getRouting().getFromSegments().get(0).getDepAirport(),
                reqVO.getRouting().getFromSegments().get(0).getArrAirport(),
                reqVO.getRouting().getFromSegments().get(0).getDepTime().substring(0,8));
        orderReq.getRouting().setData(LCCDataGuavaCache.instance().get(routDataKey));

        resVO = orderVOMapper.orderResIo2Vo(lccClient.createOrder(orderReq));

        return resVO;
    }

    @Override
    public IssueTicketResVO issueTicket(IssueTicketReqVO reqVO) {
        IssueTicketResVO resVO = null;

//        OrderReq orderReq = orderVOMapper.orderReqVo2Io(reqVO);
//
//        // 获取缓存的价格
//        String routDataKey = String.format("%s%s%s", reqVO.getRouting().getFromSegments().get(0).getDepAirport(),
//                reqVO.getRouting().getFromSegments().get(0).getArrAirport(),
//                reqVO.getRouting().getFromSegments().get(0).getDepTime().substring(0,8));
//        orderReq.getRouting().setData(LCCDataGuavaCache.instance().get(routDataKey));
//
//        resVO = orderVOMapper.orderResIo2Vo(lccClient.createOrder(orderReq));

        return resVO;
    }
}
