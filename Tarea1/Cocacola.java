package Tarea1;

public class Cocacola extends Bebida {

    /**
     * @param serie el número de serie único
     */
    public Cocacola(int serie) {
        super(serie);
    }

    /**
     * Método que simula el consumo de la Cocacola.
     * @return una cadena que describe el consumo
     */
    @Override
    public String consumir() {
        return "glupglup Cocacola";
    }
}
