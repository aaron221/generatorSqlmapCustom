package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsPriceExample() {
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

        public Criteria andRetailFactorCoefficientIsNull() {
            addCriterion("retail_factor_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientIsNotNull() {
            addCriterion("retail_factor_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientEqualTo(Integer value) {
            addCriterion("retail_factor_coefficient =", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientNotEqualTo(Integer value) {
            addCriterion("retail_factor_coefficient <>", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientGreaterThan(Integer value) {
            addCriterion("retail_factor_coefficient >", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_factor_coefficient >=", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientLessThan(Integer value) {
            addCriterion("retail_factor_coefficient <", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientLessThanOrEqualTo(Integer value) {
            addCriterion("retail_factor_coefficient <=", value, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientIn(List<Integer> values) {
            addCriterion("retail_factor_coefficient in", values, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientNotIn(List<Integer> values) {
            addCriterion("retail_factor_coefficient not in", values, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientBetween(Integer value1, Integer value2) {
            addCriterion("retail_factor_coefficient between", value1, value2, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailFactorCoefficientNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_factor_coefficient not between", value1, value2, "retailFactorCoefficient");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceIsNull() {
            addCriterion("retail_diff_balance is null");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceIsNotNull() {
            addCriterion("retail_diff_balance is not null");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceEqualTo(Integer value) {
            addCriterion("retail_diff_balance =", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceNotEqualTo(Integer value) {
            addCriterion("retail_diff_balance <>", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceGreaterThan(Integer value) {
            addCriterion("retail_diff_balance >", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_diff_balance >=", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceLessThan(Integer value) {
            addCriterion("retail_diff_balance <", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("retail_diff_balance <=", value, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceIn(List<Integer> values) {
            addCriterion("retail_diff_balance in", values, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceNotIn(List<Integer> values) {
            addCriterion("retail_diff_balance not in", values, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceBetween(Integer value1, Integer value2) {
            addCriterion("retail_diff_balance between", value1, value2, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andRetailDiffBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_diff_balance not between", value1, value2, "retailDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceIsNull() {
            addCriterion("member_diff_balance is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceIsNotNull() {
            addCriterion("member_diff_balance is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceEqualTo(Integer value) {
            addCriterion("member_diff_balance =", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceNotEqualTo(Integer value) {
            addCriterion("member_diff_balance <>", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceGreaterThan(Integer value) {
            addCriterion("member_diff_balance >", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_diff_balance >=", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceLessThan(Integer value) {
            addCriterion("member_diff_balance <", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("member_diff_balance <=", value, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceIn(List<Integer> values) {
            addCriterion("member_diff_balance in", values, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceNotIn(List<Integer> values) {
            addCriterion("member_diff_balance not in", values, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceBetween(Integer value1, Integer value2) {
            addCriterion("member_diff_balance between", value1, value2, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMemberDiffBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("member_diff_balance not between", value1, value2, "memberDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceIsNull() {
            addCriterion("heart_diff_balance is null");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceIsNotNull() {
            addCriterion("heart_diff_balance is not null");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceEqualTo(Integer value) {
            addCriterion("heart_diff_balance =", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceNotEqualTo(Integer value) {
            addCriterion("heart_diff_balance <>", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceGreaterThan(Integer value) {
            addCriterion("heart_diff_balance >", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_diff_balance >=", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceLessThan(Integer value) {
            addCriterion("heart_diff_balance <", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceLessThanOrEqualTo(Integer value) {
            addCriterion("heart_diff_balance <=", value, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceIn(List<Integer> values) {
            addCriterion("heart_diff_balance in", values, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceNotIn(List<Integer> values) {
            addCriterion("heart_diff_balance not in", values, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceBetween(Integer value1, Integer value2) {
            addCriterion("heart_diff_balance between", value1, value2, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andHeartDiffBalanceNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_diff_balance not between", value1, value2, "heartDiffBalance");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceIsNull() {
            addCriterion("maximum_price is null");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceIsNotNull() {
            addCriterion("maximum_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceEqualTo(Integer value) {
            addCriterion("maximum_price =", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceNotEqualTo(Integer value) {
            addCriterion("maximum_price <>", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceGreaterThan(Integer value) {
            addCriterion("maximum_price >", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximum_price >=", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceLessThan(Integer value) {
            addCriterion("maximum_price <", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceLessThanOrEqualTo(Integer value) {
            addCriterion("maximum_price <=", value, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceIn(List<Integer> values) {
            addCriterion("maximum_price in", values, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceNotIn(List<Integer> values) {
            addCriterion("maximum_price not in", values, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceBetween(Integer value1, Integer value2) {
            addCriterion("maximum_price between", value1, value2, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("maximum_price not between", value1, value2, "maximumPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNull() {
            addCriterion("delivery_price is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNotNull() {
            addCriterion("delivery_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceEqualTo(Integer value) {
            addCriterion("delivery_price =", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotEqualTo(Integer value) {
            addCriterion("delivery_price <>", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThan(Integer value) {
            addCriterion("delivery_price >", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_price >=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThan(Integer value) {
            addCriterion("delivery_price <", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_price <=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIn(List<Integer> values) {
            addCriterion("delivery_price in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotIn(List<Integer> values) {
            addCriterion("delivery_price not in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceBetween(Integer value1, Integer value2) {
            addCriterion("delivery_price between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_price not between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNull() {
            addCriterion("minimum_price is null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNotNull() {
            addCriterion("minimum_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceEqualTo(Integer value) {
            addCriterion("minimum_price =", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotEqualTo(Integer value) {
            addCriterion("minimum_price <>", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThan(Integer value) {
            addCriterion("minimum_price >", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_price >=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThan(Integer value) {
            addCriterion("minimum_price <", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_price <=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIn(List<Integer> values) {
            addCriterion("minimum_price in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotIn(List<Integer> values) {
            addCriterion("minimum_price not in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceBetween(Integer value1, Integer value2) {
            addCriterion("minimum_price between", value1, value2, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_price not between", value1, value2, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("retail_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(Integer value) {
            addCriterion("retail_price =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(Integer value) {
            addCriterion("retail_price <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(Integer value) {
            addCriterion("retail_price >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_price >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(Integer value) {
            addCriterion("retail_price <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(Integer value) {
            addCriterion("retail_price <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<Integer> values) {
            addCriterion("retail_price in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<Integer> values) {
            addCriterion("retail_price not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(Integer value1, Integer value2) {
            addCriterion("retail_price between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_price not between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceIsNull() {
            addCriterion("return_price is null");
            return (Criteria) this;
        }

        public Criteria andReturnPriceIsNotNull() {
            addCriterion("return_price is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPriceEqualTo(Integer value) {
            addCriterion("return_price =", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceNotEqualTo(Integer value) {
            addCriterion("return_price <>", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceGreaterThan(Integer value) {
            addCriterion("return_price >", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_price >=", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceLessThan(Integer value) {
            addCriterion("return_price <", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceLessThanOrEqualTo(Integer value) {
            addCriterion("return_price <=", value, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceIn(List<Integer> values) {
            addCriterion("return_price in", values, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceNotIn(List<Integer> values) {
            addCriterion("return_price not in", values, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceBetween(Integer value1, Integer value2) {
            addCriterion("return_price between", value1, value2, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andReturnPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("return_price not between", value1, value2, "returnPrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceIsNull() {
            addCriterion("retail_reference_price is null");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceIsNotNull() {
            addCriterion("retail_reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceEqualTo(Integer value) {
            addCriterion("retail_reference_price =", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceNotEqualTo(Integer value) {
            addCriterion("retail_reference_price <>", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceGreaterThan(Integer value) {
            addCriterion("retail_reference_price >", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_reference_price >=", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceLessThan(Integer value) {
            addCriterion("retail_reference_price <", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceLessThanOrEqualTo(Integer value) {
            addCriterion("retail_reference_price <=", value, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceIn(List<Integer> values) {
            addCriterion("retail_reference_price in", values, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceNotIn(List<Integer> values) {
            addCriterion("retail_reference_price not in", values, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceBetween(Integer value1, Integer value2) {
            addCriterion("retail_reference_price between", value1, value2, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andRetailReferencePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_reference_price not between", value1, value2, "retailReferencePrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Integer value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Integer value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Integer value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Integer value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Integer> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Integer> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Integer value1, Integer value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceIsNull() {
            addCriterion("maximum_margin_price is null");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceIsNotNull() {
            addCriterion("maximum_margin_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceEqualTo(Integer value) {
            addCriterion("maximum_margin_price =", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceNotEqualTo(Integer value) {
            addCriterion("maximum_margin_price <>", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceGreaterThan(Integer value) {
            addCriterion("maximum_margin_price >", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("maximum_margin_price >=", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceLessThan(Integer value) {
            addCriterion("maximum_margin_price <", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceLessThanOrEqualTo(Integer value) {
            addCriterion("maximum_margin_price <=", value, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceIn(List<Integer> values) {
            addCriterion("maximum_margin_price in", values, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceNotIn(List<Integer> values) {
            addCriterion("maximum_margin_price not in", values, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceBetween(Integer value1, Integer value2) {
            addCriterion("maximum_margin_price between", value1, value2, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andMaximumMarginPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("maximum_margin_price not between", value1, value2, "maximumMarginPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceIsNull() {
            addCriterion("channel_factor_price is null");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceIsNotNull() {
            addCriterion("channel_factor_price is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceEqualTo(Integer value) {
            addCriterion("channel_factor_price =", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceNotEqualTo(Integer value) {
            addCriterion("channel_factor_price <>", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceGreaterThan(Integer value) {
            addCriterion("channel_factor_price >", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_factor_price >=", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceLessThan(Integer value) {
            addCriterion("channel_factor_price <", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceLessThanOrEqualTo(Integer value) {
            addCriterion("channel_factor_price <=", value, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceIn(List<Integer> values) {
            addCriterion("channel_factor_price in", values, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceNotIn(List<Integer> values) {
            addCriterion("channel_factor_price not in", values, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceBetween(Integer value1, Integer value2) {
            addCriterion("channel_factor_price between", value1, value2, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andChannelFactorPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_factor_price not between", value1, value2, "channelFactorPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(Integer value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(Integer value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(Integer value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(Integer value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(Integer value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<Integer> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<Integer> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(Integer value1, Integer value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceIsNull() {
            addCriterion("heart_price is null");
            return (Criteria) this;
        }

        public Criteria andHeartPriceIsNotNull() {
            addCriterion("heart_price is not null");
            return (Criteria) this;
        }

        public Criteria andHeartPriceEqualTo(Integer value) {
            addCriterion("heart_price =", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceNotEqualTo(Integer value) {
            addCriterion("heart_price <>", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceGreaterThan(Integer value) {
            addCriterion("heart_price >", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_price >=", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceLessThan(Integer value) {
            addCriterion("heart_price <", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceLessThanOrEqualTo(Integer value) {
            addCriterion("heart_price <=", value, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceIn(List<Integer> values) {
            addCriterion("heart_price in", values, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceNotIn(List<Integer> values) {
            addCriterion("heart_price not in", values, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceBetween(Integer value1, Integer value2) {
            addCriterion("heart_price between", value1, value2, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andHeartPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_price not between", value1, value2, "heartPrice");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginIsNull() {
            addCriterion("retail_gross_profit_margin is null");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginIsNotNull() {
            addCriterion("retail_gross_profit_margin is not null");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginEqualTo(Integer value) {
            addCriterion("retail_gross_profit_margin =", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginNotEqualTo(Integer value) {
            addCriterion("retail_gross_profit_margin <>", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginGreaterThan(Integer value) {
            addCriterion("retail_gross_profit_margin >", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_gross_profit_margin >=", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginLessThan(Integer value) {
            addCriterion("retail_gross_profit_margin <", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginLessThanOrEqualTo(Integer value) {
            addCriterion("retail_gross_profit_margin <=", value, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginIn(List<Integer> values) {
            addCriterion("retail_gross_profit_margin in", values, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginNotIn(List<Integer> values) {
            addCriterion("retail_gross_profit_margin not in", values, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginBetween(Integer value1, Integer value2) {
            addCriterion("retail_gross_profit_margin between", value1, value2, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andRetailGrossProfitMarginNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_gross_profit_margin not between", value1, value2, "retailGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginIsNull() {
            addCriterion("member_gross_profit_margin is null");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginIsNotNull() {
            addCriterion("member_gross_profit_margin is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginEqualTo(Integer value) {
            addCriterion("member_gross_profit_margin =", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginNotEqualTo(Integer value) {
            addCriterion("member_gross_profit_margin <>", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginGreaterThan(Integer value) {
            addCriterion("member_gross_profit_margin >", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_gross_profit_margin >=", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginLessThan(Integer value) {
            addCriterion("member_gross_profit_margin <", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginLessThanOrEqualTo(Integer value) {
            addCriterion("member_gross_profit_margin <=", value, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginIn(List<Integer> values) {
            addCriterion("member_gross_profit_margin in", values, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginNotIn(List<Integer> values) {
            addCriterion("member_gross_profit_margin not in", values, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginBetween(Integer value1, Integer value2) {
            addCriterion("member_gross_profit_margin between", value1, value2, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andMemberGrossProfitMarginNotBetween(Integer value1, Integer value2) {
            addCriterion("member_gross_profit_margin not between", value1, value2, "memberGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginIsNull() {
            addCriterion("heart_gross_profit_margin is null");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginIsNotNull() {
            addCriterion("heart_gross_profit_margin is not null");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginEqualTo(Integer value) {
            addCriterion("heart_gross_profit_margin =", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginNotEqualTo(Integer value) {
            addCriterion("heart_gross_profit_margin <>", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginGreaterThan(Integer value) {
            addCriterion("heart_gross_profit_margin >", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_gross_profit_margin >=", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginLessThan(Integer value) {
            addCriterion("heart_gross_profit_margin <", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginLessThanOrEqualTo(Integer value) {
            addCriterion("heart_gross_profit_margin <=", value, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginIn(List<Integer> values) {
            addCriterion("heart_gross_profit_margin in", values, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginNotIn(List<Integer> values) {
            addCriterion("heart_gross_profit_margin not in", values, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginBetween(Integer value1, Integer value2) {
            addCriterion("heart_gross_profit_margin between", value1, value2, "heartGrossProfitMargin");
            return (Criteria) this;
        }

        public Criteria andHeartGrossProfitMarginNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_gross_profit_margin not between", value1, value2, "heartGrossProfitMargin");
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