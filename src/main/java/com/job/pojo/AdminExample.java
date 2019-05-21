package com.job.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(String value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(String value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(String value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(String value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(String value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(String value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLike(String value) {
            addCriterion("admin like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotLike(String value) {
            addCriterion("admin not like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<String> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<String> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(String value1, String value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(String value1, String value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andMasterIsNull() {
            addCriterion("master is null");
            return (Criteria) this;
        }

        public Criteria andMasterIsNotNull() {
            addCriterion("master is not null");
            return (Criteria) this;
        }

        public Criteria andMasterEqualTo(Integer value) {
            addCriterion("master =", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotEqualTo(Integer value) {
            addCriterion("master <>", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThan(Integer value) {
            addCriterion("master >", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("master >=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThan(Integer value) {
            addCriterion("master <", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThanOrEqualTo(Integer value) {
            addCriterion("master <=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterIn(List<Integer> values) {
            addCriterion("master in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotIn(List<Integer> values) {
            addCriterion("master not in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterBetween(Integer value1, Integer value2) {
            addCriterion("master between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("master not between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andFrozeIsNull() {
            addCriterion("froze is null");
            return (Criteria) this;
        }

        public Criteria andFrozeIsNotNull() {
            addCriterion("froze is not null");
            return (Criteria) this;
        }

        public Criteria andFrozeEqualTo(Integer value) {
            addCriterion("froze =", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeNotEqualTo(Integer value) {
            addCriterion("froze <>", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeGreaterThan(Integer value) {
            addCriterion("froze >", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeGreaterThanOrEqualTo(Integer value) {
            addCriterion("froze >=", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeLessThan(Integer value) {
            addCriterion("froze <", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeLessThanOrEqualTo(Integer value) {
            addCriterion("froze <=", value, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeIn(List<Integer> values) {
            addCriterion("froze in", values, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeNotIn(List<Integer> values) {
            addCriterion("froze not in", values, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeBetween(Integer value1, Integer value2) {
            addCriterion("froze between", value1, value2, "froze");
            return (Criteria) this;
        }

        public Criteria andFrozeNotBetween(Integer value1, Integer value2) {
            addCriterion("froze not between", value1, value2, "froze");
            return (Criteria) this;
        }

        public Criteria andDelectIsNull() {
            addCriterion("delect is null");
            return (Criteria) this;
        }

        public Criteria andDelectIsNotNull() {
            addCriterion("delect is not null");
            return (Criteria) this;
        }

        public Criteria andDelectEqualTo(Integer value) {
            addCriterion("delect =", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectNotEqualTo(Integer value) {
            addCriterion("delect <>", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectGreaterThan(Integer value) {
            addCriterion("delect >", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectGreaterThanOrEqualTo(Integer value) {
            addCriterion("delect >=", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectLessThan(Integer value) {
            addCriterion("delect <", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectLessThanOrEqualTo(Integer value) {
            addCriterion("delect <=", value, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectIn(List<Integer> values) {
            addCriterion("delect in", values, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectNotIn(List<Integer> values) {
            addCriterion("delect not in", values, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectBetween(Integer value1, Integer value2) {
            addCriterion("delect between", value1, value2, "delect");
            return (Criteria) this;
        }

        public Criteria andDelectNotBetween(Integer value1, Integer value2) {
            addCriterion("delect not between", value1, value2, "delect");
            return (Criteria) this;
        }

        public Criteria andRepasswordIsNull() {
            addCriterion("repassword is null");
            return (Criteria) this;
        }

        public Criteria andRepasswordIsNotNull() {
            addCriterion("repassword is not null");
            return (Criteria) this;
        }

        public Criteria andRepasswordEqualTo(Integer value) {
            addCriterion("repassword =", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordNotEqualTo(Integer value) {
            addCriterion("repassword <>", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordGreaterThan(Integer value) {
            addCriterion("repassword >", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("repassword >=", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordLessThan(Integer value) {
            addCriterion("repassword <", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordLessThanOrEqualTo(Integer value) {
            addCriterion("repassword <=", value, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordIn(List<Integer> values) {
            addCriterion("repassword in", values, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordNotIn(List<Integer> values) {
            addCriterion("repassword not in", values, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordBetween(Integer value1, Integer value2) {
            addCriterion("repassword between", value1, value2, "repassword");
            return (Criteria) this;
        }

        public Criteria andRepasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("repassword not between", value1, value2, "repassword");
            return (Criteria) this;
        }

        public Criteria andSelectIsNull() {
            addCriterion("select is null");
            return (Criteria) this;
        }

        public Criteria andSelectIsNotNull() {
            addCriterion("select is not null");
            return (Criteria) this;
        }

        public Criteria andSelectEqualTo(Integer value) {
            addCriterion("select =", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotEqualTo(Integer value) {
            addCriterion("select <>", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectGreaterThan(Integer value) {
            addCriterion("select >", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectGreaterThanOrEqualTo(Integer value) {
            addCriterion("select >=", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectLessThan(Integer value) {
            addCriterion("select <", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectLessThanOrEqualTo(Integer value) {
            addCriterion("select <=", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectIn(List<Integer> values) {
            addCriterion("select in", values, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotIn(List<Integer> values) {
            addCriterion("select not in", values, "select");
            return (Criteria) this;
        }

        public Criteria andSelectBetween(Integer value1, Integer value2) {
            addCriterion("select between", value1, value2, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotBetween(Integer value1, Integer value2) {
            addCriterion("select not between", value1, value2, "select");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNull() {
            addCriterion("freeze is null");
            return (Criteria) this;
        }

        public Criteria andFreezeIsNotNull() {
            addCriterion("freeze is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeEqualTo(Integer value) {
            addCriterion("freeze =", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotEqualTo(Integer value) {
            addCriterion("freeze <>", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThan(Integer value) {
            addCriterion("freeze >", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeze >=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThan(Integer value) {
            addCriterion("freeze <", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeLessThanOrEqualTo(Integer value) {
            addCriterion("freeze <=", value, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeIn(List<Integer> values) {
            addCriterion("freeze in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotIn(List<Integer> values) {
            addCriterion("freeze not in", values, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeBetween(Integer value1, Integer value2) {
            addCriterion("freeze between", value1, value2, "freeze");
            return (Criteria) this;
        }

        public Criteria andFreezeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeze not between", value1, value2, "freeze");
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