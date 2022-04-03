package com.project.restaurant.models;

public class Categorias {
    String nombre;

    public Categorias(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Categoría: " + nombre;
    }
}
