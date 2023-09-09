package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class PepsiBuilder extends BebidaBuilder {
  public PepsiBuilder(String name) {
    super(name);
  }

  @Override
  public void prepararBebida() {
    this.bebida.setComponente(new Componente("Bebida", this.name));
  }

  @Override
  public void asignarPrecio() {
    this.bebida.setPrecio(3000.0);
  }
}
