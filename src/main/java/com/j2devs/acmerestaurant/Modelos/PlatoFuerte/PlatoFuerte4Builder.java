package com.j2devs.acmerestaurant.Modelos.PlatoFuerte;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class PlatoFuerte4Builder extends PlatoFuerteBuilder {
  public PlatoFuerte4Builder(String name) {
    super(name);
  }

  @Override
  public void prepararPrincipal() {
    this.platoFuerte.setPrincipal(new Componente("Principal", "Mariscos"));
  }

  @Override
  public void prepararAcompanante1() {
    this.platoFuerte.setAcompanante1(new Componente("Acompanante1", "Ensalada"));
  }

  @Override
  public void prepararAcompanante2() {
    this.platoFuerte.setAcompanante2(new Componente("Acompanante2", "Arepitas"));
  }

  @Override
  public void asignarPrecio() {
    this.platoFuerte.setPrecio(16000.0);
  }
}
