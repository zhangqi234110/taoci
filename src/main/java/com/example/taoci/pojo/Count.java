package com.example.taoci.pojo;

import java.io.Serializable;
import java.util.Date;

public class Count implements Serializable {

    private int id;
    private  String name;
    private int money;
    private String date;
    private int phonenumber;

    public Count() {
    }

    public Count(int id, String name, int money, String date, int phonenumber) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
