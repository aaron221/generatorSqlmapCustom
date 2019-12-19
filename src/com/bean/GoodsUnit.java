package com.bean;

public class GoodsUnit {
    private Long id;

    private String basicUnitName;

    private Integer basicUnitConvertRate;

    private String stockUnitName;

    private Integer stockUnitConvertRate;

    private String saleUnitName;

    private Integer saleUnitConvertRate;

    private String retailUnitName;

    private Integer retailUnitConvertRate;

    private String purchaseUnitName;

    private Integer purchaseUnitConvertRate;

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

    public String getBasicUnitName() {
        return basicUnitName;
    }

    public void setBasicUnitName(String basicUnitName) {
        this.basicUnitName = basicUnitName == null ? null : basicUnitName.trim();
    }

    public Integer getBasicUnitConvertRate() {
        return basicUnitConvertRate;
    }

    public void setBasicUnitConvertRate(Integer basicUnitConvertRate) {
        this.basicUnitConvertRate = basicUnitConvertRate;
    }

    public String getStockUnitName() {
        return stockUnitName;
    }

    public void setStockUnitName(String stockUnitName) {
        this.stockUnitName = stockUnitName == null ? null : stockUnitName.trim();
    }

    public Integer getStockUnitConvertRate() {
        return stockUnitConvertRate;
    }

    public void setStockUnitConvertRate(Integer stockUnitConvertRate) {
        this.stockUnitConvertRate = stockUnitConvertRate;
    }

    public String getSaleUnitName() {
        return saleUnitName;
    }

    public void setSaleUnitName(String saleUnitName) {
        this.saleUnitName = saleUnitName == null ? null : saleUnitName.trim();
    }

    public Integer getSaleUnitConvertRate() {
        return saleUnitConvertRate;
    }

    public void setSaleUnitConvertRate(Integer saleUnitConvertRate) {
        this.saleUnitConvertRate = saleUnitConvertRate;
    }

    public String getRetailUnitName() {
        return retailUnitName;
    }

    public void setRetailUnitName(String retailUnitName) {
        this.retailUnitName = retailUnitName == null ? null : retailUnitName.trim();
    }

    public Integer getRetailUnitConvertRate() {
        return retailUnitConvertRate;
    }

    public void setRetailUnitConvertRate(Integer retailUnitConvertRate) {
        this.retailUnitConvertRate = retailUnitConvertRate;
    }

    public String getPurchaseUnitName() {
        return purchaseUnitName;
    }

    public void setPurchaseUnitName(String purchaseUnitName) {
        this.purchaseUnitName = purchaseUnitName == null ? null : purchaseUnitName.trim();
    }

    public Integer getPurchaseUnitConvertRate() {
        return purchaseUnitConvertRate;
    }

    public void setPurchaseUnitConvertRate(Integer purchaseUnitConvertRate) {
        this.purchaseUnitConvertRate = purchaseUnitConvertRate;
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