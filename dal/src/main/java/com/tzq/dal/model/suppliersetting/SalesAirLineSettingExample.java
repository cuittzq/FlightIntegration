package com.tzq.dal.model.suppliersetting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesAirLineSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SalesAirLineSettingExample() {
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

        public Criteria andDepsIsNull() {
            addCriterion("Deps is null");
            return (Criteria) this;
        }

        public Criteria andDepsIsNotNull() {
            addCriterion("Deps is not null");
            return (Criteria) this;
        }

        public Criteria andDepsEqualTo(String value) {
            addCriterion("Deps =", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsNotEqualTo(String value) {
            addCriterion("Deps <>", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsGreaterThan(String value) {
            addCriterion("Deps >", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsGreaterThanOrEqualTo(String value) {
            addCriterion("Deps >=", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsLessThan(String value) {
            addCriterion("Deps <", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsLessThanOrEqualTo(String value) {
            addCriterion("Deps <=", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsLike(String value) {
            addCriterion("Deps like", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsNotLike(String value) {
            addCriterion("Deps not like", value, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsIn(List<String> values) {
            addCriterion("Deps in", values, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsNotIn(List<String> values) {
            addCriterion("Deps not in", values, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsBetween(String value1, String value2) {
            addCriterion("Deps between", value1, value2, "deps");
            return (Criteria) this;
        }

        public Criteria andDepsNotBetween(String value1, String value2) {
            addCriterion("Deps not between", value1, value2, "deps");
            return (Criteria) this;
        }

        public Criteria andArrsIsNull() {
            addCriterion("Arrs is null");
            return (Criteria) this;
        }

        public Criteria andArrsIsNotNull() {
            addCriterion("Arrs is not null");
            return (Criteria) this;
        }

        public Criteria andArrsEqualTo(String value) {
            addCriterion("Arrs =", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsNotEqualTo(String value) {
            addCriterion("Arrs <>", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsGreaterThan(String value) {
            addCriterion("Arrs >", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsGreaterThanOrEqualTo(String value) {
            addCriterion("Arrs >=", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsLessThan(String value) {
            addCriterion("Arrs <", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsLessThanOrEqualTo(String value) {
            addCriterion("Arrs <=", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsLike(String value) {
            addCriterion("Arrs like", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsNotLike(String value) {
            addCriterion("Arrs not like", value, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsIn(List<String> values) {
            addCriterion("Arrs in", values, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsNotIn(List<String> values) {
            addCriterion("Arrs not in", values, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsBetween(String value1, String value2) {
            addCriterion("Arrs between", value1, value2, "arrs");
            return (Criteria) this;
        }

        public Criteria andArrsNotBetween(String value1, String value2) {
            addCriterion("Arrs not between", value1, value2, "arrs");
            return (Criteria) this;
        }

        public Criteria andCarriersIsNull() {
            addCriterion("Carriers is null");
            return (Criteria) this;
        }

        public Criteria andCarriersIsNotNull() {
            addCriterion("Carriers is not null");
            return (Criteria) this;
        }

        public Criteria andCarriersEqualTo(String value) {
            addCriterion("Carriers =", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotEqualTo(String value) {
            addCriterion("Carriers <>", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersGreaterThan(String value) {
            addCriterion("Carriers >", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersGreaterThanOrEqualTo(String value) {
            addCriterion("Carriers >=", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersLessThan(String value) {
            addCriterion("Carriers <", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersLessThanOrEqualTo(String value) {
            addCriterion("Carriers <=", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersLike(String value) {
            addCriterion("Carriers like", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotLike(String value) {
            addCriterion("Carriers not like", value, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersIn(List<String> values) {
            addCriterion("Carriers in", values, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotIn(List<String> values) {
            addCriterion("Carriers not in", values, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersBetween(String value1, String value2) {
            addCriterion("Carriers between", value1, value2, "carriers");
            return (Criteria) this;
        }

        public Criteria andCarriersNotBetween(String value1, String value2) {
            addCriterion("Carriers not between", value1, value2, "carriers");
            return (Criteria) this;
        }

        public Criteria andCachestatusIsNull() {
            addCriterion("CacheStatus is null");
            return (Criteria) this;
        }

        public Criteria andCachestatusIsNotNull() {
            addCriterion("CacheStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCachestatusEqualTo(Integer value) {
            addCriterion("CacheStatus =", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusNotEqualTo(Integer value) {
            addCriterion("CacheStatus <>", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusGreaterThan(Integer value) {
            addCriterion("CacheStatus >", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CacheStatus >=", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusLessThan(Integer value) {
            addCriterion("CacheStatus <", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusLessThanOrEqualTo(Integer value) {
            addCriterion("CacheStatus <=", value, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusIn(List<Integer> values) {
            addCriterion("CacheStatus in", values, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusNotIn(List<Integer> values) {
            addCriterion("CacheStatus not in", values, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusBetween(Integer value1, Integer value2) {
            addCriterion("CacheStatus between", value1, value2, "cachestatus");
            return (Criteria) this;
        }

        public Criteria andCachestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CacheStatus not between", value1, value2, "cachestatus");
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