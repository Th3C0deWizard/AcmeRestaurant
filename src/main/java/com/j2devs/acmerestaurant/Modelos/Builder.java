package com.j2devs.acmerestaurant.Modelos;

public abstract class Builder {
  protected String name;

    public Builder(String name) {
        this.name = name;
    }

  public abstract void asignarPrecio();

    public String getName() {
        return this.name;
    }

}
