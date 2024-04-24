package com.pa3p.NotDone.Maquina_Expendedora;

public class NoHayProductoException extends Exception {
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);

    }

}