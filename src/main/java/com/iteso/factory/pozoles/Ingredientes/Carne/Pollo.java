package com.iteso.factory.pozoles.Ingredientes.Carne;

import com.iteso.factory.Decorator.CarneDeco;
import com.iteso.factory.Pozole;

/**
 * Created by jose luis on 13/10/2015.
 */
public class Pollo extends CarneDeco {
    Pozole pozole;

    public Pollo(Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " con pollo";
    }
}