/**Representa una bebida Sprite.
 * @author Nícholas García
 * @author Benjamin Molina
*/
public class Sprite extends Bebida {
    /**Crea una bebida Sprite.
     * @param serie Numero de serie del producto.
     */
    public Sprite(int serie) {
        super(serie);
    }

    public String consumir() {
        return "sprite";

    }

}