package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class PozoleBlancoPierna extends Pozole {
    public PozoleBlancoPierna(){
        name = "Pozole Blanco con Pierna";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
