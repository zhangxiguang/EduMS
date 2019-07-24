package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class TeamessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamessageExample() {
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

        public Criteria andTeaidIsNull() {
            addCriterion("teaID is null");
            return (Criteria) this;
        }

        public Criteria andTeaidIsNotNull() {
            addCriterion("teaID is not null");
            return (Criteria) this;
        }

        public Criteria andTeaidEqualTo(Integer value) {
            addCriterion("teaID =", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotEqualTo(Integer value) {
            addCriterion("teaID <>", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThan(Integer value) {
            addCriterion("teaID >", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teaID >=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThan(Integer value) {
            addCriterion("teaID <", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidLessThanOrEqualTo(Integer value) {
            addCriterion("teaID <=", value, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidIn(List<Integer> values) {
            addCriterion("teaID in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotIn(List<Integer> values) {
            addCriterion("teaID not in", values, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidBetween(Integer value1, Integer value2) {
            addCriterion("teaID between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeaidNotBetween(Integer value1, Integer value2) {
            addCriterion("teaID not between", value1, value2, "teaid");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentIsNull() {
            addCriterion("teaDepartment is null");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentIsNotNull() {
            addCriterion("teaDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentEqualTo(Integer value) {
            addCriterion("teaDepartment =", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentNotEqualTo(Integer value) {
            addCriterion("teaDepartment <>", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentGreaterThan(Integer value) {
            addCriterion("teaDepartment >", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("teaDepartment >=", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentLessThan(Integer value) {
            addCriterion("teaDepartment <", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("teaDepartment <=", value, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentIn(List<Integer> values) {
            addCriterion("teaDepartment in", values, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentNotIn(List<Integer> values) {
            addCriterion("teaDepartment not in", values, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentBetween(Integer value1, Integer value2) {
            addCriterion("teaDepartment between", value1, value2, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeadepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("teaDepartment not between", value1, value2, "teadepartment");
            return (Criteria) this;
        }

        public Criteria andTeapassIsNull() {
            addCriterion("teaPass is null");
            return (Criteria) this;
        }

        public Criteria andTeapassIsNotNull() {
            addCriterion("teaPass is not null");
            return (Criteria) this;
        }

        public Criteria andTeapassEqualTo(String value) {
            addCriterion("teaPass =", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassNotEqualTo(String value) {
            addCriterion("teaPass <>", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassGreaterThan(String value) {
            addCriterion("teaPass >", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassGreaterThanOrEqualTo(String value) {
            addCriterion("teaPass >=", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassLessThan(String value) {
            addCriterion("teaPass <", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassLessThanOrEqualTo(String value) {
            addCriterion("teaPass <=", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassLike(String value) {
            addCriterion("teaPass like", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassNotLike(String value) {
            addCriterion("teaPass not like", value, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassIn(List<String> values) {
            addCriterion("teaPass in", values, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassNotIn(List<String> values) {
            addCriterion("teaPass not in", values, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassBetween(String value1, String value2) {
            addCriterion("teaPass between", value1, value2, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeapassNotBetween(String value1, String value2) {
            addCriterion("teaPass not between", value1, value2, "teapass");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNull() {
            addCriterion("teaName is null");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNotNull() {
            addCriterion("teaName is not null");
            return (Criteria) this;
        }

        public Criteria andTeanameEqualTo(String value) {
            addCriterion("teaName =", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotEqualTo(String value) {
            addCriterion("teaName <>", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThan(String value) {
            addCriterion("teaName >", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThanOrEqualTo(String value) {
            addCriterion("teaName >=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThan(String value) {
            addCriterion("teaName <", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThanOrEqualTo(String value) {
            addCriterion("teaName <=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLike(String value) {
            addCriterion("teaName like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotLike(String value) {
            addCriterion("teaName not like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameIn(List<String> values) {
            addCriterion("teaName in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotIn(List<String> values) {
            addCriterion("teaName not in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameBetween(String value1, String value2) {
            addCriterion("teaName between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotBetween(String value1, String value2) {
            addCriterion("teaName not between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeasexIsNull() {
            addCriterion("teaSex is null");
            return (Criteria) this;
        }

        public Criteria andTeasexIsNotNull() {
            addCriterion("teaSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeasexEqualTo(String value) {
            addCriterion("teaSex =", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotEqualTo(String value) {
            addCriterion("teaSex <>", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexGreaterThan(String value) {
            addCriterion("teaSex >", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexGreaterThanOrEqualTo(String value) {
            addCriterion("teaSex >=", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLessThan(String value) {
            addCriterion("teaSex <", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLessThanOrEqualTo(String value) {
            addCriterion("teaSex <=", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexLike(String value) {
            addCriterion("teaSex like", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotLike(String value) {
            addCriterion("teaSex not like", value, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexIn(List<String> values) {
            addCriterion("teaSex in", values, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotIn(List<String> values) {
            addCriterion("teaSex not in", values, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexBetween(String value1, String value2) {
            addCriterion("teaSex between", value1, value2, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeasexNotBetween(String value1, String value2) {
            addCriterion("teaSex not between", value1, value2, "teasex");
            return (Criteria) this;
        }

        public Criteria andTeanumberIsNull() {
            addCriterion("teaNumber is null");
            return (Criteria) this;
        }

        public Criteria andTeanumberIsNotNull() {
            addCriterion("teaNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTeanumberEqualTo(String value) {
            addCriterion("teaNumber =", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberNotEqualTo(String value) {
            addCriterion("teaNumber <>", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberGreaterThan(String value) {
            addCriterion("teaNumber >", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberGreaterThanOrEqualTo(String value) {
            addCriterion("teaNumber >=", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberLessThan(String value) {
            addCriterion("teaNumber <", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberLessThanOrEqualTo(String value) {
            addCriterion("teaNumber <=", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberLike(String value) {
            addCriterion("teaNumber like", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberNotLike(String value) {
            addCriterion("teaNumber not like", value, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberIn(List<String> values) {
            addCriterion("teaNumber in", values, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberNotIn(List<String> values) {
            addCriterion("teaNumber not in", values, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberBetween(String value1, String value2) {
            addCriterion("teaNumber between", value1, value2, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeanumberNotBetween(String value1, String value2) {
            addCriterion("teaNumber not between", value1, value2, "teanumber");
            return (Criteria) this;
        }

        public Criteria andTeaphoneIsNull() {
            addCriterion("teaPhone is null");
            return (Criteria) this;
        }

        public Criteria andTeaphoneIsNotNull() {
            addCriterion("teaPhone is not null");
            return (Criteria) this;
        }

        public Criteria andTeaphoneEqualTo(String value) {
            addCriterion("teaPhone =", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneNotEqualTo(String value) {
            addCriterion("teaPhone <>", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneGreaterThan(String value) {
            addCriterion("teaPhone >", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneGreaterThanOrEqualTo(String value) {
            addCriterion("teaPhone >=", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneLessThan(String value) {
            addCriterion("teaPhone <", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneLessThanOrEqualTo(String value) {
            addCriterion("teaPhone <=", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneLike(String value) {
            addCriterion("teaPhone like", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneNotLike(String value) {
            addCriterion("teaPhone not like", value, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneIn(List<String> values) {
            addCriterion("teaPhone in", values, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneNotIn(List<String> values) {
            addCriterion("teaPhone not in", values, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneBetween(String value1, String value2) {
            addCriterion("teaPhone between", value1, value2, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaphoneNotBetween(String value1, String value2) {
            addCriterion("teaPhone not between", value1, value2, "teaphone");
            return (Criteria) this;
        }

        public Criteria andTeaaddressIsNull() {
            addCriterion("teaAddress is null");
            return (Criteria) this;
        }

        public Criteria andTeaaddressIsNotNull() {
            addCriterion("teaAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTeaaddressEqualTo(String value) {
            addCriterion("teaAddress =", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressNotEqualTo(String value) {
            addCriterion("teaAddress <>", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressGreaterThan(String value) {
            addCriterion("teaAddress >", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressGreaterThanOrEqualTo(String value) {
            addCriterion("teaAddress >=", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressLessThan(String value) {
            addCriterion("teaAddress <", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressLessThanOrEqualTo(String value) {
            addCriterion("teaAddress <=", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressLike(String value) {
            addCriterion("teaAddress like", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressNotLike(String value) {
            addCriterion("teaAddress not like", value, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressIn(List<String> values) {
            addCriterion("teaAddress in", values, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressNotIn(List<String> values) {
            addCriterion("teaAddress not in", values, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressBetween(String value1, String value2) {
            addCriterion("teaAddress between", value1, value2, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTeaaddressNotBetween(String value1, String value2) {
            addCriterion("teaAddress not between", value1, value2, "teaaddress");
            return (Criteria) this;
        }

        public Criteria andTealevelIsNull() {
            addCriterion("teaLevel is null");
            return (Criteria) this;
        }

        public Criteria andTealevelIsNotNull() {
            addCriterion("teaLevel is not null");
            return (Criteria) this;
        }

        public Criteria andTealevelEqualTo(String value) {
            addCriterion("teaLevel =", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotEqualTo(String value) {
            addCriterion("teaLevel <>", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelGreaterThan(String value) {
            addCriterion("teaLevel >", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelGreaterThanOrEqualTo(String value) {
            addCriterion("teaLevel >=", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLessThan(String value) {
            addCriterion("teaLevel <", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLessThanOrEqualTo(String value) {
            addCriterion("teaLevel <=", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLike(String value) {
            addCriterion("teaLevel like", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotLike(String value) {
            addCriterion("teaLevel not like", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelIn(List<String> values) {
            addCriterion("teaLevel in", values, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotIn(List<String> values) {
            addCriterion("teaLevel not in", values, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelBetween(String value1, String value2) {
            addCriterion("teaLevel between", value1, value2, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotBetween(String value1, String value2) {
            addCriterion("teaLevel not between", value1, value2, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTeadegreeIsNull() {
            addCriterion("teaDegree is null");
            return (Criteria) this;
        }

        public Criteria andTeadegreeIsNotNull() {
            addCriterion("teaDegree is not null");
            return (Criteria) this;
        }

        public Criteria andTeadegreeEqualTo(String value) {
            addCriterion("teaDegree =", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeNotEqualTo(String value) {
            addCriterion("teaDegree <>", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeGreaterThan(String value) {
            addCriterion("teaDegree >", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeGreaterThanOrEqualTo(String value) {
            addCriterion("teaDegree >=", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeLessThan(String value) {
            addCriterion("teaDegree <", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeLessThanOrEqualTo(String value) {
            addCriterion("teaDegree <=", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeLike(String value) {
            addCriterion("teaDegree like", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeNotLike(String value) {
            addCriterion("teaDegree not like", value, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeIn(List<String> values) {
            addCriterion("teaDegree in", values, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeNotIn(List<String> values) {
            addCriterion("teaDegree not in", values, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeBetween(String value1, String value2) {
            addCriterion("teaDegree between", value1, value2, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeadegreeNotBetween(String value1, String value2) {
            addCriterion("teaDegree not between", value1, value2, "teadegree");
            return (Criteria) this;
        }

        public Criteria andTeabossIsNull() {
            addCriterion("teaBoss is null");
            return (Criteria) this;
        }

        public Criteria andTeabossIsNotNull() {
            addCriterion("teaBoss is not null");
            return (Criteria) this;
        }

        public Criteria andTeabossEqualTo(String value) {
            addCriterion("teaBoss =", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossNotEqualTo(String value) {
            addCriterion("teaBoss <>", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossGreaterThan(String value) {
            addCriterion("teaBoss >", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossGreaterThanOrEqualTo(String value) {
            addCriterion("teaBoss >=", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossLessThan(String value) {
            addCriterion("teaBoss <", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossLessThanOrEqualTo(String value) {
            addCriterion("teaBoss <=", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossLike(String value) {
            addCriterion("teaBoss like", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossNotLike(String value) {
            addCriterion("teaBoss not like", value, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossIn(List<String> values) {
            addCriterion("teaBoss in", values, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossNotIn(List<String> values) {
            addCriterion("teaBoss not in", values, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossBetween(String value1, String value2) {
            addCriterion("teaBoss between", value1, value2, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTeabossNotBetween(String value1, String value2) {
            addCriterion("teaBoss not between", value1, value2, "teaboss");
            return (Criteria) this;
        }

        public Criteria andTearemarkIsNull() {
            addCriterion("teaRemark is null");
            return (Criteria) this;
        }

        public Criteria andTearemarkIsNotNull() {
            addCriterion("teaRemark is not null");
            return (Criteria) this;
        }

        public Criteria andTearemarkEqualTo(String value) {
            addCriterion("teaRemark =", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkNotEqualTo(String value) {
            addCriterion("teaRemark <>", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkGreaterThan(String value) {
            addCriterion("teaRemark >", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkGreaterThanOrEqualTo(String value) {
            addCriterion("teaRemark >=", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkLessThan(String value) {
            addCriterion("teaRemark <", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkLessThanOrEqualTo(String value) {
            addCriterion("teaRemark <=", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkLike(String value) {
            addCriterion("teaRemark like", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkNotLike(String value) {
            addCriterion("teaRemark not like", value, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkIn(List<String> values) {
            addCriterion("teaRemark in", values, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkNotIn(List<String> values) {
            addCriterion("teaRemark not in", values, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkBetween(String value1, String value2) {
            addCriterion("teaRemark between", value1, value2, "tearemark");
            return (Criteria) this;
        }

        public Criteria andTearemarkNotBetween(String value1, String value2) {
            addCriterion("teaRemark not between", value1, value2, "tearemark");
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