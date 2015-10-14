package com.iteso.factory.pozoles.Carnes;

import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.CondimentsDecorator;

/**
 * Created by Paloma on 13/10/2015.
 */
public class Pollo extends CondimentsDecorator{
    Pozole pozole;
    public Pollo(Pozole pozole){
        this.pozole = pozole;
    }

    public String getName(){

        return pozole.getName() + " de pollo";
    }

}
