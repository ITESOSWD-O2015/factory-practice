package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by Paloma on 13/10/2015.
 */
public class PozoleBlancoStore extends PozoleStore {

    @Override
    public Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozoleBlancoPollo();
        else if (meat.equals("cachete") )
            return new PozoleBlancoCachete();
        else if (meat.equals("oreja"))
            return new PozoleBlancoOreja();
        else if (meat.equals("pierna") )
            return new PozoleBlancoPierna();
        else if (meat.equals("trompa"))
            return new PozoleBlancoTrompa();
        else return null;

    }
}
