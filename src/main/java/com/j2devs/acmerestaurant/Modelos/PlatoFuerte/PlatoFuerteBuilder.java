package com.j2devs.acmerestaurant.Modelos.PlatoFuerte;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class PlatoFuerteBuilder extends Builder {
  protected PlatoFuerte platoFuerte;

  public PlatoFuerteBuilder(String name) {
    super(name);
    this.platoFuerte = new PlatoFuerte();
  }

  public PlatoFuerte getPlatoFuerte() {
    return this.platoFuerte;
  }

  public abstract void prepararPrincipal();

  public abstract void prepararAcompanante1();

  public abstract void prepararAcompanante2();
}
