package com.j2devs.acmerestaurant.Modelos;

import com.j2devs.acmerestaurant.Modelos.Bebida.Bebida;
import com.j2devs.acmerestaurant.Modelos.Entrada.Entrada;
import com.j2devs.acmerestaurant.Modelos.PlatoFuerte.PlatoFuerte;
import com.j2devs.acmerestaurant.Modelos.Postre.Postre;

public class Orden {
    private final int numeroOrden;

    private Entrada entrada;
    private PlatoFuerte platoFuerte;
    private Postre postre;
    private Bebida bebida;

    public Orden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public void setPlatoFuerte(PlatoFuerte platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public int getNumeroOrden() {
        return this.numeroOrden;
    }

    public Entrada getEntrada() {
        return this.entrada;
    }

    public PlatoFuerte getPlatoFuerte() {
        return this.platoFuerte;
    }

    public Postre getPostre() {
        return this.postre;
    }

    public Bebida getBebida() {
        return this.bebida;
    }
}
