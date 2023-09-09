package com.j2devs.acmerestaurant.Modelos;

import com.j2devs.acmerestaurant.Modelos.Bebida.BebidaBuilder;
import com.j2devs.acmerestaurant.Modelos.Entrada.EntradaBuilder;
import com.j2devs.acmerestaurant.Modelos.PlatoFuerte.PlatoFuerteBuilder;
import com.j2devs.acmerestaurant.Modelos.Postre.PostreBuilder;

public class Chef {

    public Chef () {}

    private void prepararEntrada(EntradaBuilder builder){
        builder.prepararEntrada();
        builder.asignarPrecio();
    }

    private void prepararPlatoFuerte(PlatoFuerteBuilder builder){
        builder.prepararPrincipal();
        builder.prepararAcompanante1();
        builder.prepararAcompanante2();
        builder.asignarPrecio();
    }

    private void prepararPostre(PostreBuilder builder){
        builder.agregarBase();
        builder.agregarAcompaniante1();
        builder.agregarAcompaniante2();
        builder.asignarPrecio();
    }

    private void prepararBebida(BebidaBuilder builder){
        builder.prepararBebida();
        builder.asignarPrecio();
    }

    public Orden prepararOrden(EntradaBuilder eBuilder, PlatoFuerteBuilder pfBuilder, PostreBuilder pBuilder, BebidaBuilder bBuilder){
        this.prepararEntrada(eBuilder);
        this.prepararPlatoFuerte(pfBuilder);
        this.prepararPostre(pBuilder);
        this.prepararBebida(bBuilder);

        Orden orden = new Orden(1);
        orden.setEntrada(eBuilder.getEntrada());
        orden.setPlatoFuerte(pfBuilder.getPlatoFuerte());
        orden.setPostre(pBuilder.getPostre());
        orden.setBebida(bBuilder.getBebida());

        return orden;
    }
}
