package com.j2devs.acmerestaurant.Modelos.PlatoFuerte;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class PlatoFuerteBuilder implements Builder {
  protected PlatoFuerte platoFuerte;

  public PlatoFuerteBuilder() {
    this.platoFuerte = new PlatoFuerte();
  }

  public PlatoFuerte getPlatoFuerte() {
    return this.platoFuerte;
  }

  public abstract void prepararPrincipal();

  public abstract void prepararAcompanante1();

  public abstract void prepararAcompanante2();
}
