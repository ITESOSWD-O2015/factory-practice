package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

/**
 * Created by ShaSkills on 13/10/2015.
 */
public class PozolePollo extends Pozole {

    public PozolePollo(){
        name = "Pozole  con Pollo";
        broth = "Caldo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
