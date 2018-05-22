package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public PriceInfoExample() {
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

        public Criteria andSegmentidIsNull() {
            addCriterion("SegmentID is null");
            return (Criteria) this;
        }

        public Criteria andSegmentidIsNotNull() {
            addCriterion("SegmentID is not null");
            return (Criteria) this;
        }

        public Criteria andSegmentidEqualTo(Integer value) {
            addCriterion("SegmentID =", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidNotEqualTo(Integer value) {
            addCriterion("SegmentID <>", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidGreaterThan(Integer value) {
            addCriterion("SegmentID >", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SegmentID >=", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidLessThan(Integer value) {
            addCriterion("SegmentID <", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidLessThanOrEqualTo(Integer value) {
            addCriterion("SegmentID <=", value, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidIn(List<Integer> values) {
            addCriterion("SegmentID in", values, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidNotIn(List<Integer> values) {
            addCriterion("SegmentID not in", values, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidBetween(Integer value1, Integer value2) {
            addCriterion("SegmentID between", value1, value2, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSegmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("SegmentID not between", value1, value2, "segmentid");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNull() {
            addCriterion("SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalespriceIsNotNull() {
            addCriterion("SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalespriceEqualTo(BigDecimal value) {
            addCriterion("SalesPrice =", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <>", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThan(BigDecimal value) {
            addCriterion("SalesPrice >", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice >=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThan(BigDecimal value) {
            addCriterion("SalesPrice <", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <=", value, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceIn(List<BigDecimal> values) {
            addCriterion("SalesPrice in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice not in", values, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice not between", value1, value2, "salesprice");
            return (Criteria) this;
        }

        public Criteria andSalestaxIsNull() {
            addCriterion("SalesTax is null");
            return (Criteria) this;
        }

        public Criteria andSalestaxIsNotNull() {
            addCriterion("SalesTax is not null");
            return (Criteria) this;
        }

        public Criteria andSalestaxEqualTo(BigDecimal value) {
            addCriterion("SalesTax =", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotEqualTo(BigDecimal value) {
            addCriterion("SalesTax <>", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxGreaterThan(BigDecimal value) {
            addCriterion("SalesTax >", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesTax >=", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxLessThan(BigDecimal value) {
            addCriterion("SalesTax <", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesTax <=", value, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxIn(List<BigDecimal> values) {
            addCriterion("SalesTax in", values, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotIn(List<BigDecimal> values) {
            addCriterion("SalesTax not in", values, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesTax between", value1, value2, "salestax");
            return (Criteria) this;
        }

        public Criteria andSalestaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesTax not between", value1, value2, "salestax");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNull() {
            addCriterion("PriceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("PriceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(String value) {
            addCriterion("PriceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(String value) {
            addCriterion("PriceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(String value) {
            addCriterion("PriceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("PriceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(String value) {
            addCriterion("PriceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(String value) {
            addCriterion("PriceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLike(String value) {
            addCriterion("PriceType like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotLike(String value) {
            addCriterion("PriceType not like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<String> values) {
            addCriterion("PriceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<String> values) {
            addCriterion("PriceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(String value1, String value2) {
            addCriterion("PriceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(String value1, String value2) {
            addCriterion("PriceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNull() {
            addCriterion("PurchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNotNull() {
            addCriterion("PurchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice =", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <>", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThan(BigDecimal value) {
            addCriterion("PurchasePrice >", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice >=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThan(BigDecimal value) {
            addCriterion("PurchasePrice <", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchasePrice <=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotIn(List<BigDecimal> values) {
            addCriterion("PurchasePrice not in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchasePrice not between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxIsNull() {
            addCriterion("PurchaseTax is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxIsNotNull() {
            addCriterion("PurchaseTax is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxEqualTo(BigDecimal value) {
            addCriterion("PurchaseTax =", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxNotEqualTo(BigDecimal value) {
            addCriterion("PurchaseTax <>", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxGreaterThan(BigDecimal value) {
            addCriterion("PurchaseTax >", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseTax >=", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxLessThan(BigDecimal value) {
            addCriterion("PurchaseTax <", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PurchaseTax <=", value, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxIn(List<BigDecimal> values) {
            addCriterion("PurchaseTax in", values, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxNotIn(List<BigDecimal> values) {
            addCriterion("PurchaseTax not in", values, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseTax between", value1, value2, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPurchasetaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PurchaseTax not between", value1, value2, "purchasetax");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointIsNull() {
            addCriterion("PolicyReturnPoint is null");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointIsNotNull() {
            addCriterion("PolicyReturnPoint is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointEqualTo(BigDecimal value) {
            addCriterion("PolicyReturnPoint =", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointNotEqualTo(BigDecimal value) {
            addCriterion("PolicyReturnPoint <>", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointGreaterThan(BigDecimal value) {
            addCriterion("PolicyReturnPoint >", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PolicyReturnPoint >=", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointLessThan(BigDecimal value) {
            addCriterion("PolicyReturnPoint <", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PolicyReturnPoint <=", value, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointIn(List<BigDecimal> values) {
            addCriterion("PolicyReturnPoint in", values, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointNotIn(List<BigDecimal> values) {
            addCriterion("PolicyReturnPoint not in", values, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PolicyReturnPoint between", value1, value2, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andPolicyreturnpointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PolicyReturnPoint not between", value1, value2, "policyreturnpoint");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIsNull() {
            addCriterion("SettlementPrice is null");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIsNotNull() {
            addCriterion("SettlementPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceEqualTo(BigDecimal value) {
            addCriterion("SettlementPrice =", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotEqualTo(BigDecimal value) {
            addCriterion("SettlementPrice <>", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceGreaterThan(BigDecimal value) {
            addCriterion("SettlementPrice >", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementPrice >=", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceLessThan(BigDecimal value) {
            addCriterion("SettlementPrice <", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SettlementPrice <=", value, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceIn(List<BigDecimal> values) {
            addCriterion("SettlementPrice in", values, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotIn(List<BigDecimal> values) {
            addCriterion("SettlementPrice not in", values, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementPrice between", value1, value2, "settlementprice");
            return (Criteria) this;
        }

        public Criteria andSettlementpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SettlementPrice not between", value1, value2, "settlementprice");
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