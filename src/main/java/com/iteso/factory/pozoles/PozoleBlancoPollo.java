package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo(){
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        grano = "Grano de Pozole"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
