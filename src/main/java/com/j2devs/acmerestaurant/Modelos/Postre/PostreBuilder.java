package com.j2devs.acmerestaurant.Modelos.Postre;

public abstract class PostreBuilder {
    protected Postre postre;

    public PostreBuilder() {}

    public Postre getPostre(){
        return this.postre;
    }

    public abstract void agregarBase();
    public abstract void agregarAcompaniante1();
    public abstract void agregarAcompaniante2();
}
