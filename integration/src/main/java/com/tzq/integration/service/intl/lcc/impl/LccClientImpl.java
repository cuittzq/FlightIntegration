package com.tzq.integration.service.intl.lcc.impl;

import com.alibaba.fastjson.JSON;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/8
 * LY.com Inc.
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
        String response;
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
        }

        return verifyRes;
    }

    @Override
    public OrderRes createOrder(OrderReq req) {
        String url = String.format("%s/%s/%s", LccConstant.LCCDOMAIN, LccConstant.CID, LccConstant.CREATE_ORDER);
        req.setCid(LccConstant.CID + ":" + LccConstant.CIDPWD);
        String postData = JSON.toJSONString(req);
        Map<String, String> header = getDefaultHeader();
        String response;
        OrderRes orderRes = null;
        try {
            logger.info("调用LCC{}接口,入参{}", LccConstant.CREATE_ORDER, postData);

            // 字符串加密
            postData = AESUtil.Encrypt(postData,LccConstant.AES_KEY);

            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.CREATE_ORDER, response);
            response = AESUtil.Decrypt(response,LccConstant.AES_KEY);

            // 解密
            orderRes = JSON.parseObject(response, OrderRes.class);

        } catch (IOException e) {
            logger.error("调用LCC创单接口失败", e);
            e.printStackTrace();
        }catch (Exception e)
        {
            logger.error("调用LCC创单接口失败", e);
            e.printStackTrace();
        }
        finally {
            // TODO 记录接口访问日志
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
        passenger.setAgeType("0");
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
        OrderRes res =  lccClient.createOrder(orderReq);

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
            postData = AESUtil.Encrypt(postData,LccConstant.AES_KEY);

            response = HttpClientUtil.sendPostDataByJson(url, postData, header, ENCODING);
            logger.info("调用LCC{}接口,返回{}", LccConstant.ISSUETICKET, response);

            // 解密
            response = AESUtil.Encrypt(response,LccConstant.AES_KEY);

            // 解密
            res = JSON.parseObject(response, IssueTicketRes.class);

        } catch (IOException e) {
            logger.error("调用LCC创单接口失败", e);
        } catch (Exception e)
        {
            logger.error("调用LCC创单接口失败", e);
        }finally {
            // TODO 记录接口访问日志
        }

        return res;
    }

    /**
     *  出票查询，获取票号状态
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
