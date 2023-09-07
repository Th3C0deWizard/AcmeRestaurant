package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class EntradaBuilder implements Builder {
  protected Entrada entrada;

  public EntradaBuilder() {
    this.entrada = new Entrada();
  }

  public abstract void prepararEntrada();

  public Entrada getEntrada() {
    return this.entrada;
  }
}
