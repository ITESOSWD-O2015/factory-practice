package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class PozoleBlancoCachete extends Pozole{
    public PozoleBlancoCachete(){
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
