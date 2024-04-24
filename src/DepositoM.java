package com.pa3p.NotDone.Maquina_Expendedora;
import java.util.ArrayList;

public class DepositoM {
    
    private ArrayList<Moneda> al;

    public DepositoM() {
        al = new ArrayList<Moneda>();

    }

    public void addMoneda(Moneda m) {
        al.add(m);

    }

    public Moneda getMoneda() {
        if(al.isEmpty()) {
            return null;

        }
        return al.remove(0);

    }

    
}