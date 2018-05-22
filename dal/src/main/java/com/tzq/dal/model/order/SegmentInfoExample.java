package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SegmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SegmentInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSegmenttypeIsNull() {
            addCriterion("SegmentType is null");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeIsNotNull() {
            addCriterion("SegmentType is not null");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeEqualTo(Integer value) {
            addCriterion("SegmentType =", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeNotEqualTo(Integer value) {
            addCriterion("SegmentType <>", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeGreaterThan(Integer value) {
            addCriterion("SegmentType >", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SegmentType >=", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeLessThan(Integer value) {
            addCriterion("SegmentType <", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeLessThanOrEqualTo(Integer value) {
            addCriterion("SegmentType <=", value, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeIn(List<Integer> values) {
            addCriterion("SegmentType in", values, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeNotIn(List<Integer> values) {
            addCriterion("SegmentType not in", values, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeBetween(Integer value1, Integer value2) {
            addCriterion("SegmentType between", value1, value2, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andSegmenttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SegmentType not between", value1, value2, "segmenttype");
            return (Criteria) this;
        }

        public Criteria andDepportIsNull() {
            addCriterion("DepPort is null");
            return (Criteria) this;
        }

        public Criteria andDepportIsNotNull() {
            addCriterion("DepPort is not null");
            return (Criteria) this;
        }

        public Criteria andDepportEqualTo(BigDecimal value) {
            addCriterion("DepPort =", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportNotEqualTo(BigDecimal value) {
            addCriterion("DepPort <>", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportGreaterThan(BigDecimal value) {
            addCriterion("DepPort >", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DepPort >=", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportLessThan(BigDecimal value) {
            addCriterion("DepPort <", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DepPort <=", value, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportIn(List<BigDecimal> values) {
            addCriterion("DepPort in", values, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportNotIn(List<BigDecimal> values) {
            addCriterion("DepPort not in", values, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DepPort between", value1, value2, "depport");
            return (Criteria) this;
        }

        public Criteria andDepportNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DepPort not between", value1, value2, "depport");
            return (Criteria) this;
        }

        public Criteria andArrportIsNull() {
            addCriterion("ArrPort is null");
            return (Criteria) this;
        }

        public Criteria andArrportIsNotNull() {
            addCriterion("ArrPort is not null");
            return (Criteria) this;
        }

        public Criteria andArrportEqualTo(BigDecimal value) {
            addCriterion("ArrPort =", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportNotEqualTo(BigDecimal value) {
            addCriterion("ArrPort <>", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportGreaterThan(BigDecimal value) {
            addCriterion("ArrPort >", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ArrPort >=", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportLessThan(BigDecimal value) {
            addCriterion("ArrPort <", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ArrPort <=", value, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportIn(List<BigDecimal> values) {
            addCriterion("ArrPort in", values, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportNotIn(List<BigDecimal> values) {
            addCriterion("ArrPort not in", values, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ArrPort between", value1, value2, "arrport");
            return (Criteria) this;
        }

        public Criteria andArrportNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ArrPort not between", value1, value2, "arrport");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNull() {
            addCriterion("DepDate is null");
            return (Criteria) this;
        }

        public Criteria andDepdateIsNotNull() {
            addCriterion("DepDate is not null");
            return (Criteria) this;
        }

        public Criteria andDepdateEqualTo(Date value) {
            addCriterionForJDBCDate("DepDate =", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DepDate <>", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThan(Date value) {
            addCriterionForJDBCDate("DepDate >", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DepDate >=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThan(Date value) {
            addCriterionForJDBCDate("DepDate <", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DepDate <=", value, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateIn(List<Date> values) {
            addCriterionForJDBCDate("DepDate in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DepDate not in", values, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DepDate between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andDepdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DepDate not between", value1, value2, "depdate");
            return (Criteria) this;
        }

        public Criteria andDeptimeIsNull() {
            addCriterion("DepTime is null");
            return (Criteria) this;
        }

        public Criteria andDeptimeIsNotNull() {
            addCriterion("DepTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeptimeEqualTo(Date value) {
            addCriterion("DepTime =", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotEqualTo(Date value) {
            addCriterion("DepTime <>", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeGreaterThan(Date value) {
            addCriterion("DepTime >", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DepTime >=", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeLessThan(Date value) {
            addCriterion("DepTime <", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeLessThanOrEqualTo(Date value) {
            addCriterion("DepTime <=", value, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeIn(List<Date> values) {
            addCriterion("DepTime in", values, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotIn(List<Date> values) {
            addCriterion("DepTime not in", values, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeBetween(Date value1, Date value2) {
            addCriterion("DepTime between", value1, value2, "deptime");
            return (Criteria) this;
        }

        public Criteria andDeptimeNotBetween(Date value1, Date value2) {
            addCriterion("DepTime not between", value1, value2, "deptime");
            return (Criteria) this;
        }

        public Criteria andDepterminalIsNull() {
            addCriterion("DepTerminal is null");
            return (Criteria) this;
        }

        public Criteria andDepterminalIsNotNull() {
            addCriterion("DepTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andDepterminalEqualTo(String value) {
            addCriterion("DepTerminal =", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotEqualTo(String value) {
            addCriterion("DepTerminal <>", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalGreaterThan(String value) {
            addCriterion("DepTerminal >", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalGreaterThanOrEqualTo(String value) {
            addCriterion("DepTerminal >=", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLessThan(String value) {
            addCriterion("DepTerminal <", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLessThanOrEqualTo(String value) {
            addCriterion("DepTerminal <=", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalLike(String value) {
            addCriterion("DepTerminal like", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotLike(String value) {
            addCriterion("DepTerminal not like", value, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalIn(List<String> values) {
            addCriterion("DepTerminal in", values, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotIn(List<String> values) {
            addCriterion("DepTerminal not in", values, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalBetween(String value1, String value2) {
            addCriterion("DepTerminal between", value1, value2, "depterminal");
            return (Criteria) this;
        }

        public Criteria andDepterminalNotBetween(String value1, String value2) {
            addCriterion("DepTerminal not between", value1, value2, "depterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalIsNull() {
            addCriterion("ArrTerminal is null");
            return (Criteria) this;
        }

        public Criteria andArrterminalIsNotNull() {
            addCriterion("ArrTerminal is not null");
            return (Criteria) this;
        }

        public Criteria andArrterminalEqualTo(String value) {
            addCriterion("ArrTerminal =", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotEqualTo(String value) {
            addCriterion("ArrTerminal <>", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalGreaterThan(String value) {
            addCriterion("ArrTerminal >", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalGreaterThanOrEqualTo(String value) {
            addCriterion("ArrTerminal >=", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLessThan(String value) {
            addCriterion("ArrTerminal <", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLessThanOrEqualTo(String value) {
            addCriterion("ArrTerminal <=", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalLike(String value) {
            addCriterion("ArrTerminal like", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotLike(String value) {
            addCriterion("ArrTerminal not like", value, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalIn(List<String> values) {
            addCriterion("ArrTerminal in", values, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotIn(List<String> values) {
            addCriterion("ArrTerminal not in", values, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalBetween(String value1, String value2) {
            addCriterion("ArrTerminal between", value1, value2, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andArrterminalNotBetween(String value1, String value2) {
            addCriterion("ArrTerminal not between", value1, value2, "arrterminal");
            return (Criteria) this;
        }

        public Criteria andFlightnoIsNull() {
            addCriterion("FlightNo is null");
            return (Criteria) this;
        }

        public Criteria andFlightnoIsNotNull() {
            addCriterion("FlightNo is not null");
            return (Criteria) this;
        }

        public Criteria andFlightnoEqualTo(BigDecimal value) {
            addCriterion("FlightNo =", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotEqualTo(BigDecimal value) {
            addCriterion("FlightNo <>", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThan(BigDecimal value) {
            addCriterion("FlightNo >", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FlightNo >=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThan(BigDecimal value) {
            addCriterion("FlightNo <", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FlightNo <=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoIn(List<BigDecimal> values) {
            addCriterion("FlightNo in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotIn(List<BigDecimal> values) {
            addCriterion("FlightNo not in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FlightNo between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FlightNo not between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andShareflagIsNull() {
            addCriterion("ShareFlag is null");
            return (Criteria) this;
        }

        public Criteria andShareflagIsNotNull() {
            addCriterion("ShareFlag is not null");
            return (Criteria) this;
        }

        public Criteria andShareflagEqualTo(Integer value) {
            addCriterion("ShareFlag =", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagNotEqualTo(Integer value) {
            addCriterion("ShareFlag <>", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagGreaterThan(Integer value) {
            addCriterion("ShareFlag >", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShareFlag >=", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagLessThan(Integer value) {
            addCriterion("ShareFlag <", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagLessThanOrEqualTo(Integer value) {
            addCriterion("ShareFlag <=", value, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagIn(List<Integer> values) {
            addCriterion("ShareFlag in", values, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagNotIn(List<Integer> values) {
            addCriterion("ShareFlag not in", values, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagBetween(Integer value1, Integer value2) {
            addCriterion("ShareFlag between", value1, value2, "shareflag");
            return (Criteria) this;
        }

        public Criteria andShareflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ShareFlag not between", value1, value2, "shareflag");
            return (Criteria) this;
        }

        public Criteria andCabinIsNull() {
            addCriterion("Cabin is null");
            return (Criteria) this;
        }

        public Criteria andCabinIsNotNull() {
            addCriterion("Cabin is not null");
            return (Criteria) this;
        }

        public Criteria andCabinEqualTo(BigDecimal value) {
            addCriterion("Cabin =", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotEqualTo(BigDecimal value) {
            addCriterion("Cabin <>", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThan(BigDecimal value) {
            addCriterion("Cabin >", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Cabin >=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThan(BigDecimal value) {
            addCriterion("Cabin <", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Cabin <=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinIn(List<BigDecimal> values) {
            addCriterion("Cabin in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotIn(List<BigDecimal> values) {
            addCriterion("Cabin not in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cabin between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Cabin not between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andExtendvalueIsNull() {
            addCriterion("ExtendValue is null");
            return (Criteria) this;
        }

        public Criteria andExtendvalueIsNotNull() {
            addCriterion("ExtendValue is not null");
            return (Criteria) this;
        }

        public Criteria andExtendvalueEqualTo(String value) {
            addCriterion("ExtendValue =", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueNotEqualTo(String value) {
            addCriterion("ExtendValue <>", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueGreaterThan(String value) {
            addCriterion("ExtendValue >", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueGreaterThanOrEqualTo(String value) {
            addCriterion("ExtendValue >=", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueLessThan(String value) {
            addCriterion("ExtendValue <", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueLessThanOrEqualTo(String value) {
            addCriterion("ExtendValue <=", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueLike(String value) {
            addCriterion("ExtendValue like", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueNotLike(String value) {
            addCriterion("ExtendValue not like", value, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueIn(List<String> values) {
            addCriterion("ExtendValue in", values, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueNotIn(List<String> values) {
            addCriterion("ExtendValue not in", values, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueBetween(String value1, String value2) {
            addCriterion("ExtendValue between", value1, value2, "extendvalue");
            return (Criteria) this;
        }

        public Criteria andExtendvalueNotBetween(String value1, String value2) {
            addCriterion("ExtendValue not between", value1, value2, "extendvalue");
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