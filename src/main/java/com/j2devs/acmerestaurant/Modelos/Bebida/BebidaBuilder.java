package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class BebidaBuilder implements Builder {
  protected Bebida bebida;

  public BebidaBuilder() {
    this.bebida = new Bebida();
  }

  public Bebida getBebida() {
    return this.bebida;
  }

  public abstract void prepararBebida();

  public abstract void asignarPrecio();
}
