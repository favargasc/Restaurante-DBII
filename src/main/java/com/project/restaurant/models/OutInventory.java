package com.project.restaurant.models;

public class OutInventory {
    Integer id;
    String name;
    String provider;
    Integer amount;
    String unit;

    public OutInventory(Integer id, String name, String provider, Integer amount, String unit) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.amount = amount;
        this.unit = unit;
    }

    public OutInventory() {

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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
