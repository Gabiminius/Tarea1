package Tarea1;

/**
 * Clase {@code Moneda1000} que representa una moneda de 1000 unidades.
 * Extiende la clase abstracta {@code Moneda} e implementa el método {@code getValor}.
 */
public class Moneda1000 extends Moneda {
    public Moneda1000() {
    }

    /**
     * @return el valor de la moneda, que es 1000
     */
    @Override
    public int getValor() {
        return 1000;
    }
}
