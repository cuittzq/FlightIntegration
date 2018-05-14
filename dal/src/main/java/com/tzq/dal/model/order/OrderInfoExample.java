package com.tzq.dal.model.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andCreattimeIsNull() {
            addCriterion("CreatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("CreatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("CreatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("CreatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("CreatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("CreatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("CreatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("CreatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("CreatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("CreatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("CreatTime not between", value1, value2, "creattime");
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

        public Criteria andOrderstateIsNull() {
            addCriterion("OrderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("OrderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Byte value) {
            addCriterion("OrderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Byte value) {
            addCriterion("OrderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Byte value) {
            addCriterion("OrderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("OrderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Byte value) {
            addCriterion("OrderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Byte value) {
            addCriterion("OrderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Byte> values) {
            addCriterion("OrderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Byte> values) {
            addCriterion("OrderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Byte value1, Byte value2) {
            addCriterion("OrderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Byte value1, Byte value2) {
            addCriterion("OrderState not between", value1, value2, "orderstate");
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

        public Criteria andBacktimeIsNull() {
            addCriterion("BackTime is null");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNotNull() {
            addCriterion("BackTime is not null");
            return (Criteria) this;
        }

        public Criteria andBacktimeEqualTo(Date value) {
            addCriterion("BackTime =", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotEqualTo(Date value) {
            addCriterion("BackTime <>", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThan(Date value) {
            addCriterion("BackTime >", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BackTime >=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThan(Date value) {
            addCriterion("BackTime <", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThanOrEqualTo(Date value) {
            addCriterion("BackTime <=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeIn(List<Date> values) {
            addCriterion("BackTime in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotIn(List<Date> values) {
            addCriterion("BackTime not in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeBetween(Date value1, Date value2) {
            addCriterion("BackTime between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotBetween(Date value1, Date value2) {
            addCriterion("BackTime not between", value1, value2, "backtime");
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

        public Criteria andCabinEqualTo(String value) {
            addCriterion("Cabin =", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotEqualTo(String value) {
            addCriterion("Cabin <>", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThan(String value) {
            addCriterion("Cabin >", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThanOrEqualTo(String value) {
            addCriterion("Cabin >=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThan(String value) {
            addCriterion("Cabin <", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThanOrEqualTo(String value) {
            addCriterion("Cabin <=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLike(String value) {
            addCriterion("Cabin like", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotLike(String value) {
            addCriterion("Cabin not like", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinIn(List<String> values) {
            addCriterion("Cabin in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotIn(List<String> values) {
            addCriterion("Cabin not in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinBetween(String value1, String value2) {
            addCriterion("Cabin between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotBetween(String value1, String value2) {
            addCriterion("Cabin not between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinIsNull() {
            addCriterion("BackCabin is null");
            return (Criteria) this;
        }

        public Criteria andBackcabinIsNotNull() {
            addCriterion("BackCabin is not null");
            return (Criteria) this;
        }

        public Criteria andBackcabinEqualTo(String value) {
            addCriterion("BackCabin =", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinNotEqualTo(String value) {
            addCriterion("BackCabin <>", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinGreaterThan(String value) {
            addCriterion("BackCabin >", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinGreaterThanOrEqualTo(String value) {
            addCriterion("BackCabin >=", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinLessThan(String value) {
            addCriterion("BackCabin <", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinLessThanOrEqualTo(String value) {
            addCriterion("BackCabin <=", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinLike(String value) {
            addCriterion("BackCabin like", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinNotLike(String value) {
            addCriterion("BackCabin not like", value, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinIn(List<String> values) {
            addCriterion("BackCabin in", values, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinNotIn(List<String> values) {
            addCriterion("BackCabin not in", values, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinBetween(String value1, String value2) {
            addCriterion("BackCabin between", value1, value2, "backcabin");
            return (Criteria) this;
        }

        public Criteria andBackcabinNotBetween(String value1, String value2) {
            addCriterion("BackCabin not between", value1, value2, "backcabin");
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

        public Criteria andFlightnoEqualTo(String value) {
            addCriterion("FlightNo =", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotEqualTo(String value) {
            addCriterion("FlightNo <>", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThan(String value) {
            addCriterion("FlightNo >", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoGreaterThanOrEqualTo(String value) {
            addCriterion("FlightNo >=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThan(String value) {
            addCriterion("FlightNo <", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLessThanOrEqualTo(String value) {
            addCriterion("FlightNo <=", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoLike(String value) {
            addCriterion("FlightNo like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotLike(String value) {
            addCriterion("FlightNo not like", value, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoIn(List<String> values) {
            addCriterion("FlightNo in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotIn(List<String> values) {
            addCriterion("FlightNo not in", values, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoBetween(String value1, String value2) {
            addCriterion("FlightNo between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andFlightnoNotBetween(String value1, String value2) {
            addCriterion("FlightNo not between", value1, value2, "flightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoIsNull() {
            addCriterion("BackFlightNo is null");
            return (Criteria) this;
        }

        public Criteria andBackflightnoIsNotNull() {
            addCriterion("BackFlightNo is not null");
            return (Criteria) this;
        }

        public Criteria andBackflightnoEqualTo(String value) {
            addCriterion("BackFlightNo =", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoNotEqualTo(String value) {
            addCriterion("BackFlightNo <>", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoGreaterThan(String value) {
            addCriterion("BackFlightNo >", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoGreaterThanOrEqualTo(String value) {
            addCriterion("BackFlightNo >=", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoLessThan(String value) {
            addCriterion("BackFlightNo <", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoLessThanOrEqualTo(String value) {
            addCriterion("BackFlightNo <=", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoLike(String value) {
            addCriterion("BackFlightNo like", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoNotLike(String value) {
            addCriterion("BackFlightNo not like", value, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoIn(List<String> values) {
            addCriterion("BackFlightNo in", values, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoNotIn(List<String> values) {
            addCriterion("BackFlightNo not in", values, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoBetween(String value1, String value2) {
            addCriterion("BackFlightNo between", value1, value2, "backflightno");
            return (Criteria) this;
        }

        public Criteria andBackflightnoNotBetween(String value1, String value2) {
            addCriterion("BackFlightNo not between", value1, value2, "backflightno");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceIsNull() {
            addCriterion("AduitSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceIsNotNull() {
            addCriterion("AduitSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceEqualTo(BigDecimal value) {
            addCriterion("AduitSalesPrice =", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("AduitSalesPrice <>", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceGreaterThan(BigDecimal value) {
            addCriterion("AduitSalesPrice >", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitSalesPrice >=", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceLessThan(BigDecimal value) {
            addCriterion("AduitSalesPrice <", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitSalesPrice <=", value, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceIn(List<BigDecimal> values) {
            addCriterion("AduitSalesPrice in", values, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("AduitSalesPrice not in", values, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitSalesPrice between", value1, value2, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitSalesPrice not between", value1, value2, "aduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceIsNull() {
            addCriterion("AduitPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceIsNotNull() {
            addCriterion("AduitPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceEqualTo(BigDecimal value) {
            addCriterion("AduitPurchasePirce =", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("AduitPurchasePirce <>", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("AduitPurchasePirce >", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitPurchasePirce >=", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceLessThan(BigDecimal value) {
            addCriterion("AduitPurchasePirce <", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AduitPurchasePirce <=", value, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceIn(List<BigDecimal> values) {
            addCriterion("AduitPurchasePirce in", values, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("AduitPurchasePirce not in", values, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitPurchasePirce between", value1, value2, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andAduitpurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AduitPurchasePirce not between", value1, value2, "aduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceIsNull() {
            addCriterion("ChildSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceIsNotNull() {
            addCriterion("ChildSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceEqualTo(BigDecimal value) {
            addCriterion("ChildSalesPrice =", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("ChildSalesPrice <>", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceGreaterThan(BigDecimal value) {
            addCriterion("ChildSalesPrice >", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildSalesPrice >=", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceLessThan(BigDecimal value) {
            addCriterion("ChildSalesPrice <", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildSalesPrice <=", value, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceIn(List<BigDecimal> values) {
            addCriterion("ChildSalesPrice in", values, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("ChildSalesPrice not in", values, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildSalesPrice between", value1, value2, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildSalesPrice not between", value1, value2, "childsalesprice");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceIsNull() {
            addCriterion("ChildPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceIsNotNull() {
            addCriterion("ChildPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceEqualTo(BigDecimal value) {
            addCriterion("ChildPurchasePirce =", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("ChildPurchasePirce <>", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("ChildPurchasePirce >", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildPurchasePirce >=", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceLessThan(BigDecimal value) {
            addCriterion("ChildPurchasePirce <", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ChildPurchasePirce <=", value, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceIn(List<BigDecimal> values) {
            addCriterion("ChildPurchasePirce in", values, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("ChildPurchasePirce not in", values, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildPurchasePirce between", value1, value2, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andChildpurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ChildPurchasePirce not between", value1, value2, "childpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceIsNull() {
            addCriterion("BabySalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceIsNotNull() {
            addCriterion("BabySalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceEqualTo(BigDecimal value) {
            addCriterion("BabySalesPrice =", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceNotEqualTo(BigDecimal value) {
            addCriterion("BabySalesPrice <>", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceGreaterThan(BigDecimal value) {
            addCriterion("BabySalesPrice >", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BabySalesPrice >=", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceLessThan(BigDecimal value) {
            addCriterion("BabySalesPrice <", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BabySalesPrice <=", value, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceIn(List<BigDecimal> values) {
            addCriterion("BabySalesPrice in", values, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceNotIn(List<BigDecimal> values) {
            addCriterion("BabySalesPrice not in", values, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BabySalesPrice between", value1, value2, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabysalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BabySalesPrice not between", value1, value2, "babysalesprice");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceIsNull() {
            addCriterion("BabyPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceIsNotNull() {
            addCriterion("BabyPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceEqualTo(BigDecimal value) {
            addCriterion("BabyPurchasePirce =", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("BabyPurchasePirce <>", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("BabyPurchasePirce >", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BabyPurchasePirce >=", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceLessThan(BigDecimal value) {
            addCriterion("BabyPurchasePirce <", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BabyPurchasePirce <=", value, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceIn(List<BigDecimal> values) {
            addCriterion("BabyPurchasePirce in", values, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("BabyPurchasePirce not in", values, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BabyPurchasePirce between", value1, value2, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBabypurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BabyPurchasePirce not between", value1, value2, "babypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceIsNull() {
            addCriterion("BackAduitSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceIsNotNull() {
            addCriterion("BackAduitSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceEqualTo(BigDecimal value) {
            addCriterion("BackAduitSalesPrice =", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("BackAduitSalesPrice <>", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceGreaterThan(BigDecimal value) {
            addCriterion("BackAduitSalesPrice >", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackAduitSalesPrice >=", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceLessThan(BigDecimal value) {
            addCriterion("BackAduitSalesPrice <", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackAduitSalesPrice <=", value, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceIn(List<BigDecimal> values) {
            addCriterion("BackAduitSalesPrice in", values, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("BackAduitSalesPrice not in", values, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackAduitSalesPrice between", value1, value2, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackAduitSalesPrice not between", value1, value2, "backaduitsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceIsNull() {
            addCriterion("BackAduitPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceIsNotNull() {
            addCriterion("BackAduitPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceEqualTo(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce =", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce <>", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce >", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce >=", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceLessThan(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce <", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackAduitPurchasePirce <=", value, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceIn(List<BigDecimal> values) {
            addCriterion("BackAduitPurchasePirce in", values, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("BackAduitPurchasePirce not in", values, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackAduitPurchasePirce between", value1, value2, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackaduitpurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackAduitPurchasePirce not between", value1, value2, "backaduitpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceIsNull() {
            addCriterion("BackChildSalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceIsNotNull() {
            addCriterion("BackChildSalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceEqualTo(BigDecimal value) {
            addCriterion("BackChildSalesPrice =", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceNotEqualTo(BigDecimal value) {
            addCriterion("BackChildSalesPrice <>", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceGreaterThan(BigDecimal value) {
            addCriterion("BackChildSalesPrice >", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackChildSalesPrice >=", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceLessThan(BigDecimal value) {
            addCriterion("BackChildSalesPrice <", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackChildSalesPrice <=", value, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceIn(List<BigDecimal> values) {
            addCriterion("BackChildSalesPrice in", values, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceNotIn(List<BigDecimal> values) {
            addCriterion("BackChildSalesPrice not in", values, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackChildSalesPrice between", value1, value2, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildsalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackChildSalesPrice not between", value1, value2, "backchildsalesprice");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceIsNull() {
            addCriterion("BackChildPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceIsNotNull() {
            addCriterion("BackChildPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceEqualTo(BigDecimal value) {
            addCriterion("BackChildPurchasePirce =", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("BackChildPurchasePirce <>", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("BackChildPurchasePirce >", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackChildPurchasePirce >=", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceLessThan(BigDecimal value) {
            addCriterion("BackChildPurchasePirce <", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackChildPurchasePirce <=", value, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceIn(List<BigDecimal> values) {
            addCriterion("BackChildPurchasePirce in", values, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("BackChildPurchasePirce not in", values, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackChildPurchasePirce between", value1, value2, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackchildpurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackChildPurchasePirce not between", value1, value2, "backchildpurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceIsNull() {
            addCriterion("BackBabySalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceIsNotNull() {
            addCriterion("BackBabySalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceEqualTo(BigDecimal value) {
            addCriterion("BackBabySalesPrice =", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceNotEqualTo(BigDecimal value) {
            addCriterion("BackBabySalesPrice <>", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceGreaterThan(BigDecimal value) {
            addCriterion("BackBabySalesPrice >", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackBabySalesPrice >=", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceLessThan(BigDecimal value) {
            addCriterion("BackBabySalesPrice <", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackBabySalesPrice <=", value, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceIn(List<BigDecimal> values) {
            addCriterion("BackBabySalesPrice in", values, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceNotIn(List<BigDecimal> values) {
            addCriterion("BackBabySalesPrice not in", values, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackBabySalesPrice between", value1, value2, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabysalespriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackBabySalesPrice not between", value1, value2, "backbabysalesprice");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceIsNull() {
            addCriterion("BackBabyPurchasePirce is null");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceIsNotNull() {
            addCriterion("BackBabyPurchasePirce is not null");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceEqualTo(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce =", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceNotEqualTo(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce <>", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceGreaterThan(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce >", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce >=", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceLessThan(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce <", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BackBabyPurchasePirce <=", value, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceIn(List<BigDecimal> values) {
            addCriterion("BackBabyPurchasePirce in", values, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceNotIn(List<BigDecimal> values) {
            addCriterion("BackBabyPurchasePirce not in", values, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackBabyPurchasePirce between", value1, value2, "backbabypurchasepirce");
            return (Criteria) this;
        }

        public Criteria andBackbabypurchasepirceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BackBabyPurchasePirce not between", value1, value2, "backbabypurchasepirce");
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