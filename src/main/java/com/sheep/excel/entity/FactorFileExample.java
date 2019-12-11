package com.sheep.excel.entity;

import java.util.ArrayList;
import java.util.List;

public class FactorFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FactorFileExample() {
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

        public Criteria andShippingIsNull() {
            addCriterion("shipping is null");
            return (Criteria) this;
        }

        public Criteria andShippingIsNotNull() {
            addCriterion("shipping is not null");
            return (Criteria) this;
        }

        public Criteria andShippingEqualTo(Long value) {
            addCriterion("shipping =", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotEqualTo(Long value) {
            addCriterion("shipping <>", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThan(Long value) {
            addCriterion("shipping >", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThanOrEqualTo(Long value) {
            addCriterion("shipping >=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThan(Long value) {
            addCriterion("shipping <", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThanOrEqualTo(Long value) {
            addCriterion("shipping <=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingIn(List<Long> values) {
            addCriterion("shipping in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotIn(List<Long> values) {
            addCriterion("shipping not in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingBetween(Long value1, Long value2) {
            addCriterion("shipping between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotBetween(Long value1, Long value2) {
            addCriterion("shipping not between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameIsNull() {
            addCriterion("factor_file_name is null");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameIsNotNull() {
            addCriterion("factor_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameEqualTo(String value) {
            addCriterion("factor_file_name =", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameNotEqualTo(String value) {
            addCriterion("factor_file_name <>", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameGreaterThan(String value) {
            addCriterion("factor_file_name >", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("factor_file_name >=", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameLessThan(String value) {
            addCriterion("factor_file_name <", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameLessThanOrEqualTo(String value) {
            addCriterion("factor_file_name <=", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameLike(String value) {
            addCriterion("factor_file_name like", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameNotLike(String value) {
            addCriterion("factor_file_name not like", value, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameIn(List<String> values) {
            addCriterion("factor_file_name in", values, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameNotIn(List<String> values) {
            addCriterion("factor_file_name not in", values, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameBetween(String value1, String value2) {
            addCriterion("factor_file_name between", value1, value2, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andFactorFileNameNotBetween(String value1, String value2) {
            addCriterion("factor_file_name not between", value1, value2, "factorFileName");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRouteIsNull() {
            addCriterion("route is null");
            return (Criteria) this;
        }

        public Criteria andRouteIsNotNull() {
            addCriterion("route is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEqualTo(String value) {
            addCriterion("route =", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotEqualTo(String value) {
            addCriterion("route <>", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThan(String value) {
            addCriterion("route >", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThanOrEqualTo(String value) {
            addCriterion("route >=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThan(String value) {
            addCriterion("route <", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThanOrEqualTo(String value) {
            addCriterion("route <=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLike(String value) {
            addCriterion("route like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotLike(String value) {
            addCriterion("route not like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteIn(List<String> values) {
            addCriterion("route in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotIn(List<String> values) {
            addCriterion("route not in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteBetween(String value1, String value2) {
            addCriterion("route between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotBetween(String value1, String value2) {
            addCriterion("route not between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCmrIsNull() {
            addCriterion("cmr is null");
            return (Criteria) this;
        }

        public Criteria andCmrIsNotNull() {
            addCriterion("cmr is not null");
            return (Criteria) this;
        }

        public Criteria andCmrEqualTo(Long value) {
            addCriterion("cmr =", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrNotEqualTo(Long value) {
            addCriterion("cmr <>", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrGreaterThan(Long value) {
            addCriterion("cmr >", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrGreaterThanOrEqualTo(Long value) {
            addCriterion("cmr >=", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrLessThan(Long value) {
            addCriterion("cmr <", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrLessThanOrEqualTo(Long value) {
            addCriterion("cmr <=", value, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrIn(List<Long> values) {
            addCriterion("cmr in", values, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrNotIn(List<Long> values) {
            addCriterion("cmr not in", values, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrBetween(Long value1, Long value2) {
            addCriterion("cmr between", value1, value2, "cmr");
            return (Criteria) this;
        }

        public Criteria andCmrNotBetween(Long value1, Long value2) {
            addCriterion("cmr not between", value1, value2, "cmr");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(Long value) {
            addCriterion("duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(Long value) {
            addCriterion("duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(Long value) {
            addCriterion("duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(Long value) {
            addCriterion("duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(Long value) {
            addCriterion("duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(Long value) {
            addCriterion("duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<Long> values) {
            addCriterion("duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<Long> values) {
            addCriterion("duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(Long value1, Long value2) {
            addCriterion("duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(Long value1, Long value2) {
            addCriterion("duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Long value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Long value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Long value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Long value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Long value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Long value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Long> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Long> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Long value1, Long value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Long value1, Long value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeIsNull() {
            addCriterion("broker_fee is null");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeIsNotNull() {
            addCriterion("broker_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeEqualTo(Long value) {
            addCriterion("broker_fee =", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeNotEqualTo(Long value) {
            addCriterion("broker_fee <>", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeGreaterThan(Long value) {
            addCriterion("broker_fee >", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("broker_fee >=", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeLessThan(Long value) {
            addCriterion("broker_fee <", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeLessThanOrEqualTo(Long value) {
            addCriterion("broker_fee <=", value, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeIn(List<Long> values) {
            addCriterion("broker_fee in", values, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeNotIn(List<Long> values) {
            addCriterion("broker_fee not in", values, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeBetween(Long value1, Long value2) {
            addCriterion("broker_fee between", value1, value2, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andBrokerFeeNotBetween(Long value1, Long value2) {
            addCriterion("broker_fee not between", value1, value2, "brokerFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Long value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Long value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Long value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Long value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Long value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Long> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Long> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Long value1, Long value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Long value1, Long value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftIsNull() {
            addCriterion("local_uplift is null");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftIsNotNull() {
            addCriterion("local_uplift is not null");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftEqualTo(Long value) {
            addCriterion("local_uplift =", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftNotEqualTo(Long value) {
            addCriterion("local_uplift <>", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftGreaterThan(Long value) {
            addCriterion("local_uplift >", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftGreaterThanOrEqualTo(Long value) {
            addCriterion("local_uplift >=", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftLessThan(Long value) {
            addCriterion("local_uplift <", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftLessThanOrEqualTo(Long value) {
            addCriterion("local_uplift <=", value, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftIn(List<Long> values) {
            addCriterion("local_uplift in", values, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftNotIn(List<Long> values) {
            addCriterion("local_uplift not in", values, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftBetween(Long value1, Long value2) {
            addCriterion("local_uplift between", value1, value2, "localUplift");
            return (Criteria) this;
        }

        public Criteria andLocalUpliftNotBetween(Long value1, Long value2) {
            addCriterion("local_uplift not between", value1, value2, "localUplift");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNull() {
            addCriterion("distributor is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNotNull() {
            addCriterion("distributor is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorEqualTo(Long value) {
            addCriterion("distributor =", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotEqualTo(Long value) {
            addCriterion("distributor <>", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThan(Long value) {
            addCriterion("distributor >", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThanOrEqualTo(Long value) {
            addCriterion("distributor >=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThan(Long value) {
            addCriterion("distributor <", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThanOrEqualTo(Long value) {
            addCriterion("distributor <=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorIn(List<Long> values) {
            addCriterion("distributor in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotIn(List<Long> values) {
            addCriterion("distributor not in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorBetween(Long value1, Long value2) {
            addCriterion("distributor between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotBetween(Long value1, Long value2) {
            addCriterion("distributor not between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andAcslBpIsNull() {
            addCriterion("acsl_bp is null");
            return (Criteria) this;
        }

        public Criteria andAcslBpIsNotNull() {
            addCriterion("acsl_bp is not null");
            return (Criteria) this;
        }

        public Criteria andAcslBpEqualTo(Long value) {
            addCriterion("acsl_bp =", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpNotEqualTo(Long value) {
            addCriterion("acsl_bp <>", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpGreaterThan(Long value) {
            addCriterion("acsl_bp >", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpGreaterThanOrEqualTo(Long value) {
            addCriterion("acsl_bp >=", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpLessThan(Long value) {
            addCriterion("acsl_bp <", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpLessThanOrEqualTo(Long value) {
            addCriterion("acsl_bp <=", value, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpIn(List<Long> values) {
            addCriterion("acsl_bp in", values, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpNotIn(List<Long> values) {
            addCriterion("acsl_bp not in", values, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpBetween(Long value1, Long value2) {
            addCriterion("acsl_bp between", value1, value2, "acslBp");
            return (Criteria) this;
        }

        public Criteria andAcslBpNotBetween(Long value1, Long value2) {
            addCriterion("acsl_bp not between", value1, value2, "acslBp");
            return (Criteria) this;
        }

        public Criteria andVatIsNull() {
            addCriterion("vat is null");
            return (Criteria) this;
        }

        public Criteria andVatIsNotNull() {
            addCriterion("vat is not null");
            return (Criteria) this;
        }

        public Criteria andVatEqualTo(Long value) {
            addCriterion("vat =", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotEqualTo(Long value) {
            addCriterion("vat <>", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThan(Long value) {
            addCriterion("vat >", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatGreaterThanOrEqualTo(Long value) {
            addCriterion("vat >=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThan(Long value) {
            addCriterion("vat <", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatLessThanOrEqualTo(Long value) {
            addCriterion("vat <=", value, "vat");
            return (Criteria) this;
        }

        public Criteria andVatIn(List<Long> values) {
            addCriterion("vat in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotIn(List<Long> values) {
            addCriterion("vat not in", values, "vat");
            return (Criteria) this;
        }

        public Criteria andVatBetween(Long value1, Long value2) {
            addCriterion("vat between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andVatNotBetween(Long value1, Long value2) {
            addCriterion("vat not between", value1, value2, "vat");
            return (Criteria) this;
        }

        public Criteria andGlobalIsNull() {
            addCriterion("global is null");
            return (Criteria) this;
        }

        public Criteria andGlobalIsNotNull() {
            addCriterion("global is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalEqualTo(String value) {
            addCriterion("global =", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalNotEqualTo(String value) {
            addCriterion("global <>", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalGreaterThan(String value) {
            addCriterion("global >", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalGreaterThanOrEqualTo(String value) {
            addCriterion("global >=", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalLessThan(String value) {
            addCriterion("global <", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalLessThanOrEqualTo(String value) {
            addCriterion("global <=", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalLike(String value) {
            addCriterion("global like", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalNotLike(String value) {
            addCriterion("global not like", value, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalIn(List<String> values) {
            addCriterion("global in", values, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalNotIn(List<String> values) {
            addCriterion("global not in", values, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalBetween(String value1, String value2) {
            addCriterion("global between", value1, value2, "global");
            return (Criteria) this;
        }

        public Criteria andGlobalNotBetween(String value1, String value2) {
            addCriterion("global not between", value1, value2, "global");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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