package com.bean;

import java.util.ArrayList;
import java.util.List;

public class TestsysteminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestsysteminfoExample() {
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

        public Criteria andSystemidIsNull() {
            addCriterion("systemId is null");
            return (Criteria) this;
        }

        public Criteria andSystemidIsNotNull() {
            addCriterion("systemId is not null");
            return (Criteria) this;
        }

        public Criteria andSystemidEqualTo(Integer value) {
            addCriterion("systemId =", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotEqualTo(Integer value) {
            addCriterion("systemId <>", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThan(Integer value) {
            addCriterion("systemId >", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("systemId >=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThan(Integer value) {
            addCriterion("systemId <", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidLessThanOrEqualTo(Integer value) {
            addCriterion("systemId <=", value, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidIn(List<Integer> values) {
            addCriterion("systemId in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotIn(List<Integer> values) {
            addCriterion("systemId not in", values, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidBetween(Integer value1, Integer value2) {
            addCriterion("systemId between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemidNotBetween(Integer value1, Integer value2) {
            addCriterion("systemId not between", value1, value2, "systemid");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNull() {
            addCriterion("systemName is null");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNotNull() {
            addCriterion("systemName is not null");
            return (Criteria) this;
        }

        public Criteria andSystemnameEqualTo(String value) {
            addCriterion("systemName =", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotEqualTo(String value) {
            addCriterion("systemName <>", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThan(String value) {
            addCriterion("systemName >", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThanOrEqualTo(String value) {
            addCriterion("systemName >=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThan(String value) {
            addCriterion("systemName <", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThanOrEqualTo(String value) {
            addCriterion("systemName <=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLike(String value) {
            addCriterion("systemName like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotLike(String value) {
            addCriterion("systemName not like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameIn(List<String> values) {
            addCriterion("systemName in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotIn(List<String> values) {
            addCriterion("systemName not in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameBetween(String value1, String value2) {
            addCriterion("systemName between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotBetween(String value1, String value2) {
            addCriterion("systemName not between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
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