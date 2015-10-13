package com.iteso.factory.pozoles.ingredients.meats;

import com.iteso.factory.decorators.MeatDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Pollo extends MeatDecorator {
    Pozole pozole;

    public Pollo(Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " con pollo";
    }
}
