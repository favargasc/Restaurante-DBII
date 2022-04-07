package com.project.restaurant.models;

public class InInventory {
    Integer id;
    String name;
    Integer providerId;
    Integer amount;
    Integer unitId;

    public InInventory(Integer id, String name, Integer providerId, Integer amount, Integer unitId) {
        this.id = id;
        this.name = name;
        this.providerId = providerId;
        this.amount = amount;
        this.unitId = unitId;
    }

    public InInventory() {

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

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }
}
