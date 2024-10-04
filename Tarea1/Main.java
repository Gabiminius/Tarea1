package Tarea1; /**
 * @author Gabriela Escalona
 * @author Valentina Serón
 * @version version 2, 03 de octubre 2024
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase principal que simula una venta a través de un expendedor de dulces y bebidas.
 * Permite realizar compras utilizando monedas y también ordenar las monedas por su valor.
 * Se muestra el producto comprado y el vuelto obtenido, además de un ejemplo donde se compra
 * hasta agotar stock.
 */
public class Main {

    public static void main(String[] args) {
        int cantidad = 5;  // Cantidad de productos en stock
        Expendedor exp = new Expendedor(cantidad);

        // Mostrar productos
        System.out.println("Bienvenido al Expendedor de dulces y bebidas.\n" +
                "Productos disponibles:\n" +
                "1. Cocacola $1000\n" +
                "2. Sprite $1000\n" +
                "3. Fanta $1000\n" +
                "4. Snickers $800\n" +
                "5. Super8 $300\n");

        // Crear monedas
        Moneda m1 = new Moneda1000();
        Moneda m5 = new Moneda500();

        /**
         * Se intenta comprar un producto utilizando una moneda y especificando el expendedor.
         * En caso de que ocurra una excepción, se captura y se muestra el mensaje correspondiente.
         */
        try {
            int eleccion = 1;  // Ejemplo: elegir Cocacola
            System.out.println("Comprando el producto: " + eleccion);

            Comprador c1 = new Comprador(m1, eleccion, exp);
            System.out.println(c1.queConsumiste() + ", Vuelto: " + c1.cuantoVuelto());
        } catch (PagoIncorrectoException | NoHayProductoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Se simula la compra de productos hasta que se agota el stock disponible.
         * Se utiliza la misma moneda para cada compra y se captura cualquier excepción que ocurra.
         */
        try {
            for (int i = 0; i <= cantidad; i++) {
                Comprador c2 = new Comprador(m5, 2, exp);  // Ejemplo: comprando Sprite
                System.out.println(c2.queConsumiste() + ", Vuelto: " + c2.cuantoVuelto());
            }
        } catch (PagoIncorrectoException | NoHayProductoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        /**
         * Se crea una lista de monedas con diferentes valores y se imprimen los valores antes de ordenarlas.
         */
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda500());
        monedas.add(new Moneda100());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda500());

        System.out.println("Monedas antes de ordenar:");
        for (Moneda moneda : monedas) {
            System.out.println(moneda.getValor());
        }

        // Ordenar las monedas
        Collections.sort(monedas);

        /**
         * Después de ordenar las monedas por su valor, se imprimen los valores de las monedas en orden ascendente.
         */
        System.out.println("Monedas después de ordenar:");
        for (Moneda moneda : monedas) {
            System.out.println(moneda.getValor());
        }
    }
}


