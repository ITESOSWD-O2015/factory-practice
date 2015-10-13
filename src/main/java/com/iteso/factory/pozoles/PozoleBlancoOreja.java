package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozoleBlancoOreja extends Pozole {
    public PozoleBlancoOreja(){
        name = "Pozole Blanco con Oreja";
        broth = "Caldo Blanco";
        grano = "Grano de Pozole"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
