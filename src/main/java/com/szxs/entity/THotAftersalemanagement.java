package com.szxs.entity;


import java.util.Date;

public class THotAftersalemanagement {

  private String uuid;
  private String ordernumber;
  private String stateid;
  private String leftBy;
  private Date   leftDate;
  private String createBy;
  private Date   createDate;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(String ordernumber) {
    this.ordernumber = ordernumber;
  }


  public String getStateid() {
    return stateid;
  }

  public void setStateid(String stateid) {
    this.stateid = stateid;
  }


  public String getLeftBy() {
    return leftBy;
  }

  public void setLeftBy(String leftBy) {
    this.leftBy = leftBy;
  }




  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public Date getLeftDate() {
    return leftDate;
  }

  public void setLeftDate(Date leftDate) {
    this.leftDate = leftDate;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
