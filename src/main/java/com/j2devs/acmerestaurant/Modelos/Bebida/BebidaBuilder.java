package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class BebidaBuilder extends Builder {
  protected Bebida bebida;

  public BebidaBuilder(String name) {
    super(name);
    this.bebida = new Bebida();
  }

  public Bebida getBebida() {
    return this.bebida;
  }

  public abstract void prepararBebida();

  public abstract void asignarPrecio();
}
