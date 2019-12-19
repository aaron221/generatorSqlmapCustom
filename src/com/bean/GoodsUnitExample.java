package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsUnitExample() {
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

        public Criteria andBasicUnitNameIsNull() {
            addCriterion("basic_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameIsNotNull() {
            addCriterion("basic_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameEqualTo(String value) {
            addCriterion("basic_unit_name =", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameNotEqualTo(String value) {
            addCriterion("basic_unit_name <>", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameGreaterThan(String value) {
            addCriterion("basic_unit_name >", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("basic_unit_name >=", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameLessThan(String value) {
            addCriterion("basic_unit_name <", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameLessThanOrEqualTo(String value) {
            addCriterion("basic_unit_name <=", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameLike(String value) {
            addCriterion("basic_unit_name like", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameNotLike(String value) {
            addCriterion("basic_unit_name not like", value, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameIn(List<String> values) {
            addCriterion("basic_unit_name in", values, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameNotIn(List<String> values) {
            addCriterion("basic_unit_name not in", values, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameBetween(String value1, String value2) {
            addCriterion("basic_unit_name between", value1, value2, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitNameNotBetween(String value1, String value2) {
            addCriterion("basic_unit_name not between", value1, value2, "basicUnitName");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateIsNull() {
            addCriterion("basic_unit_convert_rate is null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateIsNotNull() {
            addCriterion("basic_unit_convert_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateEqualTo(Integer value) {
            addCriterion("basic_unit_convert_rate =", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateNotEqualTo(Integer value) {
            addCriterion("basic_unit_convert_rate <>", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateGreaterThan(Integer value) {
            addCriterion("basic_unit_convert_rate >", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_convert_rate >=", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateLessThan(Integer value) {
            addCriterion("basic_unit_convert_rate <", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateLessThanOrEqualTo(Integer value) {
            addCriterion("basic_unit_convert_rate <=", value, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateIn(List<Integer> values) {
            addCriterion("basic_unit_convert_rate in", values, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateNotIn(List<Integer> values) {
            addCriterion("basic_unit_convert_rate not in", values, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_convert_rate between", value1, value2, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andBasicUnitConvertRateNotBetween(Integer value1, Integer value2) {
            addCriterion("basic_unit_convert_rate not between", value1, value2, "basicUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameIsNull() {
            addCriterion("stock_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameIsNotNull() {
            addCriterion("stock_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameEqualTo(String value) {
            addCriterion("stock_unit_name =", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameNotEqualTo(String value) {
            addCriterion("stock_unit_name <>", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameGreaterThan(String value) {
            addCriterion("stock_unit_name >", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_unit_name >=", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameLessThan(String value) {
            addCriterion("stock_unit_name <", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameLessThanOrEqualTo(String value) {
            addCriterion("stock_unit_name <=", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameLike(String value) {
            addCriterion("stock_unit_name like", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameNotLike(String value) {
            addCriterion("stock_unit_name not like", value, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameIn(List<String> values) {
            addCriterion("stock_unit_name in", values, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameNotIn(List<String> values) {
            addCriterion("stock_unit_name not in", values, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameBetween(String value1, String value2) {
            addCriterion("stock_unit_name between", value1, value2, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitNameNotBetween(String value1, String value2) {
            addCriterion("stock_unit_name not between", value1, value2, "stockUnitName");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateIsNull() {
            addCriterion("stock_unit_convert_rate is null");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateIsNotNull() {
            addCriterion("stock_unit_convert_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateEqualTo(Integer value) {
            addCriterion("stock_unit_convert_rate =", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateNotEqualTo(Integer value) {
            addCriterion("stock_unit_convert_rate <>", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateGreaterThan(Integer value) {
            addCriterion("stock_unit_convert_rate >", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_unit_convert_rate >=", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateLessThan(Integer value) {
            addCriterion("stock_unit_convert_rate <", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateLessThanOrEqualTo(Integer value) {
            addCriterion("stock_unit_convert_rate <=", value, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateIn(List<Integer> values) {
            addCriterion("stock_unit_convert_rate in", values, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateNotIn(List<Integer> values) {
            addCriterion("stock_unit_convert_rate not in", values, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateBetween(Integer value1, Integer value2) {
            addCriterion("stock_unit_convert_rate between", value1, value2, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andStockUnitConvertRateNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_unit_convert_rate not between", value1, value2, "stockUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameIsNull() {
            addCriterion("sale_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameIsNotNull() {
            addCriterion("sale_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameEqualTo(String value) {
            addCriterion("sale_unit_name =", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameNotEqualTo(String value) {
            addCriterion("sale_unit_name <>", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameGreaterThan(String value) {
            addCriterion("sale_unit_name >", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_unit_name >=", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameLessThan(String value) {
            addCriterion("sale_unit_name <", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sale_unit_name <=", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameLike(String value) {
            addCriterion("sale_unit_name like", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameNotLike(String value) {
            addCriterion("sale_unit_name not like", value, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameIn(List<String> values) {
            addCriterion("sale_unit_name in", values, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameNotIn(List<String> values) {
            addCriterion("sale_unit_name not in", values, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameBetween(String value1, String value2) {
            addCriterion("sale_unit_name between", value1, value2, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitNameNotBetween(String value1, String value2) {
            addCriterion("sale_unit_name not between", value1, value2, "saleUnitName");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateIsNull() {
            addCriterion("sale_unit_convert_rate is null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateIsNotNull() {
            addCriterion("sale_unit_convert_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateEqualTo(Integer value) {
            addCriterion("sale_unit_convert_rate =", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateNotEqualTo(Integer value) {
            addCriterion("sale_unit_convert_rate <>", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateGreaterThan(Integer value) {
            addCriterion("sale_unit_convert_rate >", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_unit_convert_rate >=", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateLessThan(Integer value) {
            addCriterion("sale_unit_convert_rate <", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateLessThanOrEqualTo(Integer value) {
            addCriterion("sale_unit_convert_rate <=", value, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateIn(List<Integer> values) {
            addCriterion("sale_unit_convert_rate in", values, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateNotIn(List<Integer> values) {
            addCriterion("sale_unit_convert_rate not in", values, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateBetween(Integer value1, Integer value2) {
            addCriterion("sale_unit_convert_rate between", value1, value2, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andSaleUnitConvertRateNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_unit_convert_rate not between", value1, value2, "saleUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameIsNull() {
            addCriterion("retail_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameIsNotNull() {
            addCriterion("retail_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameEqualTo(String value) {
            addCriterion("retail_unit_name =", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameNotEqualTo(String value) {
            addCriterion("retail_unit_name <>", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameGreaterThan(String value) {
            addCriterion("retail_unit_name >", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("retail_unit_name >=", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameLessThan(String value) {
            addCriterion("retail_unit_name <", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameLessThanOrEqualTo(String value) {
            addCriterion("retail_unit_name <=", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameLike(String value) {
            addCriterion("retail_unit_name like", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameNotLike(String value) {
            addCriterion("retail_unit_name not like", value, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameIn(List<String> values) {
            addCriterion("retail_unit_name in", values, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameNotIn(List<String> values) {
            addCriterion("retail_unit_name not in", values, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameBetween(String value1, String value2) {
            addCriterion("retail_unit_name between", value1, value2, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitNameNotBetween(String value1, String value2) {
            addCriterion("retail_unit_name not between", value1, value2, "retailUnitName");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateIsNull() {
            addCriterion("retail_unit_convert_rate is null");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateIsNotNull() {
            addCriterion("retail_unit_convert_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateEqualTo(Integer value) {
            addCriterion("retail_unit_convert_rate =", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateNotEqualTo(Integer value) {
            addCriterion("retail_unit_convert_rate <>", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateGreaterThan(Integer value) {
            addCriterion("retail_unit_convert_rate >", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("retail_unit_convert_rate >=", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateLessThan(Integer value) {
            addCriterion("retail_unit_convert_rate <", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateLessThanOrEqualTo(Integer value) {
            addCriterion("retail_unit_convert_rate <=", value, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateIn(List<Integer> values) {
            addCriterion("retail_unit_convert_rate in", values, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateNotIn(List<Integer> values) {
            addCriterion("retail_unit_convert_rate not in", values, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateBetween(Integer value1, Integer value2) {
            addCriterion("retail_unit_convert_rate between", value1, value2, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andRetailUnitConvertRateNotBetween(Integer value1, Integer value2) {
            addCriterion("retail_unit_convert_rate not between", value1, value2, "retailUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameIsNull() {
            addCriterion("purchase_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameIsNotNull() {
            addCriterion("purchase_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameEqualTo(String value) {
            addCriterion("purchase_unit_name =", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameNotEqualTo(String value) {
            addCriterion("purchase_unit_name <>", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameGreaterThan(String value) {
            addCriterion("purchase_unit_name >", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_unit_name >=", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameLessThan(String value) {
            addCriterion("purchase_unit_name <", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameLessThanOrEqualTo(String value) {
            addCriterion("purchase_unit_name <=", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameLike(String value) {
            addCriterion("purchase_unit_name like", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameNotLike(String value) {
            addCriterion("purchase_unit_name not like", value, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameIn(List<String> values) {
            addCriterion("purchase_unit_name in", values, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameNotIn(List<String> values) {
            addCriterion("purchase_unit_name not in", values, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameBetween(String value1, String value2) {
            addCriterion("purchase_unit_name between", value1, value2, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitNameNotBetween(String value1, String value2) {
            addCriterion("purchase_unit_name not between", value1, value2, "purchaseUnitName");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateIsNull() {
            addCriterion("purchase_unit_convert_rate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateIsNotNull() {
            addCriterion("purchase_unit_convert_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateEqualTo(Integer value) {
            addCriterion("purchase_unit_convert_rate =", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateNotEqualTo(Integer value) {
            addCriterion("purchase_unit_convert_rate <>", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateGreaterThan(Integer value) {
            addCriterion("purchase_unit_convert_rate >", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_unit_convert_rate >=", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateLessThan(Integer value) {
            addCriterion("purchase_unit_convert_rate <", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_unit_convert_rate <=", value, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateIn(List<Integer> values) {
            addCriterion("purchase_unit_convert_rate in", values, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateNotIn(List<Integer> values) {
            addCriterion("purchase_unit_convert_rate not in", values, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateBetween(Integer value1, Integer value2) {
            addCriterion("purchase_unit_convert_rate between", value1, value2, "purchaseUnitConvertRate");
            return (Criteria) this;
        }

        public Criteria andPurchaseUnitConvertRateNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_unit_convert_rate not between", value1, value2, "purchaseUnitConvertRate");
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