package com.iteso.factory.condiment.caldos;

import com.iteso.factory.BrothDecorator;
import com.iteso.factory.Pozole;

/**
 * Created by Sacrp on 10/13/15.
 */
public class CaldoBlanco extends BrothDecorator {

    Pozole pozole;
    public CaldoBlanco(Pozole pozole){
        this.pozole = pozole;
    }
    public String getName(){
        return pozole.getName() + " y con caldo blanco";
    }


}
