package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsBasicExample() {
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

        public Criteria andGoodsSnIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSnEqualTo(String value) {
            addCriterion("goods_sn =", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThan(String value) {
            addCriterion("goods_sn <", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnLike(String value) {
            addCriterion("goods_sn like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotLike(String value) {
            addCriterion("goods_sn not like", value, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnIn(List<String> values) {
            addCriterion("goods_sn in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsSnNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goodsSn");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNull() {
            addCriterion("main_category is null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNotNull() {
            addCriterion("main_category is not null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryEqualTo(String value) {
            addCriterion("main_category =", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotEqualTo(String value) {
            addCriterion("main_category <>", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThan(String value) {
            addCriterion("main_category >", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("main_category >=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThan(String value) {
            addCriterion("main_category <", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThanOrEqualTo(String value) {
            addCriterion("main_category <=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLike(String value) {
            addCriterion("main_category like", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotLike(String value) {
            addCriterion("main_category not like", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIn(List<String> values) {
            addCriterion("main_category in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotIn(List<String> values) {
            addCriterion("main_category not in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryBetween(String value1, String value2) {
            addCriterion("main_category between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotBetween(String value1, String value2) {
            addCriterion("main_category not between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andSpuSnIsNull() {
            addCriterion("spu_sn is null");
            return (Criteria) this;
        }

        public Criteria andSpuSnIsNotNull() {
            addCriterion("spu_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSpuSnEqualTo(Long value) {
            addCriterion("spu_sn =", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnNotEqualTo(Long value) {
            addCriterion("spu_sn <>", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnGreaterThan(Long value) {
            addCriterion("spu_sn >", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_sn >=", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnLessThan(Long value) {
            addCriterion("spu_sn <", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnLessThanOrEqualTo(Long value) {
            addCriterion("spu_sn <=", value, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnIn(List<Long> values) {
            addCriterion("spu_sn in", values, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnNotIn(List<Long> values) {
            addCriterion("spu_sn not in", values, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnBetween(Long value1, Long value2) {
            addCriterion("spu_sn between", value1, value2, "spuSn");
            return (Criteria) this;
        }

        public Criteria andSpuSnNotBetween(Long value1, Long value2) {
            addCriterion("spu_sn not between", value1, value2, "spuSn");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIsNull() {
            addCriterion("goods_level is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIsNotNull() {
            addCriterion("goods_level is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelEqualTo(String value) {
            addCriterion("goods_level =", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotEqualTo(String value) {
            addCriterion("goods_level <>", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelGreaterThan(String value) {
            addCriterion("goods_level >", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_level >=", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelLessThan(String value) {
            addCriterion("goods_level <", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelLessThanOrEqualTo(String value) {
            addCriterion("goods_level <=", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelLike(String value) {
            addCriterion("goods_level like", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotLike(String value) {
            addCriterion("goods_level not like", value, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelIn(List<String> values) {
            addCriterion("goods_level in", values, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotIn(List<String> values) {
            addCriterion("goods_level not in", values, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelBetween(String value1, String value2) {
            addCriterion("goods_level between", value1, value2, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsLevelNotBetween(String value1, String value2) {
            addCriterion("goods_level not between", value1, value2, "goodsLevel");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeIsNull() {
            addCriterion("fruit_type is null");
            return (Criteria) this;
        }

        public Criteria andFruitTypeIsNotNull() {
            addCriterion("fruit_type is not null");
            return (Criteria) this;
        }

        public Criteria andFruitTypeEqualTo(Boolean value) {
            addCriterion("fruit_type =", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeNotEqualTo(Boolean value) {
            addCriterion("fruit_type <>", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeGreaterThan(Boolean value) {
            addCriterion("fruit_type >", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fruit_type >=", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeLessThan(Boolean value) {
            addCriterion("fruit_type <", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("fruit_type <=", value, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeIn(List<Boolean> values) {
            addCriterion("fruit_type in", values, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeNotIn(List<Boolean> values) {
            addCriterion("fruit_type not in", values, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("fruit_type between", value1, value2, "fruitType");
            return (Criteria) this;
        }

        public Criteria andFruitTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fruit_type not between", value1, value2, "fruitType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(Boolean value) {
            addCriterion("sale_type =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(Boolean value) {
            addCriterion("sale_type <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(Boolean value) {
            addCriterion("sale_type >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sale_type >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(Boolean value) {
            addCriterion("sale_type <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("sale_type <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<Boolean> values) {
            addCriterion("sale_type in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<Boolean> values) {
            addCriterion("sale_type not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_type between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_type not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIsNull() {
            addCriterion("is_combination is null");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIsNotNull() {
            addCriterion("is_combination is not null");
            return (Criteria) this;
        }

        public Criteria andIsCombinationEqualTo(Boolean value) {
            addCriterion("is_combination =", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotEqualTo(Boolean value) {
            addCriterion("is_combination <>", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationGreaterThan(Boolean value) {
            addCriterion("is_combination >", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_combination >=", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationLessThan(Boolean value) {
            addCriterion("is_combination <", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationLessThanOrEqualTo(Boolean value) {
            addCriterion("is_combination <=", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIn(List<Boolean> values) {
            addCriterion("is_combination in", values, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotIn(List<Boolean> values) {
            addCriterion("is_combination not in", values, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationBetween(Boolean value1, Boolean value2) {
            addCriterion("is_combination between", value1, value2, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_combination not between", value1, value2, "isCombination");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdIsNull() {
            addCriterion("label_group_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdIsNotNull() {
            addCriterion("label_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdEqualTo(Long value) {
            addCriterion("label_group_id =", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdNotEqualTo(Long value) {
            addCriterion("label_group_id <>", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdGreaterThan(Long value) {
            addCriterion("label_group_id >", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("label_group_id >=", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdLessThan(Long value) {
            addCriterion("label_group_id <", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("label_group_id <=", value, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdIn(List<Long> values) {
            addCriterion("label_group_id in", values, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdNotIn(List<Long> values) {
            addCriterion("label_group_id not in", values, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdBetween(Long value1, Long value2) {
            addCriterion("label_group_id between", value1, value2, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andLabelGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("label_group_id not between", value1, value2, "labelGroupId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameTwIsNull() {
            addCriterion("name_tw is null");
            return (Criteria) this;
        }

        public Criteria andNameTwIsNotNull() {
            addCriterion("name_tw is not null");
            return (Criteria) this;
        }

        public Criteria andNameTwEqualTo(String value) {
            addCriterion("name_tw =", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwNotEqualTo(String value) {
            addCriterion("name_tw <>", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwGreaterThan(String value) {
            addCriterion("name_tw >", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwGreaterThanOrEqualTo(String value) {
            addCriterion("name_tw >=", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwLessThan(String value) {
            addCriterion("name_tw <", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwLessThanOrEqualTo(String value) {
            addCriterion("name_tw <=", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwLike(String value) {
            addCriterion("name_tw like", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwNotLike(String value) {
            addCriterion("name_tw not like", value, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwIn(List<String> values) {
            addCriterion("name_tw in", values, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwNotIn(List<String> values) {
            addCriterion("name_tw not in", values, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwBetween(String value1, String value2) {
            addCriterion("name_tw between", value1, value2, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameTwNotBetween(String value1, String value2) {
            addCriterion("name_tw not between", value1, value2, "nameTw");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andMeatRateIsNull() {
            addCriterion("meat_rate is null");
            return (Criteria) this;
        }

        public Criteria andMeatRateIsNotNull() {
            addCriterion("meat_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMeatRateEqualTo(Integer value) {
            addCriterion("meat_rate =", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateNotEqualTo(Integer value) {
            addCriterion("meat_rate <>", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateGreaterThan(Integer value) {
            addCriterion("meat_rate >", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("meat_rate >=", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateLessThan(Integer value) {
            addCriterion("meat_rate <", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateLessThanOrEqualTo(Integer value) {
            addCriterion("meat_rate <=", value, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateIn(List<Integer> values) {
            addCriterion("meat_rate in", values, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateNotIn(List<Integer> values) {
            addCriterion("meat_rate not in", values, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateBetween(Integer value1, Integer value2) {
            addCriterion("meat_rate between", value1, value2, "meatRate");
            return (Criteria) this;
        }

        public Criteria andMeatRateNotBetween(Integer value1, Integer value2) {
            addCriterion("meat_rate not between", value1, value2, "meatRate");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIsNull() {
            addCriterion("spec_weight is null");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIsNotNull() {
            addCriterion("spec_weight is not null");
            return (Criteria) this;
        }

        public Criteria andSpecWeightEqualTo(Integer value) {
            addCriterion("spec_weight =", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotEqualTo(Integer value) {
            addCriterion("spec_weight <>", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightGreaterThan(Integer value) {
            addCriterion("spec_weight >", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("spec_weight >=", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightLessThan(Integer value) {
            addCriterion("spec_weight <", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightLessThanOrEqualTo(Integer value) {
            addCriterion("spec_weight <=", value, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightIn(List<Integer> values) {
            addCriterion("spec_weight in", values, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotIn(List<Integer> values) {
            addCriterion("spec_weight not in", values, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightBetween(Integer value1, Integer value2) {
            addCriterion("spec_weight between", value1, value2, "specWeight");
            return (Criteria) this;
        }

        public Criteria andSpecWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("spec_weight not between", value1, value2, "specWeight");
            return (Criteria) this;
        }

        public Criteria andIsDetachableIsNull() {
            addCriterion("is_detachable is null");
            return (Criteria) this;
        }

        public Criteria andIsDetachableIsNotNull() {
            addCriterion("is_detachable is not null");
            return (Criteria) this;
        }

        public Criteria andIsDetachableEqualTo(Boolean value) {
            addCriterion("is_detachable =", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableNotEqualTo(Boolean value) {
            addCriterion("is_detachable <>", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableGreaterThan(Boolean value) {
            addCriterion("is_detachable >", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_detachable >=", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableLessThan(Boolean value) {
            addCriterion("is_detachable <", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_detachable <=", value, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableIn(List<Boolean> values) {
            addCriterion("is_detachable in", values, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableNotIn(List<Boolean> values) {
            addCriterion("is_detachable not in", values, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_detachable between", value1, value2, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andIsDetachableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_detachable not between", value1, value2, "isDetachable");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnIsNull() {
            addCriterion("outer_package_sn is null");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnIsNotNull() {
            addCriterion("outer_package_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnEqualTo(String value) {
            addCriterion("outer_package_sn =", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnNotEqualTo(String value) {
            addCriterion("outer_package_sn <>", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnGreaterThan(String value) {
            addCriterion("outer_package_sn >", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnGreaterThanOrEqualTo(String value) {
            addCriterion("outer_package_sn >=", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnLessThan(String value) {
            addCriterion("outer_package_sn <", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnLessThanOrEqualTo(String value) {
            addCriterion("outer_package_sn <=", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnLike(String value) {
            addCriterion("outer_package_sn like", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnNotLike(String value) {
            addCriterion("outer_package_sn not like", value, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnIn(List<String> values) {
            addCriterion("outer_package_sn in", values, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnNotIn(List<String> values) {
            addCriterion("outer_package_sn not in", values, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnBetween(String value1, String value2) {
            addCriterion("outer_package_sn between", value1, value2, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andOuterPackageSnNotBetween(String value1, String value2) {
            addCriterion("outer_package_sn not between", value1, value2, "outerPackageSn");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNull() {
            addCriterion("mnemonic_code is null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNotNull() {
            addCriterion("mnemonic_code is not null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeEqualTo(String value) {
            addCriterion("mnemonic_code =", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotEqualTo(String value) {
            addCriterion("mnemonic_code <>", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThan(String value) {
            addCriterion("mnemonic_code >", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnemonic_code >=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThan(String value) {
            addCriterion("mnemonic_code <", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("mnemonic_code <=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLike(String value) {
            addCriterion("mnemonic_code like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotLike(String value) {
            addCriterion("mnemonic_code not like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIn(List<String> values) {
            addCriterion("mnemonic_code in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotIn(List<String> values) {
            addCriterion("mnemonic_code not in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeBetween(String value1, String value2) {
            addCriterion("mnemonic_code between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("mnemonic_code not between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateIsNull() {
            addCriterion("output_tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateIsNotNull() {
            addCriterion("output_tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateEqualTo(Integer value) {
            addCriterion("output_tax_rate =", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateNotEqualTo(Integer value) {
            addCriterion("output_tax_rate <>", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateGreaterThan(Integer value) {
            addCriterion("output_tax_rate >", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_tax_rate >=", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateLessThan(Integer value) {
            addCriterion("output_tax_rate <", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateLessThanOrEqualTo(Integer value) {
            addCriterion("output_tax_rate <=", value, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateIn(List<Integer> values) {
            addCriterion("output_tax_rate in", values, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateNotIn(List<Integer> values) {
            addCriterion("output_tax_rate not in", values, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateBetween(Integer value1, Integer value2) {
            addCriterion("output_tax_rate between", value1, value2, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andOutputTaxRateNotBetween(Integer value1, Integer value2) {
            addCriterion("output_tax_rate not between", value1, value2, "outputTaxRate");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIsNull() {
            addCriterion("shelf_life is null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIsNotNull() {
            addCriterion("shelf_life is not null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeEqualTo(Short value) {
            addCriterion("shelf_life =", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotEqualTo(Short value) {
            addCriterion("shelf_life <>", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeGreaterThan(Short value) {
            addCriterion("shelf_life >", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeGreaterThanOrEqualTo(Short value) {
            addCriterion("shelf_life >=", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeLessThan(Short value) {
            addCriterion("shelf_life <", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeLessThanOrEqualTo(Short value) {
            addCriterion("shelf_life <=", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIn(List<Short> values) {
            addCriterion("shelf_life in", values, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotIn(List<Short> values) {
            addCriterion("shelf_life not in", values, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeBetween(Short value1, Short value2) {
            addCriterion("shelf_life between", value1, value2, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotBetween(Short value1, Short value2) {
            addCriterion("shelf_life not between", value1, value2, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitIsNull() {
            addCriterion("shelf_life_unit is null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitIsNotNull() {
            addCriterion("shelf_life_unit is not null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitEqualTo(String value) {
            addCriterion("shelf_life_unit =", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitNotEqualTo(String value) {
            addCriterion("shelf_life_unit <>", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitGreaterThan(String value) {
            addCriterion("shelf_life_unit >", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_life_unit >=", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitLessThan(String value) {
            addCriterion("shelf_life_unit <", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitLessThanOrEqualTo(String value) {
            addCriterion("shelf_life_unit <=", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitLike(String value) {
            addCriterion("shelf_life_unit like", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitNotLike(String value) {
            addCriterion("shelf_life_unit not like", value, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitIn(List<String> values) {
            addCriterion("shelf_life_unit in", values, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitNotIn(List<String> values) {
            addCriterion("shelf_life_unit not in", values, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitBetween(String value1, String value2) {
            addCriterion("shelf_life_unit between", value1, value2, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andShelfLifeUnitNotBetween(String value1, String value2) {
            addCriterion("shelf_life_unit not between", value1, value2, "shelfLifeUnit");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIsNull() {
            addCriterion("place_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIsNotNull() {
            addCriterion("place_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginEqualTo(String value) {
            addCriterion("place_origin =", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotEqualTo(String value) {
            addCriterion("place_origin <>", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginGreaterThan(String value) {
            addCriterion("place_origin >", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginGreaterThanOrEqualTo(String value) {
            addCriterion("place_origin >=", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginLessThan(String value) {
            addCriterion("place_origin <", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginLessThanOrEqualTo(String value) {
            addCriterion("place_origin <=", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginLike(String value) {
            addCriterion("place_origin like", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotLike(String value) {
            addCriterion("place_origin not like", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIn(List<String> values) {
            addCriterion("place_origin in", values, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotIn(List<String> values) {
            addCriterion("place_origin not in", values, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginBetween(String value1, String value2) {
            addCriterion("place_origin between", value1, value2, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotBetween(String value1, String value2) {
            addCriterion("place_origin not between", value1, value2, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andIsUsableIsNull() {
            addCriterion("is_usable is null");
            return (Criteria) this;
        }

        public Criteria andIsUsableIsNotNull() {
            addCriterion("is_usable is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsableEqualTo(Boolean value) {
            addCriterion("is_usable =", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotEqualTo(Boolean value) {
            addCriterion("is_usable <>", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableGreaterThan(Boolean value) {
            addCriterion("is_usable >", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_usable >=", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableLessThan(Boolean value) {
            addCriterion("is_usable <", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_usable <=", value, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableIn(List<Boolean> values) {
            addCriterion("is_usable in", values, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotIn(List<Boolean> values) {
            addCriterion("is_usable not in", values, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_usable between", value1, value2, "isUsable");
            return (Criteria) this;
        }

        public Criteria andIsUsableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_usable not between", value1, value2, "isUsable");
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

        public Criteria andIsEliminateIsNull() {
            addCriterion("is_eliminate is null");
            return (Criteria) this;
        }

        public Criteria andIsEliminateIsNotNull() {
            addCriterion("is_eliminate is not null");
            return (Criteria) this;
        }

        public Criteria andIsEliminateEqualTo(Boolean value) {
            addCriterion("is_eliminate =", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotEqualTo(Boolean value) {
            addCriterion("is_eliminate <>", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateGreaterThan(Boolean value) {
            addCriterion("is_eliminate >", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_eliminate >=", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateLessThan(Boolean value) {
            addCriterion("is_eliminate <", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_eliminate <=", value, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateIn(List<Boolean> values) {
            addCriterion("is_eliminate in", values, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotIn(List<Boolean> values) {
            addCriterion("is_eliminate not in", values, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_eliminate between", value1, value2, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsEliminateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_eliminate not between", value1, value2, "isEliminate");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("is_gift is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("is_gift is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(Boolean value) {
            addCriterion("is_gift =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(Boolean value) {
            addCriterion("is_gift <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(Boolean value) {
            addCriterion("is_gift >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gift >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(Boolean value) {
            addCriterion("is_gift <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gift <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<Boolean> values) {
            addCriterion("is_gift in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<Boolean> values) {
            addCriterion("is_gift not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gift not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayIsNull() {
            addCriterion("is_upload_alipay is null");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayIsNotNull() {
            addCriterion("is_upload_alipay is not null");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayEqualTo(Boolean value) {
            addCriterion("is_upload_alipay =", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayNotEqualTo(Boolean value) {
            addCriterion("is_upload_alipay <>", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayGreaterThan(Boolean value) {
            addCriterion("is_upload_alipay >", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_upload_alipay >=", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayLessThan(Boolean value) {
            addCriterion("is_upload_alipay <", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_upload_alipay <=", value, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayIn(List<Boolean> values) {
            addCriterion("is_upload_alipay in", values, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayNotIn(List<Boolean> values) {
            addCriterion("is_upload_alipay not in", values, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_upload_alipay between", value1, value2, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadAlipayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_upload_alipay not between", value1, value2, "isUploadAlipay");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatIsNull() {
            addCriterion("is_upload_wechat is null");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatIsNotNull() {
            addCriterion("is_upload_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatEqualTo(Boolean value) {
            addCriterion("is_upload_wechat =", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatNotEqualTo(Boolean value) {
            addCriterion("is_upload_wechat <>", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatGreaterThan(Boolean value) {
            addCriterion("is_upload_wechat >", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_upload_wechat >=", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatLessThan(Boolean value) {
            addCriterion("is_upload_wechat <", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatLessThanOrEqualTo(Boolean value) {
            addCriterion("is_upload_wechat <=", value, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatIn(List<Boolean> values) {
            addCriterion("is_upload_wechat in", values, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatNotIn(List<Boolean> values) {
            addCriterion("is_upload_wechat not in", values, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatBetween(Boolean value1, Boolean value2) {
            addCriterion("is_upload_wechat between", value1, value2, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andIsUploadWechatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_upload_wechat not between", value1, value2, "isUploadWechat");
            return (Criteria) this;
        }

        public Criteria andImportMarkIsNull() {
            addCriterion("import_mark is null");
            return (Criteria) this;
        }

        public Criteria andImportMarkIsNotNull() {
            addCriterion("import_mark is not null");
            return (Criteria) this;
        }

        public Criteria andImportMarkEqualTo(String value) {
            addCriterion("import_mark =", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkNotEqualTo(String value) {
            addCriterion("import_mark <>", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkGreaterThan(String value) {
            addCriterion("import_mark >", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkGreaterThanOrEqualTo(String value) {
            addCriterion("import_mark >=", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkLessThan(String value) {
            addCriterion("import_mark <", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkLessThanOrEqualTo(String value) {
            addCriterion("import_mark <=", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkLike(String value) {
            addCriterion("import_mark like", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkNotLike(String value) {
            addCriterion("import_mark not like", value, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkIn(List<String> values) {
            addCriterion("import_mark in", values, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkNotIn(List<String> values) {
            addCriterion("import_mark not in", values, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkBetween(String value1, String value2) {
            addCriterion("import_mark between", value1, value2, "importMark");
            return (Criteria) this;
        }

        public Criteria andImportMarkNotBetween(String value1, String value2) {
            addCriterion("import_mark not between", value1, value2, "importMark");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIsNull() {
            addCriterion("storage_method is null");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIsNotNull() {
            addCriterion("storage_method is not null");
            return (Criteria) this;
        }

        public Criteria andStorageMethodEqualTo(String value) {
            addCriterion("storage_method =", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotEqualTo(String value) {
            addCriterion("storage_method <>", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodGreaterThan(String value) {
            addCriterion("storage_method >", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodGreaterThanOrEqualTo(String value) {
            addCriterion("storage_method >=", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLessThan(String value) {
            addCriterion("storage_method <", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLessThanOrEqualTo(String value) {
            addCriterion("storage_method <=", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodLike(String value) {
            addCriterion("storage_method like", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotLike(String value) {
            addCriterion("storage_method not like", value, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodIn(List<String> values) {
            addCriterion("storage_method in", values, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotIn(List<String> values) {
            addCriterion("storage_method not in", values, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodBetween(String value1, String value2) {
            addCriterion("storage_method between", value1, value2, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andStorageMethodNotBetween(String value1, String value2) {
            addCriterion("storage_method not between", value1, value2, "storageMethod");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueIsNull() {
            addCriterion("nutritional_value is null");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueIsNotNull() {
            addCriterion("nutritional_value is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueEqualTo(String value) {
            addCriterion("nutritional_value =", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueNotEqualTo(String value) {
            addCriterion("nutritional_value <>", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueGreaterThan(String value) {
            addCriterion("nutritional_value >", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueGreaterThanOrEqualTo(String value) {
            addCriterion("nutritional_value >=", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueLessThan(String value) {
            addCriterion("nutritional_value <", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueLessThanOrEqualTo(String value) {
            addCriterion("nutritional_value <=", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueLike(String value) {
            addCriterion("nutritional_value like", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueNotLike(String value) {
            addCriterion("nutritional_value not like", value, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueIn(List<String> values) {
            addCriterion("nutritional_value in", values, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueNotIn(List<String> values) {
            addCriterion("nutritional_value not in", values, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueBetween(String value1, String value2) {
            addCriterion("nutritional_value between", value1, value2, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andNutritionalValueNotBetween(String value1, String value2) {
            addCriterion("nutritional_value not between", value1, value2, "nutritionalValue");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsIsNull() {
            addCriterion("store_sorting_tips is null");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsIsNotNull() {
            addCriterion("store_sorting_tips is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsEqualTo(String value) {
            addCriterion("store_sorting_tips =", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsNotEqualTo(String value) {
            addCriterion("store_sorting_tips <>", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsGreaterThan(String value) {
            addCriterion("store_sorting_tips >", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsGreaterThanOrEqualTo(String value) {
            addCriterion("store_sorting_tips >=", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsLessThan(String value) {
            addCriterion("store_sorting_tips <", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsLessThanOrEqualTo(String value) {
            addCriterion("store_sorting_tips <=", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsLike(String value) {
            addCriterion("store_sorting_tips like", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsNotLike(String value) {
            addCriterion("store_sorting_tips not like", value, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsIn(List<String> values) {
            addCriterion("store_sorting_tips in", values, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsNotIn(List<String> values) {
            addCriterion("store_sorting_tips not in", values, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsBetween(String value1, String value2) {
            addCriterion("store_sorting_tips between", value1, value2, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andStoreSortingTipsNotBetween(String value1, String value2) {
            addCriterion("store_sorting_tips not between", value1, value2, "storeSortingTips");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrIsNull() {
            addCriterion("takeaway_attr is null");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrIsNotNull() {
            addCriterion("takeaway_attr is not null");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrEqualTo(String value) {
            addCriterion("takeaway_attr =", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrNotEqualTo(String value) {
            addCriterion("takeaway_attr <>", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrGreaterThan(String value) {
            addCriterion("takeaway_attr >", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrGreaterThanOrEqualTo(String value) {
            addCriterion("takeaway_attr >=", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrLessThan(String value) {
            addCriterion("takeaway_attr <", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrLessThanOrEqualTo(String value) {
            addCriterion("takeaway_attr <=", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrLike(String value) {
            addCriterion("takeaway_attr like", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrNotLike(String value) {
            addCriterion("takeaway_attr not like", value, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrIn(List<String> values) {
            addCriterion("takeaway_attr in", values, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrNotIn(List<String> values) {
            addCriterion("takeaway_attr not in", values, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrBetween(String value1, String value2) {
            addCriterion("takeaway_attr between", value1, value2, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andTakeawayAttrNotBetween(String value1, String value2) {
            addCriterion("takeaway_attr not between", value1, value2, "takeawayAttr");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
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