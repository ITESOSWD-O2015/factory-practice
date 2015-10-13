package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by GGGK4 on 13/10/2015.
 */
public class PozoleBlancoStore extends PozoleStore {


    @Override
    protected Pozole createPozole(String meat) {

        if(meat.equals("Cachete"))
            return new PozoleBlancoCachete();
        else if(meat.equals("Oreja"))
            return new PozoleBlancoOreja();
        else if (meat.equals("Pierna"))
            return new PozoleBlancoPierna();
        else if(meat.equals("Pollo"))
            return new PozoleBlancoPollo();
        else if(meat.equals("Trompa"))
            return new PozoleBlancoTrompa();
        else return null;
    }
}
