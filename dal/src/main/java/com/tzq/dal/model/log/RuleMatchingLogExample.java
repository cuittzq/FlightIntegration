package com.tzq.dal.model.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RuleMatchingLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RuleMatchingLogExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSalesplatformEqualTo(Integer value) {
            addCriterion("SalesPlatform =", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotEqualTo(Integer value) {
            addCriterion("SalesPlatform <>", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformGreaterThan(Integer value) {
            addCriterion("SalesPlatform >", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("SalesPlatform >=", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformLessThan(Integer value) {
            addCriterion("SalesPlatform <", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformLessThanOrEqualTo(Integer value) {
            addCriterion("SalesPlatform <=", value, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformIn(List<Integer> values) {
            addCriterion("SalesPlatform in", values, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotIn(List<Integer> values) {
            addCriterion("SalesPlatform not in", values, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformBetween(Integer value1, Integer value2) {
            addCriterion("SalesPlatform between", value1, value2, "salesplatform");
            return (Criteria) this;
        }

        public Criteria andSalesplatformNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPurchaseplatformEqualTo(Integer value) {
            addCriterion("PurchasePlatform =", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotEqualTo(Integer value) {
            addCriterion("PurchasePlatform <>", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformGreaterThan(Integer value) {
            addCriterion("PurchasePlatform >", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("PurchasePlatform >=", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformLessThan(Integer value) {
            addCriterion("PurchasePlatform <", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformLessThanOrEqualTo(Integer value) {
            addCriterion("PurchasePlatform <=", value, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformIn(List<Integer> values) {
            addCriterion("PurchasePlatform in", values, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotIn(List<Integer> values) {
            addCriterion("PurchasePlatform not in", values, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformBetween(Integer value1, Integer value2) {
            addCriterion("PurchasePlatform between", value1, value2, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatformNotBetween(Integer value1, Integer value2) {
            addCriterion("PurchasePlatform not between", value1, value2, "purchaseplatform");
            return (Criteria) this;
        }

        public Criteria andRequestdateIsNull() {
            addCriterion("RequestDate is null");
            return (Criteria) this;
        }

        public Criteria andRequestdateIsNotNull() {
            addCriterion("RequestDate is not null");
            return (Criteria) this;
        }

        public Criteria andRequestdateEqualTo(Date value) {
            addCriterionForJDBCDate("RequestDate =", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RequestDate <>", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateGreaterThan(Date value) {
            addCriterionForJDBCDate("RequestDate >", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RequestDate >=", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateLessThan(Date value) {
            addCriterionForJDBCDate("RequestDate <", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RequestDate <=", value, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateIn(List<Date> values) {
            addCriterionForJDBCDate("RequestDate in", values, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RequestDate not in", values, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RequestDate between", value1, value2, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequestdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RequestDate not between", value1, value2, "requestdate");
            return (Criteria) this;
        }

        public Criteria andRequesttypeIsNull() {
            addCriterion("RequestType is null");
            return (Criteria) this;
        }

        public Criteria andRequesttypeIsNotNull() {
            addCriterion("RequestType is not null");
            return (Criteria) this;
        }

        public Criteria andRequesttypeEqualTo(String value) {
            addCriterion("RequestType =", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotEqualTo(String value) {
            addCriterion("RequestType <>", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeGreaterThan(String value) {
            addCriterion("RequestType >", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeGreaterThanOrEqualTo(String value) {
            addCriterion("RequestType >=", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLessThan(String value) {
            addCriterion("RequestType <", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLessThanOrEqualTo(String value) {
            addCriterion("RequestType <=", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeLike(String value) {
            addCriterion("RequestType like", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotLike(String value) {
            addCriterion("RequestType not like", value, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeIn(List<String> values) {
            addCriterion("RequestType in", values, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotIn(List<String> values) {
            addCriterion("RequestType not in", values, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeBetween(String value1, String value2) {
            addCriterion("RequestType between", value1, value2, "requesttype");
            return (Criteria) this;
        }

        public Criteria andRequesttypeNotBetween(String value1, String value2) {
            addCriterion("RequestType not between", value1, value2, "requesttype");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNull() {
            addCriterion("Carrier is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNotNull() {
            addCriterion("Carrier is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierEqualTo(String value) {
            addCriterion("Carrier =", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotEqualTo(String value) {
            addCriterion("Carrier <>", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThan(String value) {
            addCriterion("Carrier >", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("Carrier >=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThan(String value) {
            addCriterion("Carrier <", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThanOrEqualTo(String value) {
            addCriterion("Carrier <=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLike(String value) {
            addCriterion("Carrier like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotLike(String value) {
            addCriterion("Carrier not like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierIn(List<String> values) {
            addCriterion("Carrier in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotIn(List<String> values) {
            addCriterion("Carrier not in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierBetween(String value1, String value2) {
            addCriterion("Carrier between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotBetween(String value1, String value2) {
            addCriterion("Carrier not between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andDepcodeIsNull() {
            addCriterion("DepCode is null");
            return (Criteria) this;
        }

        public Criteria andDepcodeIsNotNull() {
            addCriterion("DepCode is not null");
            return (Criteria) this;
        }

        public Criteria andDepcodeEqualTo(String value) {
            addCriterion("DepCode =", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotEqualTo(String value) {
            addCriterion("DepCode <>", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeGreaterThan(String value) {
            addCriterion("DepCode >", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DepCode >=", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLessThan(String value) {
            addCriterion("DepCode <", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLessThanOrEqualTo(String value) {
            addCriterion("DepCode <=", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeLike(String value) {
            addCriterion("DepCode like", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotLike(String value) {
            addCriterion("DepCode not like", value, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeIn(List<String> values) {
            addCriterion("DepCode in", values, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotIn(List<String> values) {
            addCriterion("DepCode not in", values, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeBetween(String value1, String value2) {
            addCriterion("DepCode between", value1, value2, "depcode");
            return (Criteria) this;
        }

        public Criteria andDepcodeNotBetween(String value1, String value2) {
            addCriterion("DepCode not between", value1, value2, "depcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeIsNull() {
            addCriterion("ArrCode is null");
            return (Criteria) this;
        }

        public Criteria andArrcodeIsNotNull() {
            addCriterion("ArrCode is not null");
            return (Criteria) this;
        }

        public Criteria andArrcodeEqualTo(String value) {
            addCriterion("ArrCode =", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotEqualTo(String value) {
            addCriterion("ArrCode <>", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeGreaterThan(String value) {
            addCriterion("ArrCode >", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ArrCode >=", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLessThan(String value) {
            addCriterion("ArrCode <", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLessThanOrEqualTo(String value) {
            addCriterion("ArrCode <=", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeLike(String value) {
            addCriterion("ArrCode like", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotLike(String value) {
            addCriterion("ArrCode not like", value, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeIn(List<String> values) {
            addCriterion("ArrCode in", values, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotIn(List<String> values) {
            addCriterion("ArrCode not in", values, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeBetween(String value1, String value2) {
            addCriterion("ArrCode between", value1, value2, "arrcode");
            return (Criteria) this;
        }

        public Criteria andArrcodeNotBetween(String value1, String value2) {
            addCriterion("ArrCode not between", value1, value2, "arrcode");
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

        public Criteria andBackdateIsNull() {
            addCriterion("BackDate is null");
            return (Criteria) this;
        }

        public Criteria andBackdateIsNotNull() {
            addCriterion("BackDate is not null");
            return (Criteria) this;
        }

        public Criteria andBackdateEqualTo(Date value) {
            addCriterionForJDBCDate("BackDate =", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BackDate <>", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BackDate >", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDate >=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThan(Date value) {
            addCriterionForJDBCDate("BackDate <", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BackDate <=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateIn(List<Date> values) {
            addCriterionForJDBCDate("BackDate in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BackDate not in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDate between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BackDate not between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayIsNull() {
            addCriterion("PlatRuleIDArray is null");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayIsNotNull() {
            addCriterion("PlatRuleIDArray is not null");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayEqualTo(String value) {
            addCriterion("PlatRuleIDArray =", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayNotEqualTo(String value) {
            addCriterion("PlatRuleIDArray <>", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayGreaterThan(String value) {
            addCriterion("PlatRuleIDArray >", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayGreaterThanOrEqualTo(String value) {
            addCriterion("PlatRuleIDArray >=", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayLessThan(String value) {
            addCriterion("PlatRuleIDArray <", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayLessThanOrEqualTo(String value) {
            addCriterion("PlatRuleIDArray <=", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayLike(String value) {
            addCriterion("PlatRuleIDArray like", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayNotLike(String value) {
            addCriterion("PlatRuleIDArray not like", value, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayIn(List<String> values) {
            addCriterion("PlatRuleIDArray in", values, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayNotIn(List<String> values) {
            addCriterion("PlatRuleIDArray not in", values, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayBetween(String value1, String value2) {
            addCriterion("PlatRuleIDArray between", value1, value2, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatruleidarrayNotBetween(String value1, String value2) {
            addCriterion("PlatRuleIDArray not between", value1, value2, "platruleidarray");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueIsNull() {
            addCriterion("PlatRuleValue is null");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueIsNotNull() {
            addCriterion("PlatRuleValue is not null");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueEqualTo(String value) {
            addCriterion("PlatRuleValue =", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueNotEqualTo(String value) {
            addCriterion("PlatRuleValue <>", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueGreaterThan(String value) {
            addCriterion("PlatRuleValue >", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueGreaterThanOrEqualTo(String value) {
            addCriterion("PlatRuleValue >=", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueLessThan(String value) {
            addCriterion("PlatRuleValue <", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueLessThanOrEqualTo(String value) {
            addCriterion("PlatRuleValue <=", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueLike(String value) {
            addCriterion("PlatRuleValue like", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueNotLike(String value) {
            addCriterion("PlatRuleValue not like", value, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueIn(List<String> values) {
            addCriterion("PlatRuleValue in", values, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueNotIn(List<String> values) {
            addCriterion("PlatRuleValue not in", values, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueBetween(String value1, String value2) {
            addCriterion("PlatRuleValue between", value1, value2, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andPlatrulevalueNotBetween(String value1, String value2) {
            addCriterion("PlatRuleValue not between", value1, value2, "platrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayIsNull() {
            addCriterion("SupplierRuleIDArray is null");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayIsNotNull() {
            addCriterion("SupplierRuleIDArray is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayEqualTo(String value) {
            addCriterion("SupplierRuleIDArray =", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayNotEqualTo(String value) {
            addCriterion("SupplierRuleIDArray <>", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayGreaterThan(String value) {
            addCriterion("SupplierRuleIDArray >", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierRuleIDArray >=", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayLessThan(String value) {
            addCriterion("SupplierRuleIDArray <", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayLessThanOrEqualTo(String value) {
            addCriterion("SupplierRuleIDArray <=", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayLike(String value) {
            addCriterion("SupplierRuleIDArray like", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayNotLike(String value) {
            addCriterion("SupplierRuleIDArray not like", value, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayIn(List<String> values) {
            addCriterion("SupplierRuleIDArray in", values, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayNotIn(List<String> values) {
            addCriterion("SupplierRuleIDArray not in", values, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayBetween(String value1, String value2) {
            addCriterion("SupplierRuleIDArray between", value1, value2, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierruleidarrayNotBetween(String value1, String value2) {
            addCriterion("SupplierRuleIDArray not between", value1, value2, "supplierruleidarray");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueIsNull() {
            addCriterion("SupplierRuleValue is null");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueIsNotNull() {
            addCriterion("SupplierRuleValue is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueEqualTo(String value) {
            addCriterion("SupplierRuleValue =", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueNotEqualTo(String value) {
            addCriterion("SupplierRuleValue <>", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueGreaterThan(String value) {
            addCriterion("SupplierRuleValue >", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueGreaterThanOrEqualTo(String value) {
            addCriterion("SupplierRuleValue >=", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueLessThan(String value) {
            addCriterion("SupplierRuleValue <", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueLessThanOrEqualTo(String value) {
            addCriterion("SupplierRuleValue <=", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueLike(String value) {
            addCriterion("SupplierRuleValue like", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueNotLike(String value) {
            addCriterion("SupplierRuleValue not like", value, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueIn(List<String> values) {
            addCriterion("SupplierRuleValue in", values, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueNotIn(List<String> values) {
            addCriterion("SupplierRuleValue not in", values, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueBetween(String value1, String value2) {
            addCriterion("SupplierRuleValue between", value1, value2, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andSupplierrulevalueNotBetween(String value1, String value2) {
            addCriterion("SupplierRuleValue not between", value1, value2, "supplierrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayIsNull() {
            addCriterion("CurrencySalesRuleIDArray is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayIsNotNull() {
            addCriterion("CurrencySalesRuleIDArray is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayEqualTo(String value) {
            addCriterion("CurrencySalesRuleIDArray =", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayNotEqualTo(String value) {
            addCriterion("CurrencySalesRuleIDArray <>", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayGreaterThan(String value) {
            addCriterion("CurrencySalesRuleIDArray >", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencySalesRuleIDArray >=", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayLessThan(String value) {
            addCriterion("CurrencySalesRuleIDArray <", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayLessThanOrEqualTo(String value) {
            addCriterion("CurrencySalesRuleIDArray <=", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayLike(String value) {
            addCriterion("CurrencySalesRuleIDArray like", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayNotLike(String value) {
            addCriterion("CurrencySalesRuleIDArray not like", value, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayIn(List<String> values) {
            addCriterion("CurrencySalesRuleIDArray in", values, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayNotIn(List<String> values) {
            addCriterion("CurrencySalesRuleIDArray not in", values, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayBetween(String value1, String value2) {
            addCriterion("CurrencySalesRuleIDArray between", value1, value2, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesruleidarrayNotBetween(String value1, String value2) {
            addCriterion("CurrencySalesRuleIDArray not between", value1, value2, "currencysalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueIsNull() {
            addCriterion("CurrencySalesRuleValue is null");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueIsNotNull() {
            addCriterion("CurrencySalesRuleValue is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueEqualTo(String value) {
            addCriterion("CurrencySalesRuleValue =", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueNotEqualTo(String value) {
            addCriterion("CurrencySalesRuleValue <>", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueGreaterThan(String value) {
            addCriterion("CurrencySalesRuleValue >", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencySalesRuleValue >=", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueLessThan(String value) {
            addCriterion("CurrencySalesRuleValue <", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueLessThanOrEqualTo(String value) {
            addCriterion("CurrencySalesRuleValue <=", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueLike(String value) {
            addCriterion("CurrencySalesRuleValue like", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueNotLike(String value) {
            addCriterion("CurrencySalesRuleValue not like", value, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueIn(List<String> values) {
            addCriterion("CurrencySalesRuleValue in", values, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueNotIn(List<String> values) {
            addCriterion("CurrencySalesRuleValue not in", values, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueBetween(String value1, String value2) {
            addCriterion("CurrencySalesRuleValue between", value1, value2, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andCurrencysalesrulevalueNotBetween(String value1, String value2) {
            addCriterion("CurrencySalesRuleValue not between", value1, value2, "currencysalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayIsNull() {
            addCriterion("ExactSalesRuleIDArray is null");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayIsNotNull() {
            addCriterion("ExactSalesRuleIDArray is not null");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayEqualTo(String value) {
            addCriterion("ExactSalesRuleIDArray =", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayNotEqualTo(String value) {
            addCriterion("ExactSalesRuleIDArray <>", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayGreaterThan(String value) {
            addCriterion("ExactSalesRuleIDArray >", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayGreaterThanOrEqualTo(String value) {
            addCriterion("ExactSalesRuleIDArray >=", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayLessThan(String value) {
            addCriterion("ExactSalesRuleIDArray <", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayLessThanOrEqualTo(String value) {
            addCriterion("ExactSalesRuleIDArray <=", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayLike(String value) {
            addCriterion("ExactSalesRuleIDArray like", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayNotLike(String value) {
            addCriterion("ExactSalesRuleIDArray not like", value, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayIn(List<String> values) {
            addCriterion("ExactSalesRuleIDArray in", values, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayNotIn(List<String> values) {
            addCriterion("ExactSalesRuleIDArray not in", values, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayBetween(String value1, String value2) {
            addCriterion("ExactSalesRuleIDArray between", value1, value2, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesruleidarrayNotBetween(String value1, String value2) {
            addCriterion("ExactSalesRuleIDArray not between", value1, value2, "exactsalesruleidarray");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueIsNull() {
            addCriterion("ExactSalesRuleValue is null");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueIsNotNull() {
            addCriterion("ExactSalesRuleValue is not null");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueEqualTo(String value) {
            addCriterion("ExactSalesRuleValue =", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueNotEqualTo(String value) {
            addCriterion("ExactSalesRuleValue <>", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueGreaterThan(String value) {
            addCriterion("ExactSalesRuleValue >", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueGreaterThanOrEqualTo(String value) {
            addCriterion("ExactSalesRuleValue >=", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueLessThan(String value) {
            addCriterion("ExactSalesRuleValue <", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueLessThanOrEqualTo(String value) {
            addCriterion("ExactSalesRuleValue <=", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueLike(String value) {
            addCriterion("ExactSalesRuleValue like", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueNotLike(String value) {
            addCriterion("ExactSalesRuleValue not like", value, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueIn(List<String> values) {
            addCriterion("ExactSalesRuleValue in", values, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueNotIn(List<String> values) {
            addCriterion("ExactSalesRuleValue not in", values, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueBetween(String value1, String value2) {
            addCriterion("ExactSalesRuleValue between", value1, value2, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andExactsalesrulevalueNotBetween(String value1, String value2) {
            addCriterion("ExactSalesRuleValue not between", value1, value2, "exactsalesrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayIsNull() {
            addCriterion("RefundRuleIDArray is null");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayIsNotNull() {
            addCriterion("RefundRuleIDArray is not null");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayEqualTo(String value) {
            addCriterion("RefundRuleIDArray =", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayNotEqualTo(String value) {
            addCriterion("RefundRuleIDArray <>", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayGreaterThan(String value) {
            addCriterion("RefundRuleIDArray >", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayGreaterThanOrEqualTo(String value) {
            addCriterion("RefundRuleIDArray >=", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayLessThan(String value) {
            addCriterion("RefundRuleIDArray <", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayLessThanOrEqualTo(String value) {
            addCriterion("RefundRuleIDArray <=", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayLike(String value) {
            addCriterion("RefundRuleIDArray like", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayNotLike(String value) {
            addCriterion("RefundRuleIDArray not like", value, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayIn(List<String> values) {
            addCriterion("RefundRuleIDArray in", values, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayNotIn(List<String> values) {
            addCriterion("RefundRuleIDArray not in", values, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayBetween(String value1, String value2) {
            addCriterion("RefundRuleIDArray between", value1, value2, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundruleidarrayNotBetween(String value1, String value2) {
            addCriterion("RefundRuleIDArray not between", value1, value2, "refundruleidarray");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueIsNull() {
            addCriterion("RefundRuleValue is null");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueIsNotNull() {
            addCriterion("RefundRuleValue is not null");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueEqualTo(String value) {
            addCriterion("RefundRuleValue =", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueNotEqualTo(String value) {
            addCriterion("RefundRuleValue <>", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueGreaterThan(String value) {
            addCriterion("RefundRuleValue >", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueGreaterThanOrEqualTo(String value) {
            addCriterion("RefundRuleValue >=", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueLessThan(String value) {
            addCriterion("RefundRuleValue <", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueLessThanOrEqualTo(String value) {
            addCriterion("RefundRuleValue <=", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueLike(String value) {
            addCriterion("RefundRuleValue like", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueNotLike(String value) {
            addCriterion("RefundRuleValue not like", value, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueIn(List<String> values) {
            addCriterion("RefundRuleValue in", values, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueNotIn(List<String> values) {
            addCriterion("RefundRuleValue not in", values, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueBetween(String value1, String value2) {
            addCriterion("RefundRuleValue between", value1, value2, "refundrulevalue");
            return (Criteria) this;
        }

        public Criteria andRefundrulevalueNotBetween(String value1, String value2) {
            addCriterion("RefundRuleValue not between", value1, value2, "refundrulevalue");
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