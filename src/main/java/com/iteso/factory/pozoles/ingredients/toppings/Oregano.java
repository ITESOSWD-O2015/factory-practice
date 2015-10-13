package com.iteso.factory.pozoles.ingredients.toppings;

import com.iteso.factory.Pozole;
import com.iteso.factory.decorators.ToppingDecorator;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Oregano extends ToppingDecorator {
    Pozole pozole;

    public Oregano (Pozole pozole) {
        this.pozole = pozole;
    }

    public void AddTopping () {
        pozole.getToppings().add("Oregano");
    }
}
