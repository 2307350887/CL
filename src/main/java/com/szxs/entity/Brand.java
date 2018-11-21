package com.szxs.entity;

/**
 * 品牌表
 */
public class Brand {
    private String uuid;
    private String brand_code;
    private String brand_name;
    private String brand_type;
    private String brand_picture_id;
    private String created_by;
    private String creation_date;
    private String last_update_by;
    private String last_update_date;
    private String ext_field1;
    private String ext_field2;
    private String memo;
    private String view_order;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBrand_code() {
        return brand_code;
    }

    public void setBrand_code(String brand_code) {
        this.brand_code = brand_code;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_type() {
        return brand_type;
    }

    public void setBrand_type(String brand_type) {
        this.brand_type = brand_type;
    }

    public String getBrand_picture_id() {
        return brand_picture_id;
    }

    public void setBrand_picture_id(String brand_picture_id) {
        this.brand_picture_id = brand_picture_id;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_update_by() {
        return last_update_by;
    }

    public void setLast_update_by(String last_update_by) {
        this.last_update_by = last_update_by;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
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

    public String getView_order() {
        return view_order;
    }

    public void setView_order(String view_order) {
        this.view_order = view_order;
    }
}
