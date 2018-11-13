package com.szxs.entity;


import java.util.Date;

/**
 * 手机表
 */
public class THotDevice {

  private String uuid;
  private String brandId;
  private String deviceModel;
  private String devicePictureId;
  private double minPrice;
  private double maxPrice;
  private int viewOrder;
  private String createdBy;
  private Date creationDate;
  private String lastUpdateBy;
  private Date lastUpdateDate;
  private String extField1;
  private String extField2;
  private String memo;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getDevicePictureId() {
    return devicePictureId;
  }

  public void setDevicePictureId(String devicePictureId) {
    this.devicePictureId = devicePictureId;
  }

  public double getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(double minPrice) {
    this.minPrice = minPrice;
  }

  public double getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(double maxPrice) {
    this.maxPrice = maxPrice;
  }

  public int getViewOrder() {
    return viewOrder;
  }

  public void setViewOrder(int viewOrder) {
    this.viewOrder = viewOrder;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public String getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(String lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }

  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public String getExtField1() {
    return extField1;
  }

  public void setExtField1(String extField1) {
    this.extField1 = extField1;
  }

  public String getExtField2() {
    return extField2;
  }

  public void setExtField2(String extField2) {
    this.extField2 = extField2;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
