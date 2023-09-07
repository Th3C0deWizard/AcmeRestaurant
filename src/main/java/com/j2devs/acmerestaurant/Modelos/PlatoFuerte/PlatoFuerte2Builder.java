package com.j2devs.acmerestaurant.Modelos.PlatoFuerte;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class PlatoFuerte2Builder extends PlatoFuerteBuilder {
  @Override
  public void prepararPrincipal() {
    this.platoFuerte.setPrincipal(new Componente("Principal", "Pollo asado"));
  }

  @Override
  public void prepararAcompanante1() {
    this.platoFuerte.setAcompanante1(new Componente("Acomponante1", "Arepitas"));
  }

  @Override
  public void prepararAcompanante2() {
    this.platoFuerte.setAcompanante2(new Componente("Acomponante2", "Papas"));
  }

  @Override
  public void asignarPrecio() {
    this.platoFuerte.setPrecio(100.0);
  }
}
