package com.iteso.factory.pozoles.Carnes;

import com.iteso.factory.Pozole;
import com.iteso.factory.pozoles.CondimentsDecorator;

/**
 * Created by Paloma on 13/10/2015.
 */
public class Cachete extends CondimentsDecorator {
    Pozole pozole;

    public Cachete(Pozole pozole){
        this.pozole = pozole;
    }

    public String getName(){

        return pozole.getName() + " de cachete";
    }

}
