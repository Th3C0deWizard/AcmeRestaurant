package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class PostreBuilder implements Builder {
    protected Postre postre;

    public PostreBuilder() {
    }

    public Postre getPostre() {
        return this.postre;
    }

    public abstract void agregarBase();

    public abstract void agregarAcompaniante1();

    public abstract void agregarAcompaniante2();
}
