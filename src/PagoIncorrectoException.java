/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

/** 
 * @param errorMessage mensaje de error
*/

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);

    }

}


