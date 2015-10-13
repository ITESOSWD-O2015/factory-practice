package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleVerdeCachete extends Pozole{
    public PozoleVerdeCachete(){
        name = "Pozole Verde con Cachete";
        broth = "Caldo Verde";
        grano = "Grano de Pozole"; //add

        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");

    }
}
