package Entrada;
import Componente;

public class Entrada implements Cloneable{
    private Double precio;
    private Componente componente;

    public Entrada() {}

    @Override
    public Entrada clone() {
        try {
            Entrada clone = (Entrada) super.clone();
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
