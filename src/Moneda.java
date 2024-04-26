/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/


package com.pa3p.NotDone.Maquina_Expendedora;

public abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}
    public Moneda getSerie() {
        return this;


    }
    /**
     * @return int Valor de la moneda
    */

    public abstract int getValor();

    @Override
    public int compareTo(Moneda m) {
        return this.getValor() - m.getValor();

    }

}