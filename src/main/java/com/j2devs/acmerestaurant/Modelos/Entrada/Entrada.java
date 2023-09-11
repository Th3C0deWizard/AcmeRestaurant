package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Entrada {
    private Double precio;
    private Componente componente;

    public Entrada() {
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public Componente getComponente() {
        return this.componente;
    }
}
