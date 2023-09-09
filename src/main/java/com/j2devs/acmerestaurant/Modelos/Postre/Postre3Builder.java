package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Postre3Builder extends PostreBuilder {
  public Postre3Builder(String name) {
    super(name);
  }

  @Override
  public void agregarBase() {
    this.postre.setPrincipal(new Componente("Principal", "Brownie"));
  }

  @Override
  public void agregarAcompaniante1() {
    this.postre.setAcompanante1(new Componente("Acompanante1", "Chispitas de chocolate"));
  }

  @Override
  public void agregarAcompaniante2() {
    this.postre.setAcompanante2(null);
  }

  @Override
  public void asignarPrecio() {
    this.postre.setPrecio(5500.0);
  }
}
