package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class PozoleBlancoOreja extends Pozole {
    public PozoleBlancoOreja(){
        name = "Pozole Blanco con Oreja";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
