package com.tzq.biz.service.mapper;

import com.tzq.biz.common.enums.StatusEnum;
import com.tzq.biz.common.model.Money;
import com.tzq.biz.common.model.integration.CabinVO;
import com.tzq.biz.common.model.integration.FlightUnitVO;
import com.tzq.biz.common.model.integration.SegmentVO;
import com.tzq.biz.common.model.integration.lccverify.VerifyReqVO;
import com.tzq.biz.common.model.integration.lccverify.VerifyResVO;
import com.tzq.biz.utils.DateConvert;
import com.tzq.integration.service.intl.lcc.model.search.FlightRoutings;
import com.tzq.integration.service.intl.lcc.model.search.FlightSegment;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyReq;
import com.tzq.integration.service.intl.lcc.model.verify.VerifyRes;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cl24957 on 2018/5/11.
 */
public class LccBusiMapper {
    public static VerifyReq vo2io(VerifyReqVO vo) {
        if (vo == null) {
            return null;
        }

        VerifyReq req = new VerifyReq();
        req.setTripType(vo.getTripType().getCode());
        req.setRouting(vo2io(vo.getRouting()));

        return req;
    }

    public static VerifyReq.VerifyRouting vo2io(VerifyReqVO.VerifyReqVORouting voRouting) {
        if (voRouting == null) {
            return null;
        }
        VerifyReq.VerifyRouting routing = new VerifyReq.VerifyRouting();

        List<FlightSegment> fromSegments = new ArrayList<>();
        for (SegmentVO fromSeg : voRouting.getFromSegments()) {
            fromSegments.add(vo2io(fromSeg));
        }
        routing.setFromSegments(fromSegments);

        List<FlightSegment> retSeg = new ArrayList<>();
        for (SegmentVO toSeg : voRouting.getRetSegments()) {
            retSeg.add(vo2io(toSeg));
        }
        routing.setRetSegments(retSeg);

        return routing;
    }

    public static FlightSegment vo2io(SegmentVO vo) {
        if (vo == null) {
            return null;
        }

        FlightSegment segment = new FlightSegment();
        segment.setAircraftCode(vo.getAircraftStyle());
        segment.setArrAirport(vo.getArrAirportCode());
        segment.setArrivingTerminal(vo.getArrAirportTerm());
        segment.setArrTime(DateConvert.getStrFromDateByFormat(vo.getArrDatetime(), DateConvert.LCC_VERIFY_DATE_FORMAT));
        segment.setCabin(vo.getCabin().getCabinCode());
        segment.setCarrier(vo.getAirlineCode());
        segment.setCodeShare(vo.getCodeShare() == StatusEnum.TRUE);
        segment.setDepAirport(vo.getDepAirportCode());
        segment.setDepartureTerminal(vo.getDepAirportTerm());
        segment.setDepTime(DateConvert.getStrFromDateByFormat(vo.getDepDatetime(), DateConvert.LCC_VERIFY_DATE_FORMAT));
        segment.setFlightNumber(vo.getMarketFlightNo());
        segment.setSeatCount(9);
        segment.setStopCities(StringUtils.EMPTY);

        return segment;
    }

    public static VerifyResVO io2vo(VerifyRes verifyRes) {
        if (verifyRes == null) {
            return null;
        }
        VerifyResVO vo = new VerifyResVO();
        vo.setMaxSeats(verifyRes.getMaxSeats());
        vo.setMsg(verifyRes.getMsg());
        vo.setRouting(io2vo(verifyRes.getRouting()));
        vo.setSessionId(verifyRes.getSessionId());
        vo.setStatus(verifyRes.getStatus());

        return vo;
    }

    private static VerifyResVO.VerifyResRouting io2vo(FlightRoutings routing) {
        if(routing == null)
        {
            return null;
        }

        VerifyResVO.VerifyResRouting vo = new VerifyResVO.VerifyResRouting();
        vo.setAdultPrice(routing.getAdultPrice());
        vo.setAdultTax(routing.getAdultTax());
        vo.setAdultTaxType(routing.getAdultTaxType());
        vo.setApplyType(routing.getApplyType());
        vo.setChildPrice(routing.getChildPrice());
        vo.setChildTax(routing.getChildTax());
        vo.setChildTaxType(routing.getChildTaxType());
        vo.setData(routing.getData());

        List<SegmentVO> fromSegs = new ArrayList<>();
        for(FlightSegment seg : routing.getFromSegments())
        {
            fromSegs.add(io2vo(seg));
        }
        vo.setFromSegments(fromSegs);

        List<SegmentVO> setSegs = new ArrayList<>();
        for(FlightSegment seg : routing.getRetSegments())
        {
            setSegs.add(io2vo(seg));
        }
        vo.setRetSegments(fromSegs);

        return vo;
    }

    private static SegmentVO io2vo(FlightSegment seg) {
        if(seg == null)
        {
            return  null;
        }

        SegmentVO vo = new SegmentVO();
        vo.setAircraftStyle(seg.getAircraftCode());
        vo.setAirlineCode(seg.getAircraftCode());
        vo.setArrAirportCode(seg.getArrAirport());
        vo.setArrAirportName(StringUtils.EMPTY); // TODO
        vo.setArrAirportTerm(seg.getArrivingTerminal());
        try {
            vo.setArrDatetime(DateConvert.getDateFromStrByFormat( seg.getArrTime(),DateConvert.LCC_VERIFY_DATE_FORMAT));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        CabinVO cabinVO = new CabinVO();// TODO
        cabinVO.setBaseCabinCode(seg.getCabin());
        vo.setCabin(cabinVO);
        vo.setCodeShare(seg.isCodeShare()?StatusEnum.TRUE:StatusEnum.FALSE);
        vo.setDepAirportCode(seg.getDepAirport());
        vo.setDepAirportName(StringUtils.EMPTY);
        vo.setDepAirportTerm(seg.getDepartureTerminal());
        try {
            vo.setDepDatetime(DateConvert.getDateFromStrByFormat( seg.getDepTime(),DateConvert.LCC_VERIFY_DATE_FORMAT));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return vo;
    }
}
