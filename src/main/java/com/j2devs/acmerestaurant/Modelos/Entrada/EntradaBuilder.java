package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Builder;

public abstract class EntradaBuilder extends Builder {
  protected Entrada entrada;

  public EntradaBuilder(String name) {
    super(name);
    this.entrada = new Entrada();
  }

  public abstract void prepararEntrada();

  public Entrada getEntrada() {
    return this.entrada;
  }
}
