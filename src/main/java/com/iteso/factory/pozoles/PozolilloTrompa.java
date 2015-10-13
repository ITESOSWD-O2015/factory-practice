package com.iteso.factory.pozoles;

import com.iteso.factory.Pozole;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozolilloTrompa extends Pozole{
    public PozolilloTrompa(){
        name = "Pozolillo con Trompa";
        broth = "Caldo Verde";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }
}
