package com.iteso.factory.pozoles.Ingredientes.Caldo;

import com.iteso.factory.Decorator.CaldoDeco;
import com.iteso.factory.Pozole;

/**
 * Created by jose luis on 13/10/2015.
 */
public class Blanco extends CaldoDeco{
    Pozole pozole;

    public Blanco (Pozole pozole) {
        this.pozole = pozole;
    }
    @Override
    public String getName() {
        return pozole.getName() + " Blanco";
    }

    @Override
    public String getCaldo() {
        return "Caldo Blanco";
    }
}
