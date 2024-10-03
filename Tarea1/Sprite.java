package Tarea1;

/**
 * Clase {@code Sprite} que representa una bebida de tipo Sprite.
 */
public class Sprite extends Bebida {

    /**
     * @param serie el número de serie único
     */
    public Sprite(int serie) {
        super(serie);
    }

    /**
     * @return una cadena que describe el consumo
     */
    @Override
    public String consumir() {
        return "glupglup Sprite";
    }
}
