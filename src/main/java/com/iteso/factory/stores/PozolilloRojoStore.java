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
public class PozolilloRojoStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozolilloRojoPollo();
        else if (meat.equals("cachete") )
            return new PozolilloRojoCachete();
        else if (meat.equals("oreja"))
            return new PozolilloRojoOreja();
        else if (meat.equals("pierna") )
            return new PozolilloRojoPierna();
        else if (meat.equals("trompa"))
            return new PozolilloRojoTrompa();
        else return null;


    }
}
