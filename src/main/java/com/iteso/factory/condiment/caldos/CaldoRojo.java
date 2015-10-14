package com.iteso.factory.condiment.caldos;

import com.iteso.factory.BrothDecorator;
import com.iteso.factory.MeatDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class CaldoRojo extends BrothDecorator {

    Pozole pozole;
    public CaldoRojo(Pozole pozole){
        this.pozole = pozole;
    }
    public String getName(){
        return pozole.getName() + " y con caldo rojo";
    }

}
