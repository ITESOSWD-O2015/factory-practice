package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.Ingredientes.Caldo.Blanco;
import com.iteso.factory.pozoles.Ingredientes.Carne.*;
import com.iteso.factory.pozoles.Ingredientes.Especias.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/27/13
 * Time: 7:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MenudoStore extends PozoleStore {
    Pozole pozole = new com.iteso.factory.pozoles.Menudo();

    @Override
    protected Pozole createPozole(String carne, String caldo, String especia) {
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
        else if (especia.equals("Cebolla")) {
            pozole = new Cebolla(pozole);
        }else if (especia.equals("Col")) {
            pozole = new Col(pozole);
        }else if (especia.equals("Lechuga")) {
            pozole = new Lechuga(pozole);
        }else if (especia.equals("Oregano")) {
            pozole = new Oregano(pozole);
        }else if (especia.equals("Rabano")) {
            pozole = new Rabano(pozole);
        }
        return pozole;
    }
}