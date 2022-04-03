package com.project.restaurant.models;

public class Items {
    int itemId;
    String nombre;

    public Items(int itemId, String nombre) {
        this.itemId = itemId;
        this.nombre = nombre;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Item Id: " + itemId + '\'' +
                "Nombre: " + nombre;
    }
}
