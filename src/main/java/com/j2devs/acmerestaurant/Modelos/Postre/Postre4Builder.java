package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Postre4Builder extends PostreBuilder {
  public Postre4Builder(String name) {
    super(name);
  }

  @Override
  public void agregarBase() {
    this.postre.setPrincipal(new Componente("Principal", "Brownie"));
  }

  @Override
  public void agregarAcompaniante1() {
    this.postre.setAcompanante1(new Componente("Acompanante1", "Galleta"));
  }

  @Override
  public void agregarAcompaniante2() {
    this.postre.setAcompanante2(new Componente("Acompanante2", "Oreo"));
  }

  @Override
  public void asignarPrecio() {
    this.postre.setPrecio(6000.0);
  }
}
