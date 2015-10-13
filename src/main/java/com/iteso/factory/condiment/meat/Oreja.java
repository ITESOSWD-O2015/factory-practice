package com.iteso.factory.condiment.meat;

import com.iteso.factory.CondimentsDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class Oreja extends CondimentsDecorator {

    Pozole pozole;

    public Oreja(Pozole pozole){
        this.pozole = pozole;
    }

    public String getName(){
        return pozole.getName() + "con oreja";
    }


}
