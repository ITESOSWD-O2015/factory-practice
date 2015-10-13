package com.iteso.factory.condiment.meat;

import com.iteso.factory.CondimentsDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class Cachete extends CondimentsDecorator {

    Pozole pozole;

    public  Cachete(Pozole pozole){
        this.pozole = pozole;
    }

    public String getName(){
        return pozole.getName() + "con cachete";
    }


}
