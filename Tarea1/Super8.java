package Tarea1;

/**
 * Clase {@code Super8} que representa un dulce de tipo Super8.
 */
public class Super8 extends Dulce {

    /**
     * @param serie el número de serie único
     */
    public Super8(int serie) {
        super(serie);
    }

    /**
     * @return una cadena que describe el consumo
     */
    @Override
    public String consumir() {
        return "ñam super8";
    }
}
