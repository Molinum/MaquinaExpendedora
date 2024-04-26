/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

public class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie);

    }

    /** 
     * @return String "Sabor" del producto para poder identificarlo
    */
    
    public String consumir() {
        return "fanta";

    }

}