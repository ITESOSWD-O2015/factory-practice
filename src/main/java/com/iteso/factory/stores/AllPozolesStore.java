package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

import javax.sound.sampled.Control;
import java.net.InetSocketAddress;

/**
 * Created by JoseFranco on 13/10/2015.
 */
public class AllPozolesStore extends PozoleStore {

    PozoleStore pozole;
    Pozole pozolestore;

    @Override
    protected Pozole createPozole(String meat) {
        if (getType().equals("Pozole Blanco")) {
            pozole = new PozoleBlancoStore();
            pozolestore = pozole.orderPozole(meat);
        }
        if (getType().equals("Pozole Rojo")) {
            pozole = new PozoleRojoStore();
            pozolestore = pozole.orderPozole(meat);
        }
        if (getType().equals("Pozole Verde")) {
            pozole = new PozoleVerdeStore();
            pozolestore = pozole.orderPozole(meat);
        }
        if (getType().equals("Pozolillo")) {
            pozole = new PozolilloStore();
            pozolestore = orderPozole(meat);
        }
        return pozolestore;
    }
}


