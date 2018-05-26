package com.tzq.dal.model.platsetting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MatchingSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public MatchingSettingExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSalesplatformIsNull() {
            addCriterion("SalesPlatform is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatformIsNotNull() {
            addCriterion("SalesPlatform is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatformEqualTo(String value) {
            addCriterion("SalesPlatform =", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotEqualTo(String value) {
            addCriterion("SalesPlatform <>", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformGreaterThan(String value) {
            addCriterion("SalesPlatform >", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformGreaterThanOrEqualTo(String value) {
            addCriterion("SalesPlatform >=", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformLessThan(String value) {
            addCriterion("SalesPlatform <", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformLessThanOrEqualTo(String value) {
            addCriterion("SalesPlatform <=", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformLike(String value) {
            addCriterion("SalesPlatform like", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotLike(String value) {
            addCriterion("SalesPlatform not like", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformIn(List<String> values) {
            addCriterion("SalesPlatform in", values, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotIn(List<String> values) {
            addCriterion("SalesPlatform not in", values, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformBetween(String value1, String value2) {
            addCriterion("SalesPlatform between", value1, value2, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotBetween(String value1, String value2) {
            addCriterion("SalesPlatform not between", value1, value2, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformIsNull() {
            addCriterion("PurchasePlatform is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformIsNotNull() {
            addCriterion("PurchasePlatform is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformEqualTo(String value) {
            addCriterion("PurchasePlatform =", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotEqualTo(String value) {
            addCriterion("PurchasePlatform <>", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformGreaterThan(String value) {
            addCriterion("PurchasePlatform >", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformGreaterThanOrEqualTo(String value) {
            addCriterion("PurchasePlatform >=", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformLessThan(String value) {
            addCriterion("PurchasePlatform <", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformLessThanOrEqualTo(String value) {
            addCriterion("PurchasePlatform <=", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformLike(String value) {
            addCriterion("PurchasePlatform like", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotLike(String value) {
            addCriterion("PurchasePlatform not like", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformIn(List<String> values) {
            addCriterion("PurchasePlatform in", values, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotIn(List<String> values) {
            addCriterion("PurchasePlatform not in", values, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformBetween(String value1, String value2) {
            addCriterion("PurchasePlatform between", value1, value2, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotBetween(String value1, String value2) {
            addCriterion("PurchasePlatform not between", value1, value2, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeIsNull() {
            addCriterion("VoyageType is null");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeIsNotNull() {
            addCriterion("VoyageType is not null");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeEqualTo(Integer value) {
            addCriterion("VoyageType =", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeNotEqualTo(Integer value) {
            addCriterion("VoyageType <>", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeGreaterThan(Integer value) {
            addCriterion("VoyageType >", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VoyageType >=", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeLessThan(Integer value) {
            addCriterion("VoyageType <", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeLessThanOrEqualTo(Integer value) {
            addCriterion("VoyageType <=", value, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeIn(List<Integer> values) {
            addCriterion("VoyageType in", values, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeNotIn(List<Integer> values) {
            addCriterion("VoyageType not in", values, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeBetween(Integer value1, Integer value2) {
            addCriterion("VoyageType between", value1, value2, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andVoyagetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("VoyageType not between", value1, value2, "voyagetype");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayIsNull() {
            addCriterion("SalesStartDay is null");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayIsNotNull() {
            addCriterion("SalesStartDay is not null");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayEqualTo(Integer value) {
            addCriterion("SalesStartDay =", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayNotEqualTo(Integer value) {
            addCriterion("SalesStartDay <>", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayGreaterThan(Integer value) {
            addCriterion("SalesStartDay >", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesStartDay >=", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayLessThan(Integer value) {
            addCriterion("SalesStartDay <", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayLessThanOrEqualTo(Integer value) {
            addCriterion("SalesStartDay <=", value, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayIn(List<Integer> values) {
            addCriterion("SalesStartDay in", values, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayNotIn(List<Integer> values) {
            addCriterion("SalesStartDay not in", values, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayBetween(Integer value1, Integer value2) {
            addCriterion("SalesStartDay between", value1, value2, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesstartdayNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesStartDay not between", value1, value2, "salesstartday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayIsNull() {
            addCriterion("SalesEndDay is null");
            return (Criteria) this;
        }

        public Criteria andSalesenddayIsNotNull() {
            addCriterion("SalesEndDay is not null");
            return (Criteria) this;
        }

        public Criteria andSalesenddayEqualTo(Integer value) {
            addCriterion("SalesEndDay =", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayNotEqualTo(Integer value) {
            addCriterion("SalesEndDay <>", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayGreaterThan(Integer value) {
            addCriterion("SalesEndDay >", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesEndDay >=", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayLessThan(Integer value) {
            addCriterion("SalesEndDay <", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayLessThanOrEqualTo(Integer value) {
            addCriterion("SalesEndDay <=", value, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayIn(List<Integer> values) {
            addCriterion("SalesEndDay in", values, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayNotIn(List<Integer> values) {
            addCriterion("SalesEndDay not in", values, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayBetween(Integer value1, Integer value2) {
            addCriterion("SalesEndDay between", value1, value2, "salesendday");
            return (Criteria) this;
        }

        public Criteria andSalesenddayNotBetween(Integer value1, Integer value2) {
            addCriterion("SalesEndDay not between", value1, value2, "salesendday");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusIsNull() {
            addCriterion("RefundRuleStatus is null");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusIsNotNull() {
            addCriterion("RefundRuleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusEqualTo(Integer value) {
            addCriterion("RefundRuleStatus =", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusNotEqualTo(Integer value) {
            addCriterion("RefundRuleStatus <>", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusGreaterThan(Integer value) {
            addCriterion("RefundRuleStatus >", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefundRuleStatus >=", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusLessThan(Integer value) {
            addCriterion("RefundRuleStatus <", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusLessThanOrEqualTo(Integer value) {
            addCriterion("RefundRuleStatus <=", value, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusIn(List<Integer> values) {
            addCriterion("RefundRuleStatus in", values, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusNotIn(List<Integer> values) {
            addCriterion("RefundRuleStatus not in", values, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusBetween(Integer value1, Integer value2) {
            addCriterion("RefundRuleStatus between", value1, value2, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andRefundrulestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RefundRuleStatus not between", value1, value2, "refundrulestatus");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIsNull() {
            addCriterion("WeekLimit is null");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIsNotNull() {
            addCriterion("WeekLimit is not null");
            return (Criteria) this;
        }

        public Criteria andWeeklimitEqualTo(String value) {
            addCriterion("WeekLimit =", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotEqualTo(String value) {
            addCriterion("WeekLimit <>", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitGreaterThan(String value) {
            addCriterion("WeekLimit >", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitGreaterThanOrEqualTo(String value) {
            addCriterion("WeekLimit >=", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLessThan(String value) {
            addCriterion("WeekLimit <", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLessThanOrEqualTo(String value) {
            addCriterion("WeekLimit <=", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLike(String value) {
            addCriterion("WeekLimit like", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotLike(String value) {
            addCriterion("WeekLimit not like", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIn(List<String> values) {
            addCriterion("WeekLimit in", values, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotIn(List<String> values) {
            addCriterion("WeekLimit not in", values, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitBetween(String value1, String value2) {
            addCriterion("WeekLimit between", value1, value2, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotBetween(String value1, String value2) {
            addCriterion("WeekLimit not between", value1, value2, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateIsNull() {
            addCriterion("SalesStartDate is null");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateIsNotNull() {
            addCriterion("SalesStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("SalesStartDate =", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SalesStartDate <>", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("SalesStartDate >", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SalesStartDate >=", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateLessThan(Date value) {
            addCriterionForJDBCDate("SalesStartDate <", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SalesStartDate <=", value, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("SalesStartDate in", values, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SalesStartDate not in", values, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SalesStartDate between", value1, value2, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SalesStartDate not between", value1, value2, "salesstartdate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateIsNull() {
            addCriterion("SalesEndDate is null");
            return (Criteria) this;
        }

        public Criteria andSalesenddateIsNotNull() {
            addCriterion("SalesEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andSalesenddateEqualTo(Date value) {
            addCriterionForJDBCDate("SalesEndDate =", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SalesEndDate <>", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("SalesEndDate >", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SalesEndDate >=", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateLessThan(Date value) {
            addCriterionForJDBCDate("SalesEndDate <", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SalesEndDate <=", value, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateIn(List<Date> values) {
            addCriterionForJDBCDate("SalesEndDate in", values, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SalesEndDate not in", values, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SalesEndDate between", value1, value2, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andSalesenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SalesEndDate not between", value1, value2, "salesenddate");
            return (Criteria) this;
        }

        public Criteria andStartworktimeIsNull() {
            addCriterion("StartWorkTime is null");
            return (Criteria) this;
        }

        public Criteria andStartworktimeIsNotNull() {
            addCriterion("StartWorkTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartworktimeEqualTo(Date value) {
            addCriterionForJDBCTime("StartWorkTime =", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("StartWorkTime <>", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeGreaterThan(Date value) {
            addCriterionForJDBCTime("StartWorkTime >", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StartWorkTime >=", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeLessThan(Date value) {
            addCriterionForJDBCTime("StartWorkTime <", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StartWorkTime <=", value, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeIn(List<Date> values) {
            addCriterionForJDBCTime("StartWorkTime in", values, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("StartWorkTime not in", values, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StartWorkTime between", value1, value2, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStartworktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StartWorkTime not between", value1, value2, "startworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeIsNull() {
            addCriterion("StopWorkTime is null");
            return (Criteria) this;
        }

        public Criteria andStopworktimeIsNotNull() {
            addCriterion("StopWorkTime is not null");
            return (Criteria) this;
        }

        public Criteria andStopworktimeEqualTo(Date value) {
            addCriterionForJDBCTime("StopWorkTime =", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("StopWorkTime <>", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeGreaterThan(Date value) {
            addCriterionForJDBCTime("StopWorkTime >", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StopWorkTime >=", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeLessThan(Date value) {
            addCriterionForJDBCTime("StopWorkTime <", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StopWorkTime <=", value, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeIn(List<Date> values) {
            addCriterionForJDBCTime("StopWorkTime in", values, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("StopWorkTime not in", values, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StopWorkTime between", value1, value2, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andStopworktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StopWorkTime not between", value1, value2, "stopworktime");
            return (Criteria) this;
        }

        public Criteria andSettingstatusIsNull() {
            addCriterion("SettingStatus is null");
            return (Criteria) this;
        }

        public Criteria andSettingstatusIsNotNull() {
            addCriterion("SettingStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSettingstatusEqualTo(Integer value) {
            addCriterion("SettingStatus =", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusNotEqualTo(Integer value) {
            addCriterion("SettingStatus <>", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusGreaterThan(Integer value) {
            addCriterion("SettingStatus >", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SettingStatus >=", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusLessThan(Integer value) {
            addCriterion("SettingStatus <", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusLessThanOrEqualTo(Integer value) {
            addCriterion("SettingStatus <=", value, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusIn(List<Integer> values) {
            addCriterion("SettingStatus in", values, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusNotIn(List<Integer> values) {
            addCriterion("SettingStatus not in", values, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusBetween(Integer value1, Integer value2) {
            addCriterion("SettingStatus between", value1, value2, "settingstatus");
            return (Criteria) this;
        }

        public Criteria andSettingstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SettingStatus not between", value1, value2, "settingstatus");
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