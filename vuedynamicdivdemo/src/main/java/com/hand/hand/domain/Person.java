package com.hand.hand.domain;

import java.util.Date;

public class Person {

    private Integer id;
    private String personName;  //人员名称
    private Integer orgId;      //组织结构
    private String devId;      //设备ID
    private String cardNo;      //工号
    private String photo;       //照片路径
    private Integer state ;     //0：启用  1：停用  2：离职
    private Date editTime;      //更新时间
    private Date createTime;    //创建时间
    private String address;
    private String featureArray;  //特征数组


    private String orgName;


    //虚拟字段
    private boolean alreadyCheck;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAlreadyCheck() {
        return alreadyCheck;
    }

    public void setAlreadyCheck(boolean alreadyCheck) {
        this.alreadyCheck = alreadyCheck;
    }

    public String getFeatureArray() {
        return featureArray;
    }

    public void setFeatureArray(String featureArray) {
        this.featureArray = featureArray;
    }


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
