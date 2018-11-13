package com.szxs.entity;

import java.io.Serializable;
import java.util.Date;

public class MobilePhoneRental implements Serializable {
    private String uuid;
    private String brand_id;
    private String device_model;
    private String device_picture_id;
    private double min_price;
    private double max_price;
    private double view_order;
    private String created_by;
    private Date creation_date;
    private String last_update_by;
    private Date last_update_date;
    private String ext_field1;
    private String ext_field2;
    private String memo;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getDevice_picture_id() {
        return device_picture_id;
    }

    public void setDevice_picture_id(String device_picture_id) {
        this.device_picture_id = device_picture_id;
    }

    public double getMin_price() {
        return min_price;
    }

    public void setMin_price(double min_price) {
        this.min_price = min_price;
    }

    public double getMax_price() {
        return max_price;
    }

    public void setMax_price(double max_price) {
        this.max_price = max_price;
    }

    public double getView_order() {
        return view_order;
    }

    public void setView_order(double view_order) {
        this.view_order = view_order;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_update_by() {
        return last_update_by;
    }

    public void setLast_update_by(String last_update_by) {
        this.last_update_by = last_update_by;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getExt_field1() {
        return ext_field1;
    }

    public void setExt_field1(String ext_field1) {
        this.ext_field1 = ext_field1;
    }

    public String getExt_field2() {
        return ext_field2;
    }

    public void setExt_field2(String ext_field2) {
        this.ext_field2 = ext_field2;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
