package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }
    private String type;
    public String getType(){
        return type;
    }

    public void setter(String setType){
        this.type = type;

    }
    protected abstract Pozole createPozole(String meat);
}
