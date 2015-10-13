package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa(){
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
