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
public class AllPozoleStore extends PozoleStore{

    Pozole pozole;

    @Override
    protected Pozole createPozole(String meat) {
        if(getTipo()== "pozole blanco"){
            PozoleBlancoStore pozoleBlancoStore = new PozoleBlancoStore();
            pozole = pozoleBlancoStore.createPozole(meat);
        }
        else if(getTipo()== "pozole verde"){
            PozoleVerdeStore pozoleVerdeStore = new PozoleVerdeStore();
            pozole = pozoleVerdeStore.createPozole(meat);
        }
        else if(getTipo()== "pozole rojo"){
            PozoleRojoStore pozoleRojoStore = new PozoleRojoStore();
            pozole = pozoleRojoStore.createPozole(meat);
        }
        else{
            PozolilloRojoStore pozolilloRojoStore = new PozolilloRojoStore();
            pozole = pozolilloRojoStore.createPozole(meat);
        }

        return pozole;
    }
}
