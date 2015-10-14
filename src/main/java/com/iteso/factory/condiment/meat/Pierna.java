package com.iteso.factory.condiment.meat;

import com.iteso.factory.MeatDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class Pierna extends MeatDecorator {

    Pozole pozole;
    public Pierna(Pozole pozole) {this.pozole = pozole;}
    public String getName(){
        return pozole.getName() + "con pierna";
    }


}
