package com.szxs.entity;

import java.util.Date;

public class THotModel {
    private String ID;
    private String MOBILE;
    private String DEVICE_ID;
    private Date STARTTIME;
    private String ENDTIME;
    private String SALES_VOLUME;
    private String SORT_CODE;
    private String EXTEND1;
    private String EXTEND2;
    private String CREATED_BY;
    private Date CREATION_DATE;
    private String LAST_UPDATE_BY;
    private Date LAST_UPDATE_DATE;
    private String MEMO;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getDEVICE_ID() {
        return DEVICE_ID;
    }

    public void setDEVICE_ID(String DEVICE_ID) {
        this.DEVICE_ID = DEVICE_ID;
    }

    public Date getSTARTTIME() {
        return STARTTIME;
    }

    public void setSTARTTIME(Date STARTTIME) {
        this.STARTTIME = STARTTIME;
    }

    public String getENDTIME() {
        return ENDTIME;
    }

    public void setENDTIME(String ENDTIME) {
        this.ENDTIME = ENDTIME;
    }

    public String getSALES_VOLUME() {
        return SALES_VOLUME;
    }

    public void setSALES_VOLUME(String SALES_VOLUME) {
        this.SALES_VOLUME = SALES_VOLUME;
    }

    public String getSORT_CODE() {
        return SORT_CODE;
    }

    public void setSORT_CODE(String SORT_CODE) {
        this.SORT_CODE = SORT_CODE;
    }

    public String getEXTEND1() {
        return EXTEND1;
    }

    public void setEXTEND1(String EXTEND1) {
        this.EXTEND1 = EXTEND1;
    }

    public String getEXTEND2() {
        return EXTEND2;
    }

    public void setEXTEND2(String EXTEND2) {
        this.EXTEND2 = EXTEND2;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public Date getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(Date CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    public String getLAST_UPDATE_BY() {
        return LAST_UPDATE_BY;
    }

    public void setLAST_UPDATE_BY(String LAST_UPDATE_BY) {
        this.LAST_UPDATE_BY = LAST_UPDATE_BY;
    }

    public Date getLAST_UPDATE_DATE() {
        return LAST_UPDATE_DATE;
    }

    public void setLAST_UPDATE_DATE(Date LAST_UPDATE_DATE) {
        this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }
}
