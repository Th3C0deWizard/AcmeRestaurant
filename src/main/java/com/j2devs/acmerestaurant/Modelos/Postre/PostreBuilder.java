package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class PostreBuilder extends Builder {
    protected Postre postre;

    public PostreBuilder(String name) {
        super(name);
        this.postre = new Postre();
    }

    public Postre getPostre() {
        return this.postre;
    }

    public abstract void agregarBase();

    public abstract void agregarAcompaniante1();

    public abstract void agregarAcompaniante2();
}
