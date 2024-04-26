/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

public abstract class Producto {
    private int serie;

    /** 
     * @param serie Numero de serie de producto
    */
    public Producto(int serie) {
        this.serie = serie;

    }

    /** 
     * @return int Numero de serie de producto
    */
    public int getSerie() {
        return serie;

    }

    /** 
     * @return String "Sabor" del producto para poder identificarlo
    */
    
    public abstract String consumir();


}