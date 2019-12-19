package com.bean;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNull() {
            addCriterion("parent_category_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIsNotNull() {
            addCriterion("parent_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdEqualTo(String value) {
            addCriterion("parent_category_id =", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotEqualTo(String value) {
            addCriterion("parent_category_id <>", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThan(String value) {
            addCriterion("parent_category_id >", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_category_id >=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThan(String value) {
            addCriterion("parent_category_id <", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("parent_category_id <=", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdLike(String value) {
            addCriterion("parent_category_id like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotLike(String value) {
            addCriterion("parent_category_id not like", value, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdIn(List<String> values) {
            addCriterion("parent_category_id in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotIn(List<String> values) {
            addCriterion("parent_category_id not in", values, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdBetween(String value1, String value2) {
            addCriterion("parent_category_id between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andParentCategoryIdNotBetween(String value1, String value2) {
            addCriterion("parent_category_id not between", value1, value2, "parentCategoryId");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNull() {
            addCriterion("next_id is null");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNotNull() {
            addCriterion("next_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextIdEqualTo(String value) {
            addCriterion("next_id =", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotEqualTo(String value) {
            addCriterion("next_id <>", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThan(String value) {
            addCriterion("next_id >", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThanOrEqualTo(String value) {
            addCriterion("next_id >=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThan(String value) {
            addCriterion("next_id <", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThanOrEqualTo(String value) {
            addCriterion("next_id <=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLike(String value) {
            addCriterion("next_id like", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotLike(String value) {
            addCriterion("next_id not like", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdIn(List<String> values) {
            addCriterion("next_id in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotIn(List<String> values) {
            addCriterion("next_id not in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdBetween(String value1, String value2) {
            addCriterion("next_id between", value1, value2, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotBetween(String value1, String value2) {
            addCriterion("next_id not between", value1, value2, "nextId");
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

        public Criteria andExtendsIdsIsNull() {
            addCriterion("extends_ids is null");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsIsNotNull() {
            addCriterion("extends_ids is not null");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsEqualTo(String value) {
            addCriterion("extends_ids =", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsNotEqualTo(String value) {
            addCriterion("extends_ids <>", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsGreaterThan(String value) {
            addCriterion("extends_ids >", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsGreaterThanOrEqualTo(String value) {
            addCriterion("extends_ids >=", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsLessThan(String value) {
            addCriterion("extends_ids <", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsLessThanOrEqualTo(String value) {
            addCriterion("extends_ids <=", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsLike(String value) {
            addCriterion("extends_ids like", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsNotLike(String value) {
            addCriterion("extends_ids not like", value, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsIn(List<String> values) {
            addCriterion("extends_ids in", values, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsNotIn(List<String> values) {
            addCriterion("extends_ids not in", values, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsBetween(String value1, String value2) {
            addCriterion("extends_ids between", value1, value2, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andExtendsIdsNotBetween(String value1, String value2) {
            addCriterion("extends_ids not between", value1, value2, "extendsIds");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdIsNull() {
            addCriterion("third_party_category_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdIsNotNull() {
            addCriterion("third_party_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdEqualTo(String value) {
            addCriterion("third_party_category_id =", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdNotEqualTo(String value) {
            addCriterion("third_party_category_id <>", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdGreaterThan(String value) {
            addCriterion("third_party_category_id >", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_category_id >=", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdLessThan(String value) {
            addCriterion("third_party_category_id <", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("third_party_category_id <=", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdLike(String value) {
            addCriterion("third_party_category_id like", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdNotLike(String value) {
            addCriterion("third_party_category_id not like", value, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdIn(List<String> values) {
            addCriterion("third_party_category_id in", values, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdNotIn(List<String> values) {
            addCriterion("third_party_category_id not in", values, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdBetween(String value1, String value2) {
            addCriterion("third_party_category_id between", value1, value2, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCategoryIdNotBetween(String value1, String value2) {
            addCriterion("third_party_category_id not between", value1, value2, "thirdPartyCategoryId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdIsNull() {
            addCriterion("third_party_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdIsNotNull() {
            addCriterion("third_party_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdEqualTo(String value) {
            addCriterion("third_party_channel_id =", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdNotEqualTo(String value) {
            addCriterion("third_party_channel_id <>", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdGreaterThan(String value) {
            addCriterion("third_party_channel_id >", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_channel_id >=", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdLessThan(String value) {
            addCriterion("third_party_channel_id <", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdLessThanOrEqualTo(String value) {
            addCriterion("third_party_channel_id <=", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdLike(String value) {
            addCriterion("third_party_channel_id like", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdNotLike(String value) {
            addCriterion("third_party_channel_id not like", value, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdIn(List<String> values) {
            addCriterion("third_party_channel_id in", values, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdNotIn(List<String> values) {
            addCriterion("third_party_channel_id not in", values, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdBetween(String value1, String value2) {
            addCriterion("third_party_channel_id between", value1, value2, "thirdPartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyChannelIdNotBetween(String value1, String value2) {
            addCriterion("third_party_channel_id not between", value1, value2, "thirdPartyChannelId");
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