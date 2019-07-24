package com.oracle.entity;

import java.util.ArrayList;
import java.util.List;

public class StumessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StumessageExample() {
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

        public Criteria andStupassIsNull() {
            addCriterion("stuPass is null");
            return (Criteria) this;
        }

        public Criteria andStupassIsNotNull() {
            addCriterion("stuPass is not null");
            return (Criteria) this;
        }

        public Criteria andStupassEqualTo(String value) {
            addCriterion("stuPass =", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassNotEqualTo(String value) {
            addCriterion("stuPass <>", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassGreaterThan(String value) {
            addCriterion("stuPass >", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassGreaterThanOrEqualTo(String value) {
            addCriterion("stuPass >=", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassLessThan(String value) {
            addCriterion("stuPass <", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassLessThanOrEqualTo(String value) {
            addCriterion("stuPass <=", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassLike(String value) {
            addCriterion("stuPass like", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassNotLike(String value) {
            addCriterion("stuPass not like", value, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassIn(List<String> values) {
            addCriterion("stuPass in", values, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassNotIn(List<String> values) {
            addCriterion("stuPass not in", values, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassBetween(String value1, String value2) {
            addCriterion("stuPass between", value1, value2, "stupass");
            return (Criteria) this;
        }

        public Criteria andStupassNotBetween(String value1, String value2) {
            addCriterion("stuPass not between", value1, value2, "stupass");
            return (Criteria) this;
        }

        public Criteria andStunameIsNull() {
            addCriterion("stuName is null");
            return (Criteria) this;
        }

        public Criteria andStunameIsNotNull() {
            addCriterion("stuName is not null");
            return (Criteria) this;
        }

        public Criteria andStunameEqualTo(String value) {
            addCriterion("stuName =", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotEqualTo(String value) {
            addCriterion("stuName <>", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThan(String value) {
            addCriterion("stuName >", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameGreaterThanOrEqualTo(String value) {
            addCriterion("stuName >=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThan(String value) {
            addCriterion("stuName <", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLessThanOrEqualTo(String value) {
            addCriterion("stuName <=", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameLike(String value) {
            addCriterion("stuName like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotLike(String value) {
            addCriterion("stuName not like", value, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameIn(List<String> values) {
            addCriterion("stuName in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotIn(List<String> values) {
            addCriterion("stuName not in", values, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameBetween(String value1, String value2) {
            addCriterion("stuName between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStunameNotBetween(String value1, String value2) {
            addCriterion("stuName not between", value1, value2, "stuname");
            return (Criteria) this;
        }

        public Criteria andStusexIsNull() {
            addCriterion("stuSex is null");
            return (Criteria) this;
        }

        public Criteria andStusexIsNotNull() {
            addCriterion("stuSex is not null");
            return (Criteria) this;
        }

        public Criteria andStusexEqualTo(String value) {
            addCriterion("stuSex =", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotEqualTo(String value) {
            addCriterion("stuSex <>", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThan(String value) {
            addCriterion("stuSex >", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexGreaterThanOrEqualTo(String value) {
            addCriterion("stuSex >=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThan(String value) {
            addCriterion("stuSex <", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLessThanOrEqualTo(String value) {
            addCriterion("stuSex <=", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexLike(String value) {
            addCriterion("stuSex like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotLike(String value) {
            addCriterion("stuSex not like", value, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexIn(List<String> values) {
            addCriterion("stuSex in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotIn(List<String> values) {
            addCriterion("stuSex not in", values, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexBetween(String value1, String value2) {
            addCriterion("stuSex between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStusexNotBetween(String value1, String value2) {
            addCriterion("stuSex not between", value1, value2, "stusex");
            return (Criteria) this;
        }

        public Criteria andStubirthdayIsNull() {
            addCriterion("stuBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStubirthdayIsNotNull() {
            addCriterion("stuBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStubirthdayEqualTo(String value) {
            addCriterion("stuBirthday =", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayNotEqualTo(String value) {
            addCriterion("stuBirthday <>", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayGreaterThan(String value) {
            addCriterion("stuBirthday >", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("stuBirthday >=", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayLessThan(String value) {
            addCriterion("stuBirthday <", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayLessThanOrEqualTo(String value) {
            addCriterion("stuBirthday <=", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayLike(String value) {
            addCriterion("stuBirthday like", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayNotLike(String value) {
            addCriterion("stuBirthday not like", value, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayIn(List<String> values) {
            addCriterion("stuBirthday in", values, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayNotIn(List<String> values) {
            addCriterion("stuBirthday not in", values, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayBetween(String value1, String value2) {
            addCriterion("stuBirthday between", value1, value2, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStubirthdayNotBetween(String value1, String value2) {
            addCriterion("stuBirthday not between", value1, value2, "stubirthday");
            return (Criteria) this;
        }

        public Criteria andStudepartmentIsNull() {
            addCriterion("stuDepartment is null");
            return (Criteria) this;
        }

        public Criteria andStudepartmentIsNotNull() {
            addCriterion("stuDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andStudepartmentEqualTo(Integer value) {
            addCriterion("stuDepartment =", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentNotEqualTo(Integer value) {
            addCriterion("stuDepartment <>", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentGreaterThan(Integer value) {
            addCriterion("stuDepartment >", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuDepartment >=", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentLessThan(Integer value) {
            addCriterion("stuDepartment <", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("stuDepartment <=", value, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentIn(List<Integer> values) {
            addCriterion("stuDepartment in", values, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentNotIn(List<Integer> values) {
            addCriterion("stuDepartment not in", values, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentBetween(Integer value1, Integer value2) {
            addCriterion("stuDepartment between", value1, value2, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStudepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("stuDepartment not between", value1, value2, "studepartment");
            return (Criteria) this;
        }

        public Criteria andStumajorIsNull() {
            addCriterion("stuMajor is null");
            return (Criteria) this;
        }

        public Criteria andStumajorIsNotNull() {
            addCriterion("stuMajor is not null");
            return (Criteria) this;
        }

        public Criteria andStumajorEqualTo(Integer value) {
            addCriterion("stuMajor =", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotEqualTo(Integer value) {
            addCriterion("stuMajor <>", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorGreaterThan(Integer value) {
            addCriterion("stuMajor >", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuMajor >=", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorLessThan(Integer value) {
            addCriterion("stuMajor <", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorLessThanOrEqualTo(Integer value) {
            addCriterion("stuMajor <=", value, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorIn(List<Integer> values) {
            addCriterion("stuMajor in", values, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotIn(List<Integer> values) {
            addCriterion("stuMajor not in", values, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorBetween(Integer value1, Integer value2) {
            addCriterion("stuMajor between", value1, value2, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStumajorNotBetween(Integer value1, Integer value2) {
            addCriterion("stuMajor not between", value1, value2, "stumajor");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNull() {
            addCriterion("stuClass is null");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNotNull() {
            addCriterion("stuClass is not null");
            return (Criteria) this;
        }

        public Criteria andStuclassEqualTo(Integer value) {
            addCriterion("stuClass =", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotEqualTo(Integer value) {
            addCriterion("stuClass <>", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThan(Integer value) {
            addCriterion("stuClass >", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuClass >=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThan(Integer value) {
            addCriterion("stuClass <", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThanOrEqualTo(Integer value) {
            addCriterion("stuClass <=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassIn(List<Integer> values) {
            addCriterion("stuClass in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotIn(List<Integer> values) {
            addCriterion("stuClass not in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassBetween(Integer value1, Integer value2) {
            addCriterion("stuClass between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotBetween(Integer value1, Integer value2) {
            addCriterion("stuClass not between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNull() {
            addCriterion("stuPhone is null");
            return (Criteria) this;
        }

        public Criteria andStuphoneIsNotNull() {
            addCriterion("stuPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStuphoneEqualTo(String value) {
            addCriterion("stuPhone =", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotEqualTo(String value) {
            addCriterion("stuPhone <>", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThan(String value) {
            addCriterion("stuPhone >", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuPhone >=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThan(String value) {
            addCriterion("stuPhone <", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLessThanOrEqualTo(String value) {
            addCriterion("stuPhone <=", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneLike(String value) {
            addCriterion("stuPhone like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotLike(String value) {
            addCriterion("stuPhone not like", value, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneIn(List<String> values) {
            addCriterion("stuPhone in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotIn(List<String> values) {
            addCriterion("stuPhone not in", values, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneBetween(String value1, String value2) {
            addCriterion("stuPhone between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuphoneNotBetween(String value1, String value2) {
            addCriterion("stuPhone not between", value1, value2, "stuphone");
            return (Criteria) this;
        }

        public Criteria andStuaddressIsNull() {
            addCriterion("stuAddress is null");
            return (Criteria) this;
        }

        public Criteria andStuaddressIsNotNull() {
            addCriterion("stuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andStuaddressEqualTo(String value) {
            addCriterion("stuAddress =", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotEqualTo(String value) {
            addCriterion("stuAddress <>", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressGreaterThan(String value) {
            addCriterion("stuAddress >", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("stuAddress >=", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLessThan(String value) {
            addCriterion("stuAddress <", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLessThanOrEqualTo(String value) {
            addCriterion("stuAddress <=", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressLike(String value) {
            addCriterion("stuAddress like", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotLike(String value) {
            addCriterion("stuAddress not like", value, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressIn(List<String> values) {
            addCriterion("stuAddress in", values, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotIn(List<String> values) {
            addCriterion("stuAddress not in", values, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressBetween(String value1, String value2) {
            addCriterion("stuAddress between", value1, value2, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStuaddressNotBetween(String value1, String value2) {
            addCriterion("stuAddress not between", value1, value2, "stuaddress");
            return (Criteria) this;
        }

        public Criteria andStustatusIsNull() {
            addCriterion("stuStatus is null");
            return (Criteria) this;
        }

        public Criteria andStustatusIsNotNull() {
            addCriterion("stuStatus is not null");
            return (Criteria) this;
        }

        public Criteria andStustatusEqualTo(String value) {
            addCriterion("stuStatus =", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusNotEqualTo(String value) {
            addCriterion("stuStatus <>", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusGreaterThan(String value) {
            addCriterion("stuStatus >", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusGreaterThanOrEqualTo(String value) {
            addCriterion("stuStatus >=", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusLessThan(String value) {
            addCriterion("stuStatus <", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusLessThanOrEqualTo(String value) {
            addCriterion("stuStatus <=", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusLike(String value) {
            addCriterion("stuStatus like", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusNotLike(String value) {
            addCriterion("stuStatus not like", value, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusIn(List<String> values) {
            addCriterion("stuStatus in", values, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusNotIn(List<String> values) {
            addCriterion("stuStatus not in", values, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusBetween(String value1, String value2) {
            addCriterion("stuStatus between", value1, value2, "stustatus");
            return (Criteria) this;
        }

        public Criteria andStustatusNotBetween(String value1, String value2) {
            addCriterion("stuStatus not between", value1, value2, "stustatus");
            return (Criteria) this;
        }

        public Criteria andSturemarkIsNull() {
            addCriterion("stuRemark is null");
            return (Criteria) this;
        }

        public Criteria andSturemarkIsNotNull() {
            addCriterion("stuRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSturemarkEqualTo(String value) {
            addCriterion("stuRemark =", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkNotEqualTo(String value) {
            addCriterion("stuRemark <>", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkGreaterThan(String value) {
            addCriterion("stuRemark >", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkGreaterThanOrEqualTo(String value) {
            addCriterion("stuRemark >=", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkLessThan(String value) {
            addCriterion("stuRemark <", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkLessThanOrEqualTo(String value) {
            addCriterion("stuRemark <=", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkLike(String value) {
            addCriterion("stuRemark like", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkNotLike(String value) {
            addCriterion("stuRemark not like", value, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkIn(List<String> values) {
            addCriterion("stuRemark in", values, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkNotIn(List<String> values) {
            addCriterion("stuRemark not in", values, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkBetween(String value1, String value2) {
            addCriterion("stuRemark between", value1, value2, "sturemark");
            return (Criteria) this;
        }

        public Criteria andSturemarkNotBetween(String value1, String value2) {
            addCriterion("stuRemark not between", value1, value2, "sturemark");
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