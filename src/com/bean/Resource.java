package com.bean;

public class Resource {
    private Long id;

    private Long groupId;

    private Long channelId;

    private Long thirdPartyId;

    private Boolean type;

    private Short sort;

    private String name;

    private String url;

    private String sourceUrl;

    private String size;

    private String proportion;

    private String widthandheight;

    private Boolean cornerPosition;

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

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Long thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion == null ? null : proportion.trim();
    }

    public String getWidthandheight() {
        return widthandheight;
    }

    public void setWidthandheight(String widthandheight) {
        this.widthandheight = widthandheight == null ? null : widthandheight.trim();
    }

    public Boolean getCornerPosition() {
        return cornerPosition;
    }

    public void setCornerPosition(Boolean cornerPosition) {
        this.cornerPosition = cornerPosition;
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