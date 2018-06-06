package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OrderInfoExample() {
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

        public Criteria andPnrIsNull() {
            addCriterion("PNR is null");
            return (Criteria) this;
        }

        public Criteria andPnrIsNotNull() {
            addCriterion("PNR is not null");
            return (Criteria) this;
        }

        public Criteria andPnrEqualTo(String value) {
            addCriterion("PNR =", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrNotEqualTo(String value) {
            addCriterion("PNR <>", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrGreaterThan(String value) {
            addCriterion("PNR >", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrGreaterThanOrEqualTo(String value) {
            addCriterion("PNR >=", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrLessThan(String value) {
            addCriterion("PNR <", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrLessThanOrEqualTo(String value) {
            addCriterion("PNR <=", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrLike(String value) {
            addCriterion("PNR like", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrNotLike(String value) {
            addCriterion("PNR not like", value, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrIn(List<String> values) {
            addCriterion("PNR in", values, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrNotIn(List<String> values) {
            addCriterion("PNR not in", values, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrBetween(String value1, String value2) {
            addCriterion("PNR between", value1, value2, "pnr");
            return (Criteria) this;
        }

        public Criteria andPnrNotBetween(String value1, String value2) {
            addCriterion("PNR not between", value1, value2, "pnr");
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

        public Criteria andSalesordernoIsNull() {
            addCriterion("SalesOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andSalesordernoIsNotNull() {
            addCriterion("SalesOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andSalesordernoEqualTo(String value) {
            addCriterion("SalesOrderNo =", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotEqualTo(String value) {
            addCriterion("SalesOrderNo <>", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoGreaterThan(String value) {
            addCriterion("SalesOrderNo >", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoGreaterThanOrEqualTo(String value) {
            addCriterion("SalesOrderNo >=", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLessThan(String value) {
            addCriterion("SalesOrderNo <", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLessThanOrEqualTo(String value) {
            addCriterion("SalesOrderNo <=", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoLike(String value) {
            addCriterion("SalesOrderNo like", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotLike(String value) {
            addCriterion("SalesOrderNo not like", value, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoIn(List<String> values) {
            addCriterion("SalesOrderNo in", values, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotIn(List<String> values) {
            addCriterion("SalesOrderNo not in", values, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoBetween(String value1, String value2) {
            addCriterion("SalesOrderNo between", value1, value2, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andSalesordernoNotBetween(String value1, String value2) {
            addCriterion("SalesOrderNo not between", value1, value2, "salesorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoIsNull() {
            addCriterion("PurchaseOrderNo is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoIsNotNull() {
            addCriterion("PurchaseOrderNo is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoEqualTo(String value) {
            addCriterion("PurchaseOrderNo =", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotEqualTo(String value) {
            addCriterion("PurchaseOrderNo <>", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoGreaterThan(String value) {
            addCriterion("PurchaseOrderNo >", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoGreaterThanOrEqualTo(String value) {
            addCriterion("PurchaseOrderNo >=", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoLessThan(String value) {
            addCriterion("PurchaseOrderNo <", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoLessThanOrEqualTo(String value) {
            addCriterion("PurchaseOrderNo <=", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoLike(String value) {
            addCriterion("PurchaseOrderNo like", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotLike(String value) {
            addCriterion("PurchaseOrderNo not like", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoIn(List<String> values) {
            addCriterion("PurchaseOrderNo in", values, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotIn(List<String> values) {
            addCriterion("PurchaseOrderNo not in", values, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoBetween(String value1, String value2) {
            addCriterion("PurchaseOrderNo between", value1, value2, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotBetween(String value1, String value2) {
            addCriterion("PurchaseOrderNo not between", value1, value2, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andDepcityIsNull() {
            addCriterion("DepCity is null");
            return (Criteria) this;
        }

        public Criteria andDepcityIsNotNull() {
            addCriterion("DepCity is not null");
            return (Criteria) this;
        }

        public Criteria andDepcityEqualTo(String value) {
            addCriterion("DepCity =", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityNotEqualTo(String value) {
            addCriterion("DepCity <>", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityGreaterThan(String value) {
            addCriterion("DepCity >", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityGreaterThanOrEqualTo(String value) {
            addCriterion("DepCity >=", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityLessThan(String value) {
            addCriterion("DepCity <", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityLessThanOrEqualTo(String value) {
            addCriterion("DepCity <=", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityLike(String value) {
            addCriterion("DepCity like", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityNotLike(String value) {
            addCriterion("DepCity not like", value, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityIn(List<String> values) {
            addCriterion("DepCity in", values, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityNotIn(List<String> values) {
            addCriterion("DepCity not in", values, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityBetween(String value1, String value2) {
            addCriterion("DepCity between", value1, value2, "depcity");
            return (Criteria) this;
        }

        public Criteria andDepcityNotBetween(String value1, String value2) {
            addCriterion("DepCity not between", value1, value2, "depcity");
            return (Criteria) this;
        }

        public Criteria andArrcityIsNull() {
            addCriterion("ArrCity is null");
            return (Criteria) this;
        }

        public Criteria andArrcityIsNotNull() {
            addCriterion("ArrCity is not null");
            return (Criteria) this;
        }

        public Criteria andArrcityEqualTo(String value) {
            addCriterion("ArrCity =", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityNotEqualTo(String value) {
            addCriterion("ArrCity <>", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityGreaterThan(String value) {
            addCriterion("ArrCity >", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityGreaterThanOrEqualTo(String value) {
            addCriterion("ArrCity >=", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityLessThan(String value) {
            addCriterion("ArrCity <", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityLessThanOrEqualTo(String value) {
            addCriterion("ArrCity <=", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityLike(String value) {
            addCriterion("ArrCity like", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityNotLike(String value) {
            addCriterion("ArrCity not like", value, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityIn(List<String> values) {
            addCriterion("ArrCity in", values, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityNotIn(List<String> values) {
            addCriterion("ArrCity not in", values, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityBetween(String value1, String value2) {
            addCriterion("ArrCity between", value1, value2, "arrcity");
            return (Criteria) this;
        }

        public Criteria andArrcityNotBetween(String value1, String value2) {
            addCriterion("ArrCity not between", value1, value2, "arrcity");
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

        public Criteria andTotalsalespriceIsNull() {
            addCriterion("TotalSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceIsNotNull() {
            addCriterion("TotalSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceEqualTo(BigDecimal value) {
            addCriterion("TotalSalesPrice =", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("TotalSalesPrice <>", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceGreaterThan(BigDecimal value) {
            addCriterion("TotalSalesPrice >", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalSalesPrice >=", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceLessThan(BigDecimal value) {
            addCriterion("TotalSalesPrice <", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalSalesPrice <=", value, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceIn(List<BigDecimal> values) {
            addCriterion("TotalSalesPrice in", values, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("TotalSalesPrice not in", values, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalSalesPrice between", value1, value2, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalSalesPrice not between", value1, value2, "totalsalesprice");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxIsNull() {
            addCriterion("TotalSalesTax is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxIsNotNull() {
            addCriterion("TotalSalesTax is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxEqualTo(BigDecimal value) {
            addCriterion("TotalSalesTax =", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxNotEqualTo(BigDecimal value) {
            addCriterion("TotalSalesTax <>", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxGreaterThan(BigDecimal value) {
            addCriterion("TotalSalesTax >", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalSalesTax >=", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxLessThan(BigDecimal value) {
            addCriterion("TotalSalesTax <", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalSalesTax <=", value, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxIn(List<BigDecimal> values) {
            addCriterion("TotalSalesTax in", values, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxNotIn(List<BigDecimal> values) {
            addCriterion("TotalSalesTax not in", values, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalSalesTax between", value1, value2, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalsalestaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalSalesTax not between", value1, value2, "totalsalestax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceIsNull() {
            addCriterion("TotalPurchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceIsNotNull() {
            addCriterion("TotalPurchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceEqualTo(BigDecimal value) {
            addCriterion("TotalPurchasePrice =", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceNotEqualTo(BigDecimal value) {
            addCriterion("TotalPurchasePrice <>", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceGreaterThan(BigDecimal value) {
            addCriterion("TotalPurchasePrice >", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchasePrice >=", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceLessThan(BigDecimal value) {
            addCriterion("TotalPurchasePrice <", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchasePrice <=", value, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceIn(List<BigDecimal> values) {
            addCriterion("TotalPurchasePrice in", values, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceNotIn(List<BigDecimal> values) {
            addCriterion("TotalPurchasePrice not in", values, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchasePrice between", value1, value2, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchasePrice not between", value1, value2, "totalpurchaseprice");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxIsNull() {
            addCriterion("TotalPurchaseTax is null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxIsNotNull() {
            addCriterion("TotalPurchaseTax is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseTax =", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxNotEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseTax <>", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxGreaterThan(BigDecimal value) {
            addCriterion("TotalPurchaseTax >", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseTax >=", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxLessThan(BigDecimal value) {
            addCriterion("TotalPurchaseTax <", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TotalPurchaseTax <=", value, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxIn(List<BigDecimal> values) {
            addCriterion("TotalPurchaseTax in", values, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxNotIn(List<BigDecimal> values) {
            addCriterion("TotalPurchaseTax not in", values, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchaseTax between", value1, value2, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andTotalpurchasetaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TotalPurchaseTax not between", value1, value2, "totalpurchasetax");
            return (Criteria) this;
        }

        public Criteria andAuditcountIsNull() {
            addCriterion("AuditCount is null");
            return (Criteria) this;
        }

        public Criteria andAuditcountIsNotNull() {
            addCriterion("AuditCount is not null");
            return (Criteria) this;
        }

        public Criteria andAuditcountEqualTo(Integer value) {
            addCriterion("AuditCount =", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountNotEqualTo(Integer value) {
            addCriterion("AuditCount <>", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountGreaterThan(Integer value) {
            addCriterion("AuditCount >", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuditCount >=", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountLessThan(Integer value) {
            addCriterion("AuditCount <", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountLessThanOrEqualTo(Integer value) {
            addCriterion("AuditCount <=", value, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountIn(List<Integer> values) {
            addCriterion("AuditCount in", values, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountNotIn(List<Integer> values) {
            addCriterion("AuditCount not in", values, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountBetween(Integer value1, Integer value2) {
            addCriterion("AuditCount between", value1, value2, "auditcount");
            return (Criteria) this;
        }

        public Criteria andAuditcountNotBetween(Integer value1, Integer value2) {
            addCriterion("AuditCount not between", value1, value2, "auditcount");
            return (Criteria) this;
        }

        public Criteria andChildcountIsNull() {
            addCriterion("ChildCount is null");
            return (Criteria) this;
        }

        public Criteria andChildcountIsNotNull() {
            addCriterion("ChildCount is not null");
            return (Criteria) this;
        }

        public Criteria andChildcountEqualTo(Integer value) {
            addCriterion("ChildCount =", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotEqualTo(Integer value) {
            addCriterion("ChildCount <>", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountGreaterThan(Integer value) {
            addCriterion("ChildCount >", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChildCount >=", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountLessThan(Integer value) {
            addCriterion("ChildCount <", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountLessThanOrEqualTo(Integer value) {
            addCriterion("ChildCount <=", value, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountIn(List<Integer> values) {
            addCriterion("ChildCount in", values, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotIn(List<Integer> values) {
            addCriterion("ChildCount not in", values, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountBetween(Integer value1, Integer value2) {
            addCriterion("ChildCount between", value1, value2, "childcount");
            return (Criteria) this;
        }

        public Criteria andChildcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ChildCount not between", value1, value2, "childcount");
            return (Criteria) this;
        }

        public Criteria andBabycountIsNull() {
            addCriterion("BabyCount is null");
            return (Criteria) this;
        }

        public Criteria andBabycountIsNotNull() {
            addCriterion("BabyCount is not null");
            return (Criteria) this;
        }

        public Criteria andBabycountEqualTo(Integer value) {
            addCriterion("BabyCount =", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountNotEqualTo(Integer value) {
            addCriterion("BabyCount <>", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountGreaterThan(Integer value) {
            addCriterion("BabyCount >", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BabyCount >=", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountLessThan(Integer value) {
            addCriterion("BabyCount <", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountLessThanOrEqualTo(Integer value) {
            addCriterion("BabyCount <=", value, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountIn(List<Integer> values) {
            addCriterion("BabyCount in", values, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountNotIn(List<Integer> values) {
            addCriterion("BabyCount not in", values, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountBetween(Integer value1, Integer value2) {
            addCriterion("BabyCount between", value1, value2, "babycount");
            return (Criteria) this;
        }

        public Criteria andBabycountNotBetween(Integer value1, Integer value2) {
            addCriterion("BabyCount not between", value1, value2, "babycount");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeIsNull() {
            addCriterion("OutTicketType is null");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeIsNotNull() {
            addCriterion("OutTicketType is not null");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeEqualTo(String value) {
            addCriterion("OutTicketType =", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeNotEqualTo(String value) {
            addCriterion("OutTicketType <>", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeGreaterThan(String value) {
            addCriterion("OutTicketType >", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeGreaterThanOrEqualTo(String value) {
            addCriterion("OutTicketType >=", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeLessThan(String value) {
            addCriterion("OutTicketType <", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeLessThanOrEqualTo(String value) {
            addCriterion("OutTicketType <=", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeLike(String value) {
            addCriterion("OutTicketType like", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeNotLike(String value) {
            addCriterion("OutTicketType not like", value, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeIn(List<String> values) {
            addCriterion("OutTicketType in", values, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeNotIn(List<String> values) {
            addCriterion("OutTicketType not in", values, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeBetween(String value1, String value2) {
            addCriterion("OutTicketType between", value1, value2, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOuttickettypeNotBetween(String value1, String value2) {
            addCriterion("OutTicketType not between", value1, value2, "outtickettype");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyIsNull() {
            addCriterion("OutTicketCompany is null");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyIsNotNull() {
            addCriterion("OutTicketCompany is not null");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyEqualTo(String value) {
            addCriterion("OutTicketCompany =", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyNotEqualTo(String value) {
            addCriterion("OutTicketCompany <>", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyGreaterThan(String value) {
            addCriterion("OutTicketCompany >", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("OutTicketCompany >=", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyLessThan(String value) {
            addCriterion("OutTicketCompany <", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyLessThanOrEqualTo(String value) {
            addCriterion("OutTicketCompany <=", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyLike(String value) {
            addCriterion("OutTicketCompany like", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyNotLike(String value) {
            addCriterion("OutTicketCompany not like", value, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyIn(List<String> values) {
            addCriterion("OutTicketCompany in", values, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyNotIn(List<String> values) {
            addCriterion("OutTicketCompany not in", values, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyBetween(String value1, String value2) {
            addCriterion("OutTicketCompany between", value1, value2, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketcompanyNotBetween(String value1, String value2) {
            addCriterion("OutTicketCompany not between", value1, value2, "outticketcompany");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkIsNull() {
            addCriterion("OutTicketRemark is null");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkIsNotNull() {
            addCriterion("OutTicketRemark is not null");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkEqualTo(String value) {
            addCriterion("OutTicketRemark =", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkNotEqualTo(String value) {
            addCriterion("OutTicketRemark <>", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkGreaterThan(String value) {
            addCriterion("OutTicketRemark >", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkGreaterThanOrEqualTo(String value) {
            addCriterion("OutTicketRemark >=", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkLessThan(String value) {
            addCriterion("OutTicketRemark <", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkLessThanOrEqualTo(String value) {
            addCriterion("OutTicketRemark <=", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkLike(String value) {
            addCriterion("OutTicketRemark like", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkNotLike(String value) {
            addCriterion("OutTicketRemark not like", value, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkIn(List<String> values) {
            addCriterion("OutTicketRemark in", values, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkNotIn(List<String> values) {
            addCriterion("OutTicketRemark not in", values, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkBetween(String value1, String value2) {
            addCriterion("OutTicketRemark between", value1, value2, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andOutticketremarkNotBetween(String value1, String value2) {
            addCriterion("OutTicketRemark not between", value1, value2, "outticketremark");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("LinkName is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("LinkName is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("LinkName =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("LinkName <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("LinkName >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("LinkName >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("LinkName <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("LinkName <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("LinkName like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("LinkName not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("LinkName in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("LinkName not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("LinkName between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("LinkName not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkmobileIsNull() {
            addCriterion("LinkMobile is null");
            return (Criteria) this;
        }

        public Criteria andLinkmobileIsNotNull() {
            addCriterion("LinkMobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmobileEqualTo(String value) {
            addCriterion("LinkMobile =", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileNotEqualTo(String value) {
            addCriterion("LinkMobile <>", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileGreaterThan(String value) {
            addCriterion("LinkMobile >", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileGreaterThanOrEqualTo(String value) {
            addCriterion("LinkMobile >=", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileLessThan(String value) {
            addCriterion("LinkMobile <", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileLessThanOrEqualTo(String value) {
            addCriterion("LinkMobile <=", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileLike(String value) {
            addCriterion("LinkMobile like", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileNotLike(String value) {
            addCriterion("LinkMobile not like", value, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileIn(List<String> values) {
            addCriterion("LinkMobile in", values, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileNotIn(List<String> values) {
            addCriterion("LinkMobile not in", values, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileBetween(String value1, String value2) {
            addCriterion("LinkMobile between", value1, value2, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkmobileNotBetween(String value1, String value2) {
            addCriterion("LinkMobile not between", value1, value2, "linkmobile");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNull() {
            addCriterion("LinkEmail is null");
            return (Criteria) this;
        }

        public Criteria andLinkemailIsNotNull() {
            addCriterion("LinkEmail is not null");
            return (Criteria) this;
        }

        public Criteria andLinkemailEqualTo(String value) {
            addCriterion("LinkEmail =", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotEqualTo(String value) {
            addCriterion("LinkEmail <>", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThan(String value) {
            addCriterion("LinkEmail >", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailGreaterThanOrEqualTo(String value) {
            addCriterion("LinkEmail >=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThan(String value) {
            addCriterion("LinkEmail <", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLessThanOrEqualTo(String value) {
            addCriterion("LinkEmail <=", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailLike(String value) {
            addCriterion("LinkEmail like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotLike(String value) {
            addCriterion("LinkEmail not like", value, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailIn(List<String> values) {
            addCriterion("LinkEmail in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotIn(List<String> values) {
            addCriterion("LinkEmail not in", values, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailBetween(String value1, String value2) {
            addCriterion("LinkEmail between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkemailNotBetween(String value1, String value2) {
            addCriterion("LinkEmail not between", value1, value2, "linkemail");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNull() {
            addCriterion("LinkAddress is null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIsNotNull() {
            addCriterion("LinkAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLinkaddressEqualTo(String value) {
            addCriterion("LinkAddress =", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotEqualTo(String value) {
            addCriterion("LinkAddress <>", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThan(String value) {
            addCriterion("LinkAddress >", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("LinkAddress >=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThan(String value) {
            addCriterion("LinkAddress <", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLessThanOrEqualTo(String value) {
            addCriterion("LinkAddress <=", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressLike(String value) {
            addCriterion("LinkAddress like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotLike(String value) {
            addCriterion("LinkAddress not like", value, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressIn(List<String> values) {
            addCriterion("LinkAddress in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotIn(List<String> values) {
            addCriterion("LinkAddress not in", values, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressBetween(String value1, String value2) {
            addCriterion("LinkAddress between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkaddressNotBetween(String value1, String value2) {
            addCriterion("LinkAddress not between", value1, value2, "linkaddress");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeIsNull() {
            addCriterion("LinkPostCode is null");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeIsNotNull() {
            addCriterion("LinkPostCode is not null");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeEqualTo(String value) {
            addCriterion("LinkPostCode =", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeNotEqualTo(String value) {
            addCriterion("LinkPostCode <>", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeGreaterThan(String value) {
            addCriterion("LinkPostCode >", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LinkPostCode >=", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeLessThan(String value) {
            addCriterion("LinkPostCode <", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeLessThanOrEqualTo(String value) {
            addCriterion("LinkPostCode <=", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeLike(String value) {
            addCriterion("LinkPostCode like", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeNotLike(String value) {
            addCriterion("LinkPostCode not like", value, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeIn(List<String> values) {
            addCriterion("LinkPostCode in", values, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeNotIn(List<String> values) {
            addCriterion("LinkPostCode not in", values, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeBetween(String value1, String value2) {
            addCriterion("LinkPostCode between", value1, value2, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andLinkpostcodeNotBetween(String value1, String value2) {
            addCriterion("LinkPostCode not between", value1, value2, "linkpostcode");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeIsNull() {
            addCriterion("OutTicketTime is null");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeIsNotNull() {
            addCriterion("OutTicketTime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeEqualTo(Date value) {
            addCriterion("OutTicketTime =", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeNotEqualTo(Date value) {
            addCriterion("OutTicketTime <>", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeGreaterThan(Date value) {
            addCriterion("OutTicketTime >", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OutTicketTime >=", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeLessThan(Date value) {
            addCriterion("OutTicketTime <", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeLessThanOrEqualTo(Date value) {
            addCriterion("OutTicketTime <=", value, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeIn(List<Date> values) {
            addCriterion("OutTicketTime in", values, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeNotIn(List<Date> values) {
            addCriterion("OutTicketTime not in", values, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeBetween(Date value1, Date value2) {
            addCriterion("OutTicketTime between", value1, value2, "outtickettime");
            return (Criteria) this;
        }

        public Criteria andOuttickettimeNotBetween(Date value1, Date value2) {
            addCriterion("OutTicketTime not between", value1, value2, "outtickettime");
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