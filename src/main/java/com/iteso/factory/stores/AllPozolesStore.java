package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.ingredients.broths.Blanco;
import com.iteso.factory.pozoles.ingredients.broths.Rojo;
import com.iteso.factory.pozoles.ingredients.broths.Verde;
import com.iteso.factory.pozoles.ingredients.meats.*;
import com.iteso.factory.pozoles.types.PozoleNormal;

import java.util.ArrayList;

/**
 * Created by WolfBloodDude on 13/10/15.
 */
public class AllPozolesStore extends PozoleStore {
    Pozole pozole = new PozoleNormal();

    @Override
    protected Pozole createPozole(String meat, String broth) {
        if(broth.equals("Blanco")) {
            pozole = new Blanco(pozole);
            if(meat.equals("Cachete")) {
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
        } else if(broth.equals("Rojo")) {
            pozole = new Rojo(pozole);
            if(meat.equals("Cachete")) {
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
        } else if(broth.equals("Verde")) {
            pozole = new Verde(pozole);
            if(meat.equals("Cachete")) {
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
        }

        return pozole;
    }
}
