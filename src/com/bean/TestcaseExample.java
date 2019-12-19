package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestcaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestcaseExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("caseId is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseId is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(String value) {
            addCriterion("caseId =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(String value) {
            addCriterion("caseId <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(String value) {
            addCriterion("caseId >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(String value) {
            addCriterion("caseId >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(String value) {
            addCriterion("caseId <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(String value) {
            addCriterion("caseId <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLike(String value) {
            addCriterion("caseId like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotLike(String value) {
            addCriterion("caseId not like", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<String> values) {
            addCriterion("caseId in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<String> values) {
            addCriterion("caseId not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(String value1, String value2) {
            addCriterion("caseId between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(String value1, String value2) {
            addCriterion("caseId not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNull() {
            addCriterion("caseName is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("caseName is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("caseName =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("caseName <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("caseName >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("caseName >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("caseName <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("caseName <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("caseName like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("caseName not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("caseName in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("caseName not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("caseName between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("caseName not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andRequestbodyIsNull() {
            addCriterion("requestBody is null");
            return (Criteria) this;
        }

        public Criteria andRequestbodyIsNotNull() {
            addCriterion("requestBody is not null");
            return (Criteria) this;
        }

        public Criteria andRequestbodyEqualTo(String value) {
            addCriterion("requestBody =", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyNotEqualTo(String value) {
            addCriterion("requestBody <>", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyGreaterThan(String value) {
            addCriterion("requestBody >", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyGreaterThanOrEqualTo(String value) {
            addCriterion("requestBody >=", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyLessThan(String value) {
            addCriterion("requestBody <", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyLessThanOrEqualTo(String value) {
            addCriterion("requestBody <=", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyLike(String value) {
            addCriterion("requestBody like", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyNotLike(String value) {
            addCriterion("requestBody not like", value, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyIn(List<String> values) {
            addCriterion("requestBody in", values, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyNotIn(List<String> values) {
            addCriterion("requestBody not in", values, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyBetween(String value1, String value2) {
            addCriterion("requestBody between", value1, value2, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestbodyNotBetween(String value1, String value2) {
            addCriterion("requestBody not between", value1, value2, "requestbody");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIsNull() {
            addCriterion("requestMethod is null");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIsNotNull() {
            addCriterion("requestMethod is not null");
            return (Criteria) this;
        }

        public Criteria andRequestmethodEqualTo(String value) {
            addCriterion("requestMethod =", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotEqualTo(String value) {
            addCriterion("requestMethod <>", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodGreaterThan(String value) {
            addCriterion("requestMethod >", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodGreaterThanOrEqualTo(String value) {
            addCriterion("requestMethod >=", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLessThan(String value) {
            addCriterion("requestMethod <", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLessThanOrEqualTo(String value) {
            addCriterion("requestMethod <=", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodLike(String value) {
            addCriterion("requestMethod like", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotLike(String value) {
            addCriterion("requestMethod not like", value, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodIn(List<String> values) {
            addCriterion("requestMethod in", values, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotIn(List<String> values) {
            addCriterion("requestMethod not in", values, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodBetween(String value1, String value2) {
            addCriterion("requestMethod between", value1, value2, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andRequestmethodNotBetween(String value1, String value2) {
            addCriterion("requestMethod not between", value1, value2, "requestmethod");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsIsNull() {
            addCriterion("expectKeywords is null");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsIsNotNull() {
            addCriterion("expectKeywords is not null");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsEqualTo(String value) {
            addCriterion("expectKeywords =", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsNotEqualTo(String value) {
            addCriterion("expectKeywords <>", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsGreaterThan(String value) {
            addCriterion("expectKeywords >", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("expectKeywords >=", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsLessThan(String value) {
            addCriterion("expectKeywords <", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsLessThanOrEqualTo(String value) {
            addCriterion("expectKeywords <=", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsLike(String value) {
            addCriterion("expectKeywords like", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsNotLike(String value) {
            addCriterion("expectKeywords not like", value, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsIn(List<String> values) {
            addCriterion("expectKeywords in", values, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsNotIn(List<String> values) {
            addCriterion("expectKeywords not in", values, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsBetween(String value1, String value2) {
            addCriterion("expectKeywords between", value1, value2, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andExpectkeywordsNotBetween(String value1, String value2) {
            addCriterion("expectKeywords not between", value1, value2, "expectkeywords");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidIsNull() {
            addCriterion("otherRequestCaseId is null");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidIsNotNull() {
            addCriterion("otherRequestCaseId is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidEqualTo(String value) {
            addCriterion("otherRequestCaseId =", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidNotEqualTo(String value) {
            addCriterion("otherRequestCaseId <>", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidGreaterThan(String value) {
            addCriterion("otherRequestCaseId >", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidGreaterThanOrEqualTo(String value) {
            addCriterion("otherRequestCaseId >=", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidLessThan(String value) {
            addCriterion("otherRequestCaseId <", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidLessThanOrEqualTo(String value) {
            addCriterion("otherRequestCaseId <=", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidLike(String value) {
            addCriterion("otherRequestCaseId like", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidNotLike(String value) {
            addCriterion("otherRequestCaseId not like", value, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidIn(List<String> values) {
            addCriterion("otherRequestCaseId in", values, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidNotIn(List<String> values) {
            addCriterion("otherRequestCaseId not in", values, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidBetween(String value1, String value2) {
            addCriterion("otherRequestCaseId between", value1, value2, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherrequestcaseidNotBetween(String value1, String value2) {
            addCriterion("otherRequestCaseId not between", value1, value2, "otherrequestcaseid");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysIsNull() {
            addCriterion("otherResponseKeys is null");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysIsNotNull() {
            addCriterion("otherResponseKeys is not null");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysEqualTo(String value) {
            addCriterion("otherResponseKeys =", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysNotEqualTo(String value) {
            addCriterion("otherResponseKeys <>", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysGreaterThan(String value) {
            addCriterion("otherResponseKeys >", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysGreaterThanOrEqualTo(String value) {
            addCriterion("otherResponseKeys >=", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysLessThan(String value) {
            addCriterion("otherResponseKeys <", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysLessThanOrEqualTo(String value) {
            addCriterion("otherResponseKeys <=", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysLike(String value) {
            addCriterion("otherResponseKeys like", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysNotLike(String value) {
            addCriterion("otherResponseKeys not like", value, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysIn(List<String> values) {
            addCriterion("otherResponseKeys in", values, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysNotIn(List<String> values) {
            addCriterion("otherResponseKeys not in", values, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysBetween(String value1, String value2) {
            addCriterion("otherResponseKeys between", value1, value2, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andOtherresponsekeysNotBetween(String value1, String value2) {
            addCriterion("otherResponseKeys not between", value1, value2, "otherresponsekeys");
            return (Criteria) this;
        }

        public Criteria andActualresponseIsNull() {
            addCriterion("actualResponse is null");
            return (Criteria) this;
        }

        public Criteria andActualresponseIsNotNull() {
            addCriterion("actualResponse is not null");
            return (Criteria) this;
        }

        public Criteria andActualresponseEqualTo(String value) {
            addCriterion("actualResponse =", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseNotEqualTo(String value) {
            addCriterion("actualResponse <>", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseGreaterThan(String value) {
            addCriterion("actualResponse >", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseGreaterThanOrEqualTo(String value) {
            addCriterion("actualResponse >=", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseLessThan(String value) {
            addCriterion("actualResponse <", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseLessThanOrEqualTo(String value) {
            addCriterion("actualResponse <=", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseLike(String value) {
            addCriterion("actualResponse like", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseNotLike(String value) {
            addCriterion("actualResponse not like", value, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseIn(List<String> values) {
            addCriterion("actualResponse in", values, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseNotIn(List<String> values) {
            addCriterion("actualResponse not in", values, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseBetween(String value1, String value2) {
            addCriterion("actualResponse between", value1, value2, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andActualresponseNotBetween(String value1, String value2) {
            addCriterion("actualResponse not between", value1, value2, "actualresponse");
            return (Criteria) this;
        }

        public Criteria andApipathIsNull() {
            addCriterion("apiPath is null");
            return (Criteria) this;
        }

        public Criteria andApipathIsNotNull() {
            addCriterion("apiPath is not null");
            return (Criteria) this;
        }

        public Criteria andApipathEqualTo(String value) {
            addCriterion("apiPath =", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathNotEqualTo(String value) {
            addCriterion("apiPath <>", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathGreaterThan(String value) {
            addCriterion("apiPath >", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathGreaterThanOrEqualTo(String value) {
            addCriterion("apiPath >=", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathLessThan(String value) {
            addCriterion("apiPath <", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathLessThanOrEqualTo(String value) {
            addCriterion("apiPath <=", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathLike(String value) {
            addCriterion("apiPath like", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathNotLike(String value) {
            addCriterion("apiPath not like", value, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathIn(List<String> values) {
            addCriterion("apiPath in", values, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathNotIn(List<String> values) {
            addCriterion("apiPath not in", values, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathBetween(String value1, String value2) {
            addCriterion("apiPath between", value1, value2, "apipath");
            return (Criteria) this;
        }

        public Criteria andApipathNotBetween(String value1, String value2) {
            addCriterion("apiPath not between", value1, value2, "apipath");
            return (Criteria) this;
        }

        public Criteria andHeadersIsNull() {
            addCriterion("headers is null");
            return (Criteria) this;
        }

        public Criteria andHeadersIsNotNull() {
            addCriterion("headers is not null");
            return (Criteria) this;
        }

        public Criteria andHeadersEqualTo(String value) {
            addCriterion("headers =", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersNotEqualTo(String value) {
            addCriterion("headers <>", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersGreaterThan(String value) {
            addCriterion("headers >", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersGreaterThanOrEqualTo(String value) {
            addCriterion("headers >=", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersLessThan(String value) {
            addCriterion("headers <", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersLessThanOrEqualTo(String value) {
            addCriterion("headers <=", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersLike(String value) {
            addCriterion("headers like", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersNotLike(String value) {
            addCriterion("headers not like", value, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersIn(List<String> values) {
            addCriterion("headers in", values, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersNotIn(List<String> values) {
            addCriterion("headers not in", values, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersBetween(String value1, String value2) {
            addCriterion("headers between", value1, value2, "headers");
            return (Criteria) this;
        }

        public Criteria andHeadersNotBetween(String value1, String value2) {
            addCriterion("headers not between", value1, value2, "headers");
            return (Criteria) this;
        }

        public Criteria andIspassIsNull() {
            addCriterion("isPass is null");
            return (Criteria) this;
        }

        public Criteria andIspassIsNotNull() {
            addCriterion("isPass is not null");
            return (Criteria) this;
        }

        public Criteria andIspassEqualTo(String value) {
            addCriterion("isPass =", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotEqualTo(String value) {
            addCriterion("isPass <>", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThan(String value) {
            addCriterion("isPass >", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThanOrEqualTo(String value) {
            addCriterion("isPass >=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThan(String value) {
            addCriterion("isPass <", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThanOrEqualTo(String value) {
            addCriterion("isPass <=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLike(String value) {
            addCriterion("isPass like", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotLike(String value) {
            addCriterion("isPass not like", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassIn(List<String> values) {
            addCriterion("isPass in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotIn(List<String> values) {
            addCriterion("isPass not in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassBetween(String value1, String value2) {
            addCriterion("isPass between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotBetween(String value1, String value2) {
            addCriterion("isPass not between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastUpdateTime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastUpdateTime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastUpdateTime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastUpdateTime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdateTime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastUpdateTime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastUpdateTime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdateTime not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andDotablesIsNull() {
            addCriterion("doTables is null");
            return (Criteria) this;
        }

        public Criteria andDotablesIsNotNull() {
            addCriterion("doTables is not null");
            return (Criteria) this;
        }

        public Criteria andDotablesEqualTo(String value) {
            addCriterion("doTables =", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesNotEqualTo(String value) {
            addCriterion("doTables <>", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesGreaterThan(String value) {
            addCriterion("doTables >", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesGreaterThanOrEqualTo(String value) {
            addCriterion("doTables >=", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesLessThan(String value) {
            addCriterion("doTables <", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesLessThanOrEqualTo(String value) {
            addCriterion("doTables <=", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesLike(String value) {
            addCriterion("doTables like", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesNotLike(String value) {
            addCriterion("doTables not like", value, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesIn(List<String> values) {
            addCriterion("doTables in", values, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesNotIn(List<String> values) {
            addCriterion("doTables not in", values, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesBetween(String value1, String value2) {
            addCriterion("doTables between", value1, value2, "dotables");
            return (Criteria) this;
        }

        public Criteria andDotablesNotBetween(String value1, String value2) {
            addCriterion("doTables not between", value1, value2, "dotables");
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