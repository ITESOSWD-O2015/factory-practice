package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleBlancoPierna extends Pozole{
    public PozoleBlancoPierna(){
        name = "Pozole Blanco con Pierna";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
