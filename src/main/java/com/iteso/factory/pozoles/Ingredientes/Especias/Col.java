package com.iteso.factory.pozoles.Ingredientes.Especias;

import com.iteso.factory.Decorator.EspeciasDeco;
import com.iteso.factory.Pozole;

/**
 * Created by jose luis on 13/10/2015.
 */
public class Col extends EspeciasDeco {
    Pozole pozole;

    public Col(Pozole pozole) {
        this.pozole = pozole;
    }

    public void AddEspecia () {
        pozole.getEspecias().add("Col");
    }
}