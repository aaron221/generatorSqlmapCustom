package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsDistributionCenterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsDistributionCenterExample() {
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

        public Criteria andTransportStorageTypeIsNull() {
            addCriterion("transport_storage_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeIsNotNull() {
            addCriterion("transport_storage_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeEqualTo(String value) {
            addCriterion("transport_storage_type =", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeNotEqualTo(String value) {
            addCriterion("transport_storage_type <>", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeGreaterThan(String value) {
            addCriterion("transport_storage_type >", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_storage_type >=", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeLessThan(String value) {
            addCriterion("transport_storage_type <", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("transport_storage_type <=", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeLike(String value) {
            addCriterion("transport_storage_type like", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeNotLike(String value) {
            addCriterion("transport_storage_type not like", value, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeIn(List<String> values) {
            addCriterion("transport_storage_type in", values, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeNotIn(List<String> values) {
            addCriterion("transport_storage_type not in", values, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeBetween(String value1, String value2) {
            addCriterion("transport_storage_type between", value1, value2, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andTransportStorageTypeNotBetween(String value1, String value2) {
            addCriterion("transport_storage_type not between", value1, value2, "transportStorageType");
            return (Criteria) this;
        }

        public Criteria andMustFruitIsNull() {
            addCriterion("must_fruit is null");
            return (Criteria) this;
        }

        public Criteria andMustFruitIsNotNull() {
            addCriterion("must_fruit is not null");
            return (Criteria) this;
        }

        public Criteria andMustFruitEqualTo(String value) {
            addCriterion("must_fruit =", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitNotEqualTo(String value) {
            addCriterion("must_fruit <>", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitGreaterThan(String value) {
            addCriterion("must_fruit >", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitGreaterThanOrEqualTo(String value) {
            addCriterion("must_fruit >=", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitLessThan(String value) {
            addCriterion("must_fruit <", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitLessThanOrEqualTo(String value) {
            addCriterion("must_fruit <=", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitLike(String value) {
            addCriterion("must_fruit like", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitNotLike(String value) {
            addCriterion("must_fruit not like", value, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitIn(List<String> values) {
            addCriterion("must_fruit in", values, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitNotIn(List<String> values) {
            addCriterion("must_fruit not in", values, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitBetween(String value1, String value2) {
            addCriterion("must_fruit between", value1, value2, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andMustFruitNotBetween(String value1, String value2) {
            addCriterion("must_fruit not between", value1, value2, "mustFruit");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescIsNull() {
            addCriterion("business_circle_must_desc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescIsNotNull() {
            addCriterion("business_circle_must_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescEqualTo(String value) {
            addCriterion("business_circle_must_desc =", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescNotEqualTo(String value) {
            addCriterion("business_circle_must_desc <>", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescGreaterThan(String value) {
            addCriterion("business_circle_must_desc >", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescGreaterThanOrEqualTo(String value) {
            addCriterion("business_circle_must_desc >=", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescLessThan(String value) {
            addCriterion("business_circle_must_desc <", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescLessThanOrEqualTo(String value) {
            addCriterion("business_circle_must_desc <=", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescLike(String value) {
            addCriterion("business_circle_must_desc like", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescNotLike(String value) {
            addCriterion("business_circle_must_desc not like", value, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescIn(List<String> values) {
            addCriterion("business_circle_must_desc in", values, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescNotIn(List<String> values) {
            addCriterion("business_circle_must_desc not in", values, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescBetween(String value1, String value2) {
            addCriterion("business_circle_must_desc between", value1, value2, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessCircleMustDescNotBetween(String value1, String value2) {
            addCriterion("business_circle_must_desc not between", value1, value2, "businessCircleMustDesc");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyIsNull() {
            addCriterion("batch_policy is null");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyIsNotNull() {
            addCriterion("batch_policy is not null");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyEqualTo(String value) {
            addCriterion("batch_policy =", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyNotEqualTo(String value) {
            addCriterion("batch_policy <>", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyGreaterThan(String value) {
            addCriterion("batch_policy >", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("batch_policy >=", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyLessThan(String value) {
            addCriterion("batch_policy <", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyLessThanOrEqualTo(String value) {
            addCriterion("batch_policy <=", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyLike(String value) {
            addCriterion("batch_policy like", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyNotLike(String value) {
            addCriterion("batch_policy not like", value, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyIn(List<String> values) {
            addCriterion("batch_policy in", values, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyNotIn(List<String> values) {
            addCriterion("batch_policy not in", values, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyBetween(String value1, String value2) {
            addCriterion("batch_policy between", value1, value2, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andBatchPolicyNotBetween(String value1, String value2) {
            addCriterion("batch_policy not between", value1, value2, "batchPolicy");
            return (Criteria) this;
        }

        public Criteria andDifferenceIsNull() {
            addCriterion("difference is null");
            return (Criteria) this;
        }

        public Criteria andDifferenceIsNotNull() {
            addCriterion("difference is not null");
            return (Criteria) this;
        }

        public Criteria andDifferenceEqualTo(String value) {
            addCriterion("difference =", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceNotEqualTo(String value) {
            addCriterion("difference <>", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceGreaterThan(String value) {
            addCriterion("difference >", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceGreaterThanOrEqualTo(String value) {
            addCriterion("difference >=", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceLessThan(String value) {
            addCriterion("difference <", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceLessThanOrEqualTo(String value) {
            addCriterion("difference <=", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceLike(String value) {
            addCriterion("difference like", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceNotLike(String value) {
            addCriterion("difference not like", value, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceIn(List<String> values) {
            addCriterion("difference in", values, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceNotIn(List<String> values) {
            addCriterion("difference not in", values, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceBetween(String value1, String value2) {
            addCriterion("difference between", value1, value2, "difference");
            return (Criteria) this;
        }

        public Criteria andDifferenceNotBetween(String value1, String value2) {
            addCriterion("difference not between", value1, value2, "difference");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyIsNull() {
            addCriterion("minimum_order_qty is null");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyIsNotNull() {
            addCriterion("minimum_order_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyEqualTo(Integer value) {
            addCriterion("minimum_order_qty =", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyNotEqualTo(Integer value) {
            addCriterion("minimum_order_qty <>", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyGreaterThan(Integer value) {
            addCriterion("minimum_order_qty >", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_order_qty >=", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyLessThan(Integer value) {
            addCriterion("minimum_order_qty <", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_order_qty <=", value, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyIn(List<Integer> values) {
            addCriterion("minimum_order_qty in", values, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyNotIn(List<Integer> values) {
            addCriterion("minimum_order_qty not in", values, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyBetween(Integer value1, Integer value2) {
            addCriterion("minimum_order_qty between", value1, value2, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinimumOrderQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_order_qty not between", value1, value2, "minimumOrderQty");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescIsNull() {
            addCriterion("quality_status_desc is null");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescIsNotNull() {
            addCriterion("quality_status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescEqualTo(String value) {
            addCriterion("quality_status_desc =", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescNotEqualTo(String value) {
            addCriterion("quality_status_desc <>", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescGreaterThan(String value) {
            addCriterion("quality_status_desc >", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("quality_status_desc >=", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescLessThan(String value) {
            addCriterion("quality_status_desc <", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescLessThanOrEqualTo(String value) {
            addCriterion("quality_status_desc <=", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescLike(String value) {
            addCriterion("quality_status_desc like", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescNotLike(String value) {
            addCriterion("quality_status_desc not like", value, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescIn(List<String> values) {
            addCriterion("quality_status_desc in", values, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescNotIn(List<String> values) {
            addCriterion("quality_status_desc not in", values, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescBetween(String value1, String value2) {
            addCriterion("quality_status_desc between", value1, value2, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andQualityStatusDescNotBetween(String value1, String value2) {
            addCriterion("quality_status_desc not between", value1, value2, "qualityStatusDesc");
            return (Criteria) this;
        }

        public Criteria andTrendIsNull() {
            addCriterion("trend is null");
            return (Criteria) this;
        }

        public Criteria andTrendIsNotNull() {
            addCriterion("trend is not null");
            return (Criteria) this;
        }

        public Criteria andTrendEqualTo(String value) {
            addCriterion("trend =", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotEqualTo(String value) {
            addCriterion("trend <>", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThan(String value) {
            addCriterion("trend >", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendGreaterThanOrEqualTo(String value) {
            addCriterion("trend >=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThan(String value) {
            addCriterion("trend <", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLessThanOrEqualTo(String value) {
            addCriterion("trend <=", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendLike(String value) {
            addCriterion("trend like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotLike(String value) {
            addCriterion("trend not like", value, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendIn(List<String> values) {
            addCriterion("trend in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotIn(List<String> values) {
            addCriterion("trend not in", values, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendBetween(String value1, String value2) {
            addCriterion("trend between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andTrendNotBetween(String value1, String value2) {
            addCriterion("trend not between", value1, value2, "trend");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationIsNull() {
            addCriterion("fruit_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationIsNotNull() {
            addCriterion("fruit_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationEqualTo(String value) {
            addCriterion("fruit_evaluation =", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationNotEqualTo(String value) {
            addCriterion("fruit_evaluation <>", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationGreaterThan(String value) {
            addCriterion("fruit_evaluation >", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("fruit_evaluation >=", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationLessThan(String value) {
            addCriterion("fruit_evaluation <", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationLessThanOrEqualTo(String value) {
            addCriterion("fruit_evaluation <=", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationLike(String value) {
            addCriterion("fruit_evaluation like", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationNotLike(String value) {
            addCriterion("fruit_evaluation not like", value, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationIn(List<String> values) {
            addCriterion("fruit_evaluation in", values, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationNotIn(List<String> values) {
            addCriterion("fruit_evaluation not in", values, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationBetween(String value1, String value2) {
            addCriterion("fruit_evaluation between", value1, value2, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andFruitEvaluationNotBetween(String value1, String value2) {
            addCriterion("fruit_evaluation not between", value1, value2, "fruitEvaluation");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsNull() {
            addCriterion("shopping_guide is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsNotNull() {
            addCriterion("shopping_guide is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideEqualTo(String value) {
            addCriterion("shopping_guide =", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNotEqualTo(String value) {
            addCriterion("shopping_guide <>", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideGreaterThan(String value) {
            addCriterion("shopping_guide >", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide >=", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLessThan(String value) {
            addCriterion("shopping_guide <", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide <=", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLike(String value) {
            addCriterion("shopping_guide like", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNotLike(String value) {
            addCriterion("shopping_guide not like", value, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIn(List<String> values) {
            addCriterion("shopping_guide in", values, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNotIn(List<String> values) {
            addCriterion("shopping_guide not in", values, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideBetween(String value1, String value2) {
            addCriterion("shopping_guide between", value1, value2, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNotBetween(String value1, String value2) {
            addCriterion("shopping_guide not between", value1, value2, "shoppingGuide");
            return (Criteria) this;
        }

        public Criteria andTasteIndexIsNull() {
            addCriterion("taste_index is null");
            return (Criteria) this;
        }

        public Criteria andTasteIndexIsNotNull() {
            addCriterion("taste_index is not null");
            return (Criteria) this;
        }

        public Criteria andTasteIndexEqualTo(String value) {
            addCriterion("taste_index =", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexNotEqualTo(String value) {
            addCriterion("taste_index <>", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexGreaterThan(String value) {
            addCriterion("taste_index >", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexGreaterThanOrEqualTo(String value) {
            addCriterion("taste_index >=", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexLessThan(String value) {
            addCriterion("taste_index <", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexLessThanOrEqualTo(String value) {
            addCriterion("taste_index <=", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexLike(String value) {
            addCriterion("taste_index like", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexNotLike(String value) {
            addCriterion("taste_index not like", value, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexIn(List<String> values) {
            addCriterion("taste_index in", values, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexNotIn(List<String> values) {
            addCriterion("taste_index not in", values, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexBetween(String value1, String value2) {
            addCriterion("taste_index between", value1, value2, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andTasteIndexNotBetween(String value1, String value2) {
            addCriterion("taste_index not between", value1, value2, "tasteIndex");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleIsNull() {
            addCriterion("deliverable_cycle is null");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleIsNotNull() {
            addCriterion("deliverable_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleEqualTo(String value) {
            addCriterion("deliverable_cycle =", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleNotEqualTo(String value) {
            addCriterion("deliverable_cycle <>", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleGreaterThan(String value) {
            addCriterion("deliverable_cycle >", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleGreaterThanOrEqualTo(String value) {
            addCriterion("deliverable_cycle >=", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleLessThan(String value) {
            addCriterion("deliverable_cycle <", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleLessThanOrEqualTo(String value) {
            addCriterion("deliverable_cycle <=", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleLike(String value) {
            addCriterion("deliverable_cycle like", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleNotLike(String value) {
            addCriterion("deliverable_cycle not like", value, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleIn(List<String> values) {
            addCriterion("deliverable_cycle in", values, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleNotIn(List<String> values) {
            addCriterion("deliverable_cycle not in", values, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleBetween(String value1, String value2) {
            addCriterion("deliverable_cycle between", value1, value2, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andDeliverableCycleNotBetween(String value1, String value2) {
            addCriterion("deliverable_cycle not between", value1, value2, "deliverableCycle");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIsNull() {
            addCriterion("source_status is null");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIsNotNull() {
            addCriterion("source_status is not null");
            return (Criteria) this;
        }

        public Criteria andSourceStatusEqualTo(Boolean value) {
            addCriterion("source_status =", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotEqualTo(Boolean value) {
            addCriterion("source_status <>", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusGreaterThan(Boolean value) {
            addCriterion("source_status >", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source_status >=", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusLessThan(Boolean value) {
            addCriterion("source_status <", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("source_status <=", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIn(List<Boolean> values) {
            addCriterion("source_status in", values, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotIn(List<Boolean> values) {
            addCriterion("source_status not in", values, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("source_status between", value1, value2, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source_status not between", value1, value2, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightIsNull() {
            addCriterion("single_fruit_weight is null");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightIsNotNull() {
            addCriterion("single_fruit_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightEqualTo(Integer value) {
            addCriterion("single_fruit_weight =", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightNotEqualTo(Integer value) {
            addCriterion("single_fruit_weight <>", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightGreaterThan(Integer value) {
            addCriterion("single_fruit_weight >", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_fruit_weight >=", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightLessThan(Integer value) {
            addCriterion("single_fruit_weight <", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightLessThanOrEqualTo(Integer value) {
            addCriterion("single_fruit_weight <=", value, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightIn(List<Integer> values) {
            addCriterion("single_fruit_weight in", values, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightNotIn(List<Integer> values) {
            addCriterion("single_fruit_weight not in", values, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightBetween(Integer value1, Integer value2) {
            addCriterion("single_fruit_weight between", value1, value2, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andSingleFruitWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("single_fruit_weight not between", value1, value2, "singleFruitWeight");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext_1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext_1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext_1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext_1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext_1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext_1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext_1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext_1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext_1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext_1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext_1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext_1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext_1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext_2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext_2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext_2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext_2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext_2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext_2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext_2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext_2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext_2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext_2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext_2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext_2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext_2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext_3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext_3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext_3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext_3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext_3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext_3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext_3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext_3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext_3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext_3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext_3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext_3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext_3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorIsNull() {
            addCriterion("created_operator is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorIsNotNull() {
            addCriterion("created_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorEqualTo(String value) {
            addCriterion("created_operator =", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorNotEqualTo(String value) {
            addCriterion("created_operator <>", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorGreaterThan(String value) {
            addCriterion("created_operator >", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("created_operator >=", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorLessThan(String value) {
            addCriterion("created_operator <", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorLessThanOrEqualTo(String value) {
            addCriterion("created_operator <=", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorLike(String value) {
            addCriterion("created_operator like", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorNotLike(String value) {
            addCriterion("created_operator not like", value, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorIn(List<String> values) {
            addCriterion("created_operator in", values, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorNotIn(List<String> values) {
            addCriterion("created_operator not in", values, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorBetween(String value1, String value2) {
            addCriterion("created_operator between", value1, value2, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedOperatorNotBetween(String value1, String value2) {
            addCriterion("created_operator not between", value1, value2, "createdOperator");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Long value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Long value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Long value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Long> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorIsNull() {
            addCriterion("updated_operator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorIsNotNull() {
            addCriterion("updated_operator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorEqualTo(String value) {
            addCriterion("updated_operator =", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorNotEqualTo(String value) {
            addCriterion("updated_operator <>", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorGreaterThan(String value) {
            addCriterion("updated_operator >", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("updated_operator >=", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorLessThan(String value) {
            addCriterion("updated_operator <", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorLessThanOrEqualTo(String value) {
            addCriterion("updated_operator <=", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorLike(String value) {
            addCriterion("updated_operator like", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorNotLike(String value) {
            addCriterion("updated_operator not like", value, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorIn(List<String> values) {
            addCriterion("updated_operator in", values, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorNotIn(List<String> values) {
            addCriterion("updated_operator not in", values, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorBetween(String value1, String value2) {
            addCriterion("updated_operator between", value1, value2, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedOperatorNotBetween(String value1, String value2) {
            addCriterion("updated_operator not between", value1, value2, "updatedOperator");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Long value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Long value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Long value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Long value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Long value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Long> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Long> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Long value1, Long value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Long value1, Long value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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