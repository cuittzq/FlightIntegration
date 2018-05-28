package com.tzq.integration.service.intl.lcc.impl;

import com.alibaba.fastjson.JSON;
import com.tzq.commons.enums.AgeTypeEunm;
import com.tzq.commons.utils.AESUtil;
import com.tzq.commons.utils.HttpClientUtil;
import com.tzq.integration.service.core.AbstractBaseClient;
import com.tzq.integration.service.intl.lcc.LccClient;
import com.tzq.integration.service.intl.lcc.constants.LccConstant;
import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusReq;
import com.tzq.integration.service.intl.lcc.model.getstatus.GetStatusRes;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketReq;
import com.tzq.integration.service.intl.lcc.model.issueticket.IssueTicketRes;
import com.tzq.integration.service.intl.lcc.model.order.Contact;
import com.tzq.integration.service.intl.lcc.model.order.OrderReq;
import com.tzq.integration.service.intl.lcc.model.order.OrderRes;
import com.tzq.integration.service.intl.lcc.model.order.Passenger;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightReq;
import com.tzq.integration.service.intl.lcc.model.search.SearchFlightRes;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author TanZhiqiang
 * @Created on 2018/5/8
 * LTC.COM.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
@Service("lccClient")
public class LccClientImpl extends AbstractBaseClient implements LccClient {

