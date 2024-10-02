package Tarea1;

import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> productos;

    public Deposito(){
        productos= new ArrayList<>();

    }
    public void addProducto(T item) {
        productos.add(item);
    }

    public T getProducto() {
        if (productos.isEmpty()) {
            return null;
        }
        return productos.remove(0);
    }
}

