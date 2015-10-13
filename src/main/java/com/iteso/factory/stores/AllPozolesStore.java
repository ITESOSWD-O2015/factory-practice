package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

import javax.sound.sampled.Control;
import java.net.InetSocketAddress;

/**
 * Created by JoseFranco on 13/10/2015.
 */
public class AllPozolesStore extends PozoleStore {
    Pozole pozolestore;

    @Override
    protected Pozole createPozole(String meat) {
        if (getType().equals("Pozole Blanco")) {
            PozoleBlancoStore pozoleStore = new PozoleBlancoStore();
            pozolestore = pozoleStore.createPozole(meat);
        }
        if (getType().equals("Pozole Rojo")) {
            PozoleRojoStore pozoleStore = new PozoleRojoStore();
            pozolestore = pozoleStore.createPozole(meat);
        }
        if (getType().equals("Pozole Verde")) {
            PozoleVerdeStore pozoleStore = new PozoleVerdeStore();
            pozolestore = pozoleStore.createPozole(meat);
        }
        if (getType().equals("Pozolillo")) {
            PozolilloStore pozolilloStore = new PozolilloStore();
            pozolestore = createPozole(meat);
        }
        return pozolestore;
    }
}


