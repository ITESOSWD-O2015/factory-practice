package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozoleBlancoCachete extends Pozole {
    public PozoleBlancoCachete(){
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        grano = "Grano de Pozole"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
