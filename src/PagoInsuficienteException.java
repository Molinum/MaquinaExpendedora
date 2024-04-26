/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/





public class PagoInsuficienteException extends Exception {
    /**
     * @param errorMessage mensaje de error
     */
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);

    }

}