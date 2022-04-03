package com.project.restaurant.models;

public class Proveedores {
    int proveedorId;
    String nombre;

    public Proveedores(int proveedorId, String nombre) {
        this.proveedorId = proveedorId;
        this.nombre = nombre;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proveedor Id: " + proveedorId + '\'' +
                "Nombre: " + nombre;
    }
}
