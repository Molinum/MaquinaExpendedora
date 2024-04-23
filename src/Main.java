
import java.util.ArrayList;
import java.lang.Exception;

class Main {
    public static void main(String[] args){
        Expendedor exp = new Expendedor(1, 200);
        Moneda m = new Moneda1000();
        Comprador c = null;
        c = new Comprador(m,4,exp);
        System.out.println(c.queBebiste() + c.cuantoVuelto());

    }

}

abstract class Bebida {
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;

    }

    public int getSerie() {
        return serie;

    }

    public abstract String beber();

}

class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "sprite";

    }

}

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return "cocacola";

    }

}

class Deposito {
    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList<Bebida>();

    }

    public void addBebida(Bebida a) {
        al.add(a);

    }

    public Bebida getBebida() {
        if (al.size() == 0) {
            return null;

        }

        return al.remove(0);

    }

}

class DepositoM {

    private ArrayList<Moneda> al;

    public DepositoM() {
        al = new ArrayList<Moneda>();

    }

    public void addMoneda(Moneda m) {
        al.add(m);

    }

    public Moneda getMoneda() {
        if(al.isEmpty()) {
            return null;

        }
        return al.remove(0);

    }


}

class Expendedor {
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precio;

    public Expendedor(int i, int precio) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();
        this.precio = precio;

        for (int j = 0; j < i; j++) {
            coca.addBebida(new CocaCola(j));
            sprite.addBebida(new Sprite(j));

        }

    }

    public Bebida comprarBebida(Moneda m, int i) {
        Bebida b = null;
        if(m != null) {
            int iterations = m.getValor() / 100;

            if(m.getValor() >= precio) {
                switch (i) {
                    case 1:
                        b = coca.getBebida();

                        break;

                    case 2:
                        b = sprite.getBebida();

                }

            }

            if (b != null) {
                iterations -= precio / 100;

            }

            for (int j = 0; j < iterations; j++) {
                monVu.addMoneda(new Moneda100());

            }

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

abstract class Moneda {
    public Moneda() {}
    public Moneda getSerie() {
        return this;


    }

    public abstract int getValor();

}

class Moneda1500 extends Moneda{
    public Moneda1500() {
        super();

    }

    public int getValor() {
        return 1500;

    }

}

class Moneda1000 extends Moneda{
    public Moneda1000() {
        super();

    }

    public int getValor() {
        return 1000;

    }

}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();

    }

    public int getValor() {
        return 500;

    }

}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();

    }

    public int getValor() {
        return 100;

    }

}

class Comprador {
    private String sonido = null;
    private int vuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida b = exp.comprarBebida(m, cualBebida);

        if (b != null) {
            sonido = b.beber();

        }

        while(true) {
            Moneda vu = exp.getVuelto();
            if (vu == null) {
                break;

            }

            vuelto += vu.getValor();

        }

    }

    public int cuantoVuelto() {
        return vuelto;

    }

    public String queBebiste() {
        return sonido;

    }

}

class NoHayProductoException extends Exception {
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);

    }

}

class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);

    }

}

class PagoIncorrectoException extends Exception {
    PagoIncorrectoException(String errorMessage) {
        super(errorMessage);

    }

}