package com.pa3p.NotDone.Maquina_Expendedora;

public class Super8 extends Dulce {
    public Super8(int serie) {
        super(serie);

    }
    
    /** 
     * @return String "Sabor" del producto para poder identificarlo
    */

    public String consumir() {
        return "super8";

    }

}