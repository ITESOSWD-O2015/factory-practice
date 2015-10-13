package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleBlancoCostilla extends Pozole{
    public PozoleBlancoCostilla(){
        name = "Pozole Blanco con costilla";
        broth = "Caldo blanco";
        toppings.add("Lechuga");
        toppings.add("cebolla");
        toppings.add("Rabanos");
        

    }
}
