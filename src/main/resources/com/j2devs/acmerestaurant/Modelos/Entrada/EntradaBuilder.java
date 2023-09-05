package Entrada;

public abstract class EntradaBuilder {
    protected Entrada entrada;

    public EntradaBuilder() {}

    public abstract void prepararEntrada();
    public Entrada getEntrada(){
        return this.entrada;
    }
}
