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
public class PozolilloStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat, String Broth) {
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


    }
}
