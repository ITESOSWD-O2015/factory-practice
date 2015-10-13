package com.iteso.factory;

import com.iteso.factory.stores.PozoleBlancoStore;
import com.iteso.factory.stores.PozoleRojoStore;
import com.iteso.factory.stores.PozoleVerdeStore;
import com.iteso.factory.stores.PozolilloStore;

/**
 * Created by Paloma on 13/10/2015.
 */
public class AllPozolesStore extends PozoleStore {

    PozoleStore pozoleStore;
    Pozole pozole;

    @Override
    protected Pozole createPozole(String meat) {

        if ( getTipo().equals("Pozole Verde")){
            PozoleVerdeStore pozoleverde  = new PozoleVerdeStore();
            pozole = createPozole(meat);
        }

        if ( getTipo().equals("Pozole Blanco")){
            PozoleBlancoStore pozoleblanco  = new PozoleBlancoStore();
            pozole = createPozole(meat);
        }

        if ( getTipo().equals("Pozole Rojo")){
            PozoleRojoStore pozolerojo  = new PozoleRojoStore();
            pozole = createPozole(meat);
        }

        if ( getTipo().equals("Pozolillo")){
            PozolilloStore pozolillo  = new PozolilloStore();
            pozole = createPozole(meat);
        }

        return pozole;
    }
}
