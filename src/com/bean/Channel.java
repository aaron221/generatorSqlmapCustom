package com.bean;

public class Channel {
    private Long id;

    private Boolean type;

    private Boolean brand;

    private String name;

    private String logoUrl;

    private Integer shillCoefficient;

    private String description;

    private Long openedAt;

    private String mainImgProportion;

    private String mainImgSize;

    private String carouselImgProportion;

    private String carouselImgSize;

    private String activityImgProportion;

    private String activityImgSize;

    private Boolean isEnabled;

    private String ext1;

    private String ext2;

    private String ext3;

    private String createdOperator;

    private Long createdAt;

    private String updatedOperator;

    private Long updatedAt;

    private Boolean isDeleted;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getBrand() {
        return brand;
    }

    public void setBrand(Boolean brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public Integer getShillCoefficient() {
        return shillCoefficient;
    }

    public void setShillCoefficient(Integer shillCoefficient) {
        this.shillCoefficient = shillCoefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(Long openedAt) {
        this.openedAt = openedAt;
    }

    public String getMainImgProportion() {
        return mainImgProportion;
    }

    public void setMainImgProportion(String mainImgProportion) {
        this.mainImgProportion = mainImgProportion == null ? null : mainImgProportion.trim();
    }

    public String getMainImgSize() {
        return mainImgSize;
    }

    public void setMainImgSize(String mainImgSize) {
        this.mainImgSize = mainImgSize == null ? null : mainImgSize.trim();
    }

    public String getCarouselImgProportion() {
        return carouselImgProportion;
    }

    public void setCarouselImgProportion(String carouselImgProportion) {
        this.carouselImgProportion = carouselImgProportion == null ? null : carouselImgProportion.trim();
    }

    public String getCarouselImgSize() {
        return carouselImgSize;
    }

    public void setCarouselImgSize(String carouselImgSize) {
        this.carouselImgSize = carouselImgSize == null ? null : carouselImgSize.trim();
    }

    public String getActivityImgProportion() {
        return activityImgProportion;
    }

    public void setActivityImgProportion(String activityImgProportion) {
        this.activityImgProportion = activityImgProportion == null ? null : activityImgProportion.trim();
    }

    public String getActivityImgSize() {
        return activityImgSize;
    }

    public void setActivityImgSize(String activityImgSize) {
        this.activityImgSize = activityImgSize == null ? null : activityImgSize.trim();
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getCreatedOperator() {
        return createdOperator;
    }

    public void setCreatedOperator(String createdOperator) {
        this.createdOperator = createdOperator == null ? null : createdOperator.trim();
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedOperator() {
        return updatedOperator;
    }

    public void setUpdatedOperator(String updatedOperator) {
        this.updatedOperator = updatedOperator == null ? null : updatedOperator.trim();
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}