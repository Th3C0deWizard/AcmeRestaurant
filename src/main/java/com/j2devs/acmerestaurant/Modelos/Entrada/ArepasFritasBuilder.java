package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class ArepasFritasBuilder extends EntradaBuilder {
  @Override
  public void prepararEntrada() {
    this.entrada.setComponente(new Componente("Entrada", "AerpasFritas"));
  }

  @Override
  public void asignarPrecio() {
    this.entrada.setPrecio(100.0);
  }
}
