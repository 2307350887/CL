package com.szxs.entity;


import java.util.Date;

public class THotRepaymenttable {

  private String uuid;
  private String stateid;
  private Date leftDate;
  private String deviceid;
  private Double price;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getStateid() {
    return stateid;
  }

  public void setStateid(String stateid) {
    this.stateid = stateid;
  }

  public Date getLeftDate() {
    return leftDate;
  }

  public void setLeftDate(Date leftDate) {
    this.leftDate = leftDate;
  }

  public String getDeviceid() {
    return deviceid;
  }

  public void setDeviceid(String deviceid) {
    this.deviceid = deviceid;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
