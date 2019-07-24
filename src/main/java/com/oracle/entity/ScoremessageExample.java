package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class ScoremessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoremessageExample() {
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

        public Criteria andScoidIsNull() {
            addCriterion("scoID is null");
            return (Criteria) this;
        }

        public Criteria andScoidIsNotNull() {
            addCriterion("scoID is not null");
            return (Criteria) this;
        }

        public Criteria andScoidEqualTo(Integer value) {
            addCriterion("scoID =", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotEqualTo(Integer value) {
            addCriterion("scoID <>", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThan(Integer value) {
            addCriterion("scoID >", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoID >=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThan(Integer value) {
            addCriterion("scoID <", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidLessThanOrEqualTo(Integer value) {
            addCriterion("scoID <=", value, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidIn(List<Integer> values) {
            addCriterion("scoID in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotIn(List<Integer> values) {
            addCriterion("scoID not in", values, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidBetween(Integer value1, Integer value2) {
            addCriterion("scoID between", value1, value2, "scoid");
            return (Criteria) this;
        }

        public Criteria andScoidNotBetween(Integer value1, Integer value2) {
            addCriterion("scoID not between", value1, value2, "scoid");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("stuID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("stuID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("stuID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("stuID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("stuID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("stuID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("stuID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("stuID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andCouidIsNull() {
            addCriterion("couID is null");
            return (Criteria) this;
        }

        public Criteria andCouidIsNotNull() {
            addCriterion("couID is not null");
            return (Criteria) this;
        }

        public Criteria andCouidEqualTo(Integer value) {
            addCriterion("couID =", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotEqualTo(Integer value) {
            addCriterion("couID <>", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThan(Integer value) {
            addCriterion("couID >", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couID >=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThan(Integer value) {
            addCriterion("couID <", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidLessThanOrEqualTo(Integer value) {
            addCriterion("couID <=", value, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidIn(List<Integer> values) {
            addCriterion("couID in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotIn(List<Integer> values) {
            addCriterion("couID not in", values, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidBetween(Integer value1, Integer value2) {
            addCriterion("couID between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andCouidNotBetween(Integer value1, Integer value2) {
            addCriterion("couID not between", value1, value2, "couid");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIsNull() {
            addCriterion("usualscore is null");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIsNotNull() {
            addCriterion("usualscore is not null");
            return (Criteria) this;
        }

        public Criteria andUsualscoreEqualTo(Integer value) {
            addCriterion("usualscore =", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotEqualTo(Integer value) {
            addCriterion("usualscore <>", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreGreaterThan(Integer value) {
            addCriterion("usualscore >", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("usualscore >=", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreLessThan(Integer value) {
            addCriterion("usualscore <", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreLessThanOrEqualTo(Integer value) {
            addCriterion("usualscore <=", value, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreIn(List<Integer> values) {
            addCriterion("usualscore in", values, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotIn(List<Integer> values) {
            addCriterion("usualscore not in", values, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreBetween(Integer value1, Integer value2) {
            addCriterion("usualscore between", value1, value2, "usualscore");
            return (Criteria) this;
        }

        public Criteria andUsualscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("usualscore not between", value1, value2, "usualscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreIsNull() {
            addCriterion("endscore is null");
            return (Criteria) this;
        }

        public Criteria andEndscoreIsNotNull() {
            addCriterion("endscore is not null");
            return (Criteria) this;
        }

        public Criteria andEndscoreEqualTo(Integer value) {
            addCriterion("endscore =", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotEqualTo(Integer value) {
            addCriterion("endscore <>", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreGreaterThan(Integer value) {
            addCriterion("endscore >", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("endscore >=", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreLessThan(Integer value) {
            addCriterion("endscore <", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreLessThanOrEqualTo(Integer value) {
            addCriterion("endscore <=", value, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreIn(List<Integer> values) {
            addCriterion("endscore in", values, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotIn(List<Integer> values) {
            addCriterion("endscore not in", values, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreBetween(Integer value1, Integer value2) {
            addCriterion("endscore between", value1, value2, "endscore");
            return (Criteria) this;
        }

        public Criteria andEndscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("endscore not between", value1, value2, "endscore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreIsNull() {
            addCriterion("zonghescore is null");
            return (Criteria) this;
        }

        public Criteria andZonghescoreIsNotNull() {
            addCriterion("zonghescore is not null");
            return (Criteria) this;
        }

        public Criteria andZonghescoreEqualTo(Integer value) {
            addCriterion("zonghescore =", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreNotEqualTo(Integer value) {
            addCriterion("zonghescore <>", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreGreaterThan(Integer value) {
            addCriterion("zonghescore >", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zonghescore >=", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreLessThan(Integer value) {
            addCriterion("zonghescore <", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreLessThanOrEqualTo(Integer value) {
            addCriterion("zonghescore <=", value, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreIn(List<Integer> values) {
            addCriterion("zonghescore in", values, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreNotIn(List<Integer> values) {
            addCriterion("zonghescore not in", values, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreBetween(Integer value1, Integer value2) {
            addCriterion("zonghescore between", value1, value2, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andZonghescoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zonghescore not between", value1, value2, "zonghescore");
            return (Criteria) this;
        }

        public Criteria andScoremarkIsNull() {
            addCriterion("scoremark is null");
            return (Criteria) this;
        }

        public Criteria andScoremarkIsNotNull() {
            addCriterion("scoremark is not null");
            return (Criteria) this;
        }

        public Criteria andScoremarkEqualTo(String value) {
            addCriterion("scoremark =", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkNotEqualTo(String value) {
            addCriterion("scoremark <>", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkGreaterThan(String value) {
            addCriterion("scoremark >", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkGreaterThanOrEqualTo(String value) {
            addCriterion("scoremark >=", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkLessThan(String value) {
            addCriterion("scoremark <", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkLessThanOrEqualTo(String value) {
            addCriterion("scoremark <=", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkLike(String value) {
            addCriterion("scoremark like", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkNotLike(String value) {
            addCriterion("scoremark not like", value, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkIn(List<String> values) {
            addCriterion("scoremark in", values, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkNotIn(List<String> values) {
            addCriterion("scoremark not in", values, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkBetween(String value1, String value2) {
            addCriterion("scoremark between", value1, value2, "scoremark");
            return (Criteria) this;
        }

        public Criteria andScoremarkNotBetween(String value1, String value2) {
            addCriterion("scoremark not between", value1, value2, "scoremark");
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