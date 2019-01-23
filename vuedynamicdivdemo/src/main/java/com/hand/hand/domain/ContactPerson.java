package com.hand.hand.domain;

import java.util.Date;

public class ContactPerson {

    private Integer id;
    private String name;  //名称
    private Integer phone;      //联系方式

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
