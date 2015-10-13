package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by GGGK4 on 13/10/2015.
 */
public class PozolilloStore extends PozoleStore{

    @Override
    protected Pozole createPozole(String meat) {

        if(meat.equals("Cachete"))
            return new PozolilloCachete();
        else if(meat.equals("Oreja"))
            return new PozolilloOreja();
        else if(meat.equals("Pierna"))
            return new PozolilloPierna();
        else if(meat.equals("Pollo"))
            return new PozolilloPollo();
        else if(meat.equals("Trompa"))
            return new PozolilloTrompa();
        else return null;
    }
}
