package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    public Pozole orderPozole(String carne, String caldo, String especia){
        Pozole pozole;

        pozole = createPozole(carne, caldo, especia);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String carne, String caldo, String especia);
}