package com.pa3p.NotDone.Maquina_Expendedora;

public class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private DepositoM monVu;

    public Expendedor(int i) {
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        fanta = new Deposito<Bebida>();
        snickers = new Deposito<Dulce>();
        super8 = new Deposito<Dulce>();
        monVu = new DepositoM();

        for (int j = 0; j < i; j++) {
            coca.addProducto(new CocaCola(j));
            sprite.addProducto(new Sprite(j));
            fanta.addProducto(new Fanta(j));
            snickers.addProducto(new Snickers(j));
            super8.addProducto(new Super8(j));

        }

    }

    public Producto comprarProducto(Moneda m, ListProd seleccion) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {
        Producto b = null;
        if (m == null) {
            throw new PagoIncorrectoException("Moneda null");

        }

        int iterations = m.getValor() / 100;

        if(m.getValor() >= seleccion.getPrecio()) {
            switch (seleccion) {
                case COCACOLA:
                    b = coca.getProducto();
                    break;
                
                case SPRITE:
                    b = sprite.getProducto();
                    break;

                case FANTA:
                    b = fanta.getProducto();
                    break;

                case SNICKERS:
                    b = snickers.getProducto();
                    break;
                
                case SUPER8:
                    b = super8.getProducto();
                    break;

            }

        } else {
            throw new PagoInsuficienteException("Pago Insuficiente");

        }

        if(b == null) {
            throw new NoHayProductoException("No hay producto");

        }

        if (b != null) {
            iterations -= seleccion.getPrecio() / 100;

        }

        for (int j = 0; j < iterations; j++) {
            monVu.addMoneda(new Moneda100());

        }


        return b;

    }

    public Moneda getVuelto() {
        if (monVu != null) {
            return monVu.getMoneda();

        }

        return null;

    }
    
}
