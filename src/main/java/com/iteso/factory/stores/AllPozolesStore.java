package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllPozolesStore extends PozoleStore{

    PozoleStore pozoleStore;
    Pozole pozole;

    @Override
    protected Pozole createPozole(String meat) {

        if(getTipo().equals("pozole blanco")) {
            pozoleStore = new PozoleBlancoStore();
            pozole = pozoleStore.orderPozole(meat);
        }

        if(getTipo().equals("pozole rojo")) {
            pozoleStore = new PozoleRojoStore();
            pozole = pozoleStore.orderPozole(meat);
        }

        if(getTipo().equals("pozole verde")) {
            pozoleStore = new PozoleVerdeStore();
            pozole = pozoleStore.orderPozole(meat);
        }

        if(getTipo().equals("pozolillo")) {
            pozoleStore = new PozolilloStore();
            pozole = pozoleStore.orderPozole(meat);
        }

        return pozole;
    }
}
