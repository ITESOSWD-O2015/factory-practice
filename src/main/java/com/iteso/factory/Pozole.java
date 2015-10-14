package com.iteso.factory;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Pozole {
    public String name;
    public String caldo;
    public ArrayList especias = new ArrayList();


    public void serve() {
        System.out.println("Serving..." );
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding broth..." );
        System.out.println("Adding toppings:" );
        for (int i = 0; i < especias.size(); i++){
            System.out.println("    " + especias.get(i));
        }

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaldo() {
        return caldo;
    }

    public void setCaldo(String caldo) {
        this.caldo = caldo;
    }

    public ArrayList getEspecias() {
        return especias;
    }

    public void setEspecias(ArrayList especias) {
        this.especias = especias;
    }



}
