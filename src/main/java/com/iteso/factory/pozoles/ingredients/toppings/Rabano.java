package com.iteso.factory.pozoles.ingredients.toppings;

import com.iteso.factory.Pozole;
import com.iteso.factory.decorators.ToppingDecorator;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Rabano extends ToppingDecorator {
    Pozole pozole;

    public Rabano(Pozole pozole) {
        this.pozole = pozole;
    }

    public void AddTopping () {
        pozole.getToppings().add("Rábano");
    }
}
