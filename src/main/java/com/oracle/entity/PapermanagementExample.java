package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class PapermanagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PapermanagementExample() {
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

        public Criteria andPapidIsNull() {
            addCriterion("papID is null");
            return (Criteria) this;
        }

        public Criteria andPapidIsNotNull() {
            addCriterion("papID is not null");
            return (Criteria) this;
        }

        public Criteria andPapidEqualTo(Integer value) {
            addCriterion("papID =", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidNotEqualTo(Integer value) {
            addCriterion("papID <>", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidGreaterThan(Integer value) {
            addCriterion("papID >", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidGreaterThanOrEqualTo(Integer value) {
            addCriterion("papID >=", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidLessThan(Integer value) {
            addCriterion("papID <", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidLessThanOrEqualTo(Integer value) {
            addCriterion("papID <=", value, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidIn(List<Integer> values) {
            addCriterion("papID in", values, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidNotIn(List<Integer> values) {
            addCriterion("papID not in", values, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidBetween(Integer value1, Integer value2) {
            addCriterion("papID between", value1, value2, "papid");
            return (Criteria) this;
        }

        public Criteria andPapidNotBetween(Integer value1, Integer value2) {
            addCriterion("papID not between", value1, value2, "papid");
            return (Criteria) this;
        }

        public Criteria andTaeidIsNull() {
            addCriterion("taeID is null");
            return (Criteria) this;
        }

        public Criteria andTaeidIsNotNull() {
            addCriterion("taeID is not null");
            return (Criteria) this;
        }

        public Criteria andTaeidEqualTo(Integer value) {
            addCriterion("taeID =", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidNotEqualTo(Integer value) {
            addCriterion("taeID <>", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidGreaterThan(Integer value) {
            addCriterion("taeID >", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taeID >=", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidLessThan(Integer value) {
            addCriterion("taeID <", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidLessThanOrEqualTo(Integer value) {
            addCriterion("taeID <=", value, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidIn(List<Integer> values) {
            addCriterion("taeID in", values, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidNotIn(List<Integer> values) {
            addCriterion("taeID not in", values, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidBetween(Integer value1, Integer value2) {
            addCriterion("taeID between", value1, value2, "taeid");
            return (Criteria) this;
        }

        public Criteria andTaeidNotBetween(Integer value1, Integer value2) {
            addCriterion("taeID not between", value1, value2, "taeid");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(String value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(String value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(String value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(String value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(String value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(String value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLike(String value) {
            addCriterion("uploadTime like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotLike(String value) {
            addCriterion("uploadTime not like", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<String> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<String> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(String value1, String value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(String value1, String value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andPapnmaeIsNull() {
            addCriterion("papNmae is null");
            return (Criteria) this;
        }

        public Criteria andPapnmaeIsNotNull() {
            addCriterion("papNmae is not null");
            return (Criteria) this;
        }

        public Criteria andPapnmaeEqualTo(String value) {
            addCriterion("papNmae =", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeNotEqualTo(String value) {
            addCriterion("papNmae <>", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeGreaterThan(String value) {
            addCriterion("papNmae >", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeGreaterThanOrEqualTo(String value) {
            addCriterion("papNmae >=", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeLessThan(String value) {
            addCriterion("papNmae <", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeLessThanOrEqualTo(String value) {
            addCriterion("papNmae <=", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeLike(String value) {
            addCriterion("papNmae like", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeNotLike(String value) {
            addCriterion("papNmae not like", value, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeIn(List<String> values) {
            addCriterion("papNmae in", values, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeNotIn(List<String> values) {
            addCriterion("papNmae not in", values, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeBetween(String value1, String value2) {
            addCriterion("papNmae between", value1, value2, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapnmaeNotBetween(String value1, String value2) {
            addCriterion("papNmae not between", value1, value2, "papnmae");
            return (Criteria) this;
        }

        public Criteria andPapfieldIsNull() {
            addCriterion("papField is null");
            return (Criteria) this;
        }

        public Criteria andPapfieldIsNotNull() {
            addCriterion("papField is not null");
            return (Criteria) this;
        }

        public Criteria andPapfieldEqualTo(String value) {
            addCriterion("papField =", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldNotEqualTo(String value) {
            addCriterion("papField <>", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldGreaterThan(String value) {
            addCriterion("papField >", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldGreaterThanOrEqualTo(String value) {
            addCriterion("papField >=", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldLessThan(String value) {
            addCriterion("papField <", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldLessThanOrEqualTo(String value) {
            addCriterion("papField <=", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldLike(String value) {
            addCriterion("papField like", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldNotLike(String value) {
            addCriterion("papField not like", value, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldIn(List<String> values) {
            addCriterion("papField in", values, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldNotIn(List<String> values) {
            addCriterion("papField not in", values, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldBetween(String value1, String value2) {
            addCriterion("papField between", value1, value2, "papfield");
            return (Criteria) this;
        }

        public Criteria andPapfieldNotBetween(String value1, String value2) {
            addCriterion("papField not between", value1, value2, "papfield");
            return (Criteria) this;
        }

        public Criteria andUploadplaceIsNull() {
            addCriterion("uploadPlace is null");
            return (Criteria) this;
        }

        public Criteria andUploadplaceIsNotNull() {
            addCriterion("uploadPlace is not null");
            return (Criteria) this;
        }

        public Criteria andUploadplaceEqualTo(String value) {
            addCriterion("uploadPlace =", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceNotEqualTo(String value) {
            addCriterion("uploadPlace <>", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceGreaterThan(String value) {
            addCriterion("uploadPlace >", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceGreaterThanOrEqualTo(String value) {
            addCriterion("uploadPlace >=", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceLessThan(String value) {
            addCriterion("uploadPlace <", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceLessThanOrEqualTo(String value) {
            addCriterion("uploadPlace <=", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceLike(String value) {
            addCriterion("uploadPlace like", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceNotLike(String value) {
            addCriterion("uploadPlace not like", value, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceIn(List<String> values) {
            addCriterion("uploadPlace in", values, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceNotIn(List<String> values) {
            addCriterion("uploadPlace not in", values, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceBetween(String value1, String value2) {
            addCriterion("uploadPlace between", value1, value2, "uploadplace");
            return (Criteria) this;
        }

        public Criteria andUploadplaceNotBetween(String value1, String value2) {
            addCriterion("uploadPlace not between", value1, value2, "uploadplace");
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