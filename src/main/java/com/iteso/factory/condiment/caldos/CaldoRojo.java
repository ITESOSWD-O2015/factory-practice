package com.iteso.factory.condiment.caldos;

import com.iteso.factory.CondimentsDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class CaldoRojo extends CondimentsDecorator {

    Pozole pozole;

    public CaldoRojo(Pozole pozole){
        this.pozole = pozole;
    }

    public String getName(){
        return pozole.getName() + "con caldo rojo";
    }


}
