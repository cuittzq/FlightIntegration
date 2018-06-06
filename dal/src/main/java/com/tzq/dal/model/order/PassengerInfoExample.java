package com.tzq.dal.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PassengerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public PassengerInfoExample() {
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

        public Criteria andPassengernameIsNull() {
            addCriterion("PassengerName is null");
            return (Criteria) this;
        }

        public Criteria andPassengernameIsNotNull() {
            addCriterion("PassengerName is not null");
            return (Criteria) this;
        }

        public Criteria andPassengernameEqualTo(String value) {
            addCriterion("PassengerName =", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotEqualTo(String value) {
            addCriterion("PassengerName <>", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThan(String value) {
            addCriterion("PassengerName >", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameGreaterThanOrEqualTo(String value) {
            addCriterion("PassengerName >=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThan(String value) {
            addCriterion("PassengerName <", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLessThanOrEqualTo(String value) {
            addCriterion("PassengerName <=", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameLike(String value) {
            addCriterion("PassengerName like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotLike(String value) {
            addCriterion("PassengerName not like", value, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameIn(List<String> values) {
            addCriterion("PassengerName in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotIn(List<String> values) {
            addCriterion("PassengerName not in", values, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameBetween(String value1, String value2) {
            addCriterion("PassengerName between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengernameNotBetween(String value1, String value2) {
            addCriterion("PassengerName not between", value1, value2, "passengername");
            return (Criteria) this;
        }

        public Criteria andPassengertypeIsNull() {
            addCriterion("PassengerType is null");
            return (Criteria) this;
        }

        public Criteria andPassengertypeIsNotNull() {
            addCriterion("PassengerType is not null");
            return (Criteria) this;
        }

        public Criteria andPassengertypeEqualTo(String value) {
            addCriterion("PassengerType =", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeNotEqualTo(String value) {
            addCriterion("PassengerType <>", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeGreaterThan(String value) {
            addCriterion("PassengerType >", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PassengerType >=", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeLessThan(String value) {
            addCriterion("PassengerType <", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeLessThanOrEqualTo(String value) {
            addCriterion("PassengerType <=", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeLike(String value) {
            addCriterion("PassengerType like", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeNotLike(String value) {
            addCriterion("PassengerType not like", value, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeIn(List<String> values) {
            addCriterion("PassengerType in", values, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeNotIn(List<String> values) {
            addCriterion("PassengerType not in", values, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeBetween(String value1, String value2) {
            addCriterion("PassengerType between", value1, value2, "passengertype");
            return (Criteria) this;
        }

        public Criteria andPassengertypeNotBetween(String value1, String value2) {
            addCriterion("PassengerType not between", value1, value2, "passengertype");
            return (Criteria) this;
        }

        public Criteria andBirtydayIsNull() {
            addCriterion("Birtyday is null");
            return (Criteria) this;
        }

        public Criteria andBirtydayIsNotNull() {
            addCriterion("Birtyday is not null");
            return (Criteria) this;
        }

        public Criteria andBirtydayEqualTo(Date value) {
            addCriterionForJDBCDate("Birtyday =", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayNotEqualTo(Date value) {
            addCriterionForJDBCDate("Birtyday <>", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayGreaterThan(Date value) {
            addCriterionForJDBCDate("Birtyday >", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birtyday >=", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayLessThan(Date value) {
            addCriterionForJDBCDate("Birtyday <", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Birtyday <=", value, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayIn(List<Date> values) {
            addCriterionForJDBCDate("Birtyday in", values, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayNotIn(List<Date> values) {
            addCriterionForJDBCDate("Birtyday not in", values, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birtyday between", value1, value2, "birtyday");
            return (Criteria) this;
        }

        public Criteria andBirtydayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Birtyday not between", value1, value2, "birtyday");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CardType is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("CardType =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("CardType <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("CardType >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CardType >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("CardType <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CardType <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("CardType like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("CardType not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("CardType in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("CardType not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("CardType between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("CardType not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNull() {
            addCriterion("CardNum is null");
            return (Criteria) this;
        }

        public Criteria andCardnumIsNotNull() {
            addCriterion("CardNum is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumEqualTo(String value) {
            addCriterion("CardNum =", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotEqualTo(String value) {
            addCriterion("CardNum <>", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThan(String value) {
            addCriterion("CardNum >", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumGreaterThanOrEqualTo(String value) {
            addCriterion("CardNum >=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThan(String value) {
            addCriterion("CardNum <", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLessThanOrEqualTo(String value) {
            addCriterion("CardNum <=", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumLike(String value) {
            addCriterion("CardNum like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotLike(String value) {
            addCriterion("CardNum not like", value, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumIn(List<String> values) {
            addCriterion("CardNum in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotIn(List<String> values) {
            addCriterion("CardNum not in", values, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumBetween(String value1, String value2) {
            addCriterion("CardNum between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardnumNotBetween(String value1, String value2) {
            addCriterion("CardNum not between", value1, value2, "cardnum");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceIsNull() {
            addCriterion("CardIssuePlace is null");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceIsNotNull() {
            addCriterion("CardIssuePlace is not null");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceEqualTo(Integer value) {
            addCriterion("CardIssuePlace =", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceNotEqualTo(Integer value) {
            addCriterion("CardIssuePlace <>", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceGreaterThan(Integer value) {
            addCriterion("CardIssuePlace >", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("CardIssuePlace >=", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceLessThan(Integer value) {
            addCriterion("CardIssuePlace <", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceLessThanOrEqualTo(Integer value) {
            addCriterion("CardIssuePlace <=", value, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceIn(List<Integer> values) {
            addCriterion("CardIssuePlace in", values, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceNotIn(List<Integer> values) {
            addCriterion("CardIssuePlace not in", values, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceBetween(Integer value1, Integer value2) {
            addCriterion("CardIssuePlace between", value1, value2, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardissueplaceNotBetween(Integer value1, Integer value2) {
            addCriterion("CardIssuePlace not between", value1, value2, "cardissueplace");
            return (Criteria) this;
        }

        public Criteria andCardexpiredIsNull() {
            addCriterion("CardExpired is null");
            return (Criteria) this;
        }

        public Criteria andCardexpiredIsNotNull() {
            addCriterion("CardExpired is not null");
            return (Criteria) this;
        }

        public Criteria andCardexpiredEqualTo(Date value) {
            addCriterionForJDBCDate("CardExpired =", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredNotEqualTo(Date value) {
            addCriterionForJDBCDate("CardExpired <>", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredGreaterThan(Date value) {
            addCriterionForJDBCDate("CardExpired >", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CardExpired >=", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredLessThan(Date value) {
            addCriterionForJDBCDate("CardExpired <", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CardExpired <=", value, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredIn(List<Date> values) {
            addCriterionForJDBCDate("CardExpired in", values, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredNotIn(List<Date> values) {
            addCriterionForJDBCDate("CardExpired not in", values, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CardExpired between", value1, value2, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andCardexpiredNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CardExpired not between", value1, value2, "cardexpired");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("Nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("Nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("Nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("Nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("Nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("Nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("Nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("Nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("Nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("Nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("Nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("Nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("Nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("Nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andTicketnoIsNull() {
            addCriterion("TicketNo is null");
            return (Criteria) this;
        }

        public Criteria andTicketnoIsNotNull() {
            addCriterion("TicketNo is not null");
            return (Criteria) this;
        }

        public Criteria andTicketnoEqualTo(String value) {
            addCriterion("TicketNo =", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotEqualTo(String value) {
            addCriterion("TicketNo <>", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThan(String value) {
            addCriterion("TicketNo >", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoGreaterThanOrEqualTo(String value) {
            addCriterion("TicketNo >=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThan(String value) {
            addCriterion("TicketNo <", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLessThanOrEqualTo(String value) {
            addCriterion("TicketNo <=", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoLike(String value) {
            addCriterion("TicketNo like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotLike(String value) {
            addCriterion("TicketNo not like", value, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoIn(List<String> values) {
            addCriterion("TicketNo in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotIn(List<String> values) {
            addCriterion("TicketNo not in", values, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoBetween(String value1, String value2) {
            addCriterion("TicketNo between", value1, value2, "ticketno");
            return (Criteria) this;
        }

        public Criteria andTicketnoNotBetween(String value1, String value2) {
            addCriterion("TicketNo not between", value1, value2, "ticketno");
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