package com.iteso.factory.pozoles.ingredients.meats;

import com.iteso.factory.decorators.MeatDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Cachete extends MeatDecorator {
    Pozole pozole;

    public Cachete (Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " con cachete";
    }
}
