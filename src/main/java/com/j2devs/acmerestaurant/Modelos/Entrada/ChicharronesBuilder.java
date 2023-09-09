package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class ChicharronesBuilder extends EntradaBuilder {
  public ChicharronesBuilder(String name) {
    super(name);
  }

  @Override
  public void prepararEntrada() {
    this.entrada.setComponente(new Componente("Entrada", this.name));
  }

  @Override
  public void asignarPrecio() {
    this.entrada.setPrecio(7000.0);
  }
}
