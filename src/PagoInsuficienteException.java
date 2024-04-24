package com.pa3p.NotDone.Maquina_Expendedora;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);

    }

}