package com.szxs.entity;


public class THotOrder {

  private String uuid;
  private String deviceid;
  private String price;
  private java.sql.Date ordertime;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getDeviceid() {
    return deviceid;
  }

  public void setDeviceid(String deviceid) {
    this.deviceid = deviceid;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public java.sql.Date getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(java.sql.Date ordertime) {
    this.ordertime = ordertime;
  }

}
