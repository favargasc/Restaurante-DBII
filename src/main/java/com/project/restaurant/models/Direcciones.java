package com.project.restaurant.models;

public class Direcciones {
    String ciudad;
    String calle;
    String descripcion;

    public Direcciones(String ciudad, String calle, String descripcion) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Dirección: " + '\'' +
                "ciudad: " + ciudad + '\'' +
                ", calle: " + calle + '\'' +
                ", descripción: " + descripcion;
    }
}
