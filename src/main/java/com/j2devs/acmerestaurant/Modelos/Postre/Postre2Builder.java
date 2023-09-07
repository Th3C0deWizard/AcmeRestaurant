package com.j2devs.acmerestaurant.Modelos.Postre;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Postre2Builder extends PostreBuilder {
  @Override
  public void agregarBase() {
    this.postre.setPrincipal(new Componente("Principal", "Helado"));
  }

  @Override
  public void agregarAcompaniante1() {
    this.postre.setAcompanante1(new Componente("Acompanante1", "Galleta"));
  }

  @Override
  public void agregarAcompaniante2() {
    this.postre.setAcompanante2(new Componente("Acompanante2", "Chispitas de chocolate"));
  }

  @Override
  public void asignarPrecio() {
    this.postre.setPrecio(100.0);
  }
}
