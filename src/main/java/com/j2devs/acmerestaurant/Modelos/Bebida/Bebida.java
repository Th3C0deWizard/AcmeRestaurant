package com.j2devs.acmerestaurant.Modelos.Bebida;

import com.j2devs.acmerestaurant.Modelos.Componente;

public class Bebida implements Cloneable {
  private Double precio;
  private Componente componente;

  public Bebida() {
  }

  @Override
  public Bebida clone() {
    try {
      Bebida clone = (Bebida) super.clone();
      clone.componente = this.componente.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
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
