package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.condiment.caldos.CaldoBlanco;
import com.iteso.factory.condiment.caldos.CaldoRojo;
import com.iteso.factory.condiment.caldos.CaldoVerde;
import com.iteso.factory.condiment.meat.*;
import com.iteso.factory.pozoles.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozoleVerdeStore extends PozoleStore {

    Pozole pozole = new PozoleNormal();


    @Override
    protected Pozole createPozole(String meat, String broth) {

        //pozole = new CaldoVerde(pozole);

        if (meat.equals("pollo"))
            pozole = new Pollo(pozole);
        else if (meat.equals("cachete"))
            pozole = new Cachete(pozole);
        else if (meat.equals("oreja"))
            pozole = new Oreja(pozole);
        else if (meat.equals("pierna"))
            pozole = new Pierna(pozole);
        else if (meat.equals("trompa"))
            pozole = new Trompa(pozole);
        else return null;

        return pozole;
    }
}
