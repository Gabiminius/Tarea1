package Tarea1;

/**
 * Enumeración {@code Seleccionador} que representa una lista de productos disponibles
 * en el expendedor, incluyendo bebidas y dulces. Cada producto tiene un número
 * de posición y un precio asociado.
 */
public enum Seleccionador {
    COCACOLA(1, 1000),
    SPRITE(2, 1000),
    FANTA(3, 1000),
    SNICKERS(4, 800),
    SUPER8(5, 300);

    private final int num;
    private final int precio;

    /**
     * @param num el número de posición del producto
     * @param precio el precio del producto
     */
    Seleccionador(int num, int precio) {
        this.num = num;
        this.precio = precio;
    }

    /**
     * @return el número de posición
     */
    public int getPosicion() {
        return num;
    }

    /**
     * @return el precio del producto
     */
    public int getPrecio() {
        return precio;
    }
    public static Seleccionador fromPosicion(int posicion){
        for(Seleccionador producto : Seleccionador.values() ){
            if(producto.getPosicion() == posicion){
                return producto;
            }
        }
        return null;
    }

}
