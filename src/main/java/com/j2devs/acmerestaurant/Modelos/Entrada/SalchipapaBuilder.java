package com.j2devs.acmerestaurant.Modelos.Entrada;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class SalchipapaBuilder extends EntradaBuilder {
  @Override
  public void prepararEntrada() {
    this.entrada.setComponente(new Componente("Entrada", "Salchipapa"));
  }

  @Override
  public void asignarPrecio() {
    this.entrada.setPrecio(100.0);
  }
}
