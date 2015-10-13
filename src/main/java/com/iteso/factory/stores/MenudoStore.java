package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.ingredients.meats.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/27/13
 * Time: 7:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenudoStore extends PozoleStore {
    Pozole pozole = new com.iteso.factory.pozoles.types.Menudo();

    @Override
    protected Pozole createPozole(String meat, String broth) {
        if (meat.equals("Cachete")) {
            pozole = new Cachete(pozole);
        } else if (meat.equals("Oreja")) {
            pozole = new Oreja(pozole);
        } else if (meat.equals("Pierna")) {
            pozole = new Pierna(pozole);
        } else if (meat.equals("Pollo")) {
            pozole = new Pollo(pozole);
        } else if (meat.equals("Trompa")) {
            pozole = new Trompa(pozole);
        }
        return pozole;
    }
}
