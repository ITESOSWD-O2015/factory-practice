package com.iteso.factory.pozoles.ingredients.meats;

import com.iteso.factory.decorators.MeatDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Pierna extends MeatDecorator {
    Pozole pozole;

    public Pierna(Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " con pierna";
    }
}
