package com.project.restaurant.models;

public class TipoOrdenes {
    String tipo;

    public TipoOrdenes(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo de Orden: " + tipo;
    }
}



