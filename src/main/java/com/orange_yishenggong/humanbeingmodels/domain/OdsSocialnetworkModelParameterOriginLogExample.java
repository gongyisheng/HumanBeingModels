package com.orange_yishenggong.humanbeingmodels.domain;

import java.util.ArrayList;
import java.util.List;

public class OdsSocialnetworkModelParameterOriginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsSocialnetworkModelParameterOriginLogExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Long value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Long value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Long value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Long value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Long value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Long> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Long> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Long value1, Long value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Long value1, Long value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andGridLengthIsNull() {
            addCriterion("grid_length is null");
            return (Criteria) this;
        }

        public Criteria andGridLengthIsNotNull() {
            addCriterion("grid_length is not null");
            return (Criteria) this;
        }

        public Criteria andGridLengthEqualTo(Integer value) {
            addCriterion("grid_length =", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthNotEqualTo(Integer value) {
            addCriterion("grid_length <>", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthGreaterThan(Integer value) {
            addCriterion("grid_length >", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("grid_length >=", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthLessThan(Integer value) {
            addCriterion("grid_length <", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthLessThanOrEqualTo(Integer value) {
            addCriterion("grid_length <=", value, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthIn(List<Integer> values) {
            addCriterion("grid_length in", values, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthNotIn(List<Integer> values) {
            addCriterion("grid_length not in", values, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthBetween(Integer value1, Integer value2) {
            addCriterion("grid_length between", value1, value2, "gridLength");
            return (Criteria) this;
        }

        public Criteria andGridLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("grid_length not between", value1, value2, "gridLength");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNull() {
            addCriterion("population is null");
            return (Criteria) this;
        }

        public Criteria andPopulationIsNotNull() {
            addCriterion("population is not null");
            return (Criteria) this;
        }

        public Criteria andPopulationEqualTo(Integer value) {
            addCriterion("population =", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotEqualTo(Integer value) {
            addCriterion("population <>", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThan(Integer value) {
            addCriterion("population >", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("population >=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThan(Integer value) {
            addCriterion("population <", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationLessThanOrEqualTo(Integer value) {
            addCriterion("population <=", value, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationIn(List<Integer> values) {
            addCriterion("population in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotIn(List<Integer> values) {
            addCriterion("population not in", values, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationBetween(Integer value1, Integer value2) {
            addCriterion("population between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andPopulationNotBetween(Integer value1, Integer value2) {
            addCriterion("population not between", value1, value2, "population");
            return (Criteria) this;
        }

        public Criteria andRoundsIsNull() {
            addCriterion("rounds is null");
            return (Criteria) this;
        }

        public Criteria andRoundsIsNotNull() {
            addCriterion("rounds is not null");
            return (Criteria) this;
        }

        public Criteria andRoundsEqualTo(Integer value) {
            addCriterion("rounds =", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsNotEqualTo(Integer value) {
            addCriterion("rounds <>", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsGreaterThan(Integer value) {
            addCriterion("rounds >", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rounds >=", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsLessThan(Integer value) {
            addCriterion("rounds <", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsLessThanOrEqualTo(Integer value) {
            addCriterion("rounds <=", value, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsIn(List<Integer> values) {
            addCriterion("rounds in", values, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsNotIn(List<Integer> values) {
            addCriterion("rounds not in", values, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsBetween(Integer value1, Integer value2) {
            addCriterion("rounds between", value1, value2, "rounds");
            return (Criteria) this;
        }

        public Criteria andRoundsNotBetween(Integer value1, Integer value2) {
            addCriterion("rounds not between", value1, value2, "rounds");
            return (Criteria) this;
        }

        public Criteria andRecomTypeIsNull() {
            addCriterion("recom_type is null");
            return (Criteria) this;
        }

        public Criteria andRecomTypeIsNotNull() {
            addCriterion("recom_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecomTypeEqualTo(Integer value) {
            addCriterion("recom_type =", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeNotEqualTo(Integer value) {
            addCriterion("recom_type <>", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeGreaterThan(Integer value) {
            addCriterion("recom_type >", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recom_type >=", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeLessThan(Integer value) {
            addCriterion("recom_type <", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recom_type <=", value, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeIn(List<Integer> values) {
            addCriterion("recom_type in", values, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeNotIn(List<Integer> values) {
            addCriterion("recom_type not in", values, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeBetween(Integer value1, Integer value2) {
            addCriterion("recom_type between", value1, value2, "recomType");
            return (Criteria) this;
        }

        public Criteria andRecomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recom_type not between", value1, value2, "recomType");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Long value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Long value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Long value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Long value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Long> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Long> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Long value1, Long value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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