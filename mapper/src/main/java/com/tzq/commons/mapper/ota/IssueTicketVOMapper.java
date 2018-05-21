package com.tzq.commons.mapper.ota;

import com.tzq.commons.converter.*;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketReqVO;
import com.tzq.commons.model.ctrip.issueticket.IssueTicketResVO;
import com.tzq.service.ctrip.models.issueticket.IssueTicketReqDTO;
import com.tzq.service.ctrip.models.issueticket.IssueTicketResDTO;
import org.mapstruct.Mapper;

/**
 * 功能描述
 *
 * @Author tzq24955
 * @Created on 2018/5/21
 * LY.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */

@Mapper(componentModel = "spring",
        uses = {
                AreaTypeEnumConverter.class,
                CurrencyEnumConverter.class,
                InventoryEnumConverter.class,
                PassengerTypeEnumConverter.class,
                SegmentTypeEnumConverter.class,
                StatusEnumConverter.class,
                TripTypeEnumConverter.class,
                CabinGradeEnumConverter.class,
                CardTypeEnumConverter.class,
                EligibilityEnumConverter.class,
                InvoiceTypeEnumConverter.class,
                ReservationTypeEnumConverter.class,
                AgeTypeEunmConverter.class})
public interface IssueTicketVOMapper {

    IssueTicketReqDTO IssueTicketReqVO2DTO(IssueTicketReqVO segmentVO);

    IssueTicketReqVO IssueTicketReqDTO2VO(IssueTicketReqDTO segmentDTO);

    IssueTicketResDTO IssueTicketResVO2DTO(IssueTicketResVO segmentVO);

    IssueTicketResVO IssueTicketResDTO2VO(IssueTicketResDTO segmentDTO);
}
