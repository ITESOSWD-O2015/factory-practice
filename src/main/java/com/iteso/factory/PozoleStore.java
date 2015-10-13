package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PozoleStore {
    private String tipo = "Poi"; //Agregamos un tipo de pozole

    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(String meat);


    ///////////////////////////////////////////////////////////////////////////////////Agregados
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
