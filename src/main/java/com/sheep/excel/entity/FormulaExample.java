package com.sheep.excel.entity;

import java.util.ArrayList;
import java.util.List;

public class FormulaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormulaExample() {
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

        public Criteria andFormulaidIsNull() {
            addCriterion("formulaid is null");
            return (Criteria) this;
        }

        public Criteria andFormulaidIsNotNull() {
            addCriterion("formulaid is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaidEqualTo(Integer value) {
            addCriterion("formulaid =", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotEqualTo(Integer value) {
            addCriterion("formulaid <>", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThan(Integer value) {
            addCriterion("formulaid >", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("formulaid >=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThan(Integer value) {
            addCriterion("formulaid <", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThanOrEqualTo(Integer value) {
            addCriterion("formulaid <=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidIn(List<Integer> values) {
            addCriterion("formulaid in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotIn(List<Integer> values) {
            addCriterion("formulaid not in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidBetween(Integer value1, Integer value2) {
            addCriterion("formulaid between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotBetween(Integer value1, Integer value2) {
            addCriterion("formulaid not between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFfidIsNull() {
            addCriterion("ffid is null");
            return (Criteria) this;
        }

        public Criteria andFfidIsNotNull() {
            addCriterion("ffid is not null");
            return (Criteria) this;
        }

        public Criteria andFfidEqualTo(Integer value) {
            addCriterion("ffid =", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidNotEqualTo(Integer value) {
            addCriterion("ffid <>", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidGreaterThan(Integer value) {
            addCriterion("ffid >", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ffid >=", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidLessThan(Integer value) {
            addCriterion("ffid <", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidLessThanOrEqualTo(Integer value) {
            addCriterion("ffid <=", value, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidIn(List<Integer> values) {
            addCriterion("ffid in", values, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidNotIn(List<Integer> values) {
            addCriterion("ffid not in", values, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidBetween(Integer value1, Integer value2) {
            addCriterion("ffid between", value1, value2, "ffid");
            return (Criteria) this;
        }

        public Criteria andFfidNotBetween(Integer value1, Integer value2) {
            addCriterion("ffid not between", value1, value2, "ffid");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("formula is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("formula is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("formula =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("formula <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("formula >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("formula >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("formula <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("formula <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("formula like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("formula not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("formula in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("formula not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("formula between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("formula not between", value1, value2, "formula");
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