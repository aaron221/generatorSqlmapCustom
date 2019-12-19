package com.bean;

public class Category {
    private Long id;

    private String categoryId;

    private String parentCategoryId;

    private String nextId;

    private String name;

    private String extendsIds;

    private String thirdPartyCategoryId;

    private String thirdPartyChannelId;

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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId == null ? null : parentCategoryId.trim();
    }

    public String getNextId() {
        return nextId;
    }

    public void setNextId(String nextId) {
        this.nextId = nextId == null ? null : nextId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExtendsIds() {
        return extendsIds;
    }

    public void setExtendsIds(String extendsIds) {
        this.extendsIds = extendsIds == null ? null : extendsIds.trim();
    }

    public String getThirdPartyCategoryId() {
        return thirdPartyCategoryId;
    }

    public void setThirdPartyCategoryId(String thirdPartyCategoryId) {
        this.thirdPartyCategoryId = thirdPartyCategoryId == null ? null : thirdPartyCategoryId.trim();
    }

    public String getThirdPartyChannelId() {
        return thirdPartyChannelId;
    }

    public void setThirdPartyChannelId(String thirdPartyChannelId) {
        this.thirdPartyChannelId = thirdPartyChannelId == null ? null : thirdPartyChannelId.trim();
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