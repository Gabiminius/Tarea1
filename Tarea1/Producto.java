package Tarea1;

/**
 * Clase abstracta {@code Producto} que representa un producto en general.
 * Los productos se identifican por un número de serie, el cual es proporcionado
 * al momento de su creación
 */
public abstract class Producto {
    // Los productos solo se les entregará serie porque el precio estará en los enum
    protected int serie;

    /**
     * @param serie el número de serie único del producto
     */
    public Producto(int serie) {
        this.serie = serie;
    }

    /**
     * @return el número de serie del producto
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Método abstracto que debe ser implementado por las clases que extiendan
     * {@code Producto}
     */
    public abstract String consumir();
}
