package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class MaramoraBuilder extends BebidaBuilder {
  public MaramoraBuilder(String name) {
    super(name);
  }

  @Override
  public void prepararBebida() {
    this.bebida.setComponente(new Componente("Bebida", this.name));
  }

  @Override
  public void asignarPrecio() {
    this.bebida.setPrecio(6000.0);
  }
}
