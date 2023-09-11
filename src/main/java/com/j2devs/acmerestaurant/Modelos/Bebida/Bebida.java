package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Bebida {
  private Double precio;
  private Componente componente;

  public Bebida() {
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public Double getPrecio() {
    return this.precio;
  }

  public void setComponente(Componente componente) {
    this.componente = componente;
  }

  public Componente getComponente() {
    return this.componente;
  }
}
