/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

public class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie);

    }

    /** 
     * @return String "Sabor" del producto para poder identificarlo
    */
    
    public String consumir() {
        return "snickers";
    
    }

}
