package com.tzq.dal.model.rulesetting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RefundSettingExample() {
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

        public Criteria andAllnotuserefundmoneyIsNull() {
            addCriterion("AllNotUseRefundMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyIsNotNull() {
            addCriterion("AllNotUseRefundMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyEqualTo(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney =", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyNotEqualTo(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney <>", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyGreaterThan(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney >", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney >=", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyLessThan(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney <", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AllNotUseRefundMoney <=", value, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyIn(List<BigDecimal> values) {
            addCriterion("AllNotUseRefundMoney in", values, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyNotIn(List<BigDecimal> values) {
            addCriterion("AllNotUseRefundMoney not in", values, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AllNotUseRefundMoney between", value1, value2, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andAllnotuserefundmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AllNotUseRefundMoney not between", value1, value2, "allnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyIsNull() {
            addCriterion("PartNotUseRefundMoney is null");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyIsNotNull() {
            addCriterion("PartNotUseRefundMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyEqualTo(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney =", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyNotEqualTo(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney <>", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyGreaterThan(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney >", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney >=", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyLessThan(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney <", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PartNotUseRefundMoney <=", value, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyIn(List<BigDecimal> values) {
            addCriterion("PartNotUseRefundMoney in", values, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyNotIn(List<BigDecimal> values) {
            addCriterion("PartNotUseRefundMoney not in", values, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PartNotUseRefundMoney between", value1, value2, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andPartnotuserefundmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PartNotUseRefundMoney not between", value1, value2, "partnotuserefundmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitIsNull() {
            addCriterion("RefundNoShowTimeLimit is null");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitIsNotNull() {
            addCriterion("RefundNoShowTimeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitEqualTo(Integer value) {
            addCriterion("RefundNoShowTimeLimit =", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitNotEqualTo(Integer value) {
            addCriterion("RefundNoShowTimeLimit <>", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitGreaterThan(Integer value) {
            addCriterion("RefundNoShowTimeLimit >", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("RefundNoShowTimeLimit >=", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitLessThan(Integer value) {
            addCriterion("RefundNoShowTimeLimit <", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitLessThanOrEqualTo(Integer value) {
            addCriterion("RefundNoShowTimeLimit <=", value, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitIn(List<Integer> values) {
            addCriterion("RefundNoShowTimeLimit in", values, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitNotIn(List<Integer> values) {
            addCriterion("RefundNoShowTimeLimit not in", values, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitBetween(Integer value1, Integer value2) {
            addCriterion("RefundNoShowTimeLimit between", value1, value2, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowtimelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("RefundNoShowTimeLimit not between", value1, value2, "refundnoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyIsNull() {
            addCriterion("RefundNoShowMoney is null");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyIsNotNull() {
            addCriterion("RefundNoShowMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyEqualTo(BigDecimal value) {
            addCriterion("RefundNoShowMoney =", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyNotEqualTo(BigDecimal value) {
            addCriterion("RefundNoShowMoney <>", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyGreaterThan(BigDecimal value) {
            addCriterion("RefundNoShowMoney >", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundNoShowMoney >=", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyLessThan(BigDecimal value) {
            addCriterion("RefundNoShowMoney <", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RefundNoShowMoney <=", value, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyIn(List<BigDecimal> values) {
            addCriterion("RefundNoShowMoney in", values, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyNotIn(List<BigDecimal> values) {
            addCriterion("RefundNoShowMoney not in", values, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundNoShowMoney between", value1, value2, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundnoshowmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RefundNoShowMoney not between", value1, value2, "refundnoshowmoney");
            return (Criteria) this;
        }

        public Criteria andRefundchdescIsNull() {
            addCriterion("RefundCHDesc is null");
            return (Criteria) this;
        }

        public Criteria andRefundchdescIsNotNull() {
            addCriterion("RefundCHDesc is not null");
            return (Criteria) this;
        }

        public Criteria andRefundchdescEqualTo(String value) {
            addCriterion("RefundCHDesc =", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescNotEqualTo(String value) {
            addCriterion("RefundCHDesc <>", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescGreaterThan(String value) {
            addCriterion("RefundCHDesc >", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescGreaterThanOrEqualTo(String value) {
            addCriterion("RefundCHDesc >=", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescLessThan(String value) {
            addCriterion("RefundCHDesc <", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescLessThanOrEqualTo(String value) {
            addCriterion("RefundCHDesc <=", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescLike(String value) {
            addCriterion("RefundCHDesc like", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescNotLike(String value) {
            addCriterion("RefundCHDesc not like", value, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescIn(List<String> values) {
            addCriterion("RefundCHDesc in", values, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescNotIn(List<String> values) {
            addCriterion("RefundCHDesc not in", values, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescBetween(String value1, String value2) {
            addCriterion("RefundCHDesc between", value1, value2, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundchdescNotBetween(String value1, String value2) {
            addCriterion("RefundCHDesc not between", value1, value2, "refundchdesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescIsNull() {
            addCriterion("RefundENDesc is null");
            return (Criteria) this;
        }

        public Criteria andRefundendescIsNotNull() {
            addCriterion("RefundENDesc is not null");
            return (Criteria) this;
        }

        public Criteria andRefundendescEqualTo(String value) {
            addCriterion("RefundENDesc =", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescNotEqualTo(String value) {
            addCriterion("RefundENDesc <>", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescGreaterThan(String value) {
            addCriterion("RefundENDesc >", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescGreaterThanOrEqualTo(String value) {
            addCriterion("RefundENDesc >=", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescLessThan(String value) {
            addCriterion("RefundENDesc <", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescLessThanOrEqualTo(String value) {
            addCriterion("RefundENDesc <=", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescLike(String value) {
            addCriterion("RefundENDesc like", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescNotLike(String value) {
            addCriterion("RefundENDesc not like", value, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescIn(List<String> values) {
            addCriterion("RefundENDesc in", values, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescNotIn(List<String> values) {
            addCriterion("RefundENDesc not in", values, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescBetween(String value1, String value2) {
            addCriterion("RefundENDesc between", value1, value2, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andRefundendescNotBetween(String value1, String value2) {
            addCriterion("RefundENDesc not between", value1, value2, "refundendesc");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyIsNull() {
            addCriterion("BeforeTakeOffChangeMoney is null");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyIsNotNull() {
            addCriterion("BeforeTakeOffChangeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyEqualTo(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney =", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyNotEqualTo(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney <>", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyGreaterThan(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney >", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney >=", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyLessThan(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney <", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BeforeTakeOffChangeMoney <=", value, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyIn(List<BigDecimal> values) {
            addCriterion("BeforeTakeOffChangeMoney in", values, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyNotIn(List<BigDecimal> values) {
            addCriterion("BeforeTakeOffChangeMoney not in", values, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeTakeOffChangeMoney between", value1, value2, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andBeforetakeoffchangemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BeforeTakeOffChangeMoney not between", value1, value2, "beforetakeoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyIsNull() {
            addCriterion("AfterTakOffChangeMoney is null");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyIsNotNull() {
            addCriterion("AfterTakOffChangeMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyEqualTo(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney =", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyNotEqualTo(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney <>", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyGreaterThan(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney >", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney >=", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyLessThan(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney <", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AfterTakOffChangeMoney <=", value, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyIn(List<BigDecimal> values) {
            addCriterion("AfterTakOffChangeMoney in", values, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyNotIn(List<BigDecimal> values) {
            addCriterion("AfterTakOffChangeMoney not in", values, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AfterTakOffChangeMoney between", value1, value2, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andAftertakoffchangemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AfterTakOffChangeMoney not between", value1, value2, "aftertakoffchangemoney");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitIsNull() {
            addCriterion("ChangeNoShowTimeLimit is null");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitIsNotNull() {
            addCriterion("ChangeNoShowTimeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitEqualTo(Integer value) {
            addCriterion("ChangeNoShowTimeLimit =", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitNotEqualTo(Integer value) {
            addCriterion("ChangeNoShowTimeLimit <>", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitGreaterThan(Integer value) {
            addCriterion("ChangeNoShowTimeLimit >", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeNoShowTimeLimit >=", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitLessThan(Integer value) {
            addCriterion("ChangeNoShowTimeLimit <", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeNoShowTimeLimit <=", value, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitIn(List<Integer> values) {
            addCriterion("ChangeNoShowTimeLimit in", values, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitNotIn(List<Integer> values) {
            addCriterion("ChangeNoShowTimeLimit not in", values, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitBetween(Integer value1, Integer value2) {
            addCriterion("ChangeNoShowTimeLimit between", value1, value2, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoshowtimelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeNoShowTimeLimit not between", value1, value2, "changenoshowtimelimit");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyIsNull() {
            addCriterion("ChangeNoSwhoMoney is null");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyIsNotNull() {
            addCriterion("ChangeNoSwhoMoney is not null");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyEqualTo(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney =", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyNotEqualTo(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney <>", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyGreaterThan(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney >", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney >=", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyLessThan(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney <", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChangeNoSwhoMoney <=", value, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyIn(List<BigDecimal> values) {
            addCriterion("ChangeNoSwhoMoney in", values, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyNotIn(List<BigDecimal> values) {
            addCriterion("ChangeNoSwhoMoney not in", values, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChangeNoSwhoMoney between", value1, value2, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangenoswhomoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChangeNoSwhoMoney not between", value1, value2, "changenoswhomoney");
            return (Criteria) this;
        }

        public Criteria andChangechdescIsNull() {
            addCriterion("ChangeCHDesc is null");
            return (Criteria) this;
        }

        public Criteria andChangechdescIsNotNull() {
            addCriterion("ChangeCHDesc is not null");
            return (Criteria) this;
        }

        public Criteria andChangechdescEqualTo(String value) {
            addCriterion("ChangeCHDesc =", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescNotEqualTo(String value) {
            addCriterion("ChangeCHDesc <>", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescGreaterThan(String value) {
            addCriterion("ChangeCHDesc >", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescGreaterThanOrEqualTo(String value) {
            addCriterion("ChangeCHDesc >=", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescLessThan(String value) {
            addCriterion("ChangeCHDesc <", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescLessThanOrEqualTo(String value) {
            addCriterion("ChangeCHDesc <=", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescLike(String value) {
            addCriterion("ChangeCHDesc like", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescNotLike(String value) {
            addCriterion("ChangeCHDesc not like", value, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescIn(List<String> values) {
            addCriterion("ChangeCHDesc in", values, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescNotIn(List<String> values) {
            addCriterion("ChangeCHDesc not in", values, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescBetween(String value1, String value2) {
            addCriterion("ChangeCHDesc between", value1, value2, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangechdescNotBetween(String value1, String value2) {
            addCriterion("ChangeCHDesc not between", value1, value2, "changechdesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescIsNull() {
            addCriterion("ChangeENDesc is null");
            return (Criteria) this;
        }

        public Criteria andChangeendescIsNotNull() {
            addCriterion("ChangeENDesc is not null");
            return (Criteria) this;
        }

        public Criteria andChangeendescEqualTo(String value) {
            addCriterion("ChangeENDesc =", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescNotEqualTo(String value) {
            addCriterion("ChangeENDesc <>", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescGreaterThan(String value) {
            addCriterion("ChangeENDesc >", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescGreaterThanOrEqualTo(String value) {
            addCriterion("ChangeENDesc >=", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescLessThan(String value) {
            addCriterion("ChangeENDesc <", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescLessThanOrEqualTo(String value) {
            addCriterion("ChangeENDesc <=", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescLike(String value) {
            addCriterion("ChangeENDesc like", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescNotLike(String value) {
            addCriterion("ChangeENDesc not like", value, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescIn(List<String> values) {
            addCriterion("ChangeENDesc in", values, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescNotIn(List<String> values) {
            addCriterion("ChangeENDesc not in", values, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescBetween(String value1, String value2) {
            addCriterion("ChangeENDesc between", value1, value2, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andChangeendescNotBetween(String value1, String value2) {
            addCriterion("ChangeENDesc not between", value1, value2, "changeendesc");
            return (Criteria) this;
        }

        public Criteria andApplycarriersIsNull() {
            addCriterion("ApplyCarriers is null");
            return (Criteria) this;
        }

        public Criteria andApplycarriersIsNotNull() {
            addCriterion("ApplyCarriers is not null");
            return (Criteria) this;
        }

        public Criteria andApplycarriersEqualTo(String value) {
            addCriterion("ApplyCarriers =", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersNotEqualTo(String value) {
            addCriterion("ApplyCarriers <>", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersGreaterThan(String value) {
            addCriterion("ApplyCarriers >", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyCarriers >=", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersLessThan(String value) {
            addCriterion("ApplyCarriers <", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersLessThanOrEqualTo(String value) {
            addCriterion("ApplyCarriers <=", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersLike(String value) {
            addCriterion("ApplyCarriers like", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersNotLike(String value) {
            addCriterion("ApplyCarriers not like", value, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersIn(List<String> values) {
            addCriterion("ApplyCarriers in", values, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersNotIn(List<String> values) {
            addCriterion("ApplyCarriers not in", values, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersBetween(String value1, String value2) {
            addCriterion("ApplyCarriers between", value1, value2, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andApplycarriersNotBetween(String value1, String value2) {
            addCriterion("ApplyCarriers not between", value1, value2, "applycarriers");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffIsNull() {
            addCriterion("OwnPackageOnOff is null");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffIsNotNull() {
            addCriterion("OwnPackageOnOff is not null");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffEqualTo(Integer value) {
            addCriterion("OwnPackageOnOff =", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffNotEqualTo(Integer value) {
            addCriterion("OwnPackageOnOff <>", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffGreaterThan(Integer value) {
            addCriterion("OwnPackageOnOff >", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("OwnPackageOnOff >=", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffLessThan(Integer value) {
            addCriterion("OwnPackageOnOff <", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffLessThanOrEqualTo(Integer value) {
            addCriterion("OwnPackageOnOff <=", value, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffIn(List<Integer> values) {
            addCriterion("OwnPackageOnOff in", values, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffNotIn(List<Integer> values) {
            addCriterion("OwnPackageOnOff not in", values, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffBetween(Integer value1, Integer value2) {
            addCriterion("OwnPackageOnOff between", value1, value2, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andOwnpackageonoffNotBetween(Integer value1, Integer value2) {
            addCriterion("OwnPackageOnOff not between", value1, value2, "ownpackageonoff");
            return (Criteria) this;
        }

        public Criteria andPackagevalueIsNull() {
            addCriterion("PackageValue is null");
            return (Criteria) this;
        }

        public Criteria andPackagevalueIsNotNull() {
            addCriterion("PackageValue is not null");
            return (Criteria) this;
        }

        public Criteria andPackagevalueEqualTo(Integer value) {
            addCriterion("PackageValue =", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueNotEqualTo(Integer value) {
            addCriterion("PackageValue <>", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueGreaterThan(Integer value) {
            addCriterion("PackageValue >", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("PackageValue >=", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueLessThan(Integer value) {
            addCriterion("PackageValue <", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueLessThanOrEqualTo(Integer value) {
            addCriterion("PackageValue <=", value, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueIn(List<Integer> values) {
            addCriterion("PackageValue in", values, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueNotIn(List<Integer> values) {
            addCriterion("PackageValue not in", values, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueBetween(Integer value1, Integer value2) {
            addCriterion("PackageValue between", value1, value2, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagevalueNotBetween(Integer value1, Integer value2) {
            addCriterion("PackageValue not between", value1, value2, "packagevalue");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIsNull() {
            addCriterion("PackageType is null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIsNotNull() {
            addCriterion("PackageType is not null");
            return (Criteria) this;
        }

        public Criteria andPackagetypeEqualTo(String value) {
            addCriterion("PackageType =", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotEqualTo(String value) {
            addCriterion("PackageType <>", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeGreaterThan(String value) {
            addCriterion("PackageType >", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("PackageType >=", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeLessThan(String value) {
            addCriterion("PackageType <", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeLessThanOrEqualTo(String value) {
            addCriterion("PackageType <=", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeLike(String value) {
            addCriterion("PackageType like", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotLike(String value) {
            addCriterion("PackageType not like", value, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeIn(List<String> values) {
            addCriterion("PackageType in", values, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotIn(List<String> values) {
            addCriterion("PackageType not in", values, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeBetween(String value1, String value2) {
            addCriterion("PackageType between", value1, value2, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackagetypeNotBetween(String value1, String value2) {
            addCriterion("PackageType not between", value1, value2, "packagetype");
            return (Criteria) this;
        }

        public Criteria andPackageendescIsNull() {
            addCriterion("PackageENDesc is null");
            return (Criteria) this;
        }

        public Criteria andPackageendescIsNotNull() {
            addCriterion("PackageENDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPackageendescEqualTo(String value) {
            addCriterion("PackageENDesc =", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescNotEqualTo(String value) {
            addCriterion("PackageENDesc <>", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescGreaterThan(String value) {
            addCriterion("PackageENDesc >", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescGreaterThanOrEqualTo(String value) {
            addCriterion("PackageENDesc >=", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescLessThan(String value) {
            addCriterion("PackageENDesc <", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescLessThanOrEqualTo(String value) {
            addCriterion("PackageENDesc <=", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescLike(String value) {
            addCriterion("PackageENDesc like", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescNotLike(String value) {
            addCriterion("PackageENDesc not like", value, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescIn(List<String> values) {
            addCriterion("PackageENDesc in", values, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescNotIn(List<String> values) {
            addCriterion("PackageENDesc not in", values, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescBetween(String value1, String value2) {
            addCriterion("PackageENDesc between", value1, value2, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackageendescNotBetween(String value1, String value2) {
            addCriterion("PackageENDesc not between", value1, value2, "packageendesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescIsNull() {
            addCriterion("PackageCHDesc is null");
            return (Criteria) this;
        }

        public Criteria andPackagechdescIsNotNull() {
            addCriterion("PackageCHDesc is not null");
            return (Criteria) this;
        }

        public Criteria andPackagechdescEqualTo(String value) {
            addCriterion("PackageCHDesc =", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescNotEqualTo(String value) {
            addCriterion("PackageCHDesc <>", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescGreaterThan(String value) {
            addCriterion("PackageCHDesc >", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescGreaterThanOrEqualTo(String value) {
            addCriterion("PackageCHDesc >=", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescLessThan(String value) {
            addCriterion("PackageCHDesc <", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescLessThanOrEqualTo(String value) {
            addCriterion("PackageCHDesc <=", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescLike(String value) {
            addCriterion("PackageCHDesc like", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescNotLike(String value) {
            addCriterion("PackageCHDesc not like", value, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescIn(List<String> values) {
            addCriterion("PackageCHDesc in", values, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescNotIn(List<String> values) {
            addCriterion("PackageCHDesc not in", values, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescBetween(String value1, String value2) {
            addCriterion("PackageCHDesc between", value1, value2, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andPackagechdescNotBetween(String value1, String value2) {
            addCriterion("PackageCHDesc not between", value1, value2, "packagechdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescIsNull() {
            addCriterion("OtherCHDesc is null");
            return (Criteria) this;
        }

        public Criteria andOtherchdescIsNotNull() {
            addCriterion("OtherCHDesc is not null");
            return (Criteria) this;
        }

        public Criteria andOtherchdescEqualTo(String value) {
            addCriterion("OtherCHDesc =", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescNotEqualTo(String value) {
            addCriterion("OtherCHDesc <>", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescGreaterThan(String value) {
            addCriterion("OtherCHDesc >", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescGreaterThanOrEqualTo(String value) {
            addCriterion("OtherCHDesc >=", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescLessThan(String value) {
            addCriterion("OtherCHDesc <", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescLessThanOrEqualTo(String value) {
            addCriterion("OtherCHDesc <=", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescLike(String value) {
            addCriterion("OtherCHDesc like", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescNotLike(String value) {
            addCriterion("OtherCHDesc not like", value, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescIn(List<String> values) {
            addCriterion("OtherCHDesc in", values, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescNotIn(List<String> values) {
            addCriterion("OtherCHDesc not in", values, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescBetween(String value1, String value2) {
            addCriterion("OtherCHDesc between", value1, value2, "otherchdesc");
            return (Criteria) this;
        }

        public Criteria andOtherchdescNotBetween(String value1, String value2) {
            addCriterion("OtherCHDesc not between", value1, value2, "otherchdesc");
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