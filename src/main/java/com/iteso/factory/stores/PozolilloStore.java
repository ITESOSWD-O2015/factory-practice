package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Blanco;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Rojo;
import com.iteso.factory.pozoles.Ingredientes.Carne.*;
import com.iteso.factory.pozoles.Pozolillo;

/**
 * Created by jose luis on 14/10/2015.
 */
public class PozolilloStore extends PozoleStore {
    Pozole pozole = new Pozolillo();

    @Override
    protected Pozole createPozole(String carne, String caldo) {
        if (carne.equals("Cachete")) {
            pozole = new Cachete(pozole);
        } else if (carne.equals("Oreja")) {
            pozole = new Oreja(pozole);
        } else if (carne.equals("Pierna")) {
            pozole = new Pierna(pozole);
        } else if (carne.equals("Pollo")) {
            pozole = new Pollo(pozole);
        } else if (carne.equals("Trompa")) {
            pozole = new Trompa(pozole);
        }
        else if (caldo.equals("Blanco")) {
            pozole = new Blanco(pozole);
        }
        else if (caldo.equals("Rojo")) {
            pozole = new Rojo(pozole);
        }
        return pozole;
    }
}