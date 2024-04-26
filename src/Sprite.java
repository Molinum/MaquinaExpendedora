/** 
 * @author Nícholas García
 * @author Benjamin Molina
*/
public class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }
    
    /** 
     * @return String "Sabor" del producto para poder identificarlo
    */
    public String consumir() {
        return "sprite";

    }

}