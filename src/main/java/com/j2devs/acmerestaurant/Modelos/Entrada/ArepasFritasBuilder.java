package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class ArepasFritasBuilder extends EntradaBuilder {
  public ArepasFritasBuilder(String name) {
    super(name);
  }

  @Override
  public void prepararEntrada() {
    this.entrada.setComponente(new Componente("Entrada", this.name));
  }

  @Override
  public void asignarPrecio() {
    this.entrada.setPrecio(5000.0);
  }
}
