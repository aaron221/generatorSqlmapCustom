package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsChannelExample() {
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

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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

        public Criteria andFrontCategorySnIsNull() {
            addCriterion("front_category_sn is null");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnIsNotNull() {
            addCriterion("front_category_sn is not null");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnEqualTo(Long value) {
            addCriterion("front_category_sn =", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnNotEqualTo(Long value) {
            addCriterion("front_category_sn <>", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnGreaterThan(Long value) {
            addCriterion("front_category_sn >", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnGreaterThanOrEqualTo(Long value) {
            addCriterion("front_category_sn >=", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnLessThan(Long value) {
            addCriterion("front_category_sn <", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnLessThanOrEqualTo(Long value) {
            addCriterion("front_category_sn <=", value, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnIn(List<Long> values) {
            addCriterion("front_category_sn in", values, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnNotIn(List<Long> values) {
            addCriterion("front_category_sn not in", values, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnBetween(Long value1, Long value2) {
            addCriterion("front_category_sn between", value1, value2, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andFrontCategorySnNotBetween(Long value1, Long value2) {
            addCriterion("front_category_sn not between", value1, value2, "frontCategorySn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnIsNull() {
            addCriterion("material_sn is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSnIsNotNull() {
            addCriterion("material_sn is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSnEqualTo(Long value) {
            addCriterion("material_sn =", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnNotEqualTo(Long value) {
            addCriterion("material_sn <>", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnGreaterThan(Long value) {
            addCriterion("material_sn >", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnGreaterThanOrEqualTo(Long value) {
            addCriterion("material_sn >=", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnLessThan(Long value) {
            addCriterion("material_sn <", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnLessThanOrEqualTo(Long value) {
            addCriterion("material_sn <=", value, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnIn(List<Long> values) {
            addCriterion("material_sn in", values, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnNotIn(List<Long> values) {
            addCriterion("material_sn not in", values, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnBetween(Long value1, Long value2) {
            addCriterion("material_sn between", value1, value2, "materialSn");
            return (Criteria) this;
        }

        public Criteria andMaterialSnNotBetween(Long value1, Long value2) {
            addCriterion("material_sn not between", value1, value2, "materialSn");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeIsNull() {
            addCriterion("sale_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeIsNotNull() {
            addCriterion("sale_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeEqualTo(Long value) {
            addCriterion("sale_start_time =", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeNotEqualTo(Long value) {
            addCriterion("sale_start_time <>", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeGreaterThan(Long value) {
            addCriterion("sale_start_time >", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_start_time >=", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeLessThan(Long value) {
            addCriterion("sale_start_time <", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("sale_start_time <=", value, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeIn(List<Long> values) {
            addCriterion("sale_start_time in", values, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeNotIn(List<Long> values) {
            addCriterion("sale_start_time not in", values, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeBetween(Long value1, Long value2) {
            addCriterion("sale_start_time between", value1, value2, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("sale_start_time not between", value1, value2, "saleStartTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeIsNull() {
            addCriterion("sale_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeIsNotNull() {
            addCriterion("sale_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeEqualTo(Long value) {
            addCriterion("sale_end_time =", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeNotEqualTo(Long value) {
            addCriterion("sale_end_time <>", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeGreaterThan(Long value) {
            addCriterion("sale_end_time >", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_end_time >=", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeLessThan(Long value) {
            addCriterion("sale_end_time <", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("sale_end_time <=", value, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeIn(List<Long> values) {
            addCriterion("sale_end_time in", values, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeNotIn(List<Long> values) {
            addCriterion("sale_end_time not in", values, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeBetween(Long value1, Long value2) {
            addCriterion("sale_end_time between", value1, value2, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andSaleEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("sale_end_time not between", value1, value2, "saleEndTime");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayIsNull() {
            addCriterion("allowed_write_off_day is null");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayIsNotNull() {
            addCriterion("allowed_write_off_day is not null");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayEqualTo(Integer value) {
            addCriterion("allowed_write_off_day =", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayNotEqualTo(Integer value) {
            addCriterion("allowed_write_off_day <>", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayGreaterThan(Integer value) {
            addCriterion("allowed_write_off_day >", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("allowed_write_off_day >=", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayLessThan(Integer value) {
            addCriterion("allowed_write_off_day <", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayLessThanOrEqualTo(Integer value) {
            addCriterion("allowed_write_off_day <=", value, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayIn(List<Integer> values) {
            addCriterion("allowed_write_off_day in", values, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayNotIn(List<Integer> values) {
            addCriterion("allowed_write_off_day not in", values, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayBetween(Integer value1, Integer value2) {
            addCriterion("allowed_write_off_day between", value1, value2, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andAllowedWriteOffDayNotBetween(Integer value1, Integer value2) {
            addCriterion("allowed_write_off_day not between", value1, value2, "allowedWriteOffDay");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(Boolean value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(Boolean value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(Boolean value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(Boolean value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<Boolean> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<Boolean> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andNamePrefixIsNull() {
            addCriterion("name_prefix is null");
            return (Criteria) this;
        }

        public Criteria andNamePrefixIsNotNull() {
            addCriterion("name_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andNamePrefixEqualTo(String value) {
            addCriterion("name_prefix =", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixNotEqualTo(String value) {
            addCriterion("name_prefix <>", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixGreaterThan(String value) {
            addCriterion("name_prefix >", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("name_prefix >=", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixLessThan(String value) {
            addCriterion("name_prefix <", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixLessThanOrEqualTo(String value) {
            addCriterion("name_prefix <=", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixLike(String value) {
            addCriterion("name_prefix like", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixNotLike(String value) {
            addCriterion("name_prefix not like", value, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixIn(List<String> values) {
            addCriterion("name_prefix in", values, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixNotIn(List<String> values) {
            addCriterion("name_prefix not in", values, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixBetween(String value1, String value2) {
            addCriterion("name_prefix between", value1, value2, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andNamePrefixNotBetween(String value1, String value2) {
            addCriterion("name_prefix not between", value1, value2, "namePrefix");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNull() {
            addCriterion("main_img_url is null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNotNull() {
            addCriterion("main_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlEqualTo(String value) {
            addCriterion("main_img_url =", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotEqualTo(String value) {
            addCriterion("main_img_url <>", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThan(String value) {
            addCriterion("main_img_url >", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_img_url >=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThan(String value) {
            addCriterion("main_img_url <", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThanOrEqualTo(String value) {
            addCriterion("main_img_url <=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLike(String value) {
            addCriterion("main_img_url like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotLike(String value) {
            addCriterion("main_img_url not like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIn(List<String> values) {
            addCriterion("main_img_url in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotIn(List<String> values) {
            addCriterion("main_img_url not in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlBetween(String value1, String value2) {
            addCriterion("main_img_url between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotBetween(String value1, String value2) {
            addCriterion("main_img_url not between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescIsNull() {
            addCriterion("goods_attr_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescIsNotNull() {
            addCriterion("goods_attr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescEqualTo(String value) {
            addCriterion("goods_attr_desc =", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescNotEqualTo(String value) {
            addCriterion("goods_attr_desc <>", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescGreaterThan(String value) {
            addCriterion("goods_attr_desc >", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr_desc >=", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescLessThan(String value) {
            addCriterion("goods_attr_desc <", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescLessThanOrEqualTo(String value) {
            addCriterion("goods_attr_desc <=", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescLike(String value) {
            addCriterion("goods_attr_desc like", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescNotLike(String value) {
            addCriterion("goods_attr_desc not like", value, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescIn(List<String> values) {
            addCriterion("goods_attr_desc in", values, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescNotIn(List<String> values) {
            addCriterion("goods_attr_desc not in", values, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescBetween(String value1, String value2) {
            addCriterion("goods_attr_desc between", value1, value2, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrDescNotBetween(String value1, String value2) {
            addCriterion("goods_attr_desc not between", value1, value2, "goodsAttrDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescIsNull() {
            addCriterion("spec_desc is null");
            return (Criteria) this;
        }

        public Criteria andSpecDescIsNotNull() {
            addCriterion("spec_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDescEqualTo(String value) {
            addCriterion("spec_desc =", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescNotEqualTo(String value) {
            addCriterion("spec_desc <>", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescGreaterThan(String value) {
            addCriterion("spec_desc >", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescGreaterThanOrEqualTo(String value) {
            addCriterion("spec_desc >=", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescLessThan(String value) {
            addCriterion("spec_desc <", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescLessThanOrEqualTo(String value) {
            addCriterion("spec_desc <=", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescLike(String value) {
            addCriterion("spec_desc like", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescNotLike(String value) {
            addCriterion("spec_desc not like", value, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescIn(List<String> values) {
            addCriterion("spec_desc in", values, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescNotIn(List<String> values) {
            addCriterion("spec_desc not in", values, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescBetween(String value1, String value2) {
            addCriterion("spec_desc between", value1, value2, "specDesc");
            return (Criteria) this;
        }

        public Criteria andSpecDescNotBetween(String value1, String value2) {
            addCriterion("spec_desc not between", value1, value2, "specDesc");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyIsNull() {
            addCriterion("minimum_purchase_qty is null");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyIsNotNull() {
            addCriterion("minimum_purchase_qty is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyEqualTo(Integer value) {
            addCriterion("minimum_purchase_qty =", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyNotEqualTo(Integer value) {
            addCriterion("minimum_purchase_qty <>", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyGreaterThan(Integer value) {
            addCriterion("minimum_purchase_qty >", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_purchase_qty >=", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyLessThan(Integer value) {
            addCriterion("minimum_purchase_qty <", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_purchase_qty <=", value, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyIn(List<Integer> values) {
            addCriterion("minimum_purchase_qty in", values, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyNotIn(List<Integer> values) {
            addCriterion("minimum_purchase_qty not in", values, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyBetween(Integer value1, Integer value2) {
            addCriterion("minimum_purchase_qty between", value1, value2, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andMinimumPurchaseQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_purchase_qty not between", value1, value2, "minimumPurchaseQty");
            return (Criteria) this;
        }

        public Criteria andIsMentionIsNull() {
            addCriterion("is_mention is null");
            return (Criteria) this;
        }

        public Criteria andIsMentionIsNotNull() {
            addCriterion("is_mention is not null");
            return (Criteria) this;
        }

        public Criteria andIsMentionEqualTo(Boolean value) {
            addCriterion("is_mention =", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionNotEqualTo(Boolean value) {
            addCriterion("is_mention <>", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionGreaterThan(Boolean value) {
            addCriterion("is_mention >", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_mention >=", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionLessThan(Boolean value) {
            addCriterion("is_mention <", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionLessThanOrEqualTo(Boolean value) {
            addCriterion("is_mention <=", value, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionIn(List<Boolean> values) {
            addCriterion("is_mention in", values, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionNotIn(List<Boolean> values) {
            addCriterion("is_mention not in", values, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionBetween(Boolean value1, Boolean value2) {
            addCriterion("is_mention between", value1, value2, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsMentionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_mention not between", value1, value2, "isMention");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNull() {
            addCriterion("is_recommended is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIsNotNull() {
            addCriterion("is_recommended is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedEqualTo(Boolean value) {
            addCriterion("is_recommended =", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotEqualTo(Boolean value) {
            addCriterion("is_recommended <>", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThan(Boolean value) {
            addCriterion("is_recommended >", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recommended >=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThan(Boolean value) {
            addCriterion("is_recommended <", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recommended <=", value, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedIn(List<Boolean> values) {
            addCriterion("is_recommended in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotIn(List<Boolean> values) {
            addCriterion("is_recommended not in", values, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommended between", value1, value2, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsRecommendedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recommended not between", value1, value2, "isRecommended");
            return (Criteria) this;
        }

        public Criteria andIsActivityIsNull() {
            addCriterion("is_activity is null");
            return (Criteria) this;
        }

        public Criteria andIsActivityIsNotNull() {
            addCriterion("is_activity is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivityEqualTo(Boolean value) {
            addCriterion("is_activity =", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityNotEqualTo(Boolean value) {
            addCriterion("is_activity <>", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityGreaterThan(Boolean value) {
            addCriterion("is_activity >", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_activity >=", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityLessThan(Boolean value) {
            addCriterion("is_activity <", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityLessThanOrEqualTo(Boolean value) {
            addCriterion("is_activity <=", value, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityIn(List<Boolean> values) {
            addCriterion("is_activity in", values, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityNotIn(List<Boolean> values) {
            addCriterion("is_activity not in", values, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activity between", value1, value2, "isActivity");
            return (Criteria) this;
        }

        public Criteria andIsActivityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_activity not between", value1, value2, "isActivity");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnIsNull() {
            addCriterion("third_party_goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnIsNotNull() {
            addCriterion("third_party_goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnEqualTo(Long value) {
            addCriterion("third_party_goods_sn =", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnNotEqualTo(Long value) {
            addCriterion("third_party_goods_sn <>", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnGreaterThan(Long value) {
            addCriterion("third_party_goods_sn >", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnGreaterThanOrEqualTo(Long value) {
            addCriterion("third_party_goods_sn >=", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnLessThan(Long value) {
            addCriterion("third_party_goods_sn <", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnLessThanOrEqualTo(Long value) {
            addCriterion("third_party_goods_sn <=", value, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnIn(List<Long> values) {
            addCriterion("third_party_goods_sn in", values, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnNotIn(List<Long> values) {
            addCriterion("third_party_goods_sn not in", values, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnBetween(Long value1, Long value2) {
            addCriterion("third_party_goods_sn between", value1, value2, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andThirdPartyGoodsSnNotBetween(Long value1, Long value2) {
            addCriterion("third_party_goods_sn not between", value1, value2, "thirdPartyGoodsSn");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIsNull() {
            addCriterion("goods_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIsNotNull() {
            addCriterion("goods_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleEqualTo(String value) {
            addCriterion("goods_subtitle =", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotEqualTo(String value) {
            addCriterion("goods_subtitle <>", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleGreaterThan(String value) {
            addCriterion("goods_subtitle >", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_subtitle >=", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLessThan(String value) {
            addCriterion("goods_subtitle <", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLessThanOrEqualTo(String value) {
            addCriterion("goods_subtitle <=", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleLike(String value) {
            addCriterion("goods_subtitle like", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotLike(String value) {
            addCriterion("goods_subtitle not like", value, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleIn(List<String> values) {
            addCriterion("goods_subtitle in", values, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotIn(List<String> values) {
            addCriterion("goods_subtitle not in", values, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleBetween(String value1, String value2) {
            addCriterion("goods_subtitle between", value1, value2, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsSubtitleNotBetween(String value1, String value2) {
            addCriterion("goods_subtitle not between", value1, value2, "goodsSubtitle");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationIsNull() {
            addCriterion("goods_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationIsNotNull() {
            addCriterion("goods_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationEqualTo(String value) {
            addCriterion("goods_abbreviation =", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationNotEqualTo(String value) {
            addCriterion("goods_abbreviation <>", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationGreaterThan(String value) {
            addCriterion("goods_abbreviation >", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("goods_abbreviation >=", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationLessThan(String value) {
            addCriterion("goods_abbreviation <", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("goods_abbreviation <=", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationLike(String value) {
            addCriterion("goods_abbreviation like", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationNotLike(String value) {
            addCriterion("goods_abbreviation not like", value, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationIn(List<String> values) {
            addCriterion("goods_abbreviation in", values, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationNotIn(List<String> values) {
            addCriterion("goods_abbreviation not in", values, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationBetween(String value1, String value2) {
            addCriterion("goods_abbreviation between", value1, value2, "goodsAbbreviation");
            return (Criteria) this;
        }

        public Criteria andGoodsAbbreviationNotBetween(String value1, String value2) {
            addCriterion("goods_abbreviation not between", value1, value2, "goodsAbbreviation");
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

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andTipsIsNull() {
            addCriterion("tips is null");
            return (Criteria) this;
        }

        public Criteria andTipsIsNotNull() {
            addCriterion("tips is not null");
            return (Criteria) this;
        }

        public Criteria andTipsEqualTo(String value) {
            addCriterion("tips =", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotEqualTo(String value) {
            addCriterion("tips <>", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThan(String value) {
            addCriterion("tips >", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsGreaterThanOrEqualTo(String value) {
            addCriterion("tips >=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThan(String value) {
            addCriterion("tips <", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLessThanOrEqualTo(String value) {
            addCriterion("tips <=", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsLike(String value) {
            addCriterion("tips like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotLike(String value) {
            addCriterion("tips not like", value, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsIn(List<String> values) {
            addCriterion("tips in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotIn(List<String> values) {
            addCriterion("tips not in", values, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsBetween(String value1, String value2) {
            addCriterion("tips between", value1, value2, "tips");
            return (Criteria) this;
        }

        public Criteria andTipsNotBetween(String value1, String value2) {
            addCriterion("tips not between", value1, value2, "tips");
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