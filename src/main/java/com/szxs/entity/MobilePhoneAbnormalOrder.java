package com.szxs.entity;

import java.util.Date;

/**
 * 异常订单类
 */
public class  MobilePhoneAbnormalOrder {
  private String uuid;
  private double price;
  private Date orderTime;
  private String stateval;
  private String device_model;

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getStateval() {
        return stateval;
    }

    public void setStateval(String stateval) {
        this.stateval = stateval;
    }
}
