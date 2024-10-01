import java.util.ArrayList;


abstract class Moneda {

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    public Moneda() {

    }
}

class Moneda1500 extends Moneda {

    public int getValor() {
        return 1500;
    }

    public Moneda1500() {
        super();
    }
}

class Moneda1000 extends Moneda {

    public int getValor() {
        return 1000;
    }

    public Moneda1000() {
        super();
    }
}

class Moneda500 extends Moneda {

    public int getValor() {
        return 500;
    }

    public Moneda500() {
        super();
    }
}

class Moneda100 extends Moneda {

    public int getValor() {
        return 100;
    }

    public Moneda100() {
        super();
    }
}

class Comprador {
    private String sonido;
    private int vuelto = 0;

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }

    public Comprador(Moneda m, int cual, Expendedor exp) {
        Bebida beer = exp.comprarBebida(m, cual);
        if (beer != null) {
            sonido = beer.beber();

        }
        Moneda aux = exp.getVuelto();
        while (aux != null) {
            vuelto += aux.getValor();
            aux = exp.getVuelto();
        }
    }
}

class Deposito {

    private ArrayList<Bebida> lista1;

    public void addBebida(Bebida vodka) {
        lista1.add(vodka);
    }

    public Bebida getBebida() {
        if (lista1.size() == 0) {
            return null;
        } else {
            Bebida aux = lista1.get(0);
            lista1.remove(0);
            return aux;
        }
    }

    public Deposito() {
        lista1 = new ArrayList<Bebida>();

    }
}

class DepositoD{}

class DepositoM {

    private ArrayList<Moneda> lista2;

    public void addMoneda(Moneda rublo) {
        lista2.add(rublo);
    }

    public Moneda getMoneda() {
        if (lista2.size() == 0) {
            return null;
        } else {
            Moneda aux = lista2.get(0);
            lista2.remove(0);
            return aux;
        }
    }

    public DepositoM() {
        lista2 = new ArrayList<Moneda>();

    }
}

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int price;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if(m == null){
            return null;
        }

        if(m.getValor()<price || (cual != COCA && cual != SPRITE)){
            monVu.addMoneda(m);
            return null;
        }
        
        for(int i = price; i<m.getValor(); i+=100){
            monVu.addMoneda(new Moneda100());
        }
        Bebida auxBebida = null;
        switch (cual) {
            case COCA: 
                auxBebida = coca.getBebida();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxBebida;
            case SPRITE: 
                auxBebida = sprite.getBebida();
                if(auxBebida == null){
                    for(int i = price; i<m.getValor(); i+=100){
                        monVu.getMoneda();
                    }
                    monVu.addMoneda(m);
                }
                return auxBebida;
            default: return null;
        }
    }

    public Expendedor(int a, int b) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();

        if (a > 0){
            for (int i = 0; i < a; i++) {
                Bebida coc = new CocaCola(i);
                Bebida spi = new Sprite(i);
                coca.addBebida(coc);
                sprite.addBebida(spi);
            }
        }

        price = b;
    }
}

abstract class Bebida {
    private int serie;

    public int getSerie() {
        return serie;
    }

    public abstract String beber();

    public Bebida(int a) {
        serie = a;
    }
}

class Sprite extends Bebida {
    public Sprite(int ab) {
        super(ab);
    }

    public String beber() {
        return new String("sprite");
    }
}

class CocaCola extends Bebida {
    public CocaCola(int ac) {
        super(ac);
    }

    public String beber() {
        return new String("cocacola");
    }
}

public class Problema110 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1,1000);
        Moneda m = null;
        Comprador c=null;

        m = new Moneda1500();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        m = new Moneda1500();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
    }
}