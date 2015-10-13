package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozolilloTrompa extends Pozole {
    public PozolilloTrompa(){
        name = "Pozolillo con Trompa";
        broth = "Caldo Verde";
        grano = "Grano de Pozolillo"; //add

        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");

    }
}
