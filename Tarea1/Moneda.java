package Tarea1;

/**
 * Clase abstracta {@code Moneda} que representa una moneda.
 * Esta clase implementa la interfaz {@code Comparable} para permitir la
 * comparación entre diferentes monedas
 */
public abstract class Moneda implements Comparable<Moneda> {

    public Moneda() {
    }

    /**
     * @return el valor de la moneda
     */
    public abstract int getValor();

    /**
     * Compara esta moneda con otra moneda.
     * @param otraMoneda la otra moneda a comparar
     * @return un valor negativo si esta moneda es menor,
     *cero si son iguales, o un valor positivo si esta moneda es mayor
     */
    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}

