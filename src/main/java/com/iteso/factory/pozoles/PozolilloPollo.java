package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozolilloPollo extends Pozole {
    public PozolilloPollo(){
        name = "Pozolillo con Pollo";
        broth = "Caldo Verde";
        grano = "Grano de Pozolillo"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
