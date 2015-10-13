package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;
import com.iteso.factory.pozoles.ingredients.meats.*;
import com.iteso.factory.pozoles.types.Pozolillo;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class PozolilloStore extends PozoleStore{
    Pozole pozole = new Pozolillo();

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
