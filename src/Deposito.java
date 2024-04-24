package com.pa3p.NotDone.Maquina_Expendedora;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<Producto> al;

    public Deposito() {
        al = new ArrayList<Producto>();

    }

    public void addProducto(Producto a) {
        al.add(a);

    }

    public Producto getProducto() {
        if (al.size() == 0) {
            return null;

        }

        return al.remove(0);

    }   

}