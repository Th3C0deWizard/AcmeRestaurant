package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Postre1Builder extends PostreBuilder {
  public Postre1Builder(String name) {
    super(name);
  }

  @Override
  public void agregarBase() {
    this.postre.setPrincipal(new Componente("Principal", "Helado"));
  }

  @Override
  public void agregarAcompaniante1() {
    this.postre.setAcompanante1(new Componente("Acompanate1", "Oreo"));
  }

  @Override
  public void agregarAcompaniante2() {
    this.postre.setAcompanante2(new Componente("Acompanate2", "Galleta"));
  }

  @Override
  public void asignarPrecio() {
    this.postre.setPrecio(6000.0);
  }
}
