package com.tzq.dal.model.rulesetting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CurrencySettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CurrencySettingExample() {
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

        public Criteria andAduitleavemoneyIsNull() {
            addCriterion("AduitLeaveMoney is null");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyIsNotNull() {
            addCriterion("AduitLeaveMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyEqualTo(BigDecimal value) {
            addCriterion("AduitLeaveMoney =", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyNotEqualTo(BigDecimal value) {
            addCriterion("AduitLeaveMoney <>", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyGreaterThan(BigDecimal value) {
            addCriterion("AduitLeaveMoney >", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitLeaveMoney >=", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyLessThan(BigDecimal value) {
            addCriterion("AduitLeaveMoney <", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitLeaveMoney <=", value, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyIn(List<BigDecimal> values) {
            addCriterion("AduitLeaveMoney in", values, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyNotIn(List<BigDecimal> values) {
            addCriterion("AduitLeaveMoney not in", values, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitLeaveMoney between", value1, value2, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitLeaveMoney not between", value1, value2, "aduitleavemoney");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointIsNull() {
            addCriterion("AduitLeavePoint is null");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointIsNotNull() {
            addCriterion("AduitLeavePoint is not null");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointEqualTo(BigDecimal value) {
            addCriterion("AduitLeavePoint =", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointNotEqualTo(BigDecimal value) {
            addCriterion("AduitLeavePoint <>", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointGreaterThan(BigDecimal value) {
            addCriterion("AduitLeavePoint >", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitLeavePoint >=", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointLessThan(BigDecimal value) {
            addCriterion("AduitLeavePoint <", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitLeavePoint <=", value, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointIn(List<BigDecimal> values) {
            addCriterion("AduitLeavePoint in", values, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointNotIn(List<BigDecimal> values) {
            addCriterion("AduitLeavePoint not in", values, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitLeavePoint between", value1, value2, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduitleavepointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitLeavePoint not between", value1, value2, "aduitleavepoint");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyIsNull() {
            addCriterion("AduitTaxAddMoeny is null");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyIsNotNull() {
            addCriterion("AduitTaxAddMoeny is not null");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyEqualTo(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny =", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyNotEqualTo(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny <>", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyGreaterThan(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny >", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny >=", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyLessThan(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny <", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitTaxAddMoeny <=", value, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyIn(List<BigDecimal> values) {
            addCriterion("AduitTaxAddMoeny in", values, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyNotIn(List<BigDecimal> values) {
            addCriterion("AduitTaxAddMoeny not in", values, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitTaxAddMoeny between", value1, value2, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andAduittaxaddmoenyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitTaxAddMoeny not between", value1, value2, "aduittaxaddmoeny");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyIsNull() {
            addCriterion("ChildLeaveMoney is null");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyIsNotNull() {
            addCriterion("ChildLeaveMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyEqualTo(BigDecimal value) {
            addCriterion("ChildLeaveMoney =", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyNotEqualTo(BigDecimal value) {
            addCriterion("ChildLeaveMoney <>", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyGreaterThan(BigDecimal value) {
            addCriterion("ChildLeaveMoney >", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildLeaveMoney >=", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyLessThan(BigDecimal value) {
            addCriterion("ChildLeaveMoney <", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildLeaveMoney <=", value, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyIn(List<BigDecimal> values) {
            addCriterion("ChildLeaveMoney in", values, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyNotIn(List<BigDecimal> values) {
            addCriterion("ChildLeaveMoney not in", values, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildLeaveMoney between", value1, value2, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildLeaveMoney not between", value1, value2, "childleavemoney");
            return (Criteria) this;
        }

        public Criteria andChildleavepointIsNull() {
            addCriterion("ChildLeavePoint is null");
            return (Criteria) this;
        }

        public Criteria andChildleavepointIsNotNull() {
            addCriterion("ChildLeavePoint is not null");
            return (Criteria) this;
        }

        public Criteria andChildleavepointEqualTo(BigDecimal value) {
            addCriterion("ChildLeavePoint =", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointNotEqualTo(BigDecimal value) {
            addCriterion("ChildLeavePoint <>", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointGreaterThan(BigDecimal value) {
            addCriterion("ChildLeavePoint >", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildLeavePoint >=", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointLessThan(BigDecimal value) {
            addCriterion("ChildLeavePoint <", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildLeavePoint <=", value, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointIn(List<BigDecimal> values) {
            addCriterion("ChildLeavePoint in", values, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointNotIn(List<BigDecimal> values) {
            addCriterion("ChildLeavePoint not in", values, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildLeavePoint between", value1, value2, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildleavepointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildLeavePoint not between", value1, value2, "childleavepoint");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyIsNull() {
            addCriterion("ChildTaxAddMoney is null");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyIsNotNull() {
            addCriterion("ChildTaxAddMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyEqualTo(BigDecimal value) {
            addCriterion("ChildTaxAddMoney =", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyNotEqualTo(BigDecimal value) {
            addCriterion("ChildTaxAddMoney <>", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyGreaterThan(BigDecimal value) {
            addCriterion("ChildTaxAddMoney >", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildTaxAddMoney >=", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyLessThan(BigDecimal value) {
            addCriterion("ChildTaxAddMoney <", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildTaxAddMoney <=", value, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyIn(List<BigDecimal> values) {
            addCriterion("ChildTaxAddMoney in", values, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyNotIn(List<BigDecimal> values) {
            addCriterion("ChildTaxAddMoney not in", values, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildTaxAddMoney between", value1, value2, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andChildtaxaddmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildTaxAddMoney not between", value1, value2, "childtaxaddmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyIsNull() {
            addCriterion("AllowLossMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyIsNotNull() {
            addCriterion("AllowLossMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyEqualTo(BigDecimal value) {
            addCriterion("AllowLossMoney =", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyNotEqualTo(BigDecimal value) {
            addCriterion("AllowLossMoney <>", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyGreaterThan(BigDecimal value) {
            addCriterion("AllowLossMoney >", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AllowLossMoney >=", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyLessThan(BigDecimal value) {
            addCriterion("AllowLossMoney <", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AllowLossMoney <=", value, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyIn(List<BigDecimal> values) {
            addCriterion("AllowLossMoney in", values, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyNotIn(List<BigDecimal> values) {
            addCriterion("AllowLossMoney not in", values, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AllowLossMoney between", value1, value2, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andAllowlossmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AllowLossMoney not between", value1, value2, "allowlossmoney");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateIsNull() {
            addCriterion("ToDepStartDate is null");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateIsNotNull() {
            addCriterion("ToDepStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepStartDate =", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepStartDate <>", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ToDepStartDate >", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepStartDate >=", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateLessThan(Date value) {
            addCriterionForJDBCDate("ToDepStartDate <", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepStartDate <=", value, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("ToDepStartDate in", values, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ToDepStartDate not in", values, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ToDepStartDate between", value1, value2, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodepstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ToDepStartDate not between", value1, value2, "todepstartdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateIsNull() {
            addCriterion("ToDepEndDate is null");
            return (Criteria) this;
        }

        public Criteria andTodependdateIsNotNull() {
            addCriterion("ToDepEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andTodependdateEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepEndDate =", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepEndDate <>", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ToDepEndDate >", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepEndDate >=", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateLessThan(Date value) {
            addCriterionForJDBCDate("ToDepEndDate <", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ToDepEndDate <=", value, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateIn(List<Date> values) {
            addCriterionForJDBCDate("ToDepEndDate in", values, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ToDepEndDate not in", values, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ToDepEndDate between", value1, value2, "todependdate");
            return (Criteria) this;
        }

        public Criteria andTodependdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ToDepEndDate not between", value1, value2, "todependdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateIsNull() {
            addCriterion("BackDepStartDate is null");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateIsNotNull() {
            addCriterion("BackDepStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepStartDate =", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepStartDate <>", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BackDepStartDate >", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepStartDate >=", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateLessThan(Date value) {
            addCriterionForJDBCDate("BackDepStartDate <", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepStartDate <=", value, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("BackDepStartDate in", values, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BackDepStartDate not in", values, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDepStartDate between", value1, value2, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdepstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDepStartDate not between", value1, value2, "backdepstartdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateIsNull() {
            addCriterion("BackDepEndDate is null");
            return (Criteria) this;
        }

        public Criteria andBackdependdateIsNotNull() {
            addCriterion("BackDepEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andBackdependdateEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepEndDate =", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepEndDate <>", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BackDepEndDate >", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepEndDate >=", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateLessThan(Date value) {
            addCriterionForJDBCDate("BackDepEndDate <", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDepEndDate <=", value, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateIn(List<Date> values) {
            addCriterionForJDBCDate("BackDepEndDate in", values, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BackDepEndDate not in", values, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDepEndDate between", value1, value2, "backdependdate");
            return (Criteria) this;
        }

        public Criteria andBackdependdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDepEndDate not between", value1, value2, "backdependdate");
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