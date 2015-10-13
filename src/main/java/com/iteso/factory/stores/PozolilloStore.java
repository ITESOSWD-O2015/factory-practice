package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by Feelpaa on 13/10/2015.
 */
public class PozolilloStore extends PozoleStore {
    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozolilloPollo();
        else if (meat.equals("cachete") )
            return new PozolilloCachete();
        else if (meat.equals("oreja"))
            return new PozolilloOreja();
        else if (meat.equals("pierna") )
            return new PozolilloPierna();
        else if (meat.equals("trompa"))
            return new PozolilloTrompa();
        else return null;

    }//createPozole
}//class
