package com.iteso.factory.pozoles.Condimentos;

import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.CondimentsDecorator;

/**
 * Created by Paloma on 13/10/2015.
 */
public class Col extends CondimentsDecorator {
    Pozole pozole;

    public Col(Pozole pozole){
        this.pozole = pozole;
        this.pozole.toppings.add("col");
    }
    @Override
    public String getName() {
        return pozole.getName() + " con col";
    }
}
