package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class AllPozolesStore extends PozoleStore {
    PozoleStore pozoleStore;
    Pozole pozole;

    @Override
    protected Pozole createPozole(String meat) {
        if (getType().equals("Pozole Blanco")) {
            pozoleStore = new PozoleBlancoStore();
            pozole = pozoleStore.orderPozole(meat);
        } else if (getType().equals("Pozole Rojo")) {
            pozoleStore = new PozoleRojoStore();
            pozole = pozoleStore.orderPozole(meat);
        } else if (getType().equals("Pozole Verde")) {
            pozoleStore = new PozoleVerdeStore();
            pozole = pozoleStore.orderPozole(meat);
        } else if (getType().equals("Pozolillo")) {
            pozoleStore = new PozolilloStore();
            pozole = pozoleStore.orderPozole(meat);
        }


        return pozole;
    }
}
