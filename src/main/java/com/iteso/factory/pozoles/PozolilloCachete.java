package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozolilloCachete extends Pozole {
    public PozolilloCachete(){
        name = "Pozolillo con Cachete";
        broth = "Caldo Verde";
        grano = "Grano de Pozolillo"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
