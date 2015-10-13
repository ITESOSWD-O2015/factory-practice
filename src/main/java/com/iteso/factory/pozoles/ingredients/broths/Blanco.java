package com.iteso.factory.pozoles.ingredients.broths;

import com.iteso.factory.decorators.BrothDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Blanco extends BrothDecorator{
    Pozole pozole;

    public Blanco (Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " Blanco";
    }

    @Override
    public String getBroth() {
        return "Caldo blanco";
    }
}
