package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.condiment.caldos.*;
import com.iteso.factory.pozoles.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class AllPozolesStore extends PozoleStore{

    Pozole pozole = new PozoleNormal();


    @Override
    protected Pozole createPozole(String meat, String broth) {

        if(broth.equals("blanco")) {
            PozoleBlancoStore pozoleBlancoStore = new PozoleBlancoStore();
            pozole = pozoleBlancoStore.createPozole(meat, broth);
            pozole = new CaldoBlanco(pozole);
        }

        if(broth.equals("rojo")) {
            PozoleRojoStore pozoleRojoStore = new PozoleRojoStore();
            pozole = pozoleRojoStore.createPozole(meat, broth );
            pozole = new CaldoRojo(pozole);
        }

        if(broth.equals("verde")) {
            PozoleVerdeStore pozoleVerdeStore = new PozoleVerdeStore();
            pozole = pozoleVerdeStore.createPozole(meat, broth);
            pozole = new CaldoVerde(pozole);
        }

        if(broth.equals("pozolillo")) {
            PozolilloStore pozolilloStore = new PozolilloStore();
            pozole = pozolilloStore.createPozole(meat, broth);
            pozole = new CaldoVerde(pozole);
        }
        return pozole;
    }
}
