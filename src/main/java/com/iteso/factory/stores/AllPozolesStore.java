package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by ShaSkills on 13/10/2015.
 */
public class AllPozolesStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {

        if (getTipo().equals("verde")) {

            PozoleVerdeStore pozoleVerdeStore;

            pozoleVerdeStore = new PozoleVerdeStore();
            return pozoleVerdeStore.createPozole(meat);
        }
        else if(getTipo().equals("rojo")){
            PozoleRojoStore pozoleRojoStore;

            pozoleRojoStore = new PozoleRojoStore();
            return pozoleRojoStore.createPozole(meat);
        }
        else if(getTipo().equals("blanco")){
            PozoleBlancoStore pozoleBlancoStore;

            pozoleBlancoStore = new PozoleBlancoStore();
            return pozoleBlancoStore.createPozole(meat);
        }
        return null;
    }
}
