package com.bean;

import java.util.ArrayList;
import java.util.List;

public class ChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andBrandEqualTo(Boolean value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(Boolean value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(Boolean value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(Boolean value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(Boolean value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(Boolean value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<Boolean> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<Boolean> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(Boolean value1, Boolean value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(Boolean value1, Boolean value2) {
            addCriterion("brand not between", value1, value2, "brand");
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

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientIsNull() {
            addCriterion("shill_coefficient is null");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientIsNotNull() {
            addCriterion("shill_coefficient is not null");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientEqualTo(Integer value) {
            addCriterion("shill_coefficient =", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientNotEqualTo(Integer value) {
            addCriterion("shill_coefficient <>", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientGreaterThan(Integer value) {
            addCriterion("shill_coefficient >", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientGreaterThanOrEqualTo(Integer value) {
            addCriterion("shill_coefficient >=", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientLessThan(Integer value) {
            addCriterion("shill_coefficient <", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientLessThanOrEqualTo(Integer value) {
            addCriterion("shill_coefficient <=", value, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientIn(List<Integer> values) {
            addCriterion("shill_coefficient in", values, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientNotIn(List<Integer> values) {
            addCriterion("shill_coefficient not in", values, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientBetween(Integer value1, Integer value2) {
            addCriterion("shill_coefficient between", value1, value2, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andShillCoefficientNotBetween(Integer value1, Integer value2) {
            addCriterion("shill_coefficient not between", value1, value2, "shillCoefficient");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOpenedAtIsNull() {
            addCriterion("opened_at is null");
            return (Criteria) this;
        }

        public Criteria andOpenedAtIsNotNull() {
            addCriterion("opened_at is not null");
            return (Criteria) this;
        }

        public Criteria andOpenedAtEqualTo(Long value) {
            addCriterion("opened_at =", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtNotEqualTo(Long value) {
            addCriterion("opened_at <>", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtGreaterThan(Long value) {
            addCriterion("opened_at >", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("opened_at >=", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtLessThan(Long value) {
            addCriterion("opened_at <", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtLessThanOrEqualTo(Long value) {
            addCriterion("opened_at <=", value, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtIn(List<Long> values) {
            addCriterion("opened_at in", values, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtNotIn(List<Long> values) {
            addCriterion("opened_at not in", values, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtBetween(Long value1, Long value2) {
            addCriterion("opened_at between", value1, value2, "openedAt");
            return (Criteria) this;
        }

        public Criteria andOpenedAtNotBetween(Long value1, Long value2) {
            addCriterion("opened_at not between", value1, value2, "openedAt");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionIsNull() {
            addCriterion("main_img_proportion is null");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionIsNotNull() {
            addCriterion("main_img_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionEqualTo(String value) {
            addCriterion("main_img_proportion =", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionNotEqualTo(String value) {
            addCriterion("main_img_proportion <>", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionGreaterThan(String value) {
            addCriterion("main_img_proportion >", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionGreaterThanOrEqualTo(String value) {
            addCriterion("main_img_proportion >=", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionLessThan(String value) {
            addCriterion("main_img_proportion <", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionLessThanOrEqualTo(String value) {
            addCriterion("main_img_proportion <=", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionLike(String value) {
            addCriterion("main_img_proportion like", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionNotLike(String value) {
            addCriterion("main_img_proportion not like", value, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionIn(List<String> values) {
            addCriterion("main_img_proportion in", values, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionNotIn(List<String> values) {
            addCriterion("main_img_proportion not in", values, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionBetween(String value1, String value2) {
            addCriterion("main_img_proportion between", value1, value2, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgProportionNotBetween(String value1, String value2) {
            addCriterion("main_img_proportion not between", value1, value2, "mainImgProportion");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeIsNull() {
            addCriterion("main_img_size is null");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeIsNotNull() {
            addCriterion("main_img_size is not null");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeEqualTo(String value) {
            addCriterion("main_img_size =", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeNotEqualTo(String value) {
            addCriterion("main_img_size <>", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeGreaterThan(String value) {
            addCriterion("main_img_size >", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeGreaterThanOrEqualTo(String value) {
            addCriterion("main_img_size >=", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeLessThan(String value) {
            addCriterion("main_img_size <", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeLessThanOrEqualTo(String value) {
            addCriterion("main_img_size <=", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeLike(String value) {
            addCriterion("main_img_size like", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeNotLike(String value) {
            addCriterion("main_img_size not like", value, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeIn(List<String> values) {
            addCriterion("main_img_size in", values, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeNotIn(List<String> values) {
            addCriterion("main_img_size not in", values, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeBetween(String value1, String value2) {
            addCriterion("main_img_size between", value1, value2, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andMainImgSizeNotBetween(String value1, String value2) {
            addCriterion("main_img_size not between", value1, value2, "mainImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionIsNull() {
            addCriterion("carousel_img_proportion is null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionIsNotNull() {
            addCriterion("carousel_img_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionEqualTo(String value) {
            addCriterion("carousel_img_proportion =", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionNotEqualTo(String value) {
            addCriterion("carousel_img_proportion <>", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionGreaterThan(String value) {
            addCriterion("carousel_img_proportion >", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_img_proportion >=", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionLessThan(String value) {
            addCriterion("carousel_img_proportion <", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionLessThanOrEqualTo(String value) {
            addCriterion("carousel_img_proportion <=", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionLike(String value) {
            addCriterion("carousel_img_proportion like", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionNotLike(String value) {
            addCriterion("carousel_img_proportion not like", value, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionIn(List<String> values) {
            addCriterion("carousel_img_proportion in", values, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionNotIn(List<String> values) {
            addCriterion("carousel_img_proportion not in", values, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionBetween(String value1, String value2) {
            addCriterion("carousel_img_proportion between", value1, value2, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgProportionNotBetween(String value1, String value2) {
            addCriterion("carousel_img_proportion not between", value1, value2, "carouselImgProportion");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeIsNull() {
            addCriterion("carousel_img_size is null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeIsNotNull() {
            addCriterion("carousel_img_size is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeEqualTo(String value) {
            addCriterion("carousel_img_size =", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeNotEqualTo(String value) {
            addCriterion("carousel_img_size <>", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeGreaterThan(String value) {
            addCriterion("carousel_img_size >", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_img_size >=", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeLessThan(String value) {
            addCriterion("carousel_img_size <", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeLessThanOrEqualTo(String value) {
            addCriterion("carousel_img_size <=", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeLike(String value) {
            addCriterion("carousel_img_size like", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeNotLike(String value) {
            addCriterion("carousel_img_size not like", value, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeIn(List<String> values) {
            addCriterion("carousel_img_size in", values, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeNotIn(List<String> values) {
            addCriterion("carousel_img_size not in", values, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeBetween(String value1, String value2) {
            addCriterion("carousel_img_size between", value1, value2, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andCarouselImgSizeNotBetween(String value1, String value2) {
            addCriterion("carousel_img_size not between", value1, value2, "carouselImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionIsNull() {
            addCriterion("activity_img_proportion is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionIsNotNull() {
            addCriterion("activity_img_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionEqualTo(String value) {
            addCriterion("activity_img_proportion =", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionNotEqualTo(String value) {
            addCriterion("activity_img_proportion <>", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionGreaterThan(String value) {
            addCriterion("activity_img_proportion >", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_img_proportion >=", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionLessThan(String value) {
            addCriterion("activity_img_proportion <", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionLessThanOrEqualTo(String value) {
            addCriterion("activity_img_proportion <=", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionLike(String value) {
            addCriterion("activity_img_proportion like", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionNotLike(String value) {
            addCriterion("activity_img_proportion not like", value, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionIn(List<String> values) {
            addCriterion("activity_img_proportion in", values, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionNotIn(List<String> values) {
            addCriterion("activity_img_proportion not in", values, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionBetween(String value1, String value2) {
            addCriterion("activity_img_proportion between", value1, value2, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgProportionNotBetween(String value1, String value2) {
            addCriterion("activity_img_proportion not between", value1, value2, "activityImgProportion");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeIsNull() {
            addCriterion("activity_img_size is null");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeIsNotNull() {
            addCriterion("activity_img_size is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeEqualTo(String value) {
            addCriterion("activity_img_size =", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeNotEqualTo(String value) {
            addCriterion("activity_img_size <>", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeGreaterThan(String value) {
            addCriterion("activity_img_size >", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_img_size >=", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeLessThan(String value) {
            addCriterion("activity_img_size <", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeLessThanOrEqualTo(String value) {
            addCriterion("activity_img_size <=", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeLike(String value) {
            addCriterion("activity_img_size like", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeNotLike(String value) {
            addCriterion("activity_img_size not like", value, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeIn(List<String> values) {
            addCriterion("activity_img_size in", values, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeNotIn(List<String> values) {
            addCriterion("activity_img_size not in", values, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeBetween(String value1, String value2) {
            addCriterion("activity_img_size between", value1, value2, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andActivityImgSizeNotBetween(String value1, String value2) {
            addCriterion("activity_img_size not between", value1, value2, "activityImgSize");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
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