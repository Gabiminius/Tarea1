package Tarea1;

import java.util.ArrayList;

/**
 * Clase genérica {@code Deposito} que representa un depósito que almacena productos
 * de cualquier tipo. Utiliza un {@code ArrayList} para gestionar los productos
 *
 * @param <T> el tipo de producto almacenado en el depósito
 */
public class Deposito<T> {
    private ArrayList<T> productos;
    public Deposito() {
        productos = new ArrayList<>();
    }

    /**
     * @param item el producto a agregar
     */
    public void addProducto(T item) {
        productos.add(item);
    }

    /**
     * @return el primer producto del depósito o {@code null} si está vacío
     */
    public T getProducto() {
        if (productos.isEmpty()) {
            return null;
        }
        return productos.remove(0);
    }
}

