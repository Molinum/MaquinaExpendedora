/** 
 * @author Nícholas García
 * @author Benjamin Molina
 *
 * Representa un producto de la maquina expendedora
*/
public abstract class Producto {
    private int serie;

    /**
     * @param serie Numero de serie de producto
    */
    public Producto(int serie) {
        this.serie = serie;

    }

    /** Obtiene el numero de serie del producto
     * @return un int que representa el numero de serie del producto
    */
    public int getSerie() {
        return serie;

    }

    /** Obtiene el sabor del producto
     * @return String "Sabor" del producto para poder identificarlo
    */
    public abstract String consumir();


}