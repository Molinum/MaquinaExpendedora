/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/

package com.pa3p.NotDone.Maquina_Expendedora;

/** 
 * @param errorMessage mensaje de error
*/

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);

    }

}