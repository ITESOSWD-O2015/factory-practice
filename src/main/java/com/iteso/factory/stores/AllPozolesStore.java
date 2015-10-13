package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class AllPozolesStore extends PozoleStore {
    Pozole pozole = null;

    @Override
    protected Pozole createPozole(String meat) {
        if (getType().equals("Pozole Blanco")) {
            PozoleBlancoStore pozoleStore = new PozoleBlancoStore();
            pozole = pozoleStore.createPozole(meat);
        } else if (getType().equals("Pozole Rojo")) {
            PozoleRojoStore pozoleStore = new PozoleRojoStore();
            pozole = pozoleStore.createPozole(meat);
        } else if (getType().equals("Pozole Verde")) {
            PozoleVerdeStore pozoleStore = new PozoleVerdeStore();
            pozole = pozoleStore.createPozole(meat);
        } else if (getType().equals("Pozolillo")) {
            PozolilloStore pozoleStore = new PozolilloStore();
            pozole = pozoleStore.createPozole(meat);
        }


        return pozole;
    }
}
