package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class CocacolaBuilder extends BebidaBuilder {

  @Override
  public void prepararBebida() {
    this.bebida.setComponente(new Componente("Bebida", "Coca-Cola"));
  }

  @Override
  public void asignarPrecio() {
    this.bebida.setPrecio(100.0);
  }
}
