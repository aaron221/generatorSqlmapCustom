package com.bean;

public class Dictionary {
    private Integer id;

    private String indexId;

    private String parentIndexId;

    private String name;

    private String value;

    private String description;

    private String ext1;

    private String ext2;

    private String ext3;

    private String createdOperator;

    private Long createdAt;

    private String updatedOperator;

    private Long updatedAt;

    private Boolean isDeleted;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId == null ? null : indexId.trim();
    }

    public String getParentIndexId() {
        return parentIndexId;
    }

    public void setParentIndexId(String parentIndexId) {
        this.parentIndexId = parentIndexId == null ? null : parentIndexId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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