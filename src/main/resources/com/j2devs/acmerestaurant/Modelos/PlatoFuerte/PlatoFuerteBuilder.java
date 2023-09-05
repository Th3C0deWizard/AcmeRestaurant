package PlatoFuerte;

public abstract class PlatoFuerteBuilder {
    protected PlatoFuerte platoFuerte;

    public PlatoFuerteBuilder() {}

    public PlatoFuerte getPlatoFuerte() {
        return this.platoFuerte;
    }

    public abstract void prepararPrincipal();

    public abstract void prepararAcompanante1();

    public abstract void prepararAcompanante2();
}
