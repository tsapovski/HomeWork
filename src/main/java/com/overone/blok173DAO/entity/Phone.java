package com.overone.blok173DAO.entity;

import java.util.Objects;

public class Phone {

    private int id;
    private String phone;



    public Phone(int id, String phone) {
    this.id = id;
    this.phone = phone;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