    /**
     *
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询航班
     *
     * @param req
     * @return
     */
    @Override
    public SearchFlightRes searchFlight(SearchFlightReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.SEARCH_FLIGHT);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response;
        SearchFlightRes searchFlightRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.SEARCH_FLIGHT, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.SEARCH_FLIGHT, response);
            searchFlightRes = JSON.parseObject(response, SearchFlightRes.class);
        } catch (IOException e) {
            logger.error("调用LCC接口失败", e);
        }
        return searchFlightRes;
    }

    /**
     * 验舱验价
     *
     * @param req
     * @return
     */
    @Override
    public VerifyRes verifyCabinPrice(VerifyReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.VERIFY);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response= StringUtils.EMPTY;
        VerifyRes verifyRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.VERIFY, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.VERIFY, response);
            verifyRes = JSON.parseObject(response, VerifyRes.class);
        } catch (IOException e) {
            logger.error("调用LCC验舱验价接口失败", e);
        } finally {
            // TODO 记录接口访问日志
            logger.info("验舱请求完成！入参：{} 返回：{}",JSON.toJSONString(req),response);
        }

        return verifyRes;
    }

    @Override
    public OrderRes createOrder(OrderReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.CREATE_ORDER);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response=StringUtils.EMPTY;
        OrderRes orderRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.CREATE_ORDER, postData);

            // 字符串加密
            postData = AESUtil.Encrypt(postData, LccConstant.AES_KEY);

            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.CREATE_ORDER, response);
            response = AESUtil.Decrypt(response, LccConstant.AES_KEY);

            // response="{\"sessionId\":null,\"maxSeats\":5,\"routing\":{\"data\":\"GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaEabUyrBaulo5Oyju8O4HjIJpKfbDB4b9yjnom57axkbdUSZrUMxNBPFS2mFb2TJqmw2k0wdzv8wIcuNwgYN72shgMAMgnvEBBW3Isdbsg2xQgtOJASz3g1edq5sTyT6GjLniQbtic3PVnukYXS4az6hBO0xi2kNVohvz9xL7OQEn1R0C8QKBmP/K3z0PsPz1ELSXAQokGPVVClyqsPWDKEmVMDpYacdX1YglOwU+uLSg==\",\"adultPrice\":418,\"adultTax\":92,\"childPrice\":417,\"childTax\":0,\"priceType\":0,\"applyType\":0,\"adultTaxType\":0,\"childTaxType\":0,\"rule\":{\"refund\":\"请仔细查看行程表，严格遵守登机办理时间和登机时间。若未按预订旅行将没收票价及相关费用和收费，不予以退还。\",\"endorse\":\"不允许进行自由和/或开放式变更，在允许变更的条件下进行变更时，可能需要支付相关费用和任何相关票价差额。\",\"baggage\":\"免费存舱行李：一件可存放在机舱上面的封闭式行李架或乘客座椅下的手提行李，而总尺寸长度不可超过一百一十五厘米（注：最大尺寸 = 长、宽及高的总和），体积不可超过54厘米 x 38厘米 x 23厘米，及重量不可超过7千克。E2和E3舱位有自带托运行李额，具体见航司规则。\",\"other\":\"若错过了有续程或返程航班段预订中的首航班，将取消预订中余下的航班，除非在错过的航班出发后 48 小时内致电酷航呼叫中心。如果未这样做，对于由此导致的的任何损失，酷航将不承担任何责任。相关登机证件（如护照）的剩余有效期必须超过6个月，否则机场将拒绝旅客登机。\"},\"fromSegments\":[{\"carrier\":\"TR\",\"flightNumber\":\"107\",\"depAirport\":\"CAN\",\"depTime\":\"201811250345\",\"arrAirport\":\"SIN\",\"arrTime\":\"201811250830\",\"stopCities\":\"\",\"codeShare\":false,\"sharingFlightNumber\":\"\",\"departureTerminal\":\"1\",\"arrivingTerminal\":\"2\",\"cabin\":\"O1\",\"aircraftCode\":\"789\",\"seatCount\":5}],\"retSegments\":[],\"refData\":null,\"priceCurrency\":\"CNY\"},\"isDupOrder\":false,\"isFakeOrder\":false,\"orderNumber\":\"20180521102800739589\",\"orderPNR\":\"B8ET4D\",\"orderNo\":\"20180521102800739589\",\"pnrCode\":\"B8ET4D\",\"status\":0,\"msg\":\"Success TrackingId: fdd6a39b-3fbe-46f1-904c-1cab922468c0 \"}";

            // 解密
            orderRes = JSON.parseObject(response, OrderRes.class);

        } catch (IOException e) {
            logger.error("调用LCC创单接口失败", e);
        } catch (Exception e) {
            logger.error("调用LCC创单接口失败", e);
        } finally {
            // TODO 记录接口访问日志
            logger.info("创单请求完成！入参：{} 返回：{}",JSON.toJSONString(req),response);
        }

        return orderRes;
    }

    public static void main(String[] args) {
        OrderReq orderReq = new OrderReq();

        orderReq.setCid("cdchangxin:YVpEgd3m");
        orderReq.setTripType(1);
        List<Contact> contacts = new ArrayList<>();
        Contact contact = new Contact();
        contact.setAddress("CHENGDU");
        contact.setEmail("281813694@qq.com");
        contact.setMobile("18200273125");
        contact.setName("ZHIGANG/LIN");
        contacts.add(contact);
        orderReq.setContact(contacts);

        List<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger();
        passenger.setAgeType(AgeTypeEunm.ADT.getCode());
        passenger.setBirthday("19910425");
        passenger.setCardExpired("20200101");
        passenger.setCardIssuePlace("CN");
        passenger.setCardType("PP");
        passenger.setName("LEI/CHEN");
        passenger.setGender("M");
        passenger.setCardNum("C85492398");
        passenger.setNationality("CN");
        passengers.add(passenger);
        orderReq.setPassengers(passengers);

        FlightRoutings routing = new FlightRoutings();
        routing.setData("GnyaJaYZ7wuQvG1DsFEY7tc8GB0lrrEJNYtQF9ssRaFx4J7QJYXNwlRlqklpYOzV1E9T1s4TN0ELCQJIUns8VK1W1YS5aIGU3TVOW6DJw1C0AsAy92Oa6jFHWyb0+sNdBeCAtom/4Cl7s4enI1JR8gFhvPqrzh2WuJ8s6DDRatXBGk6Kkr4ryF9+whKWPXNTbUPnUQ/9O99yZTlv5A1GvYhpL24gde6urfUcOrmp34Xxqj+DE8Bw/H8FkK5F4W7OIULGln8LQaYwKwVHz4G1VA==");
        routing.setRefData("SCOT-SIN-BKK-20180829-608-nil-nil-OneWay 0516092757");
        List<FlightSegment> fromSegments = new ArrayList<>();
        FlightSegment segment = new FlightSegment();
        segment.setCarrier("TR");
        segment.setFlightNumber("608");
        segment.setDepAirport("SIN");
        segment.setDepTime("201808290635");
        segment.setArrAirport("BKK");
        segment.setArrTime("201808290800");
        segment.setStopCities("");
        segment.setCodeShare(false);
        segment.setSharingFlightNumber("");
        segment.setDepartureTerminal("2");
        segment.setArrivingTerminal("");
        segment.setCabin("X1");
        segment.setAircraftCode("789");
        segment.setSeatCount(9);

        fromSegments.add(segment);
        routing.setFromSegments(fromSegments);
        orderReq.setRouting(routing);
        LccClientImpl lccClient = new LccClientImpl();
        OrderRes res = lccClient.createOrder(orderReq);

        System.out.println(JSON.toJSONString(res));
    }

    @Override
    public IssueTicketRes issueTicket(IssueTicketReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.ISSUETICKET);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response;

        IssueTicketRes res = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.ISSUETICKET, postData);
            // 字符串加密
            postData = AESUtil.Encrypt(postData, LccConstant.AES_KEY);

            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.ISSUETICKET, response);
            // 解密
            response = AESUtil.Decrypt(response, LccConstant.AES_KEY);
            // 解密
            res = JSON.parseObject(response, IssueTicketRes.class);
        } catch (IOException e) {
            logger.error("调用LCC创单接口失败", e);
        } catch (Exception e) {
            logger.error("调用LCC创单接口失败", e);
        } finally {
            // TODO 记录接口访问日志
        }

        return res;
    }

    /**
     * 出票查询，获取票号状态
     *
     * @param req
     * @return
     */
    @Override
    public GetStatusRes getStatus(GetStatusReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.GETSTATUS);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response;
        GetStatusRes res = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.GETSTATUS, postData);
            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.GETSTATUS, response);

            res = JSON.parseObject(response, GetStatusRes.class);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }

}
