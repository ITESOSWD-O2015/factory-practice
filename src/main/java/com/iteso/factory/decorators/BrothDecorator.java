package com.iteso.factory.decorators;

import com.iteso.factory.Pozole;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public abstract class BrothDecorator extends Pozole {
    public abstract String getName();
    public abstract String getBroth();
}
