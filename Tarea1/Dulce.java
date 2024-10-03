package Tarea1;

/**
 * Clase abstracta {@code Dulce} que representa un producto de tipo dulce.
 * Hereda de la clase {@code Producto}, por lo que todos los dulces tienen un número
 * de serie que es asignado al ser creados.
 */
public abstract class Dulce extends Producto {

    /**
     * @param serie el número de serie único del dulce
     */
    public Dulce(int serie) {
        super(serie);
    }
}

