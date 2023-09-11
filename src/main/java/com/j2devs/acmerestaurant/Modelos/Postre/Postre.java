package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Postre {
    private Double precio;
    private Componente principal;
    private Componente acompanante1;
    private Componente acompanante2;

    public Postre() {
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrincipal(Componente principal) {
        this.principal = principal;
    }

    public Componente getPrincipal() {
        return this.principal;
    }

    public void setAcompanante1(Componente acompanante1) {
        this.acompanante1 = acompanante1;
    }

    public Componente getAcompanante1() {
        return this.acompanante1;
    }

    public void setAcompanante2(Componente acompanante2) {
        this.acompanante2 = acompanante2;
    }

    public Componente getAcompanante2() {
        return this.acompanante2;
    }

}
