package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    private String type = "Pozole Rojo";
    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String meat);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
