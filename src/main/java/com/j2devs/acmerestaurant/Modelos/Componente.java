package com.j2devs.acmerestaurant.Modelos;

public class Componente implements Cloneable {

  private String tipo;
  private String nombre;

  public Componente(String tipo, String nombre) {
    this.tipo = tipo;
    this.nombre = nombre;
  }

  @Override
  public Componente clone() {
    try {
      return (Componente) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }
}
