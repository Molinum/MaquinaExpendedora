package com.pa3p.NotDone.Maquina_Expendedora;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}
    public Moneda getSerie() {
        return this;


    }

    public abstract int getValor();

    @Override
    public int compareTo(Moneda m) {
        return this.getValor() - m.getValor();

    }

}