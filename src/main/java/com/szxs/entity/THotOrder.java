package com.szxs.entity;


import java.util.Date;

public class THotOrder {

  private String uuid;
  private String deviceid;
  private String price;
  private Date ordertime;
  private String staticid;

  public Date getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(Date ordertime) {
    this.ordertime = ordertime;
  }

  public String getStaticid() {
    return staticid;
  }

  public void setStaticid(String staticid) {
    this.staticid = staticid;
  }





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



}
