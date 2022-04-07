package com.project.restaurant.models;

public class InOrder {
    Integer id;
    Integer clientId;
    String date;
    Integer mealId;
    Integer payMethodId;
    Integer amount;

    public InOrder(Integer id, Integer clientId, String date, Integer mealId, Integer payMethodId, Integer amount) {
        this.id = id;
        this.clientId = clientId;
        this.date = date;
        this.mealId = mealId;
        this.payMethodId = payMethodId;
        this.amount = amount;
    }

    public InOrder() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMealId() {
        return mealId;
    }

    public void setMealId(Integer mealId) {
        this.mealId = mealId;
    }

    public Integer getPayMethodId() {
        return payMethodId;
    }

    public void setPayMethodId(Integer payMethodId) {
        this.payMethodId = payMethodId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
