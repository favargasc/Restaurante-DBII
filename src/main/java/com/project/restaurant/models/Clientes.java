package com.project.restaurant.models;

import java.util.Arrays;


public class Clientes {
    int clienteId;
    String nombre;
    String telefono;
    String[] direcciones;

    public Clientes(int clienteId, String nombre, String telefono, String[] direcciones) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direcciones = direcciones;
    }

    public Clientes(int clienteId, String nombre, String telefono) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[] getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String[] direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + '\'' + "Teléfono: " + telefono + '\'' +
                "Direcciones: " + Arrays.toString(direcciones) +
                '.';
    }
}
