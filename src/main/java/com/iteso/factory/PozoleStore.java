package com.iteso.factory;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    public Pozole orderPozole(String meat, String broth){
        Pozole pozole;

        pozole = createPozole(meat, broth);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String meat, String broth);
}
