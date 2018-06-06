package com.tzq.dal.model.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OrderLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("OrderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("OrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("OrderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("OrderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("OrderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("OrderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("OrderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("OrderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("OrderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("OrderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("OrderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("OrderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("OrderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("OrderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIsNull() {
            addCriterion("FlightInfo is null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIsNotNull() {
            addCriterion("FlightInfo is not null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoEqualTo(String value) {
            addCriterion("FlightInfo =", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoNotEqualTo(String value) {
            addCriterion("FlightInfo <>", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoGreaterThan(String value) {
            addCriterion("FlightInfo >", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoGreaterThanOrEqualTo(String value) {
            addCriterion("FlightInfo >=", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoLessThan(String value) {
            addCriterion("FlightInfo <", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoLessThanOrEqualTo(String value) {
            addCriterion("FlightInfo <=", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoLike(String value) {
            addCriterion("FlightInfo like", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoNotLike(String value) {
            addCriterion("FlightInfo not like", value, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIn(List<String> values) {
            addCriterion("FlightInfo in", values, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoNotIn(List<String> values) {
            addCriterion("FlightInfo not in", values, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoBetween(String value1, String value2) {
            addCriterion("FlightInfo between", value1, value2, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andFlightinfoNotBetween(String value1, String value2) {
            addCriterion("FlightInfo not between", value1, value2, "flightinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoIsNull() {
            addCriterion("LinkInfo is null");
            return (Criteria) this;
        }

        public Criteria andLinkinfoIsNotNull() {
            addCriterion("LinkInfo is not null");
            return (Criteria) this;
        }

        public Criteria andLinkinfoEqualTo(String value) {
            addCriterion("LinkInfo =", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoNotEqualTo(String value) {
            addCriterion("LinkInfo <>", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoGreaterThan(String value) {
            addCriterion("LinkInfo >", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoGreaterThanOrEqualTo(String value) {
            addCriterion("LinkInfo >=", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoLessThan(String value) {
            addCriterion("LinkInfo <", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoLessThanOrEqualTo(String value) {
            addCriterion("LinkInfo <=", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoLike(String value) {
            addCriterion("LinkInfo like", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoNotLike(String value) {
            addCriterion("LinkInfo not like", value, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoIn(List<String> values) {
            addCriterion("LinkInfo in", values, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoNotIn(List<String> values) {
            addCriterion("LinkInfo not in", values, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoBetween(String value1, String value2) {
            addCriterion("LinkInfo between", value1, value2, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andLinkinfoNotBetween(String value1, String value2) {
            addCriterion("LinkInfo not between", value1, value2, "linkinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoIsNull() {
            addCriterion("PassengerInfo is null");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoIsNotNull() {
            addCriterion("PassengerInfo is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoEqualTo(String value) {
            addCriterion("PassengerInfo =", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoNotEqualTo(String value) {
            addCriterion("PassengerInfo <>", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoGreaterThan(String value) {
            addCriterion("PassengerInfo >", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PassengerInfo >=", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoLessThan(String value) {
            addCriterion("PassengerInfo <", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoLessThanOrEqualTo(String value) {
            addCriterion("PassengerInfo <=", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoLike(String value) {
            addCriterion("PassengerInfo like", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoNotLike(String value) {
            addCriterion("PassengerInfo not like", value, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoIn(List<String> values) {
            addCriterion("PassengerInfo in", values, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoNotIn(List<String> values) {
            addCriterion("PassengerInfo not in", values, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoBetween(String value1, String value2) {
            addCriterion("PassengerInfo between", value1, value2, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andPassengerinfoNotBetween(String value1, String value2) {
            addCriterion("PassengerInfo not between", value1, value2, "passengerinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoIsNull() {
            addCriterion("OutTicketInfo is null");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoIsNotNull() {
            addCriterion("OutTicketInfo is not null");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoEqualTo(String value) {
            addCriterion("OutTicketInfo =", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoNotEqualTo(String value) {
            addCriterion("OutTicketInfo <>", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoGreaterThan(String value) {
            addCriterion("OutTicketInfo >", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoGreaterThanOrEqualTo(String value) {
            addCriterion("OutTicketInfo >=", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoLessThan(String value) {
            addCriterion("OutTicketInfo <", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoLessThanOrEqualTo(String value) {
            addCriterion("OutTicketInfo <=", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoLike(String value) {
            addCriterion("OutTicketInfo like", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoNotLike(String value) {
            addCriterion("OutTicketInfo not like", value, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoIn(List<String> values) {
            addCriterion("OutTicketInfo in", values, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoNotIn(List<String> values) {
            addCriterion("OutTicketInfo not in", values, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoBetween(String value1, String value2) {
            addCriterion("OutTicketInfo between", value1, value2, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andOutticketinfoNotBetween(String value1, String value2) {
            addCriterion("OutTicketInfo not between", value1, value2, "outticketinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNull() {
            addCriterion("RefundInfo is null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIsNotNull() {
            addCriterion("RefundInfo is not null");
            return (Criteria) this;
        }

        public Criteria andRefundinfoEqualTo(String value) {
            addCriterion("RefundInfo =", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotEqualTo(String value) {
            addCriterion("RefundInfo <>", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThan(String value) {
            addCriterion("RefundInfo >", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoGreaterThanOrEqualTo(String value) {
            addCriterion("RefundInfo >=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThan(String value) {
            addCriterion("RefundInfo <", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLessThanOrEqualTo(String value) {
            addCriterion("RefundInfo <=", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoLike(String value) {
            addCriterion("RefundInfo like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotLike(String value) {
            addCriterion("RefundInfo not like", value, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoIn(List<String> values) {
            addCriterion("RefundInfo in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotIn(List<String> values) {
            addCriterion("RefundInfo not in", values, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoBetween(String value1, String value2) {
            addCriterion("RefundInfo between", value1, value2, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andRefundinfoNotBetween(String value1, String value2) {
            addCriterion("RefundInfo not between", value1, value2, "refundinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoIsNull() {
            addCriterion("ChangeInfo is null");
            return (Criteria) this;
        }

        public Criteria andChangeinfoIsNotNull() {
            addCriterion("ChangeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andChangeinfoEqualTo(String value) {
            addCriterion("ChangeInfo =", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoNotEqualTo(String value) {
            addCriterion("ChangeInfo <>", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoGreaterThan(String value) {
            addCriterion("ChangeInfo >", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ChangeInfo >=", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoLessThan(String value) {
            addCriterion("ChangeInfo <", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoLessThanOrEqualTo(String value) {
            addCriterion("ChangeInfo <=", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoLike(String value) {
            addCriterion("ChangeInfo like", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoNotLike(String value) {
            addCriterion("ChangeInfo not like", value, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoIn(List<String> values) {
            addCriterion("ChangeInfo in", values, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoNotIn(List<String> values) {
            addCriterion("ChangeInfo not in", values, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoBetween(String value1, String value2) {
            addCriterion("ChangeInfo between", value1, value2, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andChangeinfoNotBetween(String value1, String value2) {
            addCriterion("ChangeInfo not between", value1, value2, "changeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoIsNull() {
            addCriterion("FlightChangeInfo is null");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoIsNotNull() {
            addCriterion("FlightChangeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoEqualTo(String value) {
            addCriterion("FlightChangeInfo =", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoNotEqualTo(String value) {
            addCriterion("FlightChangeInfo <>", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoGreaterThan(String value) {
            addCriterion("FlightChangeInfo >", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("FlightChangeInfo >=", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoLessThan(String value) {
            addCriterion("FlightChangeInfo <", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoLessThanOrEqualTo(String value) {
            addCriterion("FlightChangeInfo <=", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoLike(String value) {
            addCriterion("FlightChangeInfo like", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoNotLike(String value) {
            addCriterion("FlightChangeInfo not like", value, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoIn(List<String> values) {
            addCriterion("FlightChangeInfo in", values, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoNotIn(List<String> values) {
            addCriterion("FlightChangeInfo not in", values, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoBetween(String value1, String value2) {
            addCriterion("FlightChangeInfo between", value1, value2, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andFlightchangeinfoNotBetween(String value1, String value2) {
            addCriterion("FlightChangeInfo not between", value1, value2, "flightchangeinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNull() {
            addCriterion("OtherInfo is null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIsNotNull() {
            addCriterion("OtherInfo is not null");
            return (Criteria) this;
        }

        public Criteria andOtherinfoEqualTo(String value) {
            addCriterion("OtherInfo =", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotEqualTo(String value) {
            addCriterion("OtherInfo <>", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThan(String value) {
            addCriterion("OtherInfo >", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoGreaterThanOrEqualTo(String value) {
            addCriterion("OtherInfo >=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThan(String value) {
            addCriterion("OtherInfo <", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLessThanOrEqualTo(String value) {
            addCriterion("OtherInfo <=", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoLike(String value) {
            addCriterion("OtherInfo like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotLike(String value) {
            addCriterion("OtherInfo not like", value, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoIn(List<String> values) {
            addCriterion("OtherInfo in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotIn(List<String> values) {
            addCriterion("OtherInfo not in", values, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoBetween(String value1, String value2) {
            addCriterion("OtherInfo between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andOtherinfoNotBetween(String value1, String value2) {
            addCriterion("OtherInfo not between", value1, value2, "otherinfo");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}