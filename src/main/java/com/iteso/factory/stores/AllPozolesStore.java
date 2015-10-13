package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by GeraCruz on 13/10/15.
 */
public class AllPozolesStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {

        if(getTipo().equals("Verde")) {

            new PozoleVerdeStore();
            if (meat.equals("pollo"))
                return new PozoleVerdePollo();
            else if (meat.equals("cachete"))
                return new PozoleVerdeCachete();
            else if (meat.equals("oreja"))
                return new PozoleVerdeOreja();
            else if (meat.equals("pierna"))
                return new PozoleVerdePierna();
            else if (meat.equals("trompa"))
                return new PozoleVerdeTrompa();
            else return null;
        }

        else if(getTipo().equals("Rojo")){

            new PozoleRojoStore();
            if (meat.equals("pollo"))
                return new PozoleRojoPollo();
            else if (meat.equals("cachete"))
                return new PozoleRojoCachete();
            else if (meat.equals("oreja"))
                return new PozoleRojoOreja();
            else if (meat.equals("pierna"))
                return new PozoleRojoPierna();
            else if (meat.equals("trompa"))
                return new PozoleRojoTrompa();
            else return null;
        }

        else if(getTipo().equals("Blanco")){

            new PozoleBlancoStore();
            if (meat.equals("pollo"))
                return new PozoleBlancoPollo();
            else if (meat.equals("cachete") )
                return new PozoleBlancoCachete();
            else if (meat.equals("oreja"))
                return new PozoleBlancoOreja();
            else if (meat.equals("pierna") )
                return new PozoleBlancoPierna();
            else if (meat.equals("trompa"))
                return new PozoleBlancoTrompa();
            else return null;
        }

        else if(getTipo().equals("Pozolillo")){

            new PozolilloStore();
            if (meat.equals("pollo"))
                return new PozolilloPollo();
            else if (meat.equals("cachete") )
                return new PozolilloCachete();
            else if (meat.equals("oreja"))
                return new PozolilloOreja();
            else if (meat.equals("pierna") )
                return new PozolilloPierna();
            else if (meat.equals("trompa"))
                return new PozolilloTrompa();
            else return null;
        }

        return null;
        
    }
}
