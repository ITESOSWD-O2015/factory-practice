package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleBlancoPollo extends Pozole{
    public PozoleBlancoPollo(){
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Lechuga");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
