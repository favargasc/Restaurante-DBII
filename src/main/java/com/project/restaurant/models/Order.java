package com.project.restaurant.models;

import java.util.Date;

public class Order {
    Integer id, amount;
    private String name, meal, payMethod;
    private String date;

    public Order(Integer id, String name, String meal, String payMethod, String date, Integer amount) {
        this.id = id;
        this.name = name;
        this.meal = meal;
        this.payMethod = payMethod;
        this.date = date;
        this.amount = amount;
    }

    public Order() {

    }


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

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
