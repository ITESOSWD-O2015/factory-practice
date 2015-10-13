package com.iteso.factory.pozoles.ingredients.broths;

import com.iteso.factory.decorators.BrothDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class Verde extends BrothDecorator{
    Pozole pozole;

    public Verde(Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " Verde";
    }

    @Override
    public String getBroth() {
        return "Caldo verde";
    }
}
