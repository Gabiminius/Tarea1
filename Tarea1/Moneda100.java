package Tarea1;

/**
 * Clase {@code Moneda100} que representa una moneda de 100 unidades.
 * Extiende la clase abstracta {@code Moneda} e implementa el método {@code getValor}.
 */
public class Moneda100 extends Moneda {
    public Moneda100() {
    }

    /**
     * @return el valor de la moneda, que es 100
     */
    @Override
    public int getValor() {
        return 100;
    }
}

