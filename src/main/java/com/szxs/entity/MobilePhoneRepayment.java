package com.szxs.entity;

import java.util.Date;

public class MobilePhoneRepayment {
    private String device_model ;
    private String uuid ;
    private Date left_date;
    private String stateval;
    private Double price;

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

    public Date getLeft_date() {
        return left_date;
    }

    public void setLeft_date(Date left_date) {
        this.left_date = left_date;
    }

    public String getStateval() {
        return stateval;
    }

    public void setStateval(String stateval) {
        this.stateval = stateval;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
