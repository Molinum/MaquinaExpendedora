/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

/** 
 * @param errorMessage mensaje de error
*/

public class NoHayProductoException extends Exception {
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);

    }

}