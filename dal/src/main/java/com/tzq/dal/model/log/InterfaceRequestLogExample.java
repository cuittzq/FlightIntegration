package com.tzq.dal.model.log;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InterfaceRequestLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public InterfaceRequestLogExample() {
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

        public Criteria andRequestresultIsNull() {
            addCriterion("RequestResult is null");
            return (Criteria) this;
        }

        public Criteria andRequestresultIsNotNull() {
            addCriterion("RequestResult is not null");
            return (Criteria) this;
        }

        public Criteria andRequestresultEqualTo(Byte value) {
            addCriterion("RequestResult =", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultNotEqualTo(Byte value) {
            addCriterion("RequestResult <>", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultGreaterThan(Byte value) {
            addCriterion("RequestResult >", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultGreaterThanOrEqualTo(Byte value) {
            addCriterion("RequestResult >=", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultLessThan(Byte value) {
            addCriterion("RequestResult <", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultLessThanOrEqualTo(Byte value) {
            addCriterion("RequestResult <=", value, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultIn(List<Byte> values) {
            addCriterion("RequestResult in", values, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultNotIn(List<Byte> values) {
            addCriterion("RequestResult not in", values, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultBetween(Byte value1, Byte value2) {
            addCriterion("RequestResult between", value1, value2, "requestresult");
            return (Criteria) this;
        }

        public Criteria andRequestresultNotBetween(Byte value1, Byte value2) {
            addCriterion("RequestResult not between", value1, value2, "requestresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultIsNull() {
            addCriterion("InterfaceResult is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultIsNotNull() {
            addCriterion("InterfaceResult is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultEqualTo(Byte value) {
            addCriterion("InterfaceResult =", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultNotEqualTo(Byte value) {
            addCriterion("InterfaceResult <>", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultGreaterThan(Byte value) {
            addCriterion("InterfaceResult >", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultGreaterThanOrEqualTo(Byte value) {
            addCriterion("InterfaceResult >=", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultLessThan(Byte value) {
            addCriterion("InterfaceResult <", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultLessThanOrEqualTo(Byte value) {
            addCriterion("InterfaceResult <=", value, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultIn(List<Byte> values) {
            addCriterion("InterfaceResult in", values, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultNotIn(List<Byte> values) {
            addCriterion("InterfaceResult not in", values, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultBetween(Byte value1, Byte value2) {
            addCriterion("InterfaceResult between", value1, value2, "interfaceresult");
            return (Criteria) this;
        }

        public Criteria andInterfaceresultNotBetween(Byte value1, Byte value2) {
            addCriterion("InterfaceResult not between", value1, value2, "interfaceresult");
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

        public Criteria andSalesplatrequesttimeIsNull() {
            addCriterion("SalesPlatRequestTime is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeIsNotNull() {
            addCriterion("SalesPlatRequestTime is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeEqualTo(Date value) {
            addCriterion("SalesPlatRequestTime =", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeNotEqualTo(Date value) {
            addCriterion("SalesPlatRequestTime <>", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeGreaterThan(Date value) {
            addCriterion("SalesPlatRequestTime >", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SalesPlatRequestTime >=", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeLessThan(Date value) {
            addCriterion("SalesPlatRequestTime <", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeLessThanOrEqualTo(Date value) {
            addCriterion("SalesPlatRequestTime <=", value, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeIn(List<Date> values) {
            addCriterion("SalesPlatRequestTime in", values, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeNotIn(List<Date> values) {
            addCriterion("SalesPlatRequestTime not in", values, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeBetween(Date value1, Date value2) {
            addCriterion("SalesPlatRequestTime between", value1, value2, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttimeNotBetween(Date value1, Date value2) {
            addCriterion("SalesPlatRequestTime not between", value1, value2, "salesplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeIsNull() {
            addCriterion("SalesPlatResponseTime is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeIsNotNull() {
            addCriterion("SalesPlatResponseTime is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeEqualTo(Date value) {
            addCriterion("SalesPlatResponseTime =", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeNotEqualTo(Date value) {
            addCriterion("SalesPlatResponseTime <>", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeGreaterThan(Date value) {
            addCriterion("SalesPlatResponseTime >", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SalesPlatResponseTime >=", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeLessThan(Date value) {
            addCriterion("SalesPlatResponseTime <", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("SalesPlatResponseTime <=", value, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeIn(List<Date> values) {
            addCriterion("SalesPlatResponseTime in", values, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeNotIn(List<Date> values) {
            addCriterion("SalesPlatResponseTime not in", values, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeBetween(Date value1, Date value2) {
            addCriterion("SalesPlatResponseTime between", value1, value2, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatresponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("SalesPlatResponseTime not between", value1, value2, "salesplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeIsNull() {
            addCriterion("PurchasePlatRequestTime is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeIsNotNull() {
            addCriterion("PurchasePlatRequestTime is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeEqualTo(Date value) {
            addCriterion("PurchasePlatRequestTime =", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeNotEqualTo(Date value) {
            addCriterion("PurchasePlatRequestTime <>", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeGreaterThan(Date value) {
            addCriterion("PurchasePlatRequestTime >", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PurchasePlatRequestTime >=", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeLessThan(Date value) {
            addCriterion("PurchasePlatRequestTime <", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeLessThanOrEqualTo(Date value) {
            addCriterion("PurchasePlatRequestTime <=", value, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeIn(List<Date> values) {
            addCriterion("PurchasePlatRequestTime in", values, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeNotIn(List<Date> values) {
            addCriterion("PurchasePlatRequestTime not in", values, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeBetween(Date value1, Date value2) {
            addCriterion("PurchasePlatRequestTime between", value1, value2, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttimeNotBetween(Date value1, Date value2) {
            addCriterion("PurchasePlatRequestTime not between", value1, value2, "purchaseplatrequesttime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeIsNull() {
            addCriterion("PurchasePlatResponseTime is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeIsNotNull() {
            addCriterion("PurchasePlatResponseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeEqualTo(Date value) {
            addCriterion("PurchasePlatResponseTime =", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeNotEqualTo(Date value) {
            addCriterion("PurchasePlatResponseTime <>", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeGreaterThan(Date value) {
            addCriterion("PurchasePlatResponseTime >", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PurchasePlatResponseTime >=", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeLessThan(Date value) {
            addCriterion("PurchasePlatResponseTime <", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("PurchasePlatResponseTime <=", value, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeIn(List<Date> values) {
            addCriterion("PurchasePlatResponseTime in", values, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeNotIn(List<Date> values) {
            addCriterion("PurchasePlatResponseTime not in", values, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeBetween(Date value1, Date value2) {
            addCriterion("PurchasePlatResponseTime between", value1, value2, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatresponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("PurchasePlatResponseTime not between", value1, value2, "purchaseplatresponsetime");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipIsNull() {
            addCriterion("SalesPlatRequestIP is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipIsNotNull() {
            addCriterion("SalesPlatRequestIP is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipEqualTo(String value) {
            addCriterion("SalesPlatRequestIP =", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipNotEqualTo(String value) {
            addCriterion("SalesPlatRequestIP <>", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipGreaterThan(String value) {
            addCriterion("SalesPlatRequestIP >", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipGreaterThanOrEqualTo(String value) {
            addCriterion("SalesPlatRequestIP >=", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipLessThan(String value) {
            addCriterion("SalesPlatRequestIP <", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipLessThanOrEqualTo(String value) {
            addCriterion("SalesPlatRequestIP <=", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipLike(String value) {
            addCriterion("SalesPlatRequestIP like", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipNotLike(String value) {
            addCriterion("SalesPlatRequestIP not like", value, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipIn(List<String> values) {
            addCriterion("SalesPlatRequestIP in", values, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipNotIn(List<String> values) {
            addCriterion("SalesPlatRequestIP not in", values, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipBetween(String value1, String value2) {
            addCriterion("SalesPlatRequestIP between", value1, value2, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequestipNotBetween(String value1, String value2) {
            addCriterion("SalesPlatRequestIP not between", value1, value2, "salesplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipIsNull() {
            addCriterion("PurchasePlatRequestIP is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipIsNotNull() {
            addCriterion("PurchasePlatRequestIP is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipEqualTo(String value) {
            addCriterion("PurchasePlatRequestIP =", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipNotEqualTo(String value) {
            addCriterion("PurchasePlatRequestIP <>", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipGreaterThan(String value) {
            addCriterion("PurchasePlatRequestIP >", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipGreaterThanOrEqualTo(String value) {
            addCriterion("PurchasePlatRequestIP >=", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipLessThan(String value) {
            addCriterion("PurchasePlatRequestIP <", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipLessThanOrEqualTo(String value) {
            addCriterion("PurchasePlatRequestIP <=", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipLike(String value) {
            addCriterion("PurchasePlatRequestIP like", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipNotLike(String value) {
            addCriterion("PurchasePlatRequestIP not like", value, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipIn(List<String> values) {
            addCriterion("PurchasePlatRequestIP in", values, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipNotIn(List<String> values) {
            addCriterion("PurchasePlatRequestIP not in", values, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipBetween(String value1, String value2) {
            addCriterion("PurchasePlatRequestIP between", value1, value2, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequestipNotBetween(String value1, String value2) {
            addCriterion("PurchasePlatRequestIP not between", value1, value2, "purchaseplatrequestip");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageIsNull() {
            addCriterion("SalesPlatRequestTipMessage is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageIsNotNull() {
            addCriterion("SalesPlatRequestTipMessage is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageEqualTo(String value) {
            addCriterion("SalesPlatRequestTipMessage =", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageNotEqualTo(String value) {
            addCriterion("SalesPlatRequestTipMessage <>", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageGreaterThan(String value) {
            addCriterion("SalesPlatRequestTipMessage >", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageGreaterThanOrEqualTo(String value) {
            addCriterion("SalesPlatRequestTipMessage >=", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageLessThan(String value) {
            addCriterion("SalesPlatRequestTipMessage <", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageLessThanOrEqualTo(String value) {
            addCriterion("SalesPlatRequestTipMessage <=", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageLike(String value) {
            addCriterion("SalesPlatRequestTipMessage like", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageNotLike(String value) {
            addCriterion("SalesPlatRequestTipMessage not like", value, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageIn(List<String> values) {
            addCriterion("SalesPlatRequestTipMessage in", values, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageNotIn(List<String> values) {
            addCriterion("SalesPlatRequestTipMessage not in", values, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageBetween(String value1, String value2) {
            addCriterion("SalesPlatRequestTipMessage between", value1, value2, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatrequesttipmessageNotBetween(String value1, String value2) {
            addCriterion("SalesPlatRequestTipMessage not between", value1, value2, "salesplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageIsNull() {
            addCriterion("PurchasePlatRequestTipMessage is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageIsNotNull() {
            addCriterion("PurchasePlatRequestTipMessage is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageEqualTo(String value) {
            addCriterion("PurchasePlatRequestTipMessage =", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageNotEqualTo(String value) {
            addCriterion("PurchasePlatRequestTipMessage <>", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageGreaterThan(String value) {
            addCriterion("PurchasePlatRequestTipMessage >", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageGreaterThanOrEqualTo(String value) {
            addCriterion("PurchasePlatRequestTipMessage >=", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageLessThan(String value) {
            addCriterion("PurchasePlatRequestTipMessage <", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageLessThanOrEqualTo(String value) {
            addCriterion("PurchasePlatRequestTipMessage <=", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageLike(String value) {
            addCriterion("PurchasePlatRequestTipMessage like", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageNotLike(String value) {
            addCriterion("PurchasePlatRequestTipMessage not like", value, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageIn(List<String> values) {
            addCriterion("PurchasePlatRequestTipMessage in", values, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageNotIn(List<String> values) {
            addCriterion("PurchasePlatRequestTipMessage not in", values, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageBetween(String value1, String value2) {
            addCriterion("PurchasePlatRequestTipMessage between", value1, value2, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatrequesttipmessageNotBetween(String value1, String value2) {
            addCriterion("PurchasePlatRequestTipMessage not between", value1, value2, "purchaseplatrequesttipmessage");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailIsNull() {
            addCriterion("SalesPlatLogDetail is null");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailIsNotNull() {
            addCriterion("SalesPlatLogDetail is not null");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailEqualTo(String value) {
            addCriterion("SalesPlatLogDetail =", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailNotEqualTo(String value) {
            addCriterion("SalesPlatLogDetail <>", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailGreaterThan(String value) {
            addCriterion("SalesPlatLogDetail >", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailGreaterThanOrEqualTo(String value) {
            addCriterion("SalesPlatLogDetail >=", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailLessThan(String value) {
            addCriterion("SalesPlatLogDetail <", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailLessThanOrEqualTo(String value) {
            addCriterion("SalesPlatLogDetail <=", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailLike(String value) {
            addCriterion("SalesPlatLogDetail like", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailNotLike(String value) {
            addCriterion("SalesPlatLogDetail not like", value, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailIn(List<String> values) {
            addCriterion("SalesPlatLogDetail in", values, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailNotIn(List<String> values) {
            addCriterion("SalesPlatLogDetail not in", values, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailBetween(String value1, String value2) {
            addCriterion("SalesPlatLogDetail between", value1, value2, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andSalesplatlogdetailNotBetween(String value1, String value2) {
            addCriterion("SalesPlatLogDetail not between", value1, value2, "salesplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailIsNull() {
            addCriterion("PurchasePlatLogDetail is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailIsNotNull() {
            addCriterion("PurchasePlatLogDetail is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailEqualTo(String value) {
            addCriterion("PurchasePlatLogDetail =", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailNotEqualTo(String value) {
            addCriterion("PurchasePlatLogDetail <>", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailGreaterThan(String value) {
            addCriterion("PurchasePlatLogDetail >", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailGreaterThanOrEqualTo(String value) {
            addCriterion("PurchasePlatLogDetail >=", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailLessThan(String value) {
            addCriterion("PurchasePlatLogDetail <", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailLessThanOrEqualTo(String value) {
            addCriterion("PurchasePlatLogDetail <=", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailLike(String value) {
            addCriterion("PurchasePlatLogDetail like", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailNotLike(String value) {
            addCriterion("PurchasePlatLogDetail not like", value, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailIn(List<String> values) {
            addCriterion("PurchasePlatLogDetail in", values, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailNotIn(List<String> values) {
            addCriterion("PurchasePlatLogDetail not in", values, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailBetween(String value1, String value2) {
            addCriterion("PurchasePlatLogDetail between", value1, value2, "purchaseplatlogdetail");
            return (Criteria) this;
        }

        public Criteria andPurchaseplatlogdetailNotBetween(String value1, String value2) {
            addCriterion("PurchasePlatLogDetail not between", value1, value2, "purchaseplatlogdetail");
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