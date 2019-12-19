package com.bean;

public class GoodsChannel {
    private Long id;

    private String goodsSn;

    private Long channelId;

    private String name;

    private Long frontCategorySn;

    private Long materialSn;

    private Long saleStartTime;

    private Long saleEndTime;

    private Integer allowedWriteOffDay;

    private Boolean deliveryType;

    private String namePrefix;

    private String mainImgUrl;

    private String goodsAttrDesc;

    private String specDesc;

    private Integer minimumPurchaseQty;

    private Boolean isMention;

    private Boolean isRecommended;

    private Boolean isActivity;

    private Long thirdPartyGoodsSn;

    private String goodsName;

    private String goodsSubtitle;

    private String goodsAbbreviation;

    private String nameTw;

    private String nameEn;

    private String shareTitle;

    private String tips;

    private String takeawayAttr;

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

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getFrontCategorySn() {
        return frontCategorySn;
    }

    public void setFrontCategorySn(Long frontCategorySn) {
        this.frontCategorySn = frontCategorySn;
    }

    public Long getMaterialSn() {
        return materialSn;
    }

    public void setMaterialSn(Long materialSn) {
        this.materialSn = materialSn;
    }

    public Long getSaleStartTime() {
        return saleStartTime;
    }

    public void setSaleStartTime(Long saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    public Long getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Long saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public Integer getAllowedWriteOffDay() {
        return allowedWriteOffDay;
    }

    public void setAllowedWriteOffDay(Integer allowedWriteOffDay) {
        this.allowedWriteOffDay = allowedWriteOffDay;
    }

    public Boolean getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Boolean deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix == null ? null : namePrefix.trim();
    }

    public String getMainImgUrl() {
        return mainImgUrl;
    }

    public void setMainImgUrl(String mainImgUrl) {
        this.mainImgUrl = mainImgUrl == null ? null : mainImgUrl.trim();
    }

    public String getGoodsAttrDesc() {
        return goodsAttrDesc;
    }

    public void setGoodsAttrDesc(String goodsAttrDesc) {
        this.goodsAttrDesc = goodsAttrDesc == null ? null : goodsAttrDesc.trim();
    }

    public String getSpecDesc() {
        return specDesc;
    }

    public void setSpecDesc(String specDesc) {
        this.specDesc = specDesc == null ? null : specDesc.trim();
    }

    public Integer getMinimumPurchaseQty() {
        return minimumPurchaseQty;
    }

    public void setMinimumPurchaseQty(Integer minimumPurchaseQty) {
        this.minimumPurchaseQty = minimumPurchaseQty;
    }

    public Boolean getIsMention() {
        return isMention;
    }

    public void setIsMention(Boolean isMention) {
        this.isMention = isMention;
    }

    public Boolean getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(Boolean isRecommended) {
        this.isRecommended = isRecommended;
    }

    public Boolean getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(Boolean isActivity) {
        this.isActivity = isActivity;
    }

    public Long getThirdPartyGoodsSn() {
        return thirdPartyGoodsSn;
    }

    public void setThirdPartyGoodsSn(Long thirdPartyGoodsSn) {
        this.thirdPartyGoodsSn = thirdPartyGoodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsSubtitle() {
        return goodsSubtitle;
    }

    public void setGoodsSubtitle(String goodsSubtitle) {
        this.goodsSubtitle = goodsSubtitle == null ? null : goodsSubtitle.trim();
    }

    public String getGoodsAbbreviation() {
        return goodsAbbreviation;
    }

    public void setGoodsAbbreviation(String goodsAbbreviation) {
        this.goodsAbbreviation = goodsAbbreviation == null ? null : goodsAbbreviation.trim();
    }

    public String getNameTw() {
        return nameTw;
    }

    public void setNameTw(String nameTw) {
        this.nameTw = nameTw == null ? null : nameTw.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle == null ? null : shareTitle.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }

    public String getTakeawayAttr() {
        return takeawayAttr;
    }

    public void setTakeawayAttr(String takeawayAttr) {
        this.takeawayAttr = takeawayAttr == null ? null : takeawayAttr.trim();
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