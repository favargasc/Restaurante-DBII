package com.project.restaurant.models;

public class Provider {
    Integer id;
    String name;

    public Provider(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Provider() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
