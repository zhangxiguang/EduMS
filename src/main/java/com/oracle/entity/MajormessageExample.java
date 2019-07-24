package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class MajormessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajormessageExample() {
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

        public Criteria andMajidIsNull() {
            addCriterion("majID is null");
            return (Criteria) this;
        }

        public Criteria andMajidIsNotNull() {
            addCriterion("majID is not null");
            return (Criteria) this;
        }

        public Criteria andMajidEqualTo(Integer value) {
            addCriterion("majID =", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotEqualTo(Integer value) {
            addCriterion("majID <>", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidGreaterThan(Integer value) {
            addCriterion("majID >", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidGreaterThanOrEqualTo(Integer value) {
            addCriterion("majID >=", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidLessThan(Integer value) {
            addCriterion("majID <", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidLessThanOrEqualTo(Integer value) {
            addCriterion("majID <=", value, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidIn(List<Integer> values) {
            addCriterion("majID in", values, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotIn(List<Integer> values) {
            addCriterion("majID not in", values, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidBetween(Integer value1, Integer value2) {
            addCriterion("majID between", value1, value2, "majid");
            return (Criteria) this;
        }

        public Criteria andMajidNotBetween(Integer value1, Integer value2) {
            addCriterion("majID not between", value1, value2, "majid");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("depID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("depID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(Integer value) {
            addCriterion("depID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(Integer value) {
            addCriterion("depID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(Integer value) {
            addCriterion("depID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("depID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(Integer value) {
            addCriterion("depID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(Integer value) {
            addCriterion("depID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<Integer> values) {
            addCriterion("depID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<Integer> values) {
            addCriterion("depID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(Integer value1, Integer value2) {
            addCriterion("depID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(Integer value1, Integer value2) {
            addCriterion("depID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andMajnameIsNull() {
            addCriterion("majName is null");
            return (Criteria) this;
        }

        public Criteria andMajnameIsNotNull() {
            addCriterion("majName is not null");
            return (Criteria) this;
        }

        public Criteria andMajnameEqualTo(String value) {
            addCriterion("majName =", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameNotEqualTo(String value) {
            addCriterion("majName <>", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameGreaterThan(String value) {
            addCriterion("majName >", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameGreaterThanOrEqualTo(String value) {
            addCriterion("majName >=", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameLessThan(String value) {
            addCriterion("majName <", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameLessThanOrEqualTo(String value) {
            addCriterion("majName <=", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameLike(String value) {
            addCriterion("majName like", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameNotLike(String value) {
            addCriterion("majName not like", value, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameIn(List<String> values) {
            addCriterion("majName in", values, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameNotIn(List<String> values) {
            addCriterion("majName not in", values, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameBetween(String value1, String value2) {
            addCriterion("majName between", value1, value2, "majname");
            return (Criteria) this;
        }

        public Criteria andMajnameNotBetween(String value1, String value2) {
            addCriterion("majName not between", value1, value2, "majname");
            return (Criteria) this;
        }

        public Criteria andMajdeanidIsNull() {
            addCriterion("majDeanID is null");
            return (Criteria) this;
        }

        public Criteria andMajdeanidIsNotNull() {
            addCriterion("majDeanID is not null");
            return (Criteria) this;
        }

        public Criteria andMajdeanidEqualTo(Integer value) {
            addCriterion("majDeanID =", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidNotEqualTo(Integer value) {
            addCriterion("majDeanID <>", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidGreaterThan(Integer value) {
            addCriterion("majDeanID >", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("majDeanID >=", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidLessThan(Integer value) {
            addCriterion("majDeanID <", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidLessThanOrEqualTo(Integer value) {
            addCriterion("majDeanID <=", value, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidIn(List<Integer> values) {
            addCriterion("majDeanID in", values, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidNotIn(List<Integer> values) {
            addCriterion("majDeanID not in", values, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidBetween(Integer value1, Integer value2) {
            addCriterion("majDeanID between", value1, value2, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajdeanidNotBetween(Integer value1, Integer value2) {
            addCriterion("majDeanID not between", value1, value2, "majdeanid");
            return (Criteria) this;
        }

        public Criteria andMajintroductionIsNull() {
            addCriterion("majIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andMajintroductionIsNotNull() {
            addCriterion("majIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andMajintroductionEqualTo(String value) {
            addCriterion("majIntroduction =", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionNotEqualTo(String value) {
            addCriterion("majIntroduction <>", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionGreaterThan(String value) {
            addCriterion("majIntroduction >", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("majIntroduction >=", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionLessThan(String value) {
            addCriterion("majIntroduction <", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionLessThanOrEqualTo(String value) {
            addCriterion("majIntroduction <=", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionLike(String value) {
            addCriterion("majIntroduction like", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionNotLike(String value) {
            addCriterion("majIntroduction not like", value, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionIn(List<String> values) {
            addCriterion("majIntroduction in", values, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionNotIn(List<String> values) {
            addCriterion("majIntroduction not in", values, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionBetween(String value1, String value2) {
            addCriterion("majIntroduction between", value1, value2, "majintroduction");
            return (Criteria) this;
        }

        public Criteria andMajintroductionNotBetween(String value1, String value2) {
            addCriterion("majIntroduction not between", value1, value2, "majintroduction");
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