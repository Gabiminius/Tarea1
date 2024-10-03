package Tarea1;

/**
 * Clase {@code Moneda500} que representa una moneda de 500 unidades.
 * Extiende la clase abstracta {@code Moneda} e implementa el método {@code getValor}.
 */
public class Moneda500 extends Moneda {
    public Moneda500() {
    }

    /**
     * @return el valor de la moneda, que es 500
     */
    @Override
    public int getValor() {
        return 500;
    }
}

