package Tarea1;

/**
 * La clase abstracta {@code Bebida} representa un producto de tipo bebida.
 * Hereda de la clase {@code Producto}, por lo que todas las bebidas tienen un número
 * de serie que es asignado al ser creadas.
 */
abstract class Bebida extends Producto {

    /**
     * @param serie el número de serie único de la bebida
     */
    public Bebida(int serie) {
        super(serie);
    }
}
