package Tarea1;

/**
 * Clase {@code Fanta} que representa una bebida de tipo Fanta.
 */
public class Fanta extends Bebida {

    /**
     * @param serie el número de serie único
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Método que simula el consumo de la Fanta.
     * @return una cadena que describe el consumo
     */
    @Override
    public String consumir() {
        return "glupglup Fanta";
    }
}
