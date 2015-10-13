package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa(){
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        grano = "Grano de Pozole"; //add

        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");

    }
}
