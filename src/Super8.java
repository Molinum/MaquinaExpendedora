/***
 * @author Nícholas García
 * @author Benjamin Molina
 */
public class Super8 extends Dulce {
    /***
     * Crea un super 8
     * @param serie Numero de serie del super8
     */
    public Super8(int serie) {
        super(serie);

    }

    /**
     * Obtiene el sabor del super8
     * @return String "Sabor" del producto para poder identificarlo
    */
    public String consumir() {
        return "super8";

    }

}