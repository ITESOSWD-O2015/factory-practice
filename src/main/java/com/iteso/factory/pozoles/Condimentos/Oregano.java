package com.iteso.factory.pozoles.Condimentos;

import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.CondimentsDecorator;

/**
 * Created by Paloma on 13/10/2015.
 */
public class Oregano extends CondimentsDecorator {
    Pozole pozole;

    public Oregano(Pozole pozole){
        this.pozole = pozole;
        this.pozole.toppings.add("oregano");
    }
    @Override
    public String getName() {
        return pozole.getName() + " con oregano";
    }
}
