package com.pinbang.pb.entity;

import java.util.ArrayList;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andATelIsNull() {
            addCriterion("a_tel is null");
            return (Criteria) this;
        }

        public Criteria andATelIsNotNull() {
            addCriterion("a_tel is not null");
            return (Criteria) this;
        }

        public Criteria andATelEqualTo(Long value) {
            addCriterion("a_tel =", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelNotEqualTo(Long value) {
            addCriterion("a_tel <>", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelGreaterThan(Long value) {
            addCriterion("a_tel >", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelGreaterThanOrEqualTo(Long value) {
            addCriterion("a_tel >=", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelLessThan(Long value) {
            addCriterion("a_tel <", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelLessThanOrEqualTo(Long value) {
            addCriterion("a_tel <=", value, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelIn(List<Long> values) {
            addCriterion("a_tel in", values, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelNotIn(List<Long> values) {
            addCriterion("a_tel not in", values, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelBetween(Long value1, Long value2) {
            addCriterion("a_tel between", value1, value2, "aTel");
            return (Criteria) this;
        }

        public Criteria andATelNotBetween(Long value1, Long value2) {
            addCriterion("a_tel not between", value1, value2, "aTel");
            return (Criteria) this;
        }

        public Criteria andAAreaIsNull() {
            addCriterion("a_area is null");
            return (Criteria) this;
        }

        public Criteria andAAreaIsNotNull() {
            addCriterion("a_area is not null");
            return (Criteria) this;
        }

        public Criteria andAAreaEqualTo(Integer value) {
            addCriterion("a_area =", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotEqualTo(Integer value) {
            addCriterion("a_area <>", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaGreaterThan(Integer value) {
            addCriterion("a_area >", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_area >=", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaLessThan(Integer value) {
            addCriterion("a_area <", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaLessThanOrEqualTo(Integer value) {
            addCriterion("a_area <=", value, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaIn(List<Integer> values) {
            addCriterion("a_area in", values, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotIn(List<Integer> values) {
            addCriterion("a_area not in", values, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaBetween(Integer value1, Integer value2) {
            addCriterion("a_area between", value1, value2, "aArea");
            return (Criteria) this;
        }

        public Criteria andAAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("a_area not between", value1, value2, "aArea");
            return (Criteria) this;
        }

        public Criteria andABudgetIsNull() {
            addCriterion("a_budget is null");
            return (Criteria) this;
        }

        public Criteria andABudgetIsNotNull() {
            addCriterion("a_budget is not null");
            return (Criteria) this;
        }

        public Criteria andABudgetEqualTo(Double value) {
            addCriterion("a_budget =", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetNotEqualTo(Double value) {
            addCriterion("a_budget <>", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetGreaterThan(Double value) {
            addCriterion("a_budget >", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("a_budget >=", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetLessThan(Double value) {
            addCriterion("a_budget <", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetLessThanOrEqualTo(Double value) {
            addCriterion("a_budget <=", value, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetIn(List<Double> values) {
            addCriterion("a_budget in", values, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetNotIn(List<Double> values) {
            addCriterion("a_budget not in", values, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetBetween(Double value1, Double value2) {
            addCriterion("a_budget between", value1, value2, "aBudget");
            return (Criteria) this;
        }

        public Criteria andABudgetNotBetween(Double value1, Double value2) {
            addCriterion("a_budget not between", value1, value2, "aBudget");
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