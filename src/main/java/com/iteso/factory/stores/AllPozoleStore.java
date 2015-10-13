package com.iteso.factory.stores;

import com.iteso.factory.Pozole;
import com.iteso.factory.PozoleStore;

/**
 * Created by Feelpaa on 13/10/2015.
 * Tipos:
 * Segun el color es el tipo de pozole a crear
 * -Rojo
 * -Blanco
 * -Verde
 * Para Pozolillo su tipo
 * -Pozolillo
 *
 *
 */
public class AllPozoleStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat) {
        /*
        Validamos el tipo de caldo para ver que tipo de pozole es.
         */
        if(getTipo().equals("Verde")){
            PozoleVerdeStore pozoleVerdeStore = new PozoleVerdeStore();
            return pozoleVerdeStore.createPozole(meat);

        }else if(getTipo().equals("Rojo")){
            PozoleRojoStore pozoleRojoStore = new PozoleRojoStore();
            return pozoleRojoStore.createPozole(meat);

        }else if(getTipo().equals("Blanco")){
            PozoleBlancoStore pozoleBlancoStore = new PozoleBlancoStore();
            return pozoleBlancoStore.createPozole(meat);

        }else if(getTipo().equals("Pozolillo")){
            PozolilloStore pozolilloStore = new PozolilloStore();
            return  pozolilloStore.createPozole(meat);
        }

        return null;
    }
}
