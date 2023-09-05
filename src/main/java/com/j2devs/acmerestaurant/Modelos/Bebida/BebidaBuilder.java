package com.j2devs.acmerestaurant.Modelos.Bebida;

public abstract class BebidaBuilder {
    protected Bebida bebida;

    public BebidaBuilder() {}

    public Bebida getBebida() {
        return this.bebida;
    }

    public abstract void prepararBebida();
}
