package com.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIsNull() {
            addCriterion("organization_type is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIsNotNull() {
            addCriterion("organization_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeEqualTo(Boolean value) {
            addCriterion("organization_type =", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotEqualTo(Boolean value) {
            addCriterion("organization_type <>", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeGreaterThan(Boolean value) {
            addCriterion("organization_type >", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("organization_type >=", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeLessThan(Boolean value) {
            addCriterion("organization_type <", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("organization_type <=", value, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeIn(List<Boolean> values) {
            addCriterion("organization_type in", values, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotIn(List<Boolean> values) {
            addCriterion("organization_type not in", values, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("organization_type between", value1, value2, "organizationType");
            return (Criteria) this;
        }

        public Criteria andOrganizationTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("organization_type not between", value1, value2, "organizationType");
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

        public Criteria andGoodsBasicIdIsNull() {
            addCriterion("goods_basic_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdIsNotNull() {
            addCriterion("goods_basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdEqualTo(Long value) {
            addCriterion("goods_basic_id =", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdNotEqualTo(Long value) {
            addCriterion("goods_basic_id <>", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdGreaterThan(Long value) {
            addCriterion("goods_basic_id >", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_basic_id >=", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdLessThan(Long value) {
            addCriterion("goods_basic_id <", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_basic_id <=", value, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdIn(List<Long> values) {
            addCriterion("goods_basic_id in", values, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdNotIn(List<Long> values) {
            addCriterion("goods_basic_id not in", values, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdBetween(Long value1, Long value2) {
            addCriterion("goods_basic_id between", value1, value2, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andGoodsBasicIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_basic_id not between", value1, value2, "goodsBasicId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdIsNull() {
            addCriterion("resource_group_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdIsNotNull() {
            addCriterion("resource_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdEqualTo(Long value) {
            addCriterion("resource_group_id =", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdNotEqualTo(Long value) {
            addCriterion("resource_group_id <>", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdGreaterThan(Long value) {
            addCriterion("resource_group_id >", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_group_id >=", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdLessThan(Long value) {
            addCriterion("resource_group_id <", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("resource_group_id <=", value, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdIn(List<Long> values) {
            addCriterion("resource_group_id in", values, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdNotIn(List<Long> values) {
            addCriterion("resource_group_id not in", values, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdBetween(Long value1, Long value2) {
            addCriterion("resource_group_id between", value1, value2, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("resource_group_id not between", value1, value2, "resourceGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdIsNull() {
            addCriterion("goods_combination_association_group_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdIsNotNull() {
            addCriterion("goods_combination_association_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdEqualTo(Long value) {
            addCriterion("goods_combination_association_group_id =", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdNotEqualTo(Long value) {
            addCriterion("goods_combination_association_group_id <>", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdGreaterThan(Long value) {
            addCriterion("goods_combination_association_group_id >", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_combination_association_group_id >=", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdLessThan(Long value) {
            addCriterion("goods_combination_association_group_id <", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_combination_association_group_id <=", value, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdIn(List<Long> values) {
            addCriterion("goods_combination_association_group_id in", values, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdNotIn(List<Long> values) {
            addCriterion("goods_combination_association_group_id not in", values, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdBetween(Long value1, Long value2) {
            addCriterion("goods_combination_association_group_id between", value1, value2, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsCombinationAssociationGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_combination_association_group_id not between", value1, value2, "goodsCombinationAssociationGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdIsNull() {
            addCriterion("goods_distribution_center_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdIsNotNull() {
            addCriterion("goods_distribution_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdEqualTo(Long value) {
            addCriterion("goods_distribution_center_id =", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdNotEqualTo(Long value) {
            addCriterion("goods_distribution_center_id <>", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdGreaterThan(Long value) {
            addCriterion("goods_distribution_center_id >", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_distribution_center_id >=", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdLessThan(Long value) {
            addCriterion("goods_distribution_center_id <", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_distribution_center_id <=", value, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdIn(List<Long> values) {
            addCriterion("goods_distribution_center_id in", values, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdNotIn(List<Long> values) {
            addCriterion("goods_distribution_center_id not in", values, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdBetween(Long value1, Long value2) {
            addCriterion("goods_distribution_center_id between", value1, value2, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsDistributionCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_distribution_center_id not between", value1, value2, "goodsDistributionCenterId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIsNull() {
            addCriterion("goods_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIsNotNull() {
            addCriterion("goods_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdEqualTo(Long value) {
            addCriterion("goods_unit_id =", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotEqualTo(Long value) {
            addCriterion("goods_unit_id <>", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdGreaterThan(Long value) {
            addCriterion("goods_unit_id >", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_unit_id >=", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdLessThan(Long value) {
            addCriterion("goods_unit_id <", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_unit_id <=", value, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdIn(List<Long> values) {
            addCriterion("goods_unit_id in", values, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotIn(List<Long> values) {
            addCriterion("goods_unit_id not in", values, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdBetween(Long value1, Long value2) {
            addCriterion("goods_unit_id between", value1, value2, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_unit_id not between", value1, value2, "goodsUnitId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdIsNull() {
            addCriterion("goods_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdIsNotNull() {
            addCriterion("goods_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdEqualTo(Long value) {
            addCriterion("goods_channel_id =", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdNotEqualTo(Long value) {
            addCriterion("goods_channel_id <>", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdGreaterThan(Long value) {
            addCriterion("goods_channel_id >", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_channel_id >=", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdLessThan(Long value) {
            addCriterion("goods_channel_id <", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_channel_id <=", value, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdIn(List<Long> values) {
            addCriterion("goods_channel_id in", values, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdNotIn(List<Long> values) {
            addCriterion("goods_channel_id not in", values, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdBetween(Long value1, Long value2) {
            addCriterion("goods_channel_id between", value1, value2, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_channel_id not between", value1, value2, "goodsChannelId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdIsNull() {
            addCriterion("goods_price_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdIsNotNull() {
            addCriterion("goods_price_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdEqualTo(Long value) {
            addCriterion("goods_price_id =", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdNotEqualTo(Long value) {
            addCriterion("goods_price_id <>", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdGreaterThan(Long value) {
            addCriterion("goods_price_id >", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_price_id >=", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdLessThan(Long value) {
            addCriterion("goods_price_id <", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_price_id <=", value, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdIn(List<Long> values) {
            addCriterion("goods_price_id in", values, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdNotIn(List<Long> values) {
            addCriterion("goods_price_id not in", values, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdBetween(Long value1, Long value2) {
            addCriterion("goods_price_id between", value1, value2, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_price_id not between", value1, value2, "goodsPriceId");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNull() {
            addCriterion("is_locked is null");
            return (Criteria) this;
        }

        public Criteria andIsLockedIsNotNull() {
            addCriterion("is_locked is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockedEqualTo(Boolean value) {
            addCriterion("is_locked =", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotEqualTo(Boolean value) {
            addCriterion("is_locked <>", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThan(Boolean value) {
            addCriterion("is_locked >", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_locked >=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThan(Boolean value) {
            addCriterion("is_locked <", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_locked <=", value, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedIn(List<Boolean> values) {
            addCriterion("is_locked in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotIn(List<Boolean> values) {
            addCriterion("is_locked not in", values, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_locked between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andIsLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_locked not between", value1, value2, "isLocked");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(Boolean value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(Boolean value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(Boolean value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(Boolean value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<Boolean> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<Boolean> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Boolean value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Boolean value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Boolean value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Boolean value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Boolean> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Boolean> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
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