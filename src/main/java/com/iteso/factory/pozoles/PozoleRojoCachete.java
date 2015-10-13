package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleRojoCachete extends Pozole{
    public PozoleRojoCachete(){
        name = "Pozole Rojo con Cachete";
        broth = "Caldo Rojo";
        grano = "Grano de Pozole"; //add

        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
