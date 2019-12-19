package com.bean;

public class Goods {
    private Long id;

    private String goodsSn;

    private Long organizationId;

    private Boolean organizationType;

    private Long channelId;

    private Long goodsBasicId;

    private Long resourceGroupId;

    private Long goodsCombinationAssociationGroupId;

    private Long goodsDistributionCenterId;

    private Long goodsUnitId;

    private Long goodsChannelId;

    private Long goodsPriceId;

    private Boolean isLocked;

    private Boolean postStatus;

    private Boolean saleStatus;

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

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Boolean getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Boolean organizationType) {
        this.organizationType = organizationType;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getGoodsBasicId() {
        return goodsBasicId;
    }

    public void setGoodsBasicId(Long goodsBasicId) {
        this.goodsBasicId = goodsBasicId;
    }

    public Long getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public Long getGoodsCombinationAssociationGroupId() {
        return goodsCombinationAssociationGroupId;
    }

    public void setGoodsCombinationAssociationGroupId(Long goodsCombinationAssociationGroupId) {
        this.goodsCombinationAssociationGroupId = goodsCombinationAssociationGroupId;
    }

    public Long getGoodsDistributionCenterId() {
        return goodsDistributionCenterId;
    }

    public void setGoodsDistributionCenterId(Long goodsDistributionCenterId) {
        this.goodsDistributionCenterId = goodsDistributionCenterId;
    }

    public Long getGoodsUnitId() {
        return goodsUnitId;
    }

    public void setGoodsUnitId(Long goodsUnitId) {
        this.goodsUnitId = goodsUnitId;
    }

    public Long getGoodsChannelId() {
        return goodsChannelId;
    }

    public void setGoodsChannelId(Long goodsChannelId) {
        this.goodsChannelId = goodsChannelId;
    }

    public Long getGoodsPriceId() {
        return goodsPriceId;
    }

    public void setGoodsPriceId(Long goodsPriceId) {
        this.goodsPriceId = goodsPriceId;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Boolean postStatus) {
        this.postStatus = postStatus;
    }

    public Boolean getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Boolean saleStatus) {
        this.saleStatus = saleStatus;
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