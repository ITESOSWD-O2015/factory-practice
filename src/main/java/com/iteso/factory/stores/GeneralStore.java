package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Blanco;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Rojo;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Verde;
import com.iteso.factory.pozoles.Ingredientes.Carne.*;
import com.iteso.factory.pozoles.PozoleComun;

/**
 * Created by jose luis on 14/10/2015.
 */
public class GeneralStore extends PozoleStore {
    Pozole pozole = new PozoleComun();


    protected Pozole createPozole(String carne, String caldo) {
        if(caldo.equals("Blanco")) {
            pozole = new Blanco(pozole);
            if(carne.equals("Cachete")) {
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
        }
        else if(caldo.equals("Verde")) {
            pozole = new Verde(pozole);
            if(carne.equals("Cachete")) {
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
        }
        else if(caldo.equals("Rojo")) {
            pozole = new Rojo(pozole);
            if(carne.equals("Cachete")) {
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
        }

        return pozole;
    }
}