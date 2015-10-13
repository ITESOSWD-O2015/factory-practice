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
public class PozoleBlancoStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("cabeza cerdo"))
            return new PozoleBlancoCabeza();
        else if (meat.equals("pierna cerdo") )
            return new PozoleBlancoPierna();
        else if (meat.equals("chamorro cerdo"))
            return new PozoleBlancoChamorro();
        else if (meat.equals("costilla cerdo") )
            return new PozoleBlancoCostilla();
        
        else return null;


    }
}
