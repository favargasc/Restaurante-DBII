package com.project.restaurant.models;

public class Recipe {
    String title;
    Double price;
    String detail;
<<<<<<< HEAD
    Integer id;
=======
>>>>>>> origin/master

    public Recipe(String title, Double price, String detail) {
        this.title = title;
        this.price = price;
        this.detail = detail;
    }

<<<<<<< HEAD
    public Recipe(Integer id, String title, Double price, String detail) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.detail = detail;
    }

    public Recipe(String title, Double price) {
        this.title = title;
        this.price = price;
    }

=======
>>>>>>> origin/master
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
<<<<<<< HEAD

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
=======
>>>>>>> origin/master
}
