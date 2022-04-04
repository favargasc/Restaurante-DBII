package com.project.restaurant.models;

public class Recipe {
    String title;
    Double price;
    String detail;

    public Recipe(String title, Double price, String detail) {
        this.title = title;
        this.price = price;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
