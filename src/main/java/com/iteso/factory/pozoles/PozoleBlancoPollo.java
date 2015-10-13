package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo(){
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
