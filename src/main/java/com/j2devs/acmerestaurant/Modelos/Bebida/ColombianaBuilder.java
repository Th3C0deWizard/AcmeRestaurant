package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class ColombianaBuilder extends BebidaBuilder {
  @Override
  public void prepararBebida() {
    this.bebida.setComponente(new Componente("Bebida", "Colombiana"));
  }

  @Override
  public void asignarPrecio() {
    this.bebida.setPrecio(100.0);
  }
}
