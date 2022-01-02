package com.orange_yishenggong.humanbeingmodels.domain;

import java.util.ArrayList;
import java.util.List;

public class OdsSocialnetworkModelRuntimeOriginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsSocialnetworkModelRuntimeOriginLogExample() {
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

        public Criteria andRoundIsNull() {
            addCriterion("round is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("round is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(Integer value) {
            addCriterion("round =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(Integer value) {
            addCriterion("round <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(Integer value) {
            addCriterion("round >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("round >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(Integer value) {
            addCriterion("round <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(Integer value) {
            addCriterion("round <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<Integer> values) {
            addCriterion("round in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<Integer> values) {
            addCriterion("round not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(Integer value1, Integer value2) {
            addCriterion("round between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(Integer value1, Integer value2) {
            addCriterion("round not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNull() {
            addCriterion("average_score is null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNotNull() {
            addCriterion("average_score is not null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreEqualTo(Double value) {
            addCriterion("average_score =", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotEqualTo(Double value) {
            addCriterion("average_score <>", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThan(Double value) {
            addCriterion("average_score >", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("average_score >=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThan(Double value) {
            addCriterion("average_score <", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThanOrEqualTo(Double value) {
            addCriterion("average_score <=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIn(List<Double> values) {
            addCriterion("average_score in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotIn(List<Double> values) {
            addCriterion("average_score not in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreBetween(Double value1, Double value2) {
            addCriterion("average_score between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotBetween(Double value1, Double value2) {
            addCriterion("average_score not between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andRecomCountIsNull() {
            addCriterion("recom_count is null");
            return (Criteria) this;
        }

        public Criteria andRecomCountIsNotNull() {
            addCriterion("recom_count is not null");
            return (Criteria) this;
        }

        public Criteria andRecomCountEqualTo(Integer value) {
            addCriterion("recom_count =", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountNotEqualTo(Integer value) {
            addCriterion("recom_count <>", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountGreaterThan(Integer value) {
            addCriterion("recom_count >", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("recom_count >=", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountLessThan(Integer value) {
            addCriterion("recom_count <", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountLessThanOrEqualTo(Integer value) {
            addCriterion("recom_count <=", value, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountIn(List<Integer> values) {
            addCriterion("recom_count in", values, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountNotIn(List<Integer> values) {
            addCriterion("recom_count not in", values, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountBetween(Integer value1, Integer value2) {
            addCriterion("recom_count between", value1, value2, "recomCount");
            return (Criteria) this;
        }

        public Criteria andRecomCountNotBetween(Integer value1, Integer value2) {
            addCriterion("recom_count not between", value1, value2, "recomCount");
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