package com.project.restaurant.models;

import java.util.Arrays;

public class Cliente {
    String Nombre;
    String Teléfono;
    String[] Direcciones;

    public Cliente(String nombre, String teléfono, String[] direcciones) {
        Nombre = nombre;
        Teléfono = teléfono;
        Direcciones = direcciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }

    public String[] getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(String[] direcciones) {
        Direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", Teléfono='" + Teléfono + '\'' +
                ", Direcciones=" + Arrays.toString(Direcciones) +
                '}';
    }
}
