package Tarea1;

public enum Seleccionador {
    COCACOLA(1, 1000),
    SPRITE(2, 1000),
    FANTA(3, 1000),
    COOKIES(4, 800),
    SUPER8(5, 300);
    private final int num;
    private final int precio;

    Seleccionador(int num, int precio) {
        this.num = num;
        this.precio = precio;
    }

    public int getPosicion() {
        return num;
    }
    public int getPrecio(){
        return precio;
    }
}