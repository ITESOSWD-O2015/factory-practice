package com.iteso.factory.pozoles.Condimentos;

import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.CondimentsDecorator;

/**
 * Created by Paloma on 13/10/2015.
 */
public class Rabanos extends CondimentsDecorator {
    Pozole pozole;

    public Rabanos(Pozole pozole){
        this.pozole = pozole;
        this.pozole.toppings.add("rabanos");
    }
    @Override
    public String getName() {
        return pozole.getName() + " con rabanos";
    }
}
