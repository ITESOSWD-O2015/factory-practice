package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;
import com.iteso.factory.pozoles.*;

/**
 * Created by GGGK4 on 13/10/2015.
 */
public class AllPozoleStore extends PozoleStore {


    @Override
    protected Pozole createPozole(String meat) {

        if(getTipo().equals("Verde")) {

            new PozoleVerdeStore();
            if(meat.equals("Cachete"))
                return new PozoleVerdeCachete();
            else if(meat.equals("Oreja"))
                return new PozoleVerdeOreja();
            else if(meat.equals("Pierna"))
                return new PozoleVerdePierna();
            else if(meat.equals("Pollo"))
                return new PozoleVerdePollo();
            else if(meat.equals("Trompa"))
                return new PozoleVerdeTrompa();
            else return  null;
        }
        else if(getTipo().equals("Rojo")){

            new PozoleRojoStore();
            if(meat.equals("Cachete"))
                return new PozoleRojoCachete();
            else if(meat.equals("Oreja"))
                return new PozoleRojoOreja();
            else if(meat.equals("Pierna"))
                return new PozoleRojoPierna();
            else if(meat.equals("Pollo"))
                return new PozoleRojoPollo();
            else if(meat.equals("Trompa"))
                return new PozoleRojoTrompa();
            else return  null;
        }
        else if(getTipo().equals("Blanco")){

            new PozoleBlancoStore();
            if(meat.equals("Cachete"))
                return new PozoleBlancoCachete();
            else if(meat.equals("Oreja"))
                return new PozoleBlancoOreja();
            else if(meat.equals("Pierna"))
                return new PozoleBlancoPierna();
            else if(meat.equals("Pollo"))
                return new PozoleBlancoPollo();
            else if(meat.equals("Trompa"))
                return new PozoleBlancoTrompa();
            else return  null;
        }
        else if(getTipo().equals("Pozolillo")){

            new PozolilloStore();
            if(meat.equals("Cachete"))
                return new PozolilloCachete();
            else if(meat.equals("Oreja"))
                return new PozolilloOreja();
            else if(meat.equals("Pierna"))
                return new PozolilloPierna();
            else if(meat.equals("Pollo"))
                return new PozolilloPollo();
            else if(meat.equals("Trompa"))
                return new PozolilloTrompa();
            else return  null;
        }
        else return  null;
    }
}
