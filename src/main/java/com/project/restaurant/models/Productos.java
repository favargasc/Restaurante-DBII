package com.project.restaurant.models;

public class Productos {
    int productoId;
    String nombre;
    String descripcion;
    double precio;
    int estado;


    public Productos(int productoId, String nombre, String descripcion, double precio, int estado) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  " Producto Id: " + productoId + '\'' +
                ", nombre: " + nombre + '\'' +
                ", descripción: " + descripcion + '\'' +
                ", precio: " + precio +
                ", estado: " + estado;
    }
}
