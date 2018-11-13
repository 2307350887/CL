package com.szxs.entity;

import java.util.Date;

public class MobilePhoneOrder {
    private String uuid;
    private double price;
    private Date ordertime;
    private String device_model;
    private String stateval;
    private String left_by ;
    private Date left_date;
    private String create_by;
    private Date create_date;
    private String ordernumber;
    private String stateid;

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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getStateval() {
        return stateval;
    }

    public void setStateval(String stateval) {
        this.stateval = stateval;
    }

    public String getLeft_by() {
        return left_by;
    }

    public void setLeft_by(String left_by) {
        this.left_by = left_by;
    }

    public Date getLeft_date() {
        return left_date;
    }

    public void setLeft_date(Date left_date) {
        this.left_date = left_date;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
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
}
