package com.project.restaurant.models;

import java.util.ArrayList;

public class InventoryDAO {
    ArrayList<OutInventory> inventories;
    ArrayList<Provider> providers;
    ArrayList<MeasurementUnits> units;

    public InventoryDAO(ArrayList<OutInventory> inventories, ArrayList<Provider> providers, ArrayList<MeasurementUnits> units) {
        this.inventories = inventories;
        this.providers = providers;
        this.units = units;
    }

    public ArrayList<OutInventory> getInventories() {
        return inventories;
    }

    public void setInventories(ArrayList<OutInventory> inventories) {
        this.inventories = inventories;
    }

    public ArrayList<Provider> getProviders() {
        return providers;
    }

    public void setProviders(ArrayList<Provider> providers) {
        this.providers = providers;
    }

    public ArrayList<MeasurementUnits> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<MeasurementUnits> units) {
        this.units = units;
    }
}
